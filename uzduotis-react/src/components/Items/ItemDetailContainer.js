import React, { Component } from 'react';
import axios from 'axios';
import ItemDetailComponent from './ItemDetailComponent';
import myUrl from '../../AppConfig';


export default class ItemDetailContainer extends Component {
    constructor() {
        super();
        this.state = {
            sveikinimas: {}
        }
    }

    componentDidMount() {
        axios.get(`${myUrl}/api/sveikinimai/${this.props.match.params.id}`)
            .then(res => {
                this.setState({ sveikinimas: res.data });
                console.log(res.data);
            })
            .catch(err => {
                console.log(err);
            })
    }

    render() {
        return (
            <main className="container">
                <div className="row">
                    <ItemDetailComponent sveikinimas={this.state.sveikinimas} />
                </div>
            </main>
        );
    }
}