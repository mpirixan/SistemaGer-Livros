<template>
<div class="container">
  <div class="title">
    <h1>Cadastro no Sistema</h1>
  </div>
  <div class="cadastroPe">
    <Cadastro-pe msg="Cadastro de Usuários"/>
  </div>
  <div class="home">
      <router-link to="/" custom v-slot="{ navigate }">
        <button @click="navigate" @keypress.enter="navigate" role="link">Login</button>
      </router-link>
  </div>
</div>
</template>
<script>
import CadastroPe from '../components/CadastroPe.vue'
export default {
  components: {
    CadastroPe

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
    "cadastroPe cadastroPe"\
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
