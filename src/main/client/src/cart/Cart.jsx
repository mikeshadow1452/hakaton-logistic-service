import Header from "../components/headers/Header.jsx";
import Goods from "../components/cart/Goods.jsx";
import CostAndPayment from "../components/cart/CostAndPayment.jsx";
import Footer from "../components/Footer.jsx";

function Cart() {
    return (
        <div className="cart">
            <Header/>
            <div className="cart flex min-h-screen w-full">
                <Goods/>
                <CostAndPayment/>
            </div>
            <Footer/>
        </div>
    )
}

export default Cart;