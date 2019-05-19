import Vue from 'vue';
import Vuex from 'vuex';
Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        propsList: ["mf","Android"]
    },
    getters: {
        getPropsList(state) {
            return state.propsList;
        }
    },
    mutations: {
        updatePropsList(state, propsList) {
            state.propsList = propsList;
        }
    },
    actions: {
        updatePropsList(context, propsList) {
            context.commit('updatePropsList', propsList);
        }
    }
});
