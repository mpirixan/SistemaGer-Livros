<template>
<div class="container">
  <div class="title">
    <h1>Login no Sistema</h1>
  </div>
  <div class="Login">
    <Login msg="Login"/>
  </div>
    <div class="cadastro">
        <router-link to="/Cadastros" custom v-slot="{ navigate }">
            <button @click="navigate" @keypress.enter="navigate" role="link">Cadastros</button>
        </router-link>

  </div>
</div>
</template>
<script>
import Login from '../components/Login.vue'
export default {
  components: {
    Login
  }
}

</script>

<style lang="stylus" scoped>
@import '../styles/login.styl'
.container {
  display: inline-grid
  grid-template-columns: 1fr 1fr
  grid-template-rows: 0.5fr 1.5fr 0.3fr 1.7fr
  grid-auto-columns: 1fr
  grid-auto-rows: 1fr
  gap: 0px 0px
  grid-auto-flow: row
  grid-template-areas:
    "title title"\
    "Login Login"\
    "cadastro cadastro"
}

.title {
    color: white
    grid-area: title
    margin: 20px }

.Login {
    grid-area: Login }

.Submit1 {
    grid-area: Submit1 }

.Submit2 {
    grid-area: Submit2 }

.cadrasto {

  justify-self: center
  align-self: center
  grid-area: home
  width: 500px
  height: 20%
}

</style>
