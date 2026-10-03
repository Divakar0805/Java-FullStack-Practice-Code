import Parent from "./Parent";
import { useState } from "react";
import Theme from "./Theme";

// const App=(props)=>{
// // let count=0

// // console.log(useState("diva"));
// let [state,setState]=useState(0)

// function abc(){
//   // count++
//   // console.log(count);
  
//   setState(state+1)
// }
//   return <div>
//     <h1> {state} </h1>
//     <button onClick={abc}>add count</button>
//   </div>
// }
// export default App;




let App=()=>{
  let [state,setState]=useState(0)
  console.log(state);
  
  function handleClick(){
    setState(state+1)
  }
  function click(){
    setState(state-1)
  }
  
  return <div>
    <Theme></Theme>
  </div>
  // <div>
  //   <h1> {state} </h1>
  //   <button onClick={handleClick}>Increase</button>
  //   <button onClick={click}>Decrease</button>
  // </div>
}
export default App;