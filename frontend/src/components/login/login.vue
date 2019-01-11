<template>
    <el-form class="login-container" label-position="left"
             label-width="0px" v-loading="loading">
        <h3 class="login-title">系统登录</h3>
        <el-form-item prop="account">
            <el-input type="text" v-model="loginForm.username"
                      auto-complete="off" placeholder="账号"></el-input>
        </el-form-item>
        <el-form-item prop="checkPass">
            <el-input type="password" v-model="loginForm.password"
                      auto-complete="off" placeholder="密码"></el-input>
        </el-form-item>
        <!--<el-checkbox class="login_remember" v-model="checked"
                     label-position="left">记住密码
        </el-checkbox>-->
        <el-form-item style="width: 100%">
            <el-button type="primary" style="width: 100%" @click="submit">登录</el-button>
        </el-form-item>
    </el-form>
</template>
<script>
    import http from '@/common/http'
    import {mapActions} from 'vuex'

    export default {
        data() {
            return {
                checked: true,
                loginForm: {
                    username: 'admin',
                    password: '111111'
                },
                loading: false
            }
        },
        methods: {
            ...mapActions([
               'login'
            ]),
            submit() {
                this.loading = true
                http.post('/login', {
                    username: this.loginForm.username,
                    password: this.loginForm.password
                }, {
                    // 提交表单数据的转换
                    transformRequest: [function (data) {
                        let ret = ''
                        for (let it in data) {
                            ret += encodeURIComponent(it) + '=' + encodeURIComponent(data[it]) + '&'
                        }
                        return ret
                    }],
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded'
                    }
                }).then((data) => {
                    this.login(data)
                    this.$router.push('/home')
                    this.loading = false
                }).catch((e) => {
                    console.error(e)
                    this.loading = false
                })
            }
        }
    }
</script>
<style scoped lang="less">
    @import "../../common/less/variable";

    .login-container {
        border-radius: 15px;
        background-clip: padding-box;
        margin: 180px auto;
        width: 350px;
        padding: 35px 35px 15px 35px;
        background: @background-color-shadow;
        border: 1px solid @border-color;
        box-shadow: 0 0 25px @shadow-color;

        .login-title {
            margin: 0 auto 40px auto;
            text-align: center;
            color: @text-color;
        }
    }

</style>
