<template>
  <el-menu :default-active="activeIndex" class="el-menu-vertical" @select="handleSelect" background-color="#24252A"
    text-color="#ccc" active-text-color="#f67280">
    <el-submenu index="mf">
      <template slot="title">
        <span>移动开发及前端</span>
      </template>
      <el-menu-item index="mf--Android">Android</el-menu-item>
      <el-menu-item index="mf--COCOS2D-X">COCOS2D-X</el-menu-item>
      <el-menu-item index="mf--Flash">Flash</el-menu-item>
      <el-menu-item index="mf--HTML5">HTML5</el-menu-item>
      <el-menu-item index="mf--iOS">iOS</el-menu-item>
      <el-menu-item index="mf--Javascrip">Javascrip</el-menu-item>
      <el-menu-item index="mf--U3D">U3D</el-menu-item>
      <el-menu-item index="mf--Web前端">Web前端</el-menu-item>
    </el-submenu>
    <el-submenu index="operation">
      <template slot="title">
        <span>运维</span>
      </template>
      <el-menu-item index="operation--DBA">DBA</el-menu-item>
      <el-menu-item index="operation--系统工程师">系统工程师</el-menu-item>
      <el-menu-item index="operation--网络工程师">网络工程师</el-menu-item>
      <el-menu-item index="operation--运维工程师">运维工程师</el-menu-item>
      <el-menu-item index="operation--运维开发">运维开发</el-menu-item>
    </el-submenu>
    <el-submenu index="develop">
      <template slot="title">
        <span>开发</span>
      </template>
      <el-menu-item index="develop--.NET">.NET</el-menu-item>
      <el-menu-item index="develop--ASP">ASP</el-menu-item>
      <el-menu-item index="develop--C#">C#</el-menu-item>
      <el-menu-item index="develop--C++">C++</el-menu-item>
      <el-menu-item index="develop--C">C</el-menu-item>
      <el-menu-item index="develop--Delphi">Delphi</el-menu-item>
      <el-menu-item index="develop--Docker">Docker</el-menu-item>
      <el-menu-item index="develop--Go">Go</el-menu-item>
      <el-menu-item index="develop--Hadoop">Hadoop</el-menu-item>
      <el-menu-item index="develop--HBase">HBase</el-menu-item>
      <el-menu-item index="develop--Java">Java</el-menu-item>
      <el-menu-item index="develop--Node.JS">Node.JS</el-menu-item>
      <el-menu-item index="develop--Openstack">Openstack</el-menu-item>
      <el-menu-item index="develop--Php">Php</el-menu-item>
      <el-menu-item index="develop--Python">Python</el-menu-item>
      <el-menu-item index="develop--Ruby">Ruby</el-menu-item>
      <el-menu-item index="develop--Spark">Spark</el-menu-item>
      <el-menu-item index="develop--全栈工程师">全栈工程师</el-menu-item>
      <el-menu-item index="develop--推荐系统">推荐系统</el-menu-item>
      <el-menu-item index="develop--搜索引擎">搜索引擎</el-menu-item>
      <el-menu-item index="develop--数据挖掘">数据挖掘</el-menu-item>
      <el-menu-item index="develop--自然语言处理">自然语言处理</el-menu-item>


    </el-submenu>
    <el-submenu index="highend">
      <template slot="title">
        <span>高端职位</span>
      </template>
      <el-menu-item index="highend--CTO">CTO</el-menu-item>
      <el-menu-item index="highend--安全专家">安全专家</el-menu-item>
      <el-menu-item index="highend--技术合伙人">技术合伙人</el-menu-item>
      <el-menu-item index="highend--技术总监">技术总监</el-menu-item>
      <el-menu-item index="highend--技术经理">技术经理</el-menu-item>
      <el-menu-item index="highend--架构师">架构师</el-menu-item>
      <el-menu-item index="highend--运维总监">运维总监</el-menu-item>
      <el-menu-item index="highend--项目总监">项目总监</el-menu-item>
    </el-submenu>
    <el-submenu index="test">
      <template slot="title">
        <span>测试</span>
      </template>
      <el-menu-item index="test--功能测试">功能测试</el-menu-item>
      <el-menu-item index="test--性能测试">性能测试</el-menu-item>
      <el-menu-item index="test--测试工程师">测试工程师</el-menu-item>
      <el-menu-item index="test--测试开发">测试开发</el-menu-item>
      <el-menu-item index="test--硬件测试">硬件测试</el-menu-item>
      <el-menu-item index="test--自动化测试">自动化测试</el-menu-item>
    </el-submenu>
  </el-menu>
</template>
<script>
  export default {
    data() {
      return {
        propsList: [],
        activeIndex: 'mf--Android'
      }
    },
    methods: {
      handleSelect(index) {
        this.propsList = index.split('--');
        if (this.propsList.length === 2) {
          this.activeIndex = index;
          this.$store.dispatch('updatePropsList', this.propsList);
          this.$router.push('/skill');
        }
      }
    }
  }

</script>
<style scoped>
  .el-menu-vertical {
    margin-top: 84px;
    border-right: 0px;
    overflow: hidden;
  }

  
</style>
