import React from "react";
import ReactDOM from "react-dom/client";

let a=()=>{
    console.log(`my name is $(myname)`)
};
a();
let myname = "diva";
let num1= 50;
let num2=100;

let b= 
    <h1>
     my name is {myname} .My travelling cost to reach qspiders is Rs.{num1+num2}

    </h1>

ReactDOM.createRoot(document.getElementById("root")).render(b
    // <>
    //     <h1>this is h1</h1>
    //     <h2>this is h2</h2>
    // </>
)