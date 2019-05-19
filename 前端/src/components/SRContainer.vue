<template>
  <el-container id="sr-page-container">
    <el-aside id="menu-container" data-simplebar>
      <Menu />
    </el-aside>
    <el-main id="sr-container">
      <router-view></router-view>
    </el-main>
  </el-container>
</template>
<script>
  import Menu from '@/components/Menu.vue';
  export default {
    components: {
      Menu
    },
    mounted() {
      this.$router.push('/skill');
    }
  }

</script>
<style scoped>
  #sr-page-container {
    height: 100%;
    width: 100%;
  }

  #menu-container {
    background-color: #24252A;
  }

  ::-webkit-scrollbar {
    width: 0px;
  }

</style>
