
const Parent=(props)=>{
    let {first,second}=props
    // let c=30
    // let d=40
    return <div>
I Am From Parent
{/* <App one={c} two={d}></App> */}
<h1>the sum of {props.first} and {props.second} is {props.first+props.second} </h1>
<h1>the diff between {first} and {second} is {first-second} </h1>
    </div>
}
export default Parent;