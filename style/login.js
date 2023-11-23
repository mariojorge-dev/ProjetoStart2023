const usuarios = [
    {
        login: 'rafael',
        senha: 'rafael'
    },

    {
        login: 'mario',
        senha: 'mario'
    }


]

let botao = documentElementByid('Entrar')

botao.addEventListerner('click', function logar() {
    let pegaUsuario = documentElementByid('Usuario').value
    let pegaSenha = documentElementByid('Senha').value

    for(let i in usuarios) {
        if(pegaUsuario == usuarios[i].pass)
        alert('ok')
        else {
            alert('error')
        }
    }
})


function logar () {
    let pegaUsuario = documentElementByid('Usuario').value
    let pegaSenha = documentElementByid('Senha').value

    for(let i in usuarios) {
        if(pegaUsuario == usuarios[i].login)
        alert('ok')
    }

}