import React, { useState } from 'react';
import SignInPage from './SignInPage';
import UserPage from './UserPage';
import LogoutPage from './LogoutPage';

function App() {
  const [page, setPage] = useState('signin'); // 'signin', 'user', 'logout'

  const handleLogin = () => {
    setPage('user');
  };

  const handleLogout = () => {
    setPage('logout');
  };

  const handleGoHome = () => {
    setPage('signin');
  };

  let content;
  if (page === 'signin') {
    content = <SignInPage onLogin={handleLogin} />;
  } else if (page === 'user') {
    content = <UserPage onLogout={handleLogout} />;
  } else if (page === 'logout') {
    content = <LogoutPage onGoHome={handleGoHome} />;
  }

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Ticket Booking App</h1>
      {content}
    </div>
  );
}

export default App;
