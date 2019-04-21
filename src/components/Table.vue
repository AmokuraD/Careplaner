<template>

  <el-table
    :data="tableData"
    stripe>
    <el-table-column
      prop="name"
      label="技能点">
    </el-table-column>
    <!--<el-table-column-->
      <!--prop="book"-->
      <!--label="书籍"-->
      <!--width="180">-->
    <!--</el-table-column>-->
    <!--<el-table-column-->
      <!--prop="address"-->
      <!--label="网址"-->
      <!--width="180">-->
    <!--</el-table-column>-->

  </el-table>

</template>

<script>

  export default {
    name:'Table',

    data() {
      return {
        tableData:
        [
          {
          name:null,
          // book: '《第一行代码》',
          // address:'https://pan.baidu.com/s/1N3A9JNyTT4SnhuJaS9N16w'
        }
        // , {
        //   name: 'Java开发实习生',
        //   book: '《Java编程思想》',
        //   address: 'https://pan.baidu.com/share/init?surl=d07Kp4'
        // }
        ]
      }
    }

  }
</script>

<style>


</style>
