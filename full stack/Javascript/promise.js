let age=prompt("Enter Age");
let p1=new Promise((resolve, reject) => {
    if(age>17)
        resolve("Eligible to vote")
    else
        reject("You are just\n"+age)
})

p1.then(data =>{
    console.log(data)
    console.log("fulfilled state")
})
  .catch(Error=>{
    console.log(Error)
    console.log("Rejected state")
  })
  .finally(()=>{
    console.log("finally")
  })