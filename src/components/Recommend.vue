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
            <p>{{name}}</p> -->
            <!--<Table style="margin-top:120px ;width:auto;align-self: center"></Table>-->
          </el-col>
        </el-row>
      </el-card>
      <el-card id="bookR">
        <el-row>
          <el-col :span="6">

          </el-col>
          <el-col :span="18">{{info}}</el-col>
        </el-row>
      </el-card>
      <el-card id="courseR">
        <el-row>
          <el-col :span="6"></el-col>
          <el-col :span="18"></el-col>
        </el-row>
      </el-card>
    </div>
  </el-main>
</template>
<script>
  import Table from "./Table";
  export default {
    components: {Table},
    data() {
          return {
            profession: this.$route.query.profession,
            data: {
              imgSrc: "https://edu-image.nosdn.127.net/B2B4D218926FB3D1D7A569B7D9EBADA4.png?imageView&thumbnail=426y240&quality=100",
              title: "面向对象程序设计——Java语言"
            }
          }
      },
    mounted(){
      this.axios.get("http://e74ez9.natappfree.cc/servlet/ProductServlet")
      .then(response=>(this.info=response))
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
