import React from 'react';

const BookDetails = ({ books }) => {
  return (
    <div>
      <h2>Book Details</h2>
      {books.length === 0 ? (
        <p>No books available</p>
      ) : (
        <ul>
          {books.map((book, index) => (
            <li key={index}>
              <strong>{book.title}</strong> by {book.author}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
};

export default BookDetails;
