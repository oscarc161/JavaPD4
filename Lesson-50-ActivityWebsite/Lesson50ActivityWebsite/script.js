let data, songs;
async function init(){
let link = "https://sturdy-space-journey-q7prqxj6g4rxcxj7w-8100.app.github.dev/";
let route = "/albums";
info = await fetch(link + route);
data = await info.json();
generateCards(data);
console.log(data);
}


function generateCards(customers){
  let output = document.getElementById("output");
  let build = "";
  for(let i=0; i<50; i++){
    let customer = customers[i];
    build += '<div class="card">';
    build += `<h1> Album: ${customer.Title} </h1>`;
    build += `<h2> Composer: ${customer.Name}  </h2>`;
    build += `<hr>`;
    build += '</div>'
  }
   output.innerHTML = build;

}


