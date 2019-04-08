<template>
  <el-container>
    <el-header>
    </el-header>
    <el-container>
      <el-aside style="width:auto;">
        <el-button type="primary" icon="el-icon-menu" @click="handleCollapse"></el-button>
        <el-menu :default-active="activeIndex" @select="handleSelect" class="el-menu-vertical" :collapse="isCollapse"
          collapse-transition>
          <el-menu-item class="el-menu-item" v-for="profession in professions" :key="profession.id"
            :index="profession.id">
            <img :src="'../static/icon/my-icon'+profession.id+'.png'" class="p_icon">
            <span slot="title">{{profession.name}}</span>
          </el-menu-item>
        </el-menu>
      </el-aside>
      <el-main class="el-main">
        <div id="main_container">
          <div id="p_container">
            <el-card class="p_card" v-for="data in professions[activeIndex].datas" :key="data.index" :index="data.index" shadow="hover" >
              <div @click="goRecommend(data)">{{data}}</div>
            </el-card>
          </div>
        </div>
      </el-main>
    </el-container>
  </el-container>
</template>
<script>
  export default {
    data() {
      return {
        professions: [{
          "id": "0",
          "name": "后端开发",
          "datas": ["Java", "C++", "PHP", "数据挖掘", "搜索算法", "精准推荐", "C", "C#", "全栈工程师", ".NET", "Hadoop", "Python",
            "Delphi", "VB", "Perl", "Ruby", "Node.js", "Go", "ASP", "Shell", "区块链", "后端开发其他"
          ]
        }, {
          "id": "1",
          "name": "移动开发",
          "datas": ["HTML5", "Android", "iOS", "WP", "移动开发其他"]
        }, {
          "id": "2",
          "name": "前端开发",
          "datas": ["web前端", "Flash", "JavaScript", "U3D", "COCOS2D-X", "前端开发其他"]
        }, {
          "id": "3",
          "name": "人工智能",
          "datas": ["深度学习", "机器学习", "图像处理", "图像识别", "语音识别", "机器视觉", "算法工程师", "自然语言处理"]
        }, {
          "id": "4",
          "name": "测试",
          "datas": ["测试工程师", "自动化测试", "功能测试", "性能测试", "测试开发", "游戏测试", "白盒测试", "灰盒测试", "黑盒测试", "手机测试", "硬件测试",
            "测试经理", "测试其他"
          ]
        }, {
          "id": "5",
          "name": "运维",
          "datas": ["运维工程师", "运维开发工程师", "网络工程师", "系统工程师", "IT支持", "IDC", "CDN", "F5", "系统管理员", "病毒分析", "WEB安全",
            "网络安全", "系统安全", "运维经理", "运维其他"
          ]
        }, {
          "id": "6",
          "name": "DBA",
          "datas": ["MySQL", "SQLServer", "Oracle", "DB2", "MongoDB", "ETL", "Hive", "数据仓库", "DBA其他"]
        }, {
          "id": "7",
          "name": "高端职位",
          "datas": ["技术经理", "技术总监", "架构师", "CTO", "运维总监", "技术合伙人", "项目总监", "测试总监", "安全专家", "高端技术职位其他"]
        }, {
          "id": "8",
          "name": "项目管理",
          "datas": ["项目经理", "项目助理"]
        }, {
          "id": "9",
          "name": "企业软件",
          "datas": ["实施工程师", "售前工程师", "售后工程师", "BI工程师", "企业软件其他"]
        }],
        activeIndex: '0',
        isCollapse: true
      }
    },
    computed: {},
    methods: {
      handleSelect(key, keyPath) {
        this.activeIndex = key;
        console.log(key, keyPath);
      },
      handleCollapse() {
        this.isCollapse = !this.isCollapse;
      },
      goRecommend(profession){
        this.$router.push({
          path:'/recommend',
          query:{
            profession:profession
          }
        })
      }
    }
  }

</script>
<style>
  .el-container {
    height: 100%;
  }

  .el-aside {
    border-right: 1px solid #ccc;
    height: 100%;
  }

  .el-menu-item {
    text-align: left;
    line-height: 64px;
    height: 64px;
  }

  .el-menu-vertical:not(.el-menu--collapse) {
    width: 200px;
    min-height: 400px;
  }

  .el-menu {
    border: 0px;
  }

  .el-menu--collapse {
    width: 96px;
  }

  .p_icon {
    height: 48px;
    width: 48px;
    padding-right: 26px;
  }

  .p_card {
    height: 120px;
    width: 160px;
    margin: 10px;
    border-radius: 10px;
  }

  #main_container {
    height: 100%;
  }

  #p_container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
  }

</style>
