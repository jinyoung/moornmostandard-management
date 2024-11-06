<template>
    <v-card outlined>
        <v-card-title>
            CreateAuthority
        </v-card-title>

        <v-card-text>
            <Number label="AuNo" v-model="value.auNo" :editMode="editMode"/>
            <String label="MenuCode" v-model="value.menuCode" :editMode="editMode"/>
            <String label="AuthType" v-model="value.authType" :editMode="editMode"/>
            <String label="AuthCode" v-model="value.authCode" :editMode="editMode"/>
            <String label="AuthMode" v-model="value.authMode" :editMode="editMode"/>
            <String label="RegiNm" v-model="value.regiNm" :editMode="editMode"/>
            <Date label="RegiDt" v-model="value.regiDt" :editMode="editMode"/>
            <String label="ModiNm" v-model="value.modiNm" :editMode="editMode"/>
            <Date label="ModiDt" v-model="value.modiDt" :editMode="editMode"/>
            <AuthorityDetails offline label="AuthorityDetails" v-model="value.authorityDetails" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createAuthority"
            >
                CreateAuthority
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateAuthorityCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.auNo = 0;
            this.value.menuCode = '';
            this.value.authType = '';
            this.value.authCode = '';
            this.value.authMode = '';
            this.value.regiNm = '';
            this.value.regiDt = '2024-11-06';
            this.value.modiNm = '';
            this.value.modiDt = '2024-11-06';
            this.value.authorityDetails = {};
        },
        watch: {
        },
        methods: {
            createAuthority() {
                this.$emit('createAuthority', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

