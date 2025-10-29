import axios from 'axios'
import { useAuth } from '../store'

const instance = axios.create({ baseURL: import.meta.env.VITE_API_BASE })

instance.interceptors.request.use(cfg=>{
  try {
    const auth = useAuth()
    if(auth.token){ cfg.headers.Authorization = 'Bearer '+auth.token }
  } catch {}
  return cfg
})

export const api = {
  register: (payload)=> instance.post('/auth/register', payload),
  login: (payload)=> instance.post('/auth/login', payload),
  me: ()=> instance.get('/auth/me'),
  uploadFile: (form)=> instance.post('/files/upload', form, { headers:{ 'Content-Type':'multipart/form-data' } }),
  listFiles: ()=> instance.get('/files/list'),
  sendChat: (payload)=> instance.post('/chat/send', payload),
  listChats: ()=> instance.get('/chat/list'),
  notesGenerate: (payload)=> instance.post('/notes/generate', payload),
  mindmapGenerate: (payload)=> instance.post('/mindmap/generate', payload),
}