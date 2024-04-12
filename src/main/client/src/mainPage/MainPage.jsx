import Header from "../components/headers/Header.jsx";
import ContOne from "../components/MainPage/ContOne.jsx";
import ContTwo from "../components/MainPage/ContTwo.jsx";
import ContThree from "../components/MainPage/ContThree.jsx";
import Footer from "../components/Footer.jsx";
import ImageOne from "../components/MainPage/ImageOne.jsx";
import ImageTwo from "../components/MainPage/ImageTwo.jsx";




function mainPage() {
    return(
        <div className="mainPage">
            <Header/>
            <ImageOne/>
            <ContOne/>
            <ContTwo/>
            <ImageTwo/>
            <ContThree/>
            <Footer/>
        </div>
    )
}

export default mainPage;