import React from "react";
import ReactDOM from "react-dom/client";


let ElementByUsingCreateElement=React.createElement(
    "h1",
    {id:"first",title:"my first heading tag"},
    React.createElement("u",{},"underline text"))

let elementByJSX=<h1>Nan tha Mapla<u>Thenilaairunthu</u></h1>

ReactDOM.createRoot(document.getElementById("root")).render(   
     <div>
        <h1>hello</h1>
        <h2>i'm react</h2>
        <hr />
        <label htmlFor="firstName">my lable</label>
        <input type="text" id="firstName" className="abc"/>
     </div>)
  
