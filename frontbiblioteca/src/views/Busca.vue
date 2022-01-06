<template>
<div class="buscaPessoas">
    <h1> Busca de Pessoas</h1>
    <img alt="Basa Logo" src="../assets/logo-header-2.png">
    <Busca msg="Busca de Pessoas"/>
</div>
</template>

<script>
import Busca from '../components/Busca.vue'

export default {
  components: {
    Busca
  }
}
</script>

<style lang="stylus" scoped>
img
  margin: 15px

.buscaPessoas{
  color: #fff
}
</style>
