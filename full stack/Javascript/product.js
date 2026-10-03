let body=document.body
let form=document.querySelector("form")
body.appendChild(form)
let counter=0
let addproducts=()=>{
counter++;
let label=document.createElement("label")
label.innerText=`product ${counter}`

let nameinput=document.createElement("input")
nameinput.setAttribute("placeholder","Name")

let quantityinput=document.createElement("input")
quantityinput.setAttribute("placeholder","Quantity")

let priceinput=document.createElement("input")
priceinput.setAttribute("placeholder","Price")

let div=document.createElement("div")
div.appendChild(label)
div.appendChild(nameinput)
div.appendChild(quantityinput)
div.appendChild(priceinput)
form.appendChild(div)
};
addproducts()

let btn =document.querySelector("button")
btn.addEventListener("click",addproducts);
body.appendChild(btn)