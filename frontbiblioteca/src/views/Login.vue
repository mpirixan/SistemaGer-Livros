<template>
<div class="container">
  <div class="title">
    <h1>Login no Sistema</h1>
  </div>
  <div class="Login">
    <Login msg="Login"/>
  </div>
    <div class="home">
      <router-link to="/" custom v-slot="{ navigate }">
        <button @click="navigate" @keypress.enter="navigate" role="link">Home</button>
      </router-link>
  </div>
</div>
</template>
<script>
import Login from '../components/Login.vue'
export default {
  name: 'Login',
  components: {
    Login
  }
}

</script>

<style lang="stylus" scoped>
@import '../styles/cadastros.styl'
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
    "home home"
}

.title {
    color: white
    grid-area: title
    margin: 20px }

.cadastroPe {
    grid-area: cadastroPe }

.cadastroCo {
    grid-area: cadastroCo }

.Submit1 {
    grid-area: Submit1 }

.Submit2 {
    grid-area: Submit2 }

.home {

  justify-self: center
  align-self: center
  grid-area: home
  width: 500px
  height: 20%
}

</style>
