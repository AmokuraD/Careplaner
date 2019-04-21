<template>
  <el-carousel indicator-position="outside" type="card" height="500px" width="500px">
    <el-carousel-item v-for="item in imgList" :key="item.id">
      <el-row>
        <el-col :span="24"><img ref="imgHeight" :src="item.idView" class="banner_img" @load="imgLoad"/></el-col>
      </el-row>
    </el-carousel-item>
  </el-carousel>
</template>
<script>


  export default {
    name: 'Home',
    data: function () {

      return {
        imgHeight:"",
        imgList:[
          {id: 0, idView: require('../assets/careplanner_4.jpeg')},
          {id: 1, name: '详情', idView: require('../assets/careplanner_5.jpeg')},
          {id: 2, name: '详情', idView: require('../assets/careplanner_6.jpeg')}
        ]


      }
    },
    methods:{

      imgLoad(){
        this.$nextTick(()=>{
            this.imgHeight=this.$refs.imgHeight[0].height
            console.log(this.$refs.imgHeight[0].height);
          }
        )


      }
    },
    mounted(){
      this.imgLoad();
      window.addEventListener('resize',()=>{
          this.imgHeight=this.$refs.imgHeight[0].height
          this.imgLoad();
        },false

      )
    }

  }
</script>
<style scoped>


  {
    line-height: 500px;

    line-width:500px;
    margin: 0
  ;
  }
  .el-carousel__item:nth-child(2n) {
    background-color:#e5e6e1;

  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: #fbc2eb;
  }
</style>
