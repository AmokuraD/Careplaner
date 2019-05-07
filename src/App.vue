<template>
  <div id="app">
    <Main/>
  </div>
</template>
<script>
  import mynavbar from './components/Navbar.vue';
  import Main from './components/Main.vue'
  export default {
    name: 'app',
    components:{
      mynavbar,
      Main
    }
  }

</script>
<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #0c0c12;
    margin-top: 0px;
  }

</style>
