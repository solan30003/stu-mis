import request from "@/utils/request";

const env = window.ENV || {
  API: ""
};

export function searchPlanListSuggest(params) {
  return request({
    url: env.API + `/mis/v1/stu/find`,
    method: "GET",
    params: params
  });
}

//
export function startPlan(data) {
  return request({
    url: env.API + `/mis/v1/stu/add`,
    method: "post",
    data
  });
}
