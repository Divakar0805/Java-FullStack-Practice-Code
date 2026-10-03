







import React,{Fragment } from 'react';
import { createRoot } from 'react-dom/client';
import { NavBar } from './Nav';
import NavBarClass  from './NavByClass';




function anyName(a,b){
  return a+b
}
function MyComponent(){
  return <div>
    <h1>my first MyComponent</h1>
  </div>
}

createRoot(document.getElementById('root')).render(
//   <Fragment>
// <h1>I am Header 1</h1>
// <h2>I am header 2</h2>
//   </Fragment>
<>
{anyName(10,20)}
<MyComponent>
  
</MyComponent>
<NavBar></NavBar>
<NavBarClass></NavBarClass>
</>

)
