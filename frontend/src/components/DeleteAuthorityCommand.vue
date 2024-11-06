<template>
    <v-card outlined>
        <v-card-title>
            DeleteAuthority
        </v-card-title>

        <v-card-text>
            <Number label="AuNo" v-model="value.auNo" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="deleteAuthority"
            >
                DeleteAuthority
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
        name: 'DeleteAuthorityCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.auNo = 0;
        },
        watch: {
        },
        methods: {
            deleteAuthority() {
                this.$emit('deleteAuthority', this.value);
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

