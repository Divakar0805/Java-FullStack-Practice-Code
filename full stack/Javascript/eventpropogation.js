let grandparent=document.getElementById("grandparent")
grandparent.addEventListener("click",()=>{
    console.log("grandparent clicked");
},false
);
let parent=document.getElementById("parent")
parent.addEventListener("click",()=>{
    console.log("parent clicked");
},true
);
let child=document.getElementById("child")
child.addEventListener("click",()=>{
    console.log("child clicked");
},false
);
document.body.addEventListener("click",()=>{
    console.log("body clicked");
},true
);
document.addEventListener("click",()=>{
    console.log("document clicked");
},false
);
window.addEventListener("click",()=>{
    console.log("window clicked")
},true
);