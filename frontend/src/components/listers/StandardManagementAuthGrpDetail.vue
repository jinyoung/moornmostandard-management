<template>
    <v-card outlined>
        <v-card-title>
            AuthGrp # {{item._links.self.href.split("/")[item._links.self.href.split("/").length - 1]}}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="AgNo" v-model="item.agNo" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="AuthCode" v-model="item.authCode" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="AuthName" v-model="item.authName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="AuthSer" v-model="item.authSer" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Memo" v-model="item.memo" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="RegiNm" v-model="item.regiNm" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="RegiDt" v-model="item.regiDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ModiNm" v-model="item.modiNm" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="ModiDt" v-model="item.modiDt" :editMode="editMode" @change="change" />
            </div>
            <GroupDetails offline label="GroupDetails" v-model="item.groupDetails" :editMode="false" :key="false" @change="change" />
        </v-card-text>

        <v-card-actions>
            <v-btn text color="deep-purple lighten-2" large @click="goList">List</v-btn>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="edit"
                    v-if="!editMode"
            >
                Edit
            </v-btn>
            <v-btn
                    color="primary"
                    text
                    @click="save"
                    v-else
            >
                Save
            </v-btn>
            <v-btn
                    color="primary"
                    text
                    @click="remove"
                    v-if="!editMode"
            >
                Delete
            </v-btn>
            <v-btn
                    color="primary"
                    text
                    @click="editMode = false"
                    v-if="editMode"
            >
                Cancel
            </v-btn>
        </v-card-actions>
    </v-card>
</template>


<script>
    const axios = require('axios').default;

    export default {
        name: 'StandardManagementAuthGrpDetail',
        components:{},
        props: {
        },
        data: () => ({
            item: null,
            editMode: false,
        }),
        async created() {
            var me = this;
            var params = this.$route.params;
            var temp = await axios.get(axios.fixUrl('/authGrps/' + params.id))
            if(temp.data) {
                me.item = temp.data
            }
        },
        methods: {
            goList() {
                var path = window.location.href.slice(window.location.href.indexOf("/#/"), window.location.href.lastIndexOf("/#"));
                path = path.replace("/#/", "/");
                this.$router.push(path);
            },
            edit() {
                this.editMode = true;
            },
            async remove(){
                try {
                    if (!this.offline) {
                        await axios.delete(axios.fixUrl(this.item._links.self.href))
                    }

                    this.editMode = false;

                    this.$emit('input', this.item);
                    this.$emit('delete', this.item);

                } catch(e) {
                    console.log(e)
                }
            },
        },
    };
</script>
