<template>
  <div id="app">
    <el-container>
      <el-header>
        <mynavbar></mynavbar>
      </el-header>
      <el-main>
        <router-view />
      </el-main>
    </el-container>
  </div>
</template>
<script>
  import mynavbar from './components/Navbar.vue'
  export default {
    name: 'app',
    components:{
      mynavbar
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
    background-image: url("https://webgradients.com/public/webgradients_png/008%20Rainy%20Ashville.png");
  }

</style>
