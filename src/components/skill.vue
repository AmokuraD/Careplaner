<template>
    <el-container>
        <el-header></el-header>
        <el-container>
            <el-aside>
                <el-menu @open="handleOpen" @close="handleClose">

                </el-menu>
            </el-aside>
            <el-main></el-main>
        </el-container>
    </el-container>
</template>
<script>
export default {
    methods:{
        handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      }
    }
}
</script>