<template>
  <div class="route-path">
    <el-popover ref="popoverPath" placement="bottom" trigger="click" popper-class="stu-path" @show="show">
      <el-menu default-active="jichu" class="el-menu-vertical-demo" router @open="handleOpen" @close="handleClose">
        <el-menu-item index="jichu">
          <i class="el-icon-thumb"></i>
          <span slot="title">基础信息</span>
        </el-menu-item>
        <el-menu-item index="xueji">
          <i class="el-icon-menu"></i>
          <span slot="title">学籍管理</span>
        </el-menu-item>
        <el-menu-item index="banji">
          <i class="el-icon-office-building"></i>
          <span slot="title">班级管理</span>
        </el-menu-item>
        <el-menu-item index="kecheng">
          <i class="el-icon-setting"></i>
          <span slot="title">课程管理</span>
        </el-menu-item>
        <el-menu-item index="chengji">
          <i class="el-icon-menu"></i>
          <span slot="title">成绩管理</span>
        </el-menu-item>
        <el-menu-item index="fenxi">
          <i class="el-icon-menu"></i>
          <span slot="title">数据分析</span>
        </el-menu-item>
        <el-menu-item index="xitong">
          <i class="el-icon-menu"></i>
          <span slot="title">系统管理</span>
        </el-menu-item>
      </el-menu>
      <i
        slot="reference"
        class="font_family icon-liebiao"
        style="font-size: 24px; color: #fff; margin-right: 7px; cursor: pointer"
      ></i>
    </el-popover>
  </div>
</template>

<script>
import {} from "@/api/serviceAll.js";
export default {
  data() {
    return {
      isCollapse: true,
      activeName: "first",
      pathData: [],
      collected: []
    };
  },
  computed: {},
  watch: {},
  mounted() {},
  methods: {
    handelSelect(key, keyPath) {
      console.log(keyPath);
    },
    show() {},
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    }
  }
};
</script>

<style lang="scss" scoped>
.route-path {
  margin-right: 12px;
}
.icon-shujuziyuanfuwu {
  color: #909399;
  width: 50px !important;
  display: inline-block !important;
}
.icon-shujuziyuanfuwu:before {
  display: inline-block;
  width: 50px;
}
</style>
<style>
.stu-path {
  border-radius: 0 !important;
  height: calc(100vh - 70px);
  top: 50px !important;
  overflow: hidden;
  position: fixed;
  left: 0 !important;
  width: 268px !important;
}
.el-popover {
  border: none;
}
.el-menu--popup {
  border-radius: 0px;
}
.stu-path .stu-dh-title {
  width: 150px;
  border: none;
}
.stu-path .el-tabs__nav-scroll {
  display: flex;
  justify-content: center;
  background: #97a8c3;
  height: 60px;
  line-height: 60px;
}
.stu-path .el-menu-item,
.el-submenu__title {
  font-size: 16px;
  color: #53524b;
}
.el-menu-item {
  color: #53524b;
  font-family: "PingFang SC";
}
.stu-path #tab-first {
  color: #fff !important;
  font-family: Helvetica;
  font-size: 14px;
}
.stu-path #tab-second {
  color: #fff !important;
  font-family: "PingFang SC";
  font-size: 14px;
}
#tab-second .el-icon-star-on {
  background: transparent !important;
}
.el-menu .el-icon-star-on {
  color: #0090ff !important;
}
.el-menu--vertical {
  top: 50px !important;
  width: 272px !important;
  left: 263px !important;
}
.el-menu {
  border-right: none;
  overflow: auto;
  height: calc(100vh - 70px);
}
.el-menu--collapse > .el-menu-item span,
.el-menu--collapse > .el-submenu > .el-submenu__title span {
  overflow: initial !important;
  visibility: initial !important;
}
.el-submenu__title * {
  vertical-align: initial !important;
}
.stu-tl {
  color: #c0c4cc !important;
  cursor: not-allowed !important;
  padding-left: 44px;
}
.pl40 {
  padding-left: 60px !important;
}
.pl-44 {
  padding-left: 44px !important;
  font-size: 16px;
}
.pl44 {
  padding-left: 44px !important;
}
.el-menu-item,
.el-submenu__title {
  height: 40px;
  line-height: 40px;
}
.icon-width {
  width: 50px !important;
  display: inline-block;
}
.sc-icon {
  float: right;
  margin-top: 12px;
  font-size: 18px !important;
  width: 35px;
}
</style>
