import React from 'react';

function Panel() {
    const buttonContainerStyle = {
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'flex-end',
        position: 'absolute',
        top: '4%',
        right: '1%',
        width: '6%', // ширина контейнера
        backgroundColor: '#FFFFCC', // желтоватый фон


    };

    const buttonStyle = {

        fontSize: '1.4vw', // размер текста кнопок от ширины вьюпорта
        backgroundColor: 'transparent', // прозрачный фон
        color: '#4CAF50', // зеленый текст
        border: 'none',
        borderRadius: '5px',
        cursor: 'pointer',

    };

    const lineStyle = {
        width: '100%',
        height: '1px',
        backgroundColor: '#000',

    };

    return (
        <div style={buttonContainerStyle}>
            <button style={buttonStyle}>Кнопка 1</button>
            <div style={lineStyle}></div>
            <button style={buttonStyle}>Кнопка 2</button>
            <div style={lineStyle}></div>
            <button style={buttonStyle}>Кнопка 3</button>
        </div>
    );
}

export default Panel;
