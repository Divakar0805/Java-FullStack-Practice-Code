const App=()=>{
function abc(){
  console.log("I am From Abc function");
  
}
function btnClick(e){
  console.log("i am from button");
  
}
function sectionClick(){
  console.log("i am from section");
  
}

  return <div>
    <section onClickCapture={sectionClick}>
      <button onClick={btnClick}>btn</button>
    </section>
    {/* <button onClick={abc}>btn</button>
    <input type="text" onInput={()=>{ console.log("another way of excution")}}/>


    <h1 onMouseOver={(e)=>{
      console.log(e);
      e.target.style.backgroundColor="red"
      
    }} onMouseLeave={(e)=>{
      console.log(e);
      e.target.style.backgroundColor="white"
      
    }}>MS Dhoni</h1>

    <h1 onClick={(e)=>{
      e.target.style.fontsize="2.5em"
    }}>hello</h1> */}
  </div>
}

export default App;