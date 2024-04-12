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
        orderPay: resolve('src/orderPay/orderPay.html'),
        cart: resolve('src/cart/cart.html'),
        login: resolve('/src/logReg/login/login.html'),
        registerSeller:resolve('src/logReg/register-as-Seller/registerSeller.html'),
        registerUser:resolve('src/logReg/register-as-User/registerUser.html')
      }
    }
  },
  server: {
    open: 'src/mainPage/mainPage.html'
  }
})
