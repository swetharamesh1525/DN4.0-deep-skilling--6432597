import React from 'react';

const LogoutPage = ({ onGoHome }) => {
  return (
    <div>
      <h2>You have been logged out successfully.</h2>
      <button onClick={onGoHome}>Go to Sign In Page</button>
    </div>
  );
};

export default LogoutPage;
