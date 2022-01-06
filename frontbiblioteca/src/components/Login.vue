<template>
    <div class="login">
        <h1>LOGIN</h1>
        <h2>Cadastrar Pessoas</h2>
              <div class="grid-container">
                  <div class="grid-inputs">
                    <input type="email" id="email" placeholder="email"  />
                    <input type="password" id="senha" placeholder="senha"/>
                  <div class="grid-item">
                      <div id="cadastro">
                        <button v-on:click="cadastro()">Login</button>
                      </div>
                  </div>
              </div>
            </div>
    </div>
</template>
<script>
function login () {
  const axios = require('axios').default
  var email = document.getElementById('email').value
  var senha = document.getElementById('senha').value

  axios.get('http://localhost:8080/api/v1/contas/cadastro/', {
    email: email,
    senha: senha
  })
    .then(function (response) {
      console.log(response)
      const jsonObj = JSON.stringify(response.data, undefined, 4)
      window.alert('Dados validados com sucesso\n' + jsonObj)
    })
    .catch(function (error) {
      console.log(error)
    })
}

export default {
  methods: {
    login () {
      login()
    }
  }

}

</script>

<style lang="stylus" scoped>
@import '../styles/login.styl'
</style>
