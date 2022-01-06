<template>
<div class="container">
<div class="title">
    <h1>Seja Bem Vindo(a) ao Sistema!</h1>
    <h3>Biblioteca online</h3>
</div>
<div class="logo">
    <transition appear>
    </transition>
</div>
    <div class = "opcoes">
        <router-link to="/Login" custom v-slot="{ navigate }">
            <button @click="navigate" @keypress.enter="navigate" role="link">Login</button>
        </router-link>
        <p>-</p>
        <router-link to="/Cadastros" custom v-slot="{ navigate }">
            <button @click="navigate" @keypress.enter="navigate" role="link">Cadastros</button>
        </router-link>

    </div>
</div>
</template>
<script>
</script>

<style lang="stylus" scoped>
@import '../styles/comuns.styl'
.container {
    -webkit-animation: fadein 3s; /* Safari, Chrome and Opera > 12.1 */
    -moz-animation: fadein 3s; /* Firefox < 16 */
    -ms-animation: fadein 3s; /* Internet Explorer */
    -o-animation: fadein 3s; /* Opera < 12.1 */
    animation: fadein 3s;
  display: inline-grid
  grid-auto-columns: 1fr
  grid-auto-rows: 1fr
  grid-template-columns: 1fr
  grid-template-rows: 200px 200px 300px
  gap: 01% 0px
  grid-template-areas:
    "title"\
    "logo"\
    "opcoes"
}
.title {
    grid-area: title
    color: #fff }
.logo {
    grid-area: logo
    background-image: url("../assets/logo-header-2.png")
    background-repeat: no-repeat
    background-size: 150px
    background-position: center
    }
.opcoes {
    grid-area: opcoes }

@keyframes fadein {
    from { opacity: 0; }
    to   { opacity: 1; }
}

/* Firefox < 16 */
@-moz-keyframes fadein {
    from { opacity: 0; }
    to   { opacity: 1; }
}

/* Safari, Chrome and Opera > 12.1 */
@-webkit-keyframes fadein {
    from { opacity: 0; }
    to   { opacity: 1; }
}

/* Internet Explorer */
@-ms-keyframes fadein {
    from { opacity: 0; }
    to   { opacity: 1; }
}

/* Opera < 12.1 */
@-o-keyframes fadein {
    from { opacity: 0; }
    to   { opacity: 1; }
}
</style>
