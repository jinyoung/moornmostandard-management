<template>
    <v-card outlined>
        <v-card-title>
            CreateAuthUser
        </v-card-title>

        <v-card-text>
            <Number label="AuNo" v-model="value.auNo" :editMode="editMode"/>
            <String label="AuthCode" v-model="value.authCode" :editMode="editMode"/>
            <String label="WorkerNo" v-model="value.workerNo" :editMode="editMode"/>
            <String label="RegiNm" v-model="value.regiNm" :editMode="editMode"/>
            <Date label="RegiDt" v-model="value.regiDt" :editMode="editMode"/>
            <String label="ModiNm" v-model="value.modiNm" :editMode="editMode"/>
            <Date label="ModiDt" v-model="value.modiDt" :editMode="editMode"/>
            <UserDetails offline label="UserDetails" v-model="value.userDetails" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createAuthUser"
            >
                CreateAuthUser
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
        name: 'CreateAuthUserCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.auNo = 0;
            this.value.authCode = '';
            this.value.workerNo = '';
            this.value.regiNm = '';
            this.value.regiDt = '2024-11-06';
            this.value.modiNm = '';
            this.value.modiDt = '2024-11-06';
            this.value.userDetails = {};
        },
        watch: {
        },
        methods: {
            createAuthUser() {
                this.$emit('createAuthUser', this.value);
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

