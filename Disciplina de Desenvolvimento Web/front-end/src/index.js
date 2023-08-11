import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import Header from './pages/Header/index';
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <React.StrictMode>
    <Header title = "User App"/>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

reportWebVitals();