import React from 'react';
import './App.css';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div className="App">
      <CohortDetails name="React Bootcamp" status="ongoing" startDate="2025-06-01" endDate="2025-08-01" />
      <CohortDetails name="Java Fundamentals" status="completed" startDate="2025-03-01" endDate="2025-05-30" />
    </div>
  );
}

export default App;
