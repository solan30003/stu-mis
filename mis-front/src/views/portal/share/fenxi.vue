<template>
  <div>
    <el-row>
      <el-button type="primary" @click="testHandleClick">添加反馈测试</el-button>
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
  methods: {
    testHandleClick: function() {
      // eslint-disable-next-line no-unused-vars
      const data = {
        id: "",
        planInstcItemId: "70386c95-0170-40280981-386c9897-0003",
        remark: "test11"
      };
    }
  }
};
</script>
<style lang="scss" scoped>
.msg {
  margin: 0px 4px;
}
</style>
