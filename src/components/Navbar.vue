<template>
  <div id="nav">
  <el-menu :default-active="activeIndex" class="el-menu-demo" background-color="#a6c0fe"  mode="horizontal" @select="handleSelect" router>
    <el-menu-item index="home">Home</el-menu-item>
    <el-menu-item index="skill">Skill</el-menu-item>
    <el-submenu index="3">
      <template slot="title">Position</template>
      <el-menu-item index="3-1">fore-end</el-menu-item>
      <el-menu-item index="3-2">backstage</el-menu-item>
      <el-menu-item index="3-3">Other</el-menu-item>
    </el-submenu>
    <el-menu-item index="4">About Us</el-menu-item>
  </el-menu>
  </div>
</template>
<script>
  export default {
    data() {
      return {
        activeIndex: 'home',
        activeIndex2: '1'
      }
    },
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath)
      }
    }
  }
</script>
<style>


</style>
