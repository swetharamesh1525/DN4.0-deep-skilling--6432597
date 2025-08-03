import React from 'react';

const CourseDetails = ({ courses }) => {
  return (
    <div>
      <h2>🎓 Course Details</h2>
      {courses?.length ? (
        <ul>
          {courses.map((course, index) => (
            <li key={index}>
              <strong>{course.name}</strong> - {course.duration}
            </li>
          ))}
        </ul>
      ) : (
        <p>No courses listed.</p>
      )}
    </div>
  );
};

export default CourseDetails;
