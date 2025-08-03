import React, { useState } from 'react';

const CurrencyConverter = () => {
  const [rupees, setRupees] = useState('');
  const [convertedValue, setConvertedValue] = useState(null);
  const [currency, setCurrency] = useState('EUR');

  const exchangeRates = {
    EUR: 89.5,   // 1 Euro = 89.5 INR (example rate)
    USD: 83.2,   // 1 Dollar = 83.2 INR
    GBP: 105.3   // 1 Pound = 105.3 INR
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    const rupeeValue = parseFloat(rupees);
    if (!isNaN(rupeeValue)) {
      const converted = rupeeValue / exchangeRates[currency];
      setConvertedValue(converted.toFixed(2));
    } else {
      setConvertedValue(null);
      alert("Please enter a valid number");
    }
  };

  return (
    <div style={{ marginTop: '30px' }}>
      <h2>Currency Converter (INR ➡️ Foreign Currency)</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Enter INR amount"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          style={{ marginRight: '10px' }}
        />
        <select
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
          style={{ marginRight: '10px' }}
        >
          <option value="EUR">Euro (EUR)</option>
          <option value="USD">Dollar (USD)</option>
          <option value="GBP">Pound (GBP)</option>
        </select>
        <button type="submit">Convert</button>
      </form>
      {convertedValue !== null && (
        <p>
          Equivalent in {currency}: <strong>{convertedValue} {currency}</strong>
        </p>
      )}
    </div>
  );
};

export default CurrencyConverter;
