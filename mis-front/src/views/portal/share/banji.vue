<template>
  <div>
    <el-row>
      <el-form ref="form" class="form" label-width="120px" size="mini">
        <el-form-item label="班级名称" required>
          <el-input></el-input>
        </el-form-item>
        <el-form-item label="年级" required="true">
          <el-select placeholder="请选择年级">
            <el-option label="男" value="1"></el-option>
            <el-option label="女" value="0"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="班次" required="true">
          <el-select placeholder="请选择班次">
            <el-option label="男" value="1"></el-option>
            <el-option label="女" value="0"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="班主任" required="true">
          <el-select placeholder="请选择班主任">
            <el-option label="男" value="1"></el-option>
            <el-option label="女" value="0"></el-option>
          </el-select>
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
