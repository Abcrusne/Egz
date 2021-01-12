import React from 'react';
import { Link } from 'react-router-dom';
//import { Link } from 'react-router-dom';
import img1 from '../../img/img1.png';
import img2 from '../../img/img2.jpg';
import img3 from '../../img/img3.jpg';

const ItemsAdministrationComponent =({ sveikinimas,
    //  deleteItem 
    }) =>{
        const imgSrc =
    sveikinimas.image === 'img1'
      ? img1
      : sveikinimas.image === 'img2'
      ? img2
      : img3;
  return (
    <tr>
      <th scope="row">{sveikinimas.id}</th>
      <td>
        {' '}
        <img
          src={imgSrc}
          //src={sveikinimas.image}
          className="card-img-top"
          style={{ width: 50, height: 50 }}
          alt={sveikinimas.name}
        />
      </td>
      <td>
        {/* <Link to={`/admin/greetings/${id}`}>{sveikinimas.name} </Link> */}
        {sveikinimas.name}
      </td>
      <td>
        {/* <button className="btn btn-danger" 
        // onClick={deleteItem(sveikinimas.id)}
        >
          Delete item
        </button> */}
        <Link to="/delete" className="btn btn-danger">
                Delete Item
              </Link>
      </td>
    </tr>
  );
}

export default ItemsAdministrationComponent;
