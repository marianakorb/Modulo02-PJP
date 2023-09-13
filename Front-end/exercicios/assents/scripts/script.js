criarElementoHTML = () => {
    //  criando o elemento HTML
    const novoElemento = document.createElement('div');

    // <div id="meuDiv" class="minhaClasse"></div>
    novoElemento.id = 'meuDiv';
    novoElemento.className = 'minhaClasse';

    // texto para ser inserido em um nó do DOM HTML
    const texto = document.createTextNode("Esse é o texto que vou colocar no elemento");

    novoElemento.appendChild(texto);
    document.body.appendChild(novoElemento);

}

aplicarClassBotao = () => {
    
}

