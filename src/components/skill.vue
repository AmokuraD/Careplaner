<template>
  <div id="skill-container">
    <div class="skill-item-container" v-for="skill in skillList" :key="skill" @click="goRecommend(skill)">
      <div class="skill-item">
        {{skill}}
      </div>
    </div>
  </div>
</template>
<script>
  import scrollReveal from 'scrollreveal';
  export default {
    data() {
      return {
        skillList: [],
        scrollReveal: scrollReveal()
      }
    },
    methods: {
      updateSkillList(tableName, professionName) {
        this.axios.post('control/result1', {
          "table": tableName,
          "name": professionName
        }).then(
          res => {
            this.skillList = res.data.data;
            console.log(this.skillList);
          }
        ).catch(err => console.log(err));
      },
      goRecommend(skill) {
        this.$router.push({
          name: 'Recommend',
          params: {
            skill: skill
          }
        });
      }
    },
    computed: {
      updateProps() {
        return this.$store.getters.getPropsList;
      }
    },
    watch: {
      updateProps() {
        this.updateSkillList(this.$store.getters.getPropsList[0], this.$store.getters.getPropsList[1]);
      }
    },
    mounted() {
      this.scrollReveal.reveal('.skill-item', {
        delay: 200,
        reset: true,
        distance: '10px',
        easing: 'ease',
        interval: 100,
        scale: 0.9,
        viewFactor: 0.25
      });
      // loadin(this.$route.params.tableName,this.$route.params.professionName);
      this.updateSkillList(this.$store.getters.getPropsList[0], this.$store.getters.getPropsList[1]);
    }
  }

</script>
<style scoped>
  .skill-item-container {
    width: 25%;
    padding: 10px;
  }

  .skill-item {
    background-color: #24252A;
    border: 2px solid #24252A;
    height: 100%;
    width: 100%;
    transition: all 0.5s;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    font-size: 2em;
    color: #595a5f;
  }

  .skill-item:hover {
    border: 2px solid #C06C84;
    color: #C06C84;
  }

  #skill-container {
    padding: 20px;
    display: flex;
    /* display: -webkit-flex; */
    flex-wrap: wrap;
    width: 100%;
    height: 100%;
  }

</style>
