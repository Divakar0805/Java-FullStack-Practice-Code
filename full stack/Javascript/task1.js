let body=document.body
let nav=document.createElement("nav")
body.appendChild(nav)

document.body.style.margin="0"
document.body.style.padding="0"
nav.style.height="50px"
nav.style.backgroundColor="gray"
nav.style.padding="10px"
nav.style.display="flex"
nav.style.alignItems="center"
nav.style.justifyContent="space-between"

let leftaside=document.createElement("aside")
let rightaside=document.createElement("aside")
nav.appendChild(leftaside)
nav.appendChild(rightaside)
leftaside.style.display="flex"
rightaside.style.display="flex"
leftaside.style.gap="15px"
rightaside.style.gap="15px"
rightaside.style.fontSize="20px"



let logo=document.createElement("img")
logo.setAttribute("src","https://cdn.iconscout.com/icon/free/png-512/free-html-59-225995.png?f=webp&w=256")
leftaside.appendChild(logo)
logo.style.width="50px"
logo.style.height="auto"

let topic = document.createElement("span")
topic.innerText = "JavaScript"
leftaside.appendChild(topic)
topic.style.fontSize="40px"
topic.style.fontFamily="cursive"


// let login = document.createElement("span")
// login.innerText = "Login"
// rightaside.appendChild(login)

// let register = document.createElement("span") 
// register.innerText = "Register"
// rightaside.appendChild(register)

let btn1=document.getElementById("btn1")
let btn2=document.getElementById("btn2")
btn1.addEventListener("click",()=>{
    console.log("button clicked");
});
btn1.addEventListener("mouseenter",()=>{
    console.log("mouse entered");
});
btn1.addEventListener("mouseleave",()=>{
    console.log("mouse leaved");
});
btn2.addEventListener("click",()=>{
    console.log("button clicked");
});
btn2.addEventListener("mouseenter",()=>{
    console.log("mouse entered");
});
btn2.addEventListener("mouseleave",()=>{
    console.log("mouse leaved");
});
rightaside.appendChild(btn1)
rightaside.appendChild(btn2)
btn1.style.backgroundColor="gray"
btn2.style.backgroundColor="gray"
btn1.style.border="none"
btn2.style.border="none"
btn1.style.borderRadius="10px"
btn2.style.borderRadius="10px"
btn1.addEventListener("mouseover",()=>{
    btn1.style.backgroundColor="white"
})
btn1.addEventListener("mouseout",()=>{
    btn1.style.backgroundColor="gray"
})
btn2.addEventListener("mouseover",()=>{
    btn2.style.backgroundColor="white"
})
btn2.addEventListener("mouseout",()=>{
    btn2.style.backgroundColor="gray"
})
btn1.style.fontSize="18px"
btn2.style.fontSize="18px"