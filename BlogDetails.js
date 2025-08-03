import React from 'react';

const BlogDetails = ({ blogs }) => {
  return (
    <div>
      <h2>📝 Blog Posts</h2>
      {blogs.length > 0 && (
        <div>
          {blogs.map((blog, index) => (
            <div key={index}>
              <h4>{blog.title}</h4>
              <p>{blog.content}</p>
            </div>
          ))}
        </div>
      )}
      {blogs.length === 0 && <p>No blog posts found.</p>}
    </div>
  );
};

export default BlogDetails;
