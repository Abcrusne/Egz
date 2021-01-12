import React, { Component } from 'react';
import axios from 'axios';
import FormComponent from './FormComponent';
import myUrl from '../../AppConfig';

export default class FormContainer extends Component {
  constructor() {
    super();
    this.state = {
      audio: '',
      date: '',
      image: '',
      name: '',
      text: '',
      time: '',
      type: '',
    };
  }

  handleChange = (event) => {
    this.setState({
      [event.target.name]: event.target.value,
    });
  };

  handleSubmit = (event) => {
    event.preventDefault();
    console.log(this.state);
    axios
      .post(`${myUrl}/api/sveikinimai`, this.state)
      .then((response) => {
        this.props.history.push('/administracija');
      })
      .catch((error) => {
        console.log(error);
      });
  };

  render() {
    return (
      <main className="container pt-5">
        <FormComponent
          handleChange={this.handleChange}
          handleSubmit={this.handleSubmit}
          audio={this.state.audio}
          date={this.state.date}
          image={this.state.image}
          name={this.state.name}
          text={this.state.text}
          time={this.state.time}
          type={this.state.type}
        />
      </main>
    );
  }
}
