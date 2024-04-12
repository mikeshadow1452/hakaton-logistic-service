function shippingInfo() {
    return (
        <div className="mt-0 mb-0 m-auto pt-0 pb-0 border-t-0 border-b-0 border-2 border-violet-500 bg-violet-400">
            <div className={"pt-6 p-24 border-b-2 border-violet-500"}>
                <h1 className={"text-center text-5xl text-amber-300 border-b-2 border-amber-300"}>пункт выдачи</h1>
                <select className={"w-full h-8 mt-12"}>
                    <option>место 1</option>
                    <option>место 2</option>
                    <option>место 3</option>
                </select>
            </div>
            <div className={"pt-6 p-24 border-b-2 border-violet-500"}>
                <h1 className={"text-center text-5xl text-amber-300 border-b-2 border-amber-300"}>дата доставки</h1>
                <input className={"w-full h-8 mt-12"} type={"date"}></input>
            </div>
            <div className={"pt-6 pb-0 p-24"}>
                <h1 className={"text-center text-5xl text-amber-300 border-b-2 border-amber-300"}>Данные об оплате</h1>
                <form className={"mt-4"}>
                    <input className={"mb-4"} type="number" name="cardNumber" placeholder="Номер карты"/>
                    <br/>
                    <input className={"mb-4"} type="number" name="expirationDate" placeholder="Срок действия"/>
                    <br/>
                    <input className={"mb-4"} type="number" name="cvv" placeholder="CVV"/>
                    <br/>
                    <input className={"mb-4"} type="text" name="cardholderName" placeholder="Имя держателя карты"/>
                    <br/>
                    <button type="submit" className={"submitButton mt-4 p-2 bg-amber-300 border-amber-600 border-b-8"}>Оплатить
                    </button>
                </form>
            </div>
        </div>
    )
}

export default shippingInfo;


