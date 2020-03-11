<template>
  <div>
    <el-row>
      <el-form ref="form" class="form" label-width="120px" size="mini">
        <el-form-item label="学号" required>
          <el-input></el-input>
        </el-form-item>
        <el-form-item label="姓名" required>
          <el-input></el-input>
        </el-form-item>
        <el-form-item label="性别" required>
          <el-select placeholder="请选择性别">
            <el-option label="男" value="1"></el-option>
            <el-option label="女" value="0"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="出生日期" required="true">
          <el-date-picker type="date" placeholder="选择日期" style="width: 100%;"></el-date-picker>
        </el-form-item>
        <el-form-item label="家庭地址" required="true">
          <el-input></el-input>
        </el-form-item>
        <el-form-item label="联系电话">
          <el-input></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary">创建</el-button>
          <el-button>取消</el-button>
        </el-form-item>
      </el-form>
    </el-row>
  </div>
</template>
<script>
import {} from "@/api/serviceAll.js";
export default {
  data() {
    return {};
  },
  created() {},
  methods: {}
};
</script>
<style lang="scss" scoped>
.form {
  width: 400px;
  margin-top: 20px;
  border: 1px solid #c0c4cc;
  margin-left: 50px;
  padding: 8px;
}
</style>
