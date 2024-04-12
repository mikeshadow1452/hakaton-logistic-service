import HeaderLogo from "../header/HeaderLogo.jsx";


function HeaderLogReg() {
    return (
        <div className="sticky top-0">
            <header className={"h-18 bg-violet-500 flex items-center justify-center"}>
                <HeaderLogo/>
            </header>
        </div>
    )
}


export default HeaderLogReg;