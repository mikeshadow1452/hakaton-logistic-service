import CatalogButton from "./CatalogButton.jsx";
import HeaderLogo from "./HeaderLogo.jsx";
import Search from "./Search.jsx";
import ProfileButton from "./ProfileButton.jsx";
import CartButton from "./CartButton.jsx";

function Header() {
    return (
        <header className={"h-18 bg-violet-500 flex items-center"}>
            <CatalogButton/>
            <HeaderLogo/>
            <Search/>
            <CartButton/>
            <ProfileButton/>
        </header>

    )
}


export default Header;