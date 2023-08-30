function calcular() {
    event.preventDefault();
    console.log("Olá, Você cricou no botão");
 
    //pegar elemento na tela com o nome tabuada
    const element = document.getElementById('tabuada');
    const tabuada = element.value;
    console.log(element)
    console.log(tabuada);
 
 
    //validacao
    if (isNaN(tabuada) || tabuada < 1 || tabuada > 10 || tabuada == '') {
        let erro = '';
 
        if (isNaN(tabuada)) {
            erro = "Somente numeros"
        }
        if (tabuada < 1) {
            erro = "somente números positivos";
        }
        if (tabuada > 10) {
            erro = "Somente números menores que 10"
        }
        if (tabuada == '') {
            erro = 'Não é possível fazer o calculo com  valores vazio'
        }
        //alert("somente numeros");
        element.value = erro;
        element.classList.add('erro');
        return;
    }
 
 
    for (let index = 1; index < 11; index++) {
        console.log(tabuada + 'X' + index + '=' + tabuada * index);
    }
 
    let condition = 1;
    while (condition < 11) {
        console.log(tabuada + 'X' + condition + '=' + tabuada * condition);
        condition++;
    }
 
 
    //apagar o resultado anterior
    const linhaResultado = document.getElementsByClassName('tab-result');
    while (linhaResultado.length != 0) {
        linhaResultado[0].remove();
    }
 
 
    //guardar na variavel resultado os valores da tabuada
    let resultado = '';
    for (let index = 1; index < 11; index++) {
        resultado += '<div class="tab-result">' + tabuada + 'X' + index + '=' + tabuada * index + '</div>';
    }
 
    //pegar o elemento tabuada-resultado e inserir o resultado da tabuada
    const elementResultado = document.getElementById('tabuada-resultado');
    elementResultado.insertAdjacentHTML('afterbegin', resultado);
    elementResultado.style.visibility = 'visible';
 
    element.value = '';
}
 
function limparInput(elementClicado) {
    elementClicado.value = '';
    elementClicado.classList.remove('erro');
}