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
        app: 'src/components/index.html'
        // mainPage: resolve('src/mainPage/mainPage.html'),
      }
    }
  },
  server: {
    open: 'src/components/index.html'
  }
})
