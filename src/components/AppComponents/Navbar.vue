<template>
  <el-menu theme="dark" :default-active="activeIndex"
           class="el-menu-demo" mode="horizontal" @select="handleSelect">
    <el-menu-item index="1">Home</el-menu-item>
    <el-menu-item index="2">recommendation</el-menu-item>
    <el-submenu index="3">
      <template slot="title">Position</template>
      <el-menu-item index="3-1">fore-end</el-menu-item>
      <el-menu-item index="3-2">backstage</el-menu-item>
      <el-menu-item index="3-3">Other</el-menu-item>
    </el-submenu>
    <el-menu-item index="4">About Us</el-menu-item>
  </el-menu>
</template>
<script>
  export default {
    data () {
      return {
        activeIndex: '1',
        activeIndex2: '1'
      }
    },
    methods: {
      handleSelect (key, keyPath) {
        console.log(key, keyPath)
      }
    }
  }
</script>
