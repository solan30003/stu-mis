import Vue from "vue";
import Router from "vue-router";

Vue.use(Router);

import Layout from "@/views/layout/Layout";
export const constantRouterMap = [
  {
    path: "",
    component: Layout,
    redirect: "jichu",
    children: [
      {
        path: "jichu",
        component: () => import("@/views/portal/share/jichu"),
        name: "jichu",
        meta: {
          title: "基础信息",
          icon: "portal",
          noCache: true,
          requireAuth: true
        }
      },
      {
        path: "xueji",
        component: () => import("@/views/portal/share/xueji"),
        name: "xueji",
        meta: {
          title: "学籍管理",
          icon: "portal"
        }
      },
      {
        path: "banji",
        component: () => import("@/views/portal/share/banji"),
        name: "banji",
        meta: {
          title: "班级管理",
          icon: "portal"
        }
      },
      {
        path: "kecheng",
        component: () => import("@/views/portal/share/kecheng"),
        name: "kecheng",
        meta: {
          title: "课程管理",
          icon: "portal"
        }
      },
      {
        path: "chengji",
        component: () => import("@/views/portal/share/chengji"),
        name: "chengji",
        meta: {
          title: "成绩管理",
          icon: "portal"
        }
      },
      {
        path: "fenxi",
        component: () => import("@/views/portal/share/fenxi"),
        name: "fenxi",
        meta: {
          title: "数据分析",
          icon: "portal"
        }
      },
      {
        path: "xitong",
        component: () => import("@/views/portal/share/xitong"),
        name: "xitong",
        meta: {
          title: "系统管理",
          icon: "portal"
        }
      },
      {
        path: "404",
        component: () => import("@/views/layout/components/404"),
        name: "404",
        meta: {
          title: "学生信息管理系统",
          icon: "error",
          noCache: true
        }
      },
      {
        path: "500",
        component: () => import("@/views/layout/components/500"),
        name: "500",
        meta: {
          title: "学生信息管理系统",
          icon: "error",
          noCache: true
        }
      }
    ]
  }
];

const router = new Router({
  mode: "history", // require service support
  base: process.env.BASE_URL,
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRouterMap
});

export default router;
