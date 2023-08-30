validaSenha = () => {
    // arrow function
    
    event.preventDefault();

    const elementSenha = document.getElementById("senha");
    const senha = elementSenha.value;

    const senhaLetraMin = /[a-z]/.test(senha); // true se tiver letra minuscula
    const senhaLetraMai = /[A-Z]/.test(senha); // true se tiver letra maiuscula
    const senhaNumero = /[0-9]/.test(senha); // true se tiver numero
    const senhaCaracterEspecial = /[!@#$%&*()_+.?]/.test(senha); // true se tiver caracter especial

    if(senha.length < 7) {
        const containerMensagemPadrao = document.getElementsByClassName("mensagem-padrao");
        containerMensagemPadrao[0].insertAdjacentHTML('afterbegin','<p>Senha inválida, senha deve conter no mínimo 8 caracteres</p>');

        return;
    }


}