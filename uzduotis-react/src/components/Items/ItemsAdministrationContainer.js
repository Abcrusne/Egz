import React, { Component } from 'react';
import ItemsAdministrationComponent from './ItemsAdministrationComponent';
import axios from 'axios';
import { Link } from 'react-router-dom';
import myUrl from '../../AppConfig';

export default class ItemsAdministrationContainer extends Component {
  constructor() {
    super();
    this.state = {
      sveikinimai: [],
    };
  }

  componentDidMount() {
    axios
      .get(`${myUrl}/api/sveikinimai`)
      .then((response) => {
        this.setState({ sveikinimai: response.data });
        //console.log(this.state);
      })
      .catch((error) => {
        console.log(error);
      });
  }
//   deleteItem = (id) => {
//     axios
//       .delete(`${myUrl}/api/sveikinimai/${id}`)
//       .then((sveikinimas) => {
//         this.setState({ sveikinimai: sveikinimas.data });
//       })
//       .catch((error) => {
//         console.log(error);
//       });
//   };
  // deleteItem = (e) => {
  //   e.preventDefault();
  //   axios
  //     .delete(`${myUrl}/api/greetings/${e.target.value}`)
  //     .then(() => {
  //       axios
  //         .get(`${myUrl}/api/greetings/`)
  //         .then((res) => this.setState({ greetings: res.data }));
  //     })
  //     .catch((err) => console.log(err));
  // };

  render() {
    return (
      <main className="container pt-3">
        <div className="row pb-3">
          <Link to={`/administracija/naujas`} className="btn btn-primary">
            Add new item
          </Link>
        </div>
        <div className="row">
          <table className="table">
            <thead>
              <tr>
                <th scope="col">#</th>
                <th scope="col">Image</th>
                <th scope="col">Name</th>
                <th scope="col"> </th>
              </tr>
            </thead>
            <tbody>
              {this.state.sveikinimai.map((sveikinimas) => {
                return (
                  <ItemsAdministrationComponent
                    sveikinimas={sveikinimas}
                    // deleteItem={this.deleteItem}
                  />
                );
              })}
            </tbody>
          </table>
        </div>
      </main>
    );
  }
}
