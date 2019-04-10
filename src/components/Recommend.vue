<template>
  <el-main>
    <div id="main_container">
      <el-card id="vedioR">
        <el-row>
          <el-col :span="6">
            <img id="iJava"
              :src="data.imgSrc"
              alt="">
          </el-col>
          <el-col :span="18">
            <p>{{data.title}}</p>
            <p>{{profession}}</p>
          </el-col>
        </el-row>
      </el-card>
    </div>
  </el-main>
</template>
<script>
  export default {
    data() {
      switch (this.$route.query.profession) {
        case "Java":
          return {
            profession: this.$route.query.profession,
            data: {
              imgSrc: "https://edu-image.nosdn.127.net/B2B4D218926FB3D1D7A569B7D9EBADA4.png?imageView&thumbnail=426y240&quality=100",
              title: "面向对象程序设计——Java语言"
            }
          }
        default:
          return {
            profession: this.$route.query.profession,
            data: {
              imgSrc: '',
              title: ''
            }
          }
      }
    }
  }

</script>
<style scoped>
  #main_container {
    width: 60%;
    margin: auto;
  }

  #iJava {
    width: 300px;
  }

</style>
