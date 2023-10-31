document.addEventListener('DOMContentLoaded', function() {
});
const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Icpf = document.querySelector(".cpf");
const Icontato = document.querySelector(".contato");
const Idatan = document.querySelector(".datan");
const Isexo = document.querySelector(".sexo");
const Icep = document.querySelector(".cep");
const Icidade = document.querySelector(".cidade");
const Iestado = document.querySelector(".estado");
const Iendereco = document.querySelector(".endereco");
const Isenha = document.querySelector(".senha");

function cadastrar() {
fetch("http://localhost:8080/usuarios", {
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json' 
    },
    method: "POST",
    body: JSON.stringify({
        nome: Inome.value,
        cpf: Icpf.value,
        contato: Icontato.value,
        datanascimento: Idatan.value,
        sexo: Isexo.value,
        cep: Icep.value,
        cidade: Icidade.value,
        estado: Iestado.value,/*
        endereco: Iendereco.value,*/
        senha: Isenha.value

    })
})
.then(function (res) { console.log(res) })
.catch(function (res) { console.log(res) })
}

function limpar () {
Inome.value = "";
Icpf.value = "";
Icontato.value = "";
Idatan.value = "";
Isexo.value = "";
Icep.value = "";
Icidade.value = "";
Iestado.value = "";
Iendereco.value = "";
Isenha.value = "";
};

formulario.addEventListener('submit', function (event) {
event.preventDefault();

cadastrar();
limpar();
});