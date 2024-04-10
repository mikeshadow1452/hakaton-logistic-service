import Header from "../components/Header.jsx";

function LoginPage() {
    const handleRegister = (e) => {
        e.preventDefault();
        const data = new FormData(e.target);
        const name = data.get("name");
        const email = data.get("email");
        const password = data.get("password");

        // Send data to server (implementation omitted)

        console.log({
            name,
            email,
            password,
        });
    };

    return (
        <div className="container">
            <div className="flex flex-col items-center justify-center min-h-screen py-2">
                <div
                    className={`w-full p-10 bg-white  shadow-lg max-w-md border border-red-500 aspect-ratio-square `} // Added aspect-ratio-square class
                >
                    <h1 className="text-center text-2xl font-bold mb-5">Регистрация</h1>
                    <form onSubmit={handleRegister}>
                        <div className="mb-4">
                            <label
                                htmlFor="name"
                                className="block mb-2 text-sm font-medium text-gray-900"
                            >
                                Имя
                            </label>
                            <input
                                type="text"
                                id="name"
                                name="name"
                                className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white"
                            />
                        </div>
                        <div className="mb-4">
                            <label
                                htmlFor="email"
                                className="block mb-2 text-sm font-medium text-gray-900"
                            >
                                Email
                            </label>
                            <input
                                type="email"
                                id="email"
                                name="email"
                                className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white"
                            />
                        </div>
                        <div className="mb-4">
                            <label
                                htmlFor="password"
                                className="block mb-2 text-sm font-medium text-gray-900"
                            >
                                Пароль
                            </label>
                            <input
                                type="password"
                                id="password"
                                name="password"
                                className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white"
                            />
                        </div>
                        <button
                            type="submit"
                            className="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center mr-2 mb-2 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"
                        >
                            Зарегистрироваться
                        </button>
                    </form>
                </div>
            </div>
        </div>
    );
}

export default LoginPage;
