document.addEventListener('DOMContentLoaded', function() {
});
const formulario = document.querySelector("user");
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");


function cadastrar() {
fetch("http://localhost:8080/login", {
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json' 
    },
    method: "POST",
    body: JSON.stringify({
        email: Iemail.value,
        senha: Isenha.value

    })
})
.then(function (res) { console.log(res) })
.catch(function (res) { console.log(res) })
}

formulario.addEventListener('submit', function (event) {
event.preventDefault();

Entrar();
})
