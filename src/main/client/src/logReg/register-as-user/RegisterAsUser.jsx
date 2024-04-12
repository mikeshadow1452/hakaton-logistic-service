import HeaderLogReg from "../../components/headers/HeaderLogReg.jsx";
import Footer from "../../components/Footer.jsx";

function RegisterAsUser() {
    return (
        <div className="bg-violet-100 h-screen">
            <HeaderLogReg/>
            <div className="w-auto flex justify-center">
                <div className="text-center h-auto bg-violet-300 login-container mt-24 border-b-8 border-violet-500">
                    <div className={"mt-1 mr-1 ml-1"}>
                        <a href={"/src/logReg/login/login.html"}>
                            <button
                                className={"w-48 p-2 bg-amber-300 border-r-2 border-r-amber-600 border-b-4 border-b-amber-600"}>
                            <span>
                                Уже имеется аккаунт?
                            </span>
                            </button>
                        </a>
                        <a href={"/src/logReg/register-as-seller/registerSeller"}>
                            <button
                                className={"w-48 p-2 bg-amber-300 border-l-2 border-l-amber-600 border-b-4 border-b-amber-600"}>
                            <span>
                                Регистрация Продавца
                            </span>
                            </button>
                        </a>
                    </div>
                    <h1 className={"text-center text-3xl"}>Регистрация</h1>
                    <form className={"text-center p-4"}>
                        <input className={"mb-8 text-3xl text-center"} placeholder={"Имя"}
                               type={"text"}></input>
                        <br/>
                        <input className={"text-3xl text-center"} placeholder={"Email"}
                               type={"email"}></input>
                        <br/>
                        <input className={"mt-8 text-3xl text-center w-fit"} placeholder={"Пароль"}
                               type={"password"}></input>
                        <br/>
                        <input className={"mt-8 text-3xl text-center w-fit"} placeholder={"Повторите пароль"}
                               type={"password"}></input>
                        <br/>
                        <button className={"mt-4 p-2 text-2xl bg-amber-300 border-b-4 border-amber-600"}>Зарегистрироваться</button>
                    </form>
                </div>
            </div>
            <Footer/>
        </div>
    )
}

export default RegisterAsUser;