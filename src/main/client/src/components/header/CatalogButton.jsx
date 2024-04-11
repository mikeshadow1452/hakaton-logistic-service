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
            <button onClick={handleClick} className={"bg-violet-400"}><img src={"/src/assets/catalogButton.png"} alt={"catalog button"}/></button>
            <Modal
                isOpen={visible}
                onRequestClose={handleClose}
                // style={{
                //     overlay: {
                //         backgroundColor: "",
                //     },
                //     content: {
                //         position: "fixed",
                //         top: "50px",
                //         left: "0%",
                //         transform: "translateY(0%)",
                //         width: "180px",
                //         height: "120px",
                //         border: "none",
                //         borderRadius: "0",
                //         backgroundColor:"#8b5cf6",
                //     },
                // }}

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