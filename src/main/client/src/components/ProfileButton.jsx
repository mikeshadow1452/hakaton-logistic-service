function ProfileButton() {
    return (
        <div className="ProfileButton w-16 ml-1.5 mr-1.5">
            <button className="ProfileButton__profileButton">
                <img src={"/src/assets/PFP.png"} alt="Profile" className={"bg-violet-400"}/>
            </button>
        </div>
    )
}

export default ProfileButton;