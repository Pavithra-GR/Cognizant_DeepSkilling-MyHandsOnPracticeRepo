import React from "react";

function BlogDetails({blogs}){
    return(
        <div>
            <h2>Blog Details</h2>
            {blogs.map((blog) => (
                <div key={blog.id}>
                    <h3>{blog.title}</h3>
                    <p>{blog.author}</p>
                    </div>
            ))}
        </div>
    );
}
export default BlogDetails;