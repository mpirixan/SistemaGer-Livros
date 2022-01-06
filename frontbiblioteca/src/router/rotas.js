import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import CadastroPe from '../views/CadastroPessoas.vue'
import Busca from '../views/Busca.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/Cadastro',
    name: 'Cadastro',
    component: CadastroPe
  },
  {
    path: '/busca',
    name: 'Busca',
    component: Busca
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
