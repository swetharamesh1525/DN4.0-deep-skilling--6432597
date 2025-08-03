import React from 'react';

const UserPage = ({ onLogout }) => {
  return (
    <div>
      <h2>Welcome Back, User!</h2>
      <p>You can now book tickets:</p>
      <form>
        <label>
          Select Flight:
          <select>
            <option>Flight A - ₹5000</option>
            <option>Flight B - ₹6000</option>
            <option>Flight C - ₹5500</option>
          </select>
        </label>
        <br /><br />
        <button type="submit">Book Now</button>
      </form>
      <br />
      <button onClick={onLogout}>Logout</button>
    </div>
  );
};

export default UserPage;
