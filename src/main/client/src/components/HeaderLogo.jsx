function HeaderLogo(){
    return(
        <div className="header-logo">
            <button className={"flex items-center"}>
                <img className={"mt-0 mb-0 ml-8 mr-8"} src={"/src/assets/logoMini.png"} alt="logo"/>
                <span className={"text-4xl text-amber-300"}>ChokoDash</span>
            </button>
        </div>
    )
}

export default HeaderLogo;