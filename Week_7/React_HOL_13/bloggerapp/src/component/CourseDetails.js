import React from "react";

function CourseDetails({courses}){
    return(
        <div>
            <h2>Course Details</h2>
            {courses.map((course) => (
                <div key={course.id}>
                    <h3>{course.cname}</h3>
                    <p>{course.duration}</p>
                    </div>
            ))}
        </div>
    );
}
export default CourseDetails;