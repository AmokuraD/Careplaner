import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Homepage from '@/components/Homepage'
import Home from '@/components/Home'
import Navbar from '@/components/AppComponents/Navbar'
Vue.use(Router)

export default new Router({
  routes:
    [
      {
        path: '/',
        name: 'Homepage',
        component:Homepage
      },

    {
      path: '/HelloWord',
      name: 'HelloWorld',
      component: HelloWorld
    }, {
      path: '/home',
      name: 'Home',
      component:Home
    }
  ]
})
