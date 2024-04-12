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
                          top: "75px",
                          left: "91.5%",
                          width: "180px",
                          borderRadius: "0",
                          border: "none",
                          backgroundColor: "#fde047",
                          padding: "0px",
                          paddingRight: "12px",
                          height: "52px",
                     },
                 }}
            >
                <div className="h-full profile-modal-content">
                    <div className={" border-2 border-b-2 border-amber-600 text-center"}>
                        <a href={"/src/logReg/login/login.html"}>
                        <button>
                            <span>Регистрация и Вход</span>
                        </button>
                        </a>
                    </div>
                </div>
            </Modal>
        </div>
    );
}

export default ProfileButton;