document.getElementById('fabricante-cadastro').className = ''

const getShowItemMenu = (idNomeSection) => {
    setHiddenSection();
    element = document.getElementById(idNomeSection);
    element.className = ''
}
const getShowItemMenuEdit = (ele) => {
    setHiddenSection();
    element = document.getElementById(ele.getAttribute('idEdit'));
    element.className = ''
    document.getElementById('fabricante-cadastro-input-nome-edit').value = ele.getAttribute('nome');
    document.getElementById('fabricante-cadastro-input-origem-editar').value = ele.getAttribute('origem');

}
const setHiddenSection = () => {
    const section = document.getElementsByTagName('section');

    for(const element of section){
        element.className = 'hidden'
    }
}

const getShowEdit = (ele) =>{
    getShowItemMenuEdit(ele);
}