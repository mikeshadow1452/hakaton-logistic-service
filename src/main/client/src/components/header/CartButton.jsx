function CartButton() {
    return (
        <div className="cartButton h-16 flex text-amber-300 border-2 border-b-0 border-t-0 mr-1.5 border-amber-300 text-xl">
            <a className={"content-center"}>
                <button className={"w-32 CartButton_button"}><a>Корзина</a></button>
            </a>
        </div>
)
}

export default CartButton;