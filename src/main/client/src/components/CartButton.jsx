function CartButton() {
    return (
        <div className="cartButton h-16 flex ml-auto">
            <button className={"w-32 CartButton_button"}><span className={"bg-no-repeat bg-center bg-[url('./assets/button_1x2.png')]"}>Корзина</span></button>
        </div>
    )
}

export default CartButton;