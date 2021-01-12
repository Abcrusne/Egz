import React from 'react';
import { Link } from 'react-router-dom';
import img1 from '../../img/img1.png';
import img2 from '../../img/img2.jpg';
import img3 from '../../img/img3.jpg';

const ItemCardComponent = ({ sveikinimas }) => {
  console.log('Greeting Card: ', sveikinimas.id);
  const imgSrc =
    sveikinimas.image === 'img1'
      ? img1
      : sveikinimas.image === 'img2'
      ? img2
      : img3;

  return (
    <div className="card col-12 col-md-6 col-lg-4 my-3">
      <img
        src={imgSrc}
        className="card-img-top"
        alt={sveikinimas.name}
        style={{
          height: '15rem',
          width: "22rem"
        }}
      />
      <div className="card-body ">
        <h5 className="card-name">Name: {sveikinimas.name}</h5>
        <p className="card-text">
          <b>Text: {sveikinimas.text} </b>
        </p>
        <p className="card-text">Date: {sveikinimas.date}</p>
        <p className="card-text">Time: {sveikinimas.time}</p>
        <Link to={`/sveikinimai/${sveikinimas.id}`} className="btn btn-dark">
          More info
        </Link>
      </div>
    </div>
  );
};

export default ItemCardComponent;
