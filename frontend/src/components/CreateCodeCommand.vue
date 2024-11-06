<template>
    <v-card outlined>
        <v-card-title>
            CreateCode
        </v-card-title>

        <v-card-text>
            <String label="ItemCode" v-model="value.itemCode" :editMode="editMode"/>
            <String label="CodeNo" v-model="value.codeNo" :editMode="editMode"/>
            <String label="Code" v-model="value.code" :editMode="editMode"/>
            <String label="CodeName" v-model="value.codeName" :editMode="editMode"/>
            <String label="IsSys" v-model="value.isSys" :editMode="editMode"/>
            <String label="IsUse" v-model="value.isUse" :editMode="editMode"/>
            <CodeEtc offline label="CodeEtc" v-model="value.codeEtc" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createCode"
            >
                CreateCode
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
        name: 'CreateCodeCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.itemCode = '';
            this.value.codeNo = '';
            this.value.code = '';
            this.value.codeName = '';
            this.value.isSys = '';
            this.value.isUse = '';
            this.value.codeEtc = {};
        },
        watch: {
        },
        methods: {
            createCode() {
                this.$emit('createCode', this.value);
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

