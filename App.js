import React, { Component } from 'react';
import CurrencyConverter from './CurrencyConverter';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
    };

    // Binding methods to use "this"
    this.increment = this.increment.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.combinedFunction = this.combinedFunction.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
  }

  increment() {
    this.setState({ counter: this.state.counter + 1 });
  }

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  }

  sayHello() {
    console.log("Hello! This is a static message.");
  }

  combinedFunction() {
    this.increment();
    this.sayHello();
  }

  sayWelcome(message) {
    alert("Message: " + message);
  }

  handleSyntheticEvent = (e) => {
    e.preventDefault();
    alert("I was clicked (Synthetic Event)");
  };

  render() {
    return (
      <div style={{ padding: '20px', fontFamily: 'Arial' }}>
        <h1>Event Examples in React</h1>
        <p>Counter: {this.state.counter}</p>

        <button onClick={this.combinedFunction}>Increase</button>
        <button onClick={this.decrement}>Decrease</button>

        <br /><br />

        <button onClick={() => this.sayWelcome("Welcome to React!")}>Say Welcome</button>

        <br /><br />

        <button onClick={this.handleSyntheticEvent}>Click Me (Synthetic Event)</button>

        <br /><br />

        <CurrencyConverter />
      </div>
    );
  }
}

export default App;
