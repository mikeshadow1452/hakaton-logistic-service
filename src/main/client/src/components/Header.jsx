import HeaderLogo from "./HeaderLogo.jsx";
import CatalogButton from "./CatalogButton.jsx";
import UserProfileButton from "./UserProfileButton.jsx";


function Header() {
    return (
        <header className={"bg-violet-500 flex space-x-4 items-center"}>
            <div className={"p-1.5"}>
                <CatalogButton/>
            </div>
            <div className={"p-1.5"}>
                <HeaderLogo/>
            </div>
             <UserProfileButton/>
        </header>
    )
}



export default Header;