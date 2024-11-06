<template>
    <v-card outlined>
        <v-card-title>
            CreateAuthGrp
        </v-card-title>

        <v-card-text>
            <Number label="AgNo" v-model="value.agNo" :editMode="editMode"/>
            <String label="AuthCode" v-model="value.authCode" :editMode="editMode"/>
            <String label="AuthName" v-model="value.authName" :editMode="editMode"/>
            <String label="AuthSer" v-model="value.authSer" :editMode="editMode"/>
            <String label="Memo" v-model="value.memo" :editMode="editMode"/>
            <String label="RegiNm" v-model="value.regiNm" :editMode="editMode"/>
            <Date label="RegiDt" v-model="value.regiDt" :editMode="editMode"/>
            <String label="ModiNm" v-model="value.modiNm" :editMode="editMode"/>
            <Date label="ModiDt" v-model="value.modiDt" :editMode="editMode"/>
            <GroupDetails offline label="GroupDetails" v-model="value.groupDetails" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createAuthGrp"
            >
                CreateAuthGrp
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
        name: 'CreateAuthGrpCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.agNo = 0;
            this.value.authCode = '';
            this.value.authName = '';
            this.value.authSer = '';
            this.value.memo = '';
            this.value.regiNm = '';
            this.value.regiDt = '2024-11-06';
            this.value.modiNm = '';
            this.value.modiDt = '2024-11-06';
            this.value.groupDetails = {};
        },
        watch: {
        },
        methods: {
            createAuthGrp() {
                this.$emit('createAuthGrp', this.value);
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

