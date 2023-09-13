criarElementoHTML = () => {
    //  criando o elemento HTML
    const novoElemento = document.createElement('div');

    // <div id="meuDiv" class="minhaClasse"></div>
    novoElemento.id = 'meuDiv';

    const valor = Math.floor(Math.random() * 100) + 1;
    console.log(valor);

    if(valor <= 70 ) {
        novoElemento.className = "minhaClasse";
    }
    // texto para ser inserido em um nó do DOM HTML
    const texto = document.createTextNode("Esse é o texto que vou colocar no elemento");

    novoElemento.appendChild(texto);
    document.body.appendChild(novoElemento);

}

aplicarClassBotao = () => {
    const botoes = document.querySelectorAll("button");

    botoes.forEach(function(btn) {
        btn.style.color = "blue";
        btn.style.backgroundColor = "#fff";
        btn.style.borderRadius = "10px";
        btn.style.padding = "5px";
    })
}

alterarClassElement = () => {
    //document.querySelectorAll("#meuDiv").classList.add("padrao");
    document.querySelectorAll("meuDiv").forEach(function(el) {
        el.classList.add("padrao");
    })
}