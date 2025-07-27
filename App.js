import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore name="Swetha" school="ABC Matric" total={480} goal={6} />
    </div>
  );
}

export default App;
