<template>
    <div class="cadastroUsuario">
        <h2>Cadastrar Usuário</h2>
              <div class="grid-container">
                  <div class="grid-inputs">
                    <input type="text" id="nome" placeholder="NOME COMPLETO"/>
                    <input type="text" id="apelido" placeholder="APELIDO"  />
                    <input type="password" id="senha" placeholder="SENHA"/>
                    <input type="email" id="email" placeholder="EMAIL"/>
                  </div>
                  <div class="grid-item">
                      <div id="cadastro">
                        <button v-on:click="cadastro()">Cadastro</button>
                      </div>
                  </div>
              </div>
    </div>
</template>

<script>
function cadastro () {
  const axios = require('axios').default
  var nome = document.getElementById('nome').value
  var apelido = document.getElementById('apelido').value
  var senha = document.getElementById('senha').value
  var email = document.getElementById('email').value

  dataNasc = String(dataNasc)
  axios.post('http://localhost:8056/serviços-cliente/cadastro-usuario', {
    nome: nome,
    apelido: apelido,
    senha: senha,
    email: email
  })
    .then(function (response) {
      console.log(response)
      const jsonObj = JSON.stringify(response.data, undefined, 4)
      window.alert('Dados salvos com sucesso\n' + jsonObj)
    })
    .catch(function (error) {
      console.log(error)
    })
}

export default {
  methods: {
    cadastro () {
      cadastro()
    }
  }

}

</script>

<style lang="stylus" scoped>
@import '../styles/cadastros.styl'
</style>
