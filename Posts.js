import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [
        {
          id: 1,
          title: 'The Importance of Time Management',
          body: 'Time management is key to success. Planning your day helps you prioritize tasks and reduce stress. Effective use of time leads to increased productivity and better results.'
        },
        {
          id: 2,
          title: 'Benefits of Regular Exercise',
          body: 'Exercising regularly improves both physical and mental health. It boosts energy, strengthens the heart, and improves your mood by releasing endorphins.'
        },
        {
          id: 3,
          title: 'Tips for Effective Learning',
          body: 'To learn better, take regular breaks, use active recall, and teach others what you’ve learned. These techniques help retain knowledge longer.'
        },
        {
          id: 4,
          title: 'How to Stay Motivated',
          body: 'Set clear goals and reward yourself for progress. Surround yourself with positivity and break large tasks into smaller, manageable steps to maintain motivation.'
        }
      ],
      hasError: false
    };
  }

  componentDidCatch(error, info) {
    alert("Something went wrong while displaying the posts.");
    console.error("Caught error:", error, info);
    this.setState({ hasError: true });
  }

  render() {
    if (this.state.hasError) {
      return <h2>Error occurred while displaying posts.</h2>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
