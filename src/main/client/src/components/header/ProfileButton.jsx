import React, { useState } from "react";
import Modal from "react-modal";

function ProfileButton() {
    const [visible, setVisible] = useState(false);

    const handleClick = () => {
        setVisible(true);
    };

    const handleClose = () => {
        setVisible(false);
    };

    return (
        <div>
            <button onClick={handleClick} className={"bg-violet-400 mr-1.5"}><img src={"/src/assets/PFP.png"} alt={"profile picture"}/></button>
            <Modal
                isOpen={visible}
                onRequestClose={handleClose}
                style={{
                    overlay: {
                        backgroundColor: "",
                    },
                    content: {
                        position: "fixed",
                        top: "50px",
                        left: "89%",
                        transform: "translateY(4%)",
                        width: "180px",
                        borderRadius: "0",
                        border: "none",
                        backgroundColor: "#8b5cf6",
                        padding: "0px",
                        paddingRight: "12px",
                    },
                }}
            >
                <div className="profile-modal-content">
                    <div className={"h-full border-t-2 border-t-violet-600 text-center"}>
                        <button>
                            <span>Регистрация и Вход</span>
                        </button>
                    </div>
                    <div className={"border-t-2 border-t-violet-600 text-center"}>
                        <button>
                            <span>слово</span>
                        </button>
                    </div>
                    <div className={"border-t-2 border-b-2 border-t-violet-600 border-b-violet-600 text-center"}>
                        <button>
                            <span>слово</span>
                        </button>
                    </div>
                </div>
            </Modal>
        </div>
    );
}

export default ProfileButton;