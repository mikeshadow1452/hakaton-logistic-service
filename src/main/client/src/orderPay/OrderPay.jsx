import Header from "../components/headers/Header.jsx";
import Map from "../components/orderPay/Map.jsx";
import ShippingInfo from "../components/orderPay/ShippingInfo.jsx";
import Footer from "../components/Footer.jsx";

function OrderPay() {
    return (
        <div className="order-pay bg-violet-200">
            <Header/>
            <div className="requisites flex">
                <ShippingInfo/>
                <Map/>
            </div>
            <Footer/>
        </div>
    )
}

export default OrderPay;