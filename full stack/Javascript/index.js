//creat-->setattribute()
let body=document.body
let form=document.createElement("form")
body.appendChild(form)
let namelabel=document.createElement("label")
namelabel.innerText="Name"

form.appendChild(label)
let nameInput=document.createElement("input")
label.appendChild(nameInput)


label.setAttribute("for","name")
nameInput.setAttribute("id","name")
nameInput.setAttribute("name","name")
nameInput.setAttribute("placeholder","Enter name")



//Read-->getsttribute()

console.log(nameInput.getAttribute("id"))
console.log(nameInput.getAttribute("placeholder"))
console.log(nameInput("name"))


