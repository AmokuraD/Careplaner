<template>
  <el-container>
    <el-header></el-header>
    <el-main>
      <el-card id="vedioR">
        <el-row>
          <el-col :span="6">
            <img
              src="https://edu-image.nosdn.127.net/B2B4D218926FB3D1D7A569B7D9EBADA4.png?imageView&amp;thumbnail=426y240&amp;quality=100"
              alt="">
          </el-col>
          <el-col :span="18">
            <p>面向对象程序设计——Java语言</p>
            <p>{{profession}}</p>
          </el-col>
        </el-row>
      </el-card>
    </el-main>
  </el-container>
</template>
<script>
  export default {
    data() {
      return {
        profession: this.$route.query.profession,
        data:{
          imgSrc:'',
          title:''
        }
      }
    }
  }

</script>
<style>

</style>
