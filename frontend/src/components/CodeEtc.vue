<template>

    <v-card outlined>
        <v-card-title>
            CodeEtc
        </v-card-title>

        <v-card-text>
            <String label="itemCode" v-model="value.ItemCode" :editMode="editMode"/>
            <String label="etc" v-model="value.Etc" :editMode="editMode"/>
            <String label="etc1" v-model="value.Etc1" :editMode="editMode"/>
            <String label="etc2" v-model="value.Etc2" :editMode="editMode"/>
            <String label="etc3" v-model="value.Etc3" :editMode="editMode"/>
            <String label="etc4" v-model="value.Etc4" :editMode="editMode"/>
            <String label="etc5" v-model="value.Etc5" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions v-if="inList">
            <slot name="actions"></slot>
        </v-card-actions>
    </v-card>
</template>

<script>

    export default {
        name: 'CodeEtc',
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
                    'ItemCode': '',
                    'Etc': '',
                    'Etc1': '',
                    'Etc2': '',
                    'Etc3': '',
                    'Etc4': '',
                    'Etc5': '',
                }
            }
            if(typeof this.value === 'object') {
                if(!('ItemCode' in this.value)) {
                    this.value.ItemCode = '';
                }
            }
            if(typeof this.value === 'object') {
                if(!('Etc' in this.value)) {
                    this.value.Etc = '';
                }
            }
            if(typeof this.value === 'object') {
                if(!('Etc1' in this.value)) {
                    this.value.Etc1 = '';
                }
            }
            if(typeof this.value === 'object') {
                if(!('Etc2' in this.value)) {
                    this.value.Etc2 = '';
                }
            }
            if(typeof this.value === 'object') {
                if(!('Etc3' in this.value)) {
                    this.value.Etc3 = '';
                }
            }
            if(typeof this.value === 'object') {
                if(!('Etc4' in this.value)) {
                    this.value.Etc4 = '';
                }
            }
            if(typeof this.value === 'object') {
                if(!('Etc5' in this.value)) {
                    this.value.Etc5 = '';
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

