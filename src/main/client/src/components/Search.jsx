function Search() {
    return (
        <div className="searchDiv flex">
            <input className={"search m-2 h-12 w-full"} placeholder={"Поиск"}></input>
            <button className={"buttonSearch"}><img src={"/src/assets/lupa.png"} alt={"lupa"} className={"h-12 w-16 bg-violet-400"}/></button>
        </div>
    )
}

export default Search;