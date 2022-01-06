<template>
    <div class="cadastroUsuario">
        <h2>Cadastrar Usuário</h2>
              <div class="grid-container">
                  <div class="grid-inputs">
                    <input type="number" id="idFiscal" placeholder="CPF/CNPJ"  />
                    <input type="text" id="nome" placeholder="NOME COMPLETO"/>
                    <input v-model="data"
                          onfocus="(this.type='date')"
                          onblur="(this.type='text')" id="dataNasc" placeholder="Data Nascimento"/>
                    <select id="tipoPessoa" style="width:200px">
                      <option value="FISICA"> Física</option>
                      <option value="JURIDICA">Jurídica</option>
                    </select>
                      <select id="estadoCivil" placeholder="Estado Civil">
                          <option value="SOLTERO">Solteiro(a)</option>
                          <option value="CASADO">Casado(a)</option>
                          <option value="UNIAOESTAVEL">União Estável</option>
                          <option value="VIUVO">Viúvo(a)</option>
                          <option value="DIVORCIADO">Divorciado(a)</option>
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
  var nome = document.getElementById('nome').value
  var dataNasc = document.getElementById('dataNasc').value
  var tipoPessoa = document.getElementById('tipoPessoa').value
  var estadoCivil = document.getElementById('estadoCivil').value

  dataNasc = String(dataNasc)
  axios.post('http://191.232.183.250:8090/api/v1/pessoas/cadastro', {
    idFiscal: idFiscal,
    nome: nome,
    dataNascimento: dataNasc,
    tipoPessoa: tipoPessoa,
    estadoCivil: estadoCivil
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
