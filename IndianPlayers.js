import React from 'react';

const IndianPlayers = () => {
  const players = ['Virat', 'Rohit', 'Dhoni', 'Pant', 'Hardik', 'Jadeja', 'Kohli', 'Rahul', 'Bumrah', 'Gill', 'Shami'];

  // Destructuring Odd and Even players
  const oddTeam = players.filter((_, index) => index % 2 !== 0);
  const evenTeam = players.filter((_, index) => index % 2 === 0);

  const T20Players = ['Surya', 'Iyer', 'Ashwin'];
  const RanjiTrophyPlayers = ['Pujara', 'Saha', 'Karun'];

  // Merge arrays using spread operator
  const allPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Indian Players</h2>

      <h3>Odd Team</h3>
      <ul>
        {oddTeam.map((player, index) => <li key={index}>{player}</li>)}
      </ul>

      <h3>Even Team</h3>
      <ul>
        {evenTeam.map((player, index) => <li key={index}>{player}</li>)}
      </ul>

      <h3>All Combined Players (T20 + Ranji Trophy)</h3>
      <ul>
        {allPlayers.map((player, index) => <li key={index}>{player}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
