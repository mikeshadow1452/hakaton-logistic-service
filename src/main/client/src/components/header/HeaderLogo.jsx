function HeaderLogo(){
    return(
        <div className="header-logo flex items-center">
            <button className={"flex items-center"}>
                <a href={"/src/mainPage/mainPage.html"}><img className={"mt-0 mb-0 ml-8 mr-8"}
                                                             src={"/src/assets/logoMini.png"} alt="logo"/></a>
            </button>
            <span className={"text-4xl text-amber-300"}>ChokoDash</span>
        </div>
    )
}

export default HeaderLogo;