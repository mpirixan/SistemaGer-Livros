import Vue from 'vue'
import App from './App.vue'
import router from './router'
import VueSweetalert2 from 'vue-sweetalert2'
Vue.config.productionTip = false

new Vue({
  router,
  VueSweetalert2,
  render: h => h(App)
}).$mount('#app')
