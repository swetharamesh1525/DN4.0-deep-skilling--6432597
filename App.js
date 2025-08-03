import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [showComponent, setShowComponent] = useState('books'); // Conditional rendering flag

  const books = [
    { title: 'Atomic Habits', author: 'James Clear' },
    { title: 'The Alchemist', author: 'Paulo Coelho' }
  ];

  const blogs = [
    { title: 'React Tips', content: 'Use hooks and keep components small.' },
    { title: 'State vs Props', content: 'Props are immutable, state is local.' }
  ];

  const courses = [
    { name: 'React Fundamentals', duration: '3 Weeks' },
    { name: 'Advanced JavaScript', duration: '4 Weeks' }
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Blogger App Dashboard</h1>

      {/* Conditional Buttons */}
      <div style={{ marginBottom: '20px' }}>
        <button onClick={() => setShowComponent('books')}>Show Book Details</button>
        <button onClick={() => setShowComponent('blogs')}>Show Blog Details</button>
        <button onClick={() => setShowComponent('courses')}>Show Course Details</button>
      </div>

      {/* Conditional Rendering Approaches */}

      {/* 1. if-else rendering */}
      {showComponent === 'books' && <BookDetails books={books} />}

      {/* 2. Ternary operator */}
      {showComponent === 'blogs'
        ? <BlogDetails blogs={blogs} />
        : showComponent === 'courses' && <CourseDetails courses={courses} />
      }

      {/* 3. Switch-like rendering with element variable (alternative way) */}
      {/* This method isn't needed if using above methods but shown here for demo */}
      {/* let component; if (showComponent === 'books') component = <BookDetails ... /> */}
    </div>
  );
}

export default App;
