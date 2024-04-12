function costAndPayment() {
    return (
        <div>
            <div className="h-full ml-auto mr-8 text-center">
                <h1 className={"text-3xl"}>Цена товара</h1>
                <div>
                    <p className={"text-left text-2xl"}>Итог:</p>
                    <p> руб.</p>

                </div>
                <a className={""} href={"/src/orderPay/orderPay.html"}>
                <button className={"p-2 bg-amber-300 border-amber-600 border-b-8 text-2xl"}>
                    <span>Оплатить</span>
                </button>
                </a>
            </div>
        </div>
    )
}

export default costAndPayment;