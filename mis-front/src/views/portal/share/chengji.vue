<template>
  <div class="main-container">
    <el-row class=" border">
      <el-table
        :data="tableDetailsData"
        border
        style="width: 100%"
        :row-style="{ height: '40px' }"
        :cell-style="{ padding: '4px 4px' }"
        stripe
        v-loading="loading"
      >
        <el-table-column prop="stuId" label="学号" width="120" align="center"></el-table-column>
        <el-table-column prop="name" label="姓名" width="120" align="center"></el-table-column>
        <el-table-column prop="course" label="课程" width="120" align="center"></el-table-column>
        <el-table-column prop="teacher" label="任课老师" width="120" align="center"></el-table-column>
        <el-table-column prop="score" label="分数" width="100" align="center"></el-table-column>
        <el-table-column prop="date" label="考试日期" width="120" align="center"></el-table-column>
        <el-table-column prop="summary" label="备注" align="left"></el-table-column>
        <el-table-column fixed="right" label="操作" width="100" align="center">
          <template slot-scope="scope">
            <el-button type="text" size="small">编辑</el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        background
        layout="prev, pager, next,  sizes, total"
        :total="paging.total"
        :page-size="paging.pageSize"
        :page-sizes="[5, 10, 20, 50]"
        @current-change="current_change"
        @size-change="size_change"
      >
      </el-pagination>
    </el-row>
  </div>
</template>
<script>
import {} from "@/api/serviceAll.js";
export default {
  data() {
    return {
      tableDetailsData: [],
      paging: {
        pageIndex: 0,
        pageSize: 5,
        total: 0
      }
    };
  },
  created() {
    this.loadData();
  },
  methods: {
    loadData: function() {
      this.tableDetailsData = [
        {
          stuId: "S20200001",
          name: "聂香露",
          course: "C++程序设计",
          teacher: "杨志华",
          score: "82",
          date: "2019-05-22",
          summary: ""
        },
        {
          stuId: "S20200002",
          name: "牛希月",
          course: "C++程序设计",
          teacher: "杨志华",
          score: "65.5",
          date: "2019-05-22",
          summary: ""
        },
        {
          stuId: "S20200003",
          name: "蓟北嘉",
          course: "C++程序设计",
          teacher: "杨志华",
          score: "73",
          date: "2019-05-22",
          summary: ""
        },
        {
          stuId: "S20200004",
          name: "袁晶",
          course: "C++程序设计",
          teacher: "杨志华",
          score: "92",
          date: "2019-05-22",
          summary: ""
        },
        {
          stuId: "S20200005",
          name: "林卓逸",
          course: "C++程序设计",
          teacher: "杨志华",
          score: "69",
          date: "2019-05-22",
          summary: ""
        }
      ];
      this.paging.total = 45;
    },
    current_change: function(currentPage) {
      this.paging.pageIndex = currentPage;
      this.doGetDictListForSysOfDetails();
    },
    size_change: function(pageSize) {
      this.paging.pageSize = pageSize;
      this.doGetDictListForSysOfDetails();
    }
  }
};
</script>
<style lang="scss" scoped>
.el-table {
  margin-top: 10px;
}
.border {
  margin: 20px 20px 180px 20px;
  border: 1px solid #c0c4cc;
  padding: 8px;
}
</style>
