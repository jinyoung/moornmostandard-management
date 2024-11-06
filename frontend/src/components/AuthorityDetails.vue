<template>

    <v-card outlined>
        <v-card-title>
            AuthorityDetails
        </v-card-title>

        <v-card-text>
            <String label="menuCode" v-model="value.MenuCode" :editMode="editMode"/>
            <String label="authType" v-model="value.AuthType" :editMode="editMode"/>
            <String label="authCode" v-model="value.AuthCode" :editMode="editMode"/>
            <String label="authMode" v-model="value.AuthMode" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions v-if="inList">
            <slot name="actions"></slot>
        </v-card-actions>
    </v-card>
</template>

<script>

    export default {
        name: 'AuthorityDetails',
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
                    'MenuCode': '',
                    'AuthType': '',
                    'AuthCode': '',
                    'AuthMode': '',
                }
            }
            if(typeof this.value === 'object') {
                if(!('MenuCode' in this.value)) {
                    this.value.MenuCode = '';
                }
            }
            if(typeof this.value === 'object') {
                if(!('AuthType' in this.value)) {
                    this.value.AuthType = '';
                }
            }
            if(typeof this.value === 'object') {
                if(!('AuthCode' in this.value)) {
                    this.value.AuthCode = '';
                }
            }
            if(typeof this.value === 'object') {
                if(!('AuthMode' in this.value)) {
                    this.value.AuthMode = '';
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

