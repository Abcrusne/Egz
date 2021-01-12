import React, { Component } from 'react';
import axios from 'axios';
import ItemCardComponent from './ItemCardComponent';
import myUrl from '../../AppConfig';

export default class ItemListContainer extends Component {
  constructor() {
    super();
    this.state = {
      sveikinimai: [],
    };
  }

  componentDidMount() {
    document.title = 'Perlaikymas';
    axios
      .get(`${myUrl}/api/sveikinimai`)
      .then((res) => {
        this.setState({ sveikinimai: res.data });
      })
      .catch((err) => {
        console.log(err);
      });
  }

  render() {
    // const { data } = this.state.sveikinimai;

    // if (data) {
    return (
      <div className="container pt-4">
        <div className="row d-flex justify-content-center">
          {this.state.sveikinimai.map((sveikinimas) => {
            return <ItemCardComponent sveikinimas={sveikinimas} />;
          })}
        </div>
      </div>
    );
    // } else {
    //   return (
    //     <div className="text-center">
    //       <div className="spinner-border m-5 text-dark" role="status">
    //         <span className="sr-only">Loading...</span>
    //       </div>
    //     </div>
    //   );
    // }
  }
}
