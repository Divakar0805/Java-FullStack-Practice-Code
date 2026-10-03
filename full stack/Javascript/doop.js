let body = document.body;

// Create form
let form = document.createElement("form");
body.appendChild(form);

// Counter for products
let counter = 0;

// Create total display
let totalDisplay = document.createElement("h3");
totalDisplay.innerText = "Total: 0";
body.appendChild(totalDisplay);

// Function to update total
let updateTotal = () => {
  let total = 0;
  let divs = form.querySelectorAll("div");
  divs.forEach(div => {
    let inputs = div.querySelectorAll("input");
    let qty = parseFloat(inputs[1].value) || 0;
    let price = parseFloat(inputs[2].value) || 0;
    total += qty * price;
  });
  totalDisplay.innerText = "Total: " + total;
};

// Function to add new product fields
let addproducts = () => {
  counter++;

  let div = document.createElement("div");

  let label = document.createElement("label");
  label.innerText = `Product ${counter}: `;
  div.appendChild(label);

  let nameinput = document.createElement("input");
  nameinput.setAttribute("placeholder", "Name");
  div.appendChild(nameinput);

  let quantityinput = document.createElement("input");
  quantityinput.setAttribute("placeholder", "Quantity");
  quantityinput.type = "number";
  quantityinput.addEventListener("input", updateTotal);
  div.appendChild(quantityinput);

  let priceinput = document.createElement("input");
  priceinput.setAttribute("placeholder", "Price");
  priceinput.type = "number";
  priceinput.addEventListener("input", updateTotal);
  div.appendChild(priceinput);

  form.appendChild(div);
};

// Add first product by default
addproducts();

// Create button
let btn = document.createElement("button");
btn.innerText = "Add Product";
body.appendChild(btn);

// Prevent form refresh and add product
btn.addEventListener("click", (e) => {
  e.preventDefault();
  addproducts();
});
