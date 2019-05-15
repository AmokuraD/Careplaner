<template>
  <div id="recommend-container">
    <div class="list-title">书籍推荐</div>
    <div class="list-container">
      <div class="card-container" v-for="book in bookList" :key="book.id">
        <div class="card-header book-card-header">
          <img :src="book.image" alt="">
          <a :href="book.url">
            <div class="header-container book-card-header-container">
              <div class="div1">{{book.publisher}}</div>
              <div class="div2">{{book.intro}}</div>
              <i class="el-icon-d-arrow-right icon"></i>
            </div>
          </a>
        </div>
        <div class="card-body">
          <div class="card-title">{{book.name}}</div>
          <div class="card-author">{{book.author}}</div>
        </div>
      </div>
    </div>
    <div class="list-title">学校课程推荐</div>
    <div class="list-container">
      <div class="card-container" v-for="course in courseList" :key="course.name">
        <div class="card-header  book-card-header">
          <img src="../../static/images/whu.jpg" alt="">
          <div class="header-container book-card-header-container">
            <i class="el-icon-d-arrow-right icon"></i>
          </div>
        </div>
        <div class="card-body">
          <div class="card-title">{{course.name}}</div>
        </div>
      </div>
    </div>
    <div class="list-title">网课推荐</div>
    <div class="list-container">
      <div class="card-container" v-for="netcourse in netcourseList" :key="netcourse.name">
        <div class="card-header">
          <img :src="netcourse.image" alt="">
          <a :href="netcourse.url">
            <div class="header-container">
              <div class="div1">{{netcourse.type}}</div>
              <i class="el-icon-d-arrow-right icon"></i>
            </div>
          </a>
        </div>
        <div class="card-body">
          <div class="card-title">{{netcourse.name}}</div>
          <div class="card-author">{{netcourse.ts}}</div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
  import Menu from '@/components/Menu.vue';
  import scrollReveal from 'scrollreveal';
  export default {
    components: {
      Menu
    },
    data() {
      return {
        bookList: [],
        courseList: [],
        netcourseList: [],
        scrollReveal: scrollReveal()
      }
    },
    mounted() {
      console.log(this.$route.params.skill);
      this.axios.post('control/result2', {
        "skill": this.$route.params.skill
      }).then(
        res => {
          console.log(res);
          this.bookList = res.data.data.bookList;
          this.courseList = res.data.data.courseList;
          this.netcourseList = res.data.data.netcourseList;
        }
      ).catch(err => console.log(err));
    },
    updated(){
      
    }
  }

</script>
<style scoped>
  p {
    word-wrap: break-word;
    word-break: break-all;
    overflow: hidden;

  }

  img {
    width: 100%;
    height: 100%;
  }

  .icon {
    color: #f67280;
    font-size: 2em;
    padding-top: 40px;
  }
  .list-title{
    font-size: 2em;
    color: #595a5f;
    margin-top: 40px;
  }

  .recommend-card {
    margin: 10px;
    background-color: #24252A;
    color: #595a5f;
    border: 0px;
  }

  .card-container {
    width: 400px;
    margin: 20px;
  }

  .card-header {
    position: relative;
    width: 100%;
    height: 250px;
  }

  .book-card-header {
    height: 400px;
  }

  .list-container {
    display: flex;
    flex-wrap: wrap;
    justify-content: flex-start;
  }

  .header-container {
    color: #ccc;
    position: absolute;
    left: 0px;
    top: 0px;
    z-index: 2;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    width: 100%;
    height: 100%;
    background-color: rgba(36, 37, 42, 0.9);
    opacity: 0;
    transition: all 0.5s;
  }

  .header-container:hover {
    opacity: 1;
  }

  .card-body {
    display: flex;
    flex-direction: column;
    text-align: left;
    background-color: #24252A;
    padding: 20px;
  }

  .card-title {
    color: #CCC;
    font-size: 1.2em;
    font-weight: bold;
    margin: 10px 0px;
  }

  .card-author {
    color: #595a5f;
    font-size: 1em;
  }

  #recommend-container {
    padding: 20px;
    width: 100%;
  }

</style>
