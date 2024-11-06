
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import StandardManagementAuthGrpManager from "./components/listers/StandardManagementAuthGrpCards"
import StandardManagementAuthGrpDetail from "./components/listers/StandardManagementAuthGrpDetail"
import StandardManagementAuthUserManager from "./components/listers/StandardManagementAuthUserCards"
import StandardManagementAuthUserDetail from "./components/listers/StandardManagementAuthUserDetail"
import StandardManagementAuthorityManager from "./components/listers/StandardManagementAuthorityCards"
import StandardManagementAuthorityDetail from "./components/listers/StandardManagementAuthorityDetail"
import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/standardManagements/authGrps',
                name: 'StandardManagementAuthGrpManager',
                component: StandardManagementAuthGrpManager
            },
            {
                path: '/standardManagements/authGrps/:id',
                name: 'StandardManagementAuthGrpDetail',
                component: StandardManagementAuthGrpDetail
            },
            {
                path: '/standardManagements/authUsers',
                name: 'StandardManagementAuthUserManager',
                component: StandardManagementAuthUserManager
            },
            {
                path: '/standardManagements/authUsers/:id',
                name: 'StandardManagementAuthUserDetail',
                component: StandardManagementAuthUserDetail
            },
            {
                path: '/standardManagements/authorities',
                name: 'StandardManagementAuthorityManager',
                component: StandardManagementAuthorityManager
            },
            {
                path: '/standardManagements/authorities/:id',
                name: 'StandardManagementAuthorityDetail',
                component: StandardManagementAuthorityDetail
            },
            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },



    ]
})
