import Header from "../components/Header.jsx";
import MainPageContOne from "../components/MainPageContOne.jsx";
import MainPageContTwo from "../components/MainPageContTwo.jsx";
import MainPageContThree from "../components/MainPageContThree.jsx";
import Footer from "../components/Footer.jsx";
import MainPageImageOne from "../components/MainPageImageOne.jsx";
import MainPageImageTwo from "../components/MainPageImageTwo.jsx";




function mainPage() {
    return(
        <div className="mainPage">
            <Header/>
            <MainPageImageOne/>
            <MainPageContOne/>
            <MainPageContTwo/>
            <MainPageImageTwo/>
            <MainPageContThree/>
            <Footer/>
        </div>
    )
}

export default mainPage;