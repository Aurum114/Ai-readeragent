import { defineStore } from 'pinia'

export const useAuth = defineStore('auth',{
  state:()=>({ token: localStorage.getItem('token')||'', user:null }),
  actions:{
    setToken(t){ this.token=t; localStorage.setItem('token',t) },
    logout(){ this.token=''; this.user=null; localStorage.removeItem('token') }
  }
})

export const useChat = defineStore('chat',{
  state:()=>({ chats:[], files:[], currentChatId:null, messages:[] })
})