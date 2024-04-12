import React, { useState } from "react";
import Modal from "react-modal";

function CatalogButton() {
    const [visible, setVisible] = useState(false);

    const handleClick = () => {
        setVisible(true);
    };

    const handleClose = () => {
        setVisible(false);
    };

    return (
        <div>
            <button onClick={handleClick} className={"bg-violet-400"}><img src={"/imgs/catalogButton.png"} alt={"catalog button"}/></button>
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
                        left: "0%",
                        width: "180px",
                        height: "auto",
                        border: "none",
                        borderRadius: "0",
                        backgroundColor:"#8b5cf6",
                        flex: "start",
                        alignItems: "flex-start",
                        justifyContent: "start",
                    },
                }}
            >
                <div className="profile-modal-content">
                    <h1>Ваш профиль</h1>
                    <p>Здесь будет информация о профиле</p>
                    <button onClick={handleClose}>Закрыть</button>
                </div>
            </Modal>
        </div>
    );
}

export default CatalogButton;