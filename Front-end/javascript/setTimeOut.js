
setTimeout(() => {

    console.log("5000")

}, 5000);

console.log("depois do timeout de 1000")

setTimeout(() => {

    console.log("1000")

}, 1000);

const aleatorio  = Math.floor(Math.random() * 100) + 800 ;

setTimeout(() => {

    console.log(aleatorio);

}, aleatorio);

const valores = [10,25,8]

console.log(valores)

valores.push(aleatorio);

console.log(valores);

setTimeout(() => {

    console.log("texto dentro do setimeout aleatorio");

}, aleatorio);


const stringValor = "52,3,Sidney,8";

console.log(stringValor);

console.log(stringValor.split(","));
