<template>
    <div class="cadastroContas">
        <h2>Cadastrar Contas</h2>
        <div class="grid-container">
    <div class="grid-inputs">
    <input type="number" id="idFiscal" placeholder="CPF/CNPJ">
    <select id="agencia" style="flex-grow: 1">
        <option value="98">Ananindeua - Cidade Nova</option>
        <option value="57">Ananindeua - Centro</option>
        <option value="59">Belém - Atalaia</option>
        <option value="07">Belém - Campina</option>
    </select>
    <select id="tipoConta" style="flex-grow: 1">
        <option value="CONTA_CORRENTE"> Conta Corrente</option>
        <option value="POUPANÇA">Conta Poupança</option>
        <option value="PJ">Conta Jurídica</option>
    </select>
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
  var idFiscal = document.getElementById('idFiscal').value
  var agencia = document.getElementById('agencia').value
  var senha = document.getElementById('senha').value
  var tipoConta = document.getElementById('tipoConta').value

  axios.post('http://191.232.183.250:8090/api/v1/contas/cadastro/' + idFiscal, {
    agencia: agencia,
    senha: senha,
    tipoConta: tipoConta
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
