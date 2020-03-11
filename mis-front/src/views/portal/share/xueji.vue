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
        <el-form-item label="班级" required>
          <el-select placeholder="请选择班级">
            <el-option label="一年级1班" value="1.1"></el-option>
            <el-option label="一年级2班" value="1.2"></el-option>
            <el-option label="一年级3班" value="1.3"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="入学日期" required>
          <el-date-picker type="date" placeholder="选择日期" style="width: 100%;"></el-date-picker>
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
