<template>
    <v-card outlined>
        <v-card-title>
            DeleteAuthGrp
        </v-card-title>

        <v-card-text>
            <Number label="AgNo" v-model="value.agNo" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="deleteAuthGrp"
            >
                DeleteAuthGrp
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
        name: 'DeleteAuthGrpCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.agNo = 0;
        },
        watch: {
        },
        methods: {
            deleteAuthGrp() {
                this.$emit('deleteAuthGrp', this.value);
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

