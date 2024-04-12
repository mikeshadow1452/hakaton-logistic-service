import CatalogButton from "../header/CatalogButton.jsx";
import HeaderLogo from "../header/HeaderLogo.jsx";
import Search from "../header/Search.jsx";
import ProfileButton from "../header/ProfileButton.jsx";
import CartButton from "../header/CartButton.jsx";

function Header() {
    return (
        <div className="sticky top-0">
            <header className={"h-18 bg-violet-500 flex items-center"}>
                <CatalogButton/>
                <HeaderLogo/>
                <Search/>
                <CartButton/>
                <ProfileButton/>
            </header>
        </div>
    )
}


export default Header;