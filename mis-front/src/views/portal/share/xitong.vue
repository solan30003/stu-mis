<template>
  <div class="main-container border">
    <el-row>
      <el-col :span="2" style="min-width: 30px;">
        <el-button @click="addHandleClick" type="primary">新增</el-button>
      </el-col>
      <el-col :span="12">
        <el-alert :title="activeDictMsg" type="success" :closable="false"></el-alert>
      </el-col>
      <el-col :span="10" style="text-align:right;">
        <el-select v-model="dicType" placeholder="请选择" @change="nvaMenuSelect" v-loading="loading1">
          <el-option
            v-for="(item, index) in tableLeftData"
            :key="index"
            :label="item.dictValue"
            :value="item.id"
          ></el-option>
        </el-select>
      </el-col>
    </el-row>
    <el-table
      :data="tableDetailsData"
      border
      style="width: 100%"
      :row-style="{ height: '40px' }"
      :cell-style="{ padding: '4px 4px' }"
      stripe
      v-loading="loading"
    >
      <el-table-column prop="dictCode" label="编码" width="100" align="center"></el-table-column>
      <el-table-column prop="dictValue" label="值" align="center"></el-table-column>
      <el-table-column prop="parentCode" label="父级编码" width="100" align="center"></el-table-column>
      <el-table-column prop="sortNum" label="排序值" width="80" align="center"></el-table-column>
      <el-table-column
        prop="statusName"
        label="状态"
        width="80"
        align="center"
        :formatter="formatterEnabled"
      ></el-table-column>
      <!-- <el-table-column prop="summary" label="备注" align="center"></el-table-column> -->
      <el-table-column
        prop="statusName"
        label="系统参数"
        width="100"
        align="center"
        :formatter="formatBoolean"
      ></el-table-column>
      <el-table-column fixed="right" label="操作" width="120" align="center">
        <template slot-scope="scope">
          <el-button @click="editHandleClick(scope.row)" type="text" size="small">编辑</el-button>
          <el-button @click="deleteHandleClick(scope.row)" type="text" size="small">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      background
      layout="prev, pager, next,  sizes,total"
      :total="paging.total"
      :page-size="paging.pageSize"
      :page-sizes="[5, 10, 20, 50]"
      @current-change="current_change"
      @size-change="size_change"
    >
    </el-pagination>
    <el-dialog title="编辑字典" :visible.sync="form.dialogFormVisible" width="600px" append-to-body>
      <el-form ref="form" name="dialog-form" :model="form.model" label-width="120px" size="mini">
        <el-input type="hidden" id="id" name="id" prop="id" v-model="form.model.id"></el-input>
        <el-form-item
          label="CODE"
          prop="dictCode"
          :rules="[
            { required: true, message: '不能为空', trigger: ['blur'] },
            { min: 1, max: 30, message: '长度在 1 到 30之间', trigger: ['blur'] }
          ]"
        >
          <el-input
            v-model="form.model.dictCode"
            :disabled="form.model.id"
            maxlength="30"
            placeholder="请认真填写，添加后，CODE将不能修改"
          ></el-input>
        </el-form-item>
        <el-form-item
          label="VALUE"
          prop="dictValue"
          :rules="[
            { required: true, message: '不能为空', trigger: ['blur'] },
            { min: 1, max: 50, message: '长度在 1 到 50之间', trigger: ['blur'] }
          ]"
        >
          <el-input v-model="form.model.dictValue" maxlength="50"></el-input>
        </el-form-item>
        <el-form-item
          label="父级编码"
          prop="parentCode"
          :rules="[
            { required: true, message: '不能为空', trigger: ['blur'] },
            { min: 1, max: 30, message: '长度在 1 到 30之间', trigger: ['blur'] }
          ]"
        >
          <el-input v-model="form.model.parentCode" :disabled="true" maxlength="30"></el-input>
        </el-form-item>
        <el-form-item
          label="字典分类"
          prop="category"
          :rules="[
            { required: true, message: '不能为空', trigger: ['blur'] },
            { min: 1, max: 30, message: '长度在 1 到 30之间', trigger: ['blur'] }
          ]"
        >
          <el-input v-model="form.model.category" :disabled="true" maxlength="30"></el-input>
        </el-form-item>
        <el-form-item
          label="排序参考值"
          prop="sortNum"
          :rules="[{ type: 'number', min: 0, max: 1000, message: '请输入0-1000之间的数字' }]"
        >
          <el-input v-model.number="form.model.sortNum" type="number" maxlength="4"></el-input>
        </el-form-item>
        <el-form-item
          label="有效性"
          prop="enabled"
          :rules="[{ required: true, message: '不能为空', trigger: ['blur'] }]"
        >
          <el-radio-group v-model="form.model.enabled">
            <el-radio :label="true">启用</el-radio>
            <el-radio :label="false">禁用</el-radio>
          </el-radio-group>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="form.dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="saveDictHandle">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>
<script>
import {} from "@/api/serviceAll.js";
export default {
  data() {
    return {
      loading: false,
      loading1: false,
      dicType: "",
      tableLeftData: [],
      activeDict: null,
      activeDictMsg: "当前字典种类：",
      tableDetailsData: [],
      tableDetailsParams: {
        category: "all"
      },
      paging: {
        pageIndex: 0,
        pageSize: 5,
        total: 14
      },
      form: {
        dialogFormVisible: false,
        model: {
          id: null,
          dictCode: null,
          dictValue: null,
          parentCode: null,
          category: null,
          sortNum: 0,
          enabled: true
        }
      }
    };
  },
  created() {
    this.doGetDictListForSysOfLeft();
  },
  methods: {
    nvaMenuSelect: function(index) {
      this.activeDict = this.tableLeftData.find(e => {
        return e.id === index;
      });
      if (this.activeDict) {
        this.activeDictMsg =
          "字典分类：" +
          this.activeDict.category +
          "，编码：" +
          this.activeDict.dictCode +
          "，值：" +
          this.activeDict.dictValue;
        this.doGetDictListForSysOfDetails();
      }
    },
    formatterEnabled: function(row) {
      if (row.enabled) return "启用";
      else return "禁用";
    },
    formatBoolean: function(row) {
      return row.basal && row.basal === true ? "是" : "否";
    },
    doGetDictListForSysOfLeft: function() {
      this.tableLeftData = [
        {
          id: 1,
          dictCode: "101",
          dictValue: "学科",
          parentCode: "0",
          category: "学科",
          sortNum: 0,
          enabled: true
        },
        {
          id: 2,
          dictCode: "102",
          dictValue: "年级",
          parentCode: "0",
          category: "学科",
          sortNum: 0,
          enabled: true
        }
      ];
      this.tableDetailsData = [
        {
          id: 1,
          dictCode: "11",
          dictValue: "语文",
          parentCode: "1001",
          category: "学科",
          sortNum: 1,
          enabled: true
        },
        {
          id: 2,
          dictCode: "12",
          dictValue: "数学",
          parentCode: "1001",
          category: "学科",
          sortNum: 2,
          enabled: true
        },
        {
          id: 3,
          dictCode: "13",
          dictValue: "英语",
          parentCode: "1001",
          category: "学科",
          sortNum: 3,
          enabled: true
        },
        {
          id: 4,
          dictCode: "14",
          dictValue: "西方政治经济学",
          parentCode: "1001",
          category: "学科",
          sortNum: 4,
          enabled: true
        },
        {
          id: 5,
          dictCode: "15",
          dictValue: "C++程序设计",
          parentCode: "1001",
          category: "学科",
          sortNum: 5,
          enabled: true
        }
      ];
    },
    doGetDictListForSysOfDetails: function() {},
    current_change: function(currentPage) {
      this.paging.pageIndex = currentPage;
      this.doGetDictListForSysOfDetails();
    },
    size_change: function(pageSize) {
      this.paging.pageSize = pageSize;
      this.doGetDictListForSysOfDetails();
    },
    addHandleClick: function() {},
    editHandleClick: function(row) {
      this.form.model = {
        id: row.id,
        dictCode: row.dictCode,
        dictValue: row.dictValue,
        parentCode: this.activeDict.dictCode,
        category: this.activeDict.category,
        sortNum: row.sortNum,
        enabled: row.enabled
      };
      this.form.dialogFormVisible = true;
    },
    saveDictHandle: function() {},
    deleteHandleClick: function(row) {
      console.log(row);
    }
  }
};
</script>
<style lang="scss" scoped>
.msg {
  margin: 0px 4px;
}
.el-table {
  margin-top: 10px;
}
.border {
  margin: 20px 20px 180px 20px;
  border: 1px solid #c0c4cc;
  padding: 8px;
}
</style>
