import React from 'react';
//import { Link } from 'react-router-dom';
import img1 from '../../img/img1.png';
import img2 from '../../img/img2.jpg';
import img3 from '../../img/img3.jpg';

const ItemDetailComponent = ({ sveikinimas }) => {
  const imgSrc =
    sveikinimas.image === 'img1'
      ? img1
      : sveikinimas.image === 'img2'
      ? img2
      : img3;
  return (
    <div>
      <div className="media">
        <img
          className="align-self-start mr-3"
          src={imgSrc}
          alt={sveikinimas.name}
          style={{
            height: '25rem',
          }}
        />
        <div className="media-body mt-3">
          <h2>Name: {sveikinimas.name}</h2>
          <p>Text: {sveikinimas.text}</p>
          <p>Date: {sveikinimas.date}</p>
          <p>Time: {sveikinimas.time}</p>
          <p>Audio: {sveikinimas.audio}</p>
          <p>Type: {sveikinimas.type}</p>
        </div>
      </div>
    </div>
  );
};

export default ItemDetailComponent;
