import React from 'react';

function Post(props) {
  return (
    <div style={{ border: "1px solid #ccc", margin: "10px", padding: "10px", borderRadius: "8px" }}>
      <h3>{props.title}</h3>
      <p>{props.body}</p>
    </div>
  );
}

export default Post;
