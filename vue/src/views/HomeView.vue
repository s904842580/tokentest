<template>
  <div>
    <el-container>
    <!--  侧边栏    -->
      <el-aside style="width: 200px; min-height: 100vh; background-color: #001529">
        <div style="height: 60px; color: white; display: flex; align-items: center;justify-content: center">
          夏瑾溪
        </div>

        <el-menu router background-color="#001529" text-color="rgba(255,255,255,0.65)" active-text-color="#fff" style="border: none" :default-active="$route.path"> <!--$route.path 当前浏览器访问的路由-->
          <el-menu-item index="/">系统首页</el-menu-item>
          <el-menu-item index="element">Element页面</el-menu-item>
          <el-menu-item>系统首页</el-menu-item>
          <el-menu-item>系统首页</el-menu-item>
          <el-submenu index="">
            <template slot="title">
              <span>信息管理</span>
            </template>
            <el-menu-item>用户信息</el-menu-item>
          </el-submenu>
        </el-menu>

      </el-aside>

      <el-container>
<!--    头部区域    -->
        <el-header>

          <el-breadcrumb separator-class="el-icon-arrow-right" style="margin-left: 10px;margin-top: 10px">
            <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item :to="{ path: 'user' }">用户管理</el-breadcrumb-item>
          </el-breadcrumb>

          <div style="flex: 1; width: 0; display: flex; align-items: center; justify-content: flex-end">
            <el-dropdown placement="bottom">
              <img src="@/assets/real.jpg" alt="" style="width: 40px; height: 40px">
              <el-dropdown-menu slot="dropdown">
                <el-dropdown-item>个人信息</el-dropdown-item>
                <el-dropdown-item>修改密码</el-dropdown-item>
                <el-dropdown-item @click="">退出登录</el-dropdown-item>
              </el-dropdown-menu>
            </el-dropdown>
          </div>
        </el-header>

        <el-main>
           <div style="box-shadow: 0 0 10px rgba(0,0,0,.1); padding: 10px 20px; border-radius: 5px; margin-bottom: 10px">
             早安，骚年，祝你开心每一天！
           </div>
           <div style="display: flex">
             <el-card style="width: 50%; margin-right: 10px">
               <div slot="header" class="clearfix">
                 <span>小标题</span>
               </div>
               <div>
                 主题内容
                 <div style="margin-top: 20px">
                   <div style="margin: 10px 0"><strong>主题色</strong></div>
                   <el-button type="primary">按钮</el-button>
                   <el-button type="success">按钮</el-button>
                   <el-button type="warning">按钮</el-button>
                   <el-button type="danger">按钮</el-button>
                   <el-button type="info">按钮</el-button>
                 </div>
               </div>
             </el-card>

             <el-card style="width: 50%">
               <div slot="header" class="clearfix">
                 <span>渲染用户的数据</span>
                 <div>
                   <el-table :data="users">
                     <el-table-column label="ID" prop="id"></el-table-column>
                     <el-table-column label="用户名" prop="username"></el-table-column>
                     <el-table-column label="姓名" prop="name"></el-table-column>
                     <el-table-column label="地址" prop="address"></el-table-column>
                   </el-table>
                 </div>

               </div>
             </el-card>
           </div>
        </el-main>


      </el-container>
    </el-container>
  </div>
</template>

<script>
import axios from "axios";

import request from "@/utils/request";

export default {
  name: 'HomeView',
  data(){
    return{
      users: []
    }
  },
  mounted(){ //页面加载完成之后触发

    request.get('/user/selectAll').then(res =>{
      this.users = res.data
    })
    /*axios.get('http://localhost:9090/user/selectAll').then(res => {
      console.log(res.data) //后台返回的数据
      this.users = res.data.data*/
      /*res.data = { //数据格式
        code: '200',
        msg: '请求成功',
        data:{

        }
      }*/
    }
  }

</script>
<style>

.el-aside {
  background-color: #D3DCE6;
  color: #333;
  text-align: center;
  line-height: 200px;
}

.el-main {
  background-color: #E9EEF3;
  color: #333;
  text-align: center;
}

.el-menu-inline{
  background-color: #000c17 !important;
}
.el-menu--inline .el-menu-item{
  background-color: #000c17 !important;
}
/*鼠标滑过高亮*/
.el-menu-item:hover, .el-submenu__title:hover{
  color: #fff !important;
}
/*二级标签文字滑过高亮*/
.el-submenu__title:hover{
  color: #fff !important;
}
/*背景蓝色*/
.el-menu-item.is-active{
  background-color: #1890ff !important;
  border-radius: 5px !important;
  margin: 5px !important;
}
/*圆角*/
.el-menu-item{
  height: 40px !important;
  line-height: 40px !important;
  margin: 5px !important;
}
/*阴影*/
.el-aside{
  box-shadow: 2px 0 6px rgba(0,21,41,.35);
}
/*头部阴影*/
.el-header{
  box-shadow: 2px 0 6px rgba(0,21,41,.35);
  display: flex;
  align-items: center;
}
</style>