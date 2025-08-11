import './App.css';
import { useState } from "react";

import { books, blogs, courses } from "./data";
import BookDetails from "./component/BookDetails";
import BlogDetails from "./component/BlogDetails";
import CourseDetails from "./component/CourseDetails";
function App() {
    const [showBooks] = useState(true);
  const [showBlogs] = useState(true);
  const [showCourses] = useState(true);
  return (
    <div className="App">
      <h1>Blogger App</h1>
      <div className="container">
        
      {showBooks && <BookDetails books={books} />}
      {showBlogs ? <BlogDetails blogs={blogs} /> : <p>No Blogs</p>}
      {showCourses && <CourseDetails courses={courses} />}
    </div>
    </div>

  );
}

export default App;
