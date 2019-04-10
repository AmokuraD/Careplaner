import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Skill from '@/components/Skill'
import Recommend from '@/components/Recommend'
Vue.use(Router)

export default new Router({
  routes: [{
    path: '/',
    redirect: '/home'
  }, {
    path: '/home',
    name: 'Home',
    component: Home
  }, {
    path: '/skill',
    name: 'Skill',
    component: Skill
  }, {
    path: '/recommend',
    name: 'Recommend',
    component: Recommend
  }]
})
