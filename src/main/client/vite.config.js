import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'
import { resolve } from 'path'

export default defineConfig({
  plugins: [react()],
  build: {
    outDir: '../resources/static/',
    emptyOutDir: true,
    rollupOptions: {
      input: {
      mainPage: resolve('src/mainPage/mainPage.html'),
      }
    }
  },
  server: {
    open: 'src/mainPage/mainPage.html'
  }
})
