const loadCidade = (uf) =>{
    const url = `https://servicodados.ibge.gov.br/api/v1/localidades/estados/${uf}/distritos?orderBy=nome`
    load(url, 'cidade');
    resultado('estado');
}
const loadEstado = () =>{
    const url = 'https://servicodados.ibge.gov.br/api/v1/localidades/estados?orderBy=nome';
   load(url, 'estado');
}

const resultado = (action) =>{
    const element = document.getElementById(action);
    document.getElementById('item-cidade').textContent = '';
    
    if(action == 'estado'){
        const estado = element.options[element.selectedIndex].text;
        document.getElementById('item-estado').textContent = estado;
        aplicarDisplay('resultado','none');
    }
    if(action =='cidade'){
        const cidade = element.options[element.selectedIndex].text;
        document.getElementById('item-cidade').textContent = cidade;    
        aplicarDisplay('resultado','block');
    }
}

const aplicarDisplay = (id, action) =>{
    document.getElementById(id).style.display = action;
}

const load = async (url, action) =>{
    try {        
        const response = await fetch(url);
        const data = await response.json();
        const element = document.getElementById(action);
        let option = '';

        switch (action) {
            case 'cidade':
                const optionCidade = document.getElementsByClassName('option-cidade');
                while(optionCidade.length != 0){
                    optionCidade[0].remove();
                }
                for(let cidade of data ){
                    option += `<option class='option-cidade' value=${cidade.nome} id=${cidade.id}>${cidade.nome}</option>`;
                }
                break;
            case 'estado':
                for(let estado of data){
                    if(estado.id != 53){
                        option += `<option value=${estado.sigla} id=${estado.id}> ${estado.nome} </option>`;
                    }
                }
                break;
            default:
                break;
        }
        element.insertAdjacentHTML("beforeend",option);

    } catch (error) {
        alert("Ops! algo deu errado");
    }
}

loadEstado();

/*
const loadCidade = async (uf) => {
    const url = `https://servicodados.ibge.gov.br/api/v1/localidades/estados/${uf}/distritos?orderBy=nome`;

    const optionCidade = document.getElementsByClassName("option-cidade");

    while(optionCidade.length != 0) {
        optionCidade[0].remove();
    } 


    try {
        const response = await fetch(url);
        const data = await response.json(); 
        
        const element = document.getElementById('cidade');
        let option = "";
        for(let cidade of data) {
            option += `<option class="option-cidade" value=${cidade.nome} id=${cidade.id}>${cidade.nome}</option>`;
        }

        element.insertAdjacentHTML("beforeend", option);

    } catch (error) {
        alert("Ops! Algo deu errado na carga dos municípios da união federativa " + uf);
    }
}

// async - avisa que tenho uma promessa (callback)
const loadEstado = async () => {
    const url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados?orderBy=nome";

    try {
        // await - aguarda processar essa linha para depois ir para a próxima
        const response = await fetch(url);
        const data = await response.json();

        const element = document.getElementById('estado');
        let option = "";

        for(let estado of data) {
            option += `<option value=${estado.sigla} id=${estado.id}>${estado.nome}</option>`;
        }

        element.insertAdjacentHTML("beforeend", option);

    } catch (error) {
        alert("Ops! Algo deu errado.");
    }
}

loadEstado(); */