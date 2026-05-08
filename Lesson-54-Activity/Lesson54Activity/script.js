let data, songs;



async function init_customers(){
let link = "https://sturdy-space-journey-q7prqxj6g4rxcxj7w-8700.app.github.dev/";
let route = "customers";
info = await fetch(link + route);
customers = await info.json();
generateCards_customers(customers);
console.log(customers);
}

function generateCards_customers(customers){
  let output = document.getElementById("centerpanel");
  let build = "";
  for(let i=0; i<50; i++){
    let customer = customers[i];
    build += '<div class="card">';
    build += `<h1> Customer ID: ${customer.CustomerId} </h1>`;
    build += `<h2> First Name: ${customer.FirstName}  </h2>`;
    build += `<h2> Last Name: ${customer.LastName}  </h2>`;
    build += `<h2> Country: ${customer.Country}  </h2>`;
    build += `<p> Email: ${customer.Email}  </p>`;
    build += `<img src="countries/${customer.Country}.PNG"`;
    build += `<hr>`;
    build += '</div>'
  }
   output.innerHTML = build;

}

function filter_1(country){

    let newCustomers = [];

    for (let i = 0; i < customers.length; i++){
        let customer = customers[i];
        if(customer.Country === country){
            // add this customer to the new list
            newCustomers.push(customer);
        }
    }

    generateCards_customers(newCustomers);
}
