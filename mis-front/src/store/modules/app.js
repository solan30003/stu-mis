const app = {
  state: {
    token: localStorage.getItem("token") ? localStorage.getItem("token") : ""
  },
  mutations: {
    SET_TOKEN: (state, payload) => {
      state.token = payload;
    }
  },
  actions: {}
};

export default app;
