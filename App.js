import React from 'react';

function App() {
  // Step 1: Page heading as JSX
  const heading = <h1>Office Space Rental Application</h1>;

  // Step 2: Image attribute JSX
  const officeImageUrl = "https://via.placeholder.com/400x200?text=Office+Image";

  // Step 3: Single Office Object
  const office = {
    name: "TechSpace Solutions",
    rent: 55000,
    address: "2nd Floor, Innovate Tower, Bangalore"
  };

  // Step 4: List of Offices
  const officeList = [
    {
      name: "Elite Office Hub",
      rent: 45000,
      address: "3rd Floor, Business Park, Chennai"
    },
    {
      name: "Urban Workbay",
      rent: 75000,
      address: "5th Floor, Cyber Heights, Hyderabad"
    },
    {
      name: "NextGen Offices",
      rent: 62000,
      address: "1st Floor, Skyline Plaza, Pune"
    },
    {
      name: "Budget Business Suites",
      rent: 39000,
      address: "Near Tech Junction, Kochi"
    }
  ];

  // Step 5: Function to get rent color
  const getRentColor = (rent) => {
    return {
      color: rent > 60000 ? 'green' : 'red'
    };
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      {heading}

      <img src={officeImageUrl} alt="Office" style={{ width: '100%', maxWidth: '600px', marginBottom: '20px' }} />

      <h2>Featured Office:</h2>
      <div>
        <p><strong>Name:</strong> {office.name}</p>
        <p><strong>Rent:</strong> <span style={getRentColor(office.rent)}>{office.rent}</span></p>
        <p><strong>Address:</strong> {office.address}</p>
      </div>

      <hr />

      <h2>Other Available Offices</h2>
      {officeList.map((o, index) => (
        <div key={index} style={{ marginBottom: '20px', border: '1px solid #ccc', padding: '10px' }}>
          <p><strong>Name:</strong> {o.name}</p>
          <p><strong>Rent:</strong> <span style={getRentColor(o.rent)}>{o.rent}</span></p>
          <p><strong>Address:</strong> {o.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
