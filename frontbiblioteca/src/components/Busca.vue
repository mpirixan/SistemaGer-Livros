<template>
    <div class="buscarPessoas">
        <h2>Buscar Pessoas na Plataforma</h2>
            <div class="container">
                <div class="Buscar">
                  <div id="busca">
                    <h3>Por Nome</h3>
                    <input type="text" id="nome" Nome />
                    <button v-on:click="buscaNome()">Buscar</button>
                    <h3>Por identificação fiscal</h3>
                    <input type="text" id="idFiscal" IdFiscal />
                    <button v-on:click="buscaIdFiscal()">Buscar</button>
                  </div>
                <div class="Dados">
                  <span id="response">
                  </span>
                </div>
            </div>
        <div id="nav">
        <router-link to="/" custom v-slot="{ navigate }">
        <button @click="navigate" @keypress.enter="navigate" role="link">Home</button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
function buscaNome () {
  var nome = document.getElementById('nome').value
  const axios = require('axios').default
  axios.get('http://localhost:8090/api/v1/pessoas/nome/' + nome)
    .then(function (response) {
      console.log(response.data)
      const jsonObj = JSON.stringify(response.data, null, '\n')
      // document.getElementById('response').innerHTML = '<pre>' + jsonObj + '</pre>'
      window.alert('Dados \n' + jsonObj)
    })
    .catch(function (error) {
      // const jsonObj = JSON.stringify(error.response.data, undefined, 4)
      document.getElementById('response').innerHTML = 'Elemento não encontrado'
      console.log(error.response)
    })
    .then(function () {
    // always executed
    })
}

function buscaIdFiscal () {
  var idFiscal = document.getElementById('idFiscal').value
  const axios = require('axios').default
  axios.get('http://191.232.183.250:8888/api/v1/pessoas/cpf-cnpj/' + idFiscal)
    .then(function (response) {
      console.log(response.data)
      const jsonObj = JSON.stringify(response.data, undefined, '\n')
      // document.getElementById('response').innerHTML = jsonObj
      window.alert('Dados \n' + jsonObj)
    })
    .catch(function (error) {
    // handle error
      console.log(error)
    })
    .then(function () {
    // always executed
    })
}

export default {
  methods: {
    buscaNome () {
      buscaNome()
    },
    buscaIdFiscal () {
      buscaIdFiscal()
    },
    showAlert () {
      // Use sweetalert2
      this.$swal.fire()
    }
  }
}
</script>

<style lang="stylus" scoped>
@import '../styles/busca.styl'
</style>
