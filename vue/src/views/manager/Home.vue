<template>
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
</template>

<script>
export default {
  name: "Home"
}
</script>

<style scoped>

</style>