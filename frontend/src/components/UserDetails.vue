<template>

    <v-card outlined>
        <v-card-title>
            UserDetails
        </v-card-title>

        <v-card-text>
            <String label="authCode" v-model="value.AuthCode" :editMode="editMode"/>
            <String label="workerNo" v-model="value.WorkerNo" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions v-if="inList">
            <slot name="actions"></slot>
        </v-card-actions>
    </v-card>
</template>

<script>

    export default {
        name: 'UserDetails',
        components:{},
        props: {
            value: [Object, String, Number, Boolean, Array],
            editMode: Boolean,
            isNew: Boolean,
            offline: Boolean,
            inList: Boolean,
            label: String,
        },
        data: () => ({
        }),
        async created() {
            if(!Object.values(this.value)[0]) {
                this.$emit('input', {});
                this.newValue = {
                    'AuthCode': '',
                    'WorkerNo': '',
                }
            }
            if(typeof this.value === 'object') {
                if(!('AuthCode' in this.value)) {
                    this.value.AuthCode = '';
                }
            }
            if(typeof this.value === 'object') {
                if(!('WorkerNo' in this.value)) {
                    this.value.WorkerNo = '';
                }
            }
        },
        watch: {
            value(val) {
                this.$emit('input', val);
            },
            newValue(val) {
                this.$emit('input', val);
            },
        },

        methods: {
            edit() {
                this.editMode = true;
            },
            async add() {
                this.editMode = false;
                this.$emit('input', this.value);

                if(this.isNew){
                    this.$emit('add', this.value);
                } else {
                    this.$emit('edit', this.value);
                }
            },
            async remove(){
                this.editMode = false;
                this.isDeleted = true;

                this.$emit('input', this.value);
                this.$emit('delete', this.value);
            },
            change(){
                this.$emit('change', this.value);
            },
        }
    }
</script>

