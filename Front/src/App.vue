<template>
  <div id="app">
    <Main/>
  </div>
</template>
<script>
  import Main from './components/Main.vue';
  import Recommend from './components/Recommend.vue'
  export default {
    name: 'app',
    components:{
      Main,
      Recommend
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
