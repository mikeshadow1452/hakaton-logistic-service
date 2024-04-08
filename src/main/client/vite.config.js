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
        mainPage: resolve(__dirname, 'src/mainPage/mainPage.html'),
        catalog: resolve(__dirname, 'src/catalog/catalog.html'),
        profile: resolve(__dirname, 'src/profile/profile.html'),
        orderPay: resolve(__dirname, 'src/orderPay/orderPay.html'),
        login: resolve(__dirname, 'src/login/login.html'),
        cart: resolve(__dirname, 'src/cart/cart.html')
      }
    }
  },
})
