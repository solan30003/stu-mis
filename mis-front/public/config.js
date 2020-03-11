(function(win) {
  var domain = `http://localhost`;
  win.ENV = {
    LoginTitle: "学生信息管理系统", // 登陆首页标题
    API: `${domain}:8090/api`
  };
})(window);
