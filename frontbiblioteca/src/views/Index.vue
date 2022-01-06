<template>
<div class="index">
    <h1>Seja Bem Vindo(a) ao Sistema!</h1>
    <h3>Biblioteca Online</h3>
    <Cadastros />
</div>
</template>

<script>
import Cadastros from '../components/Cadastros.vue'
export default {
  data () {
    return {
    }
  },
  components: {
    Cadastros
  }
}
</script>

<style lang="stylus" scoped>
.Logo
  text-align: center
  margin: 0
  position: absolute
  top: 50%
  left: 50%
  height: 100%;
  width: 100%
  transform: translate(-50%, -50%)
.index
  height: 100%
  width: 100%
  color: rgb(178, 255, 158, 1)
</style>
