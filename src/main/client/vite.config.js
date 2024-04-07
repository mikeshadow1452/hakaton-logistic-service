import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'
import { resolve } from 'path'
// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  build: {
    outDir: '../resources/static/',
    emptyOutDir: true,
    rollupOptions: {
      main: resolve(__dirname, 'src/main/main.html')
    }
  },
})
