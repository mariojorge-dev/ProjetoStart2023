document.addEventListener('DOMContentLoaded', function() {
});
const formulario = document.querySelector(".form");
const Inome = document.querySelector(".nome");
const Icnpj = document.querySelector(".cnpj");
const Idatan = document.querySelector(".datan");
const Iemail = document.querySelector(".email");
const Icep = document.querySelector(".cep");
const Iestado = document.querySelector(".estado");
const Icidade = document.querySelector(".cidade");
const Ibairro = document.querySelector(".bairro");
const Iendereco = document.querySelector(".endereco");
const Icontato = document.querySelector(".contato");
const Isenha = document.querySelector(".senha");
const Isenha2 = document.querySelector(".senha2");

function cadastrar() {
fetch("http://localhost:8080/empreendedor", {
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json' 
    },
    method: "POST",
    body: JSON.stringify({
        nome: Inome.value,
        cnpj: Icnpj.value,
        datan: Idatan.value,
        email: Iemail.value,
        cep: Icep.value,
        estado: Iestado.value,
        cidade: Icidade.value,
        bairro: Ibairro.value,
        endereco: Iendereco.value,
        contato: Icontato.value,
        senha: Isenha.value,
        senha2: Isenha2.value,

    })
})
.then(function (res) { console.log(res) })
.catch(function (res) { console.log(res) })
}

function limpar () {
Inome.value = "";
Icnpj.value = "";
Idatan.value = "";
Iemail.value = "";
Icep.value = "";
Iestado.value = "";
Icidade.value = "";
Ibairro.value = "";
Iendereco.value = "";
Icontato.value = "";
Isenha.value = "";
Isenha2.value = "";

};

formulario.addEventListener('submit', function (event) {
event.preventDefault();

cadastrar();
limpar();
});


  document.addEventListener('DOMContentLoaded', function () {
  
    function formatarData(datan) {
   
      var regexData = /^\d{2}\/\d{2}\/\d{4}$/;
      if (!regexData.test(datan)) {
        alert('Formato de data inválido');
        return null;
      }

   
      var partes = datan.split('/');
      var dia = partes[0];
      var mes = partes[1];
      var ano = partes[2];

      
      var dataFormatada = ano + '-' + mes + '-' + dia;

      return dataFormatada;
    }

    
    function buscarCep() {
      var cep = document.querySelector('.cep').value.replace(/\D/g, ''); 

      if (cep.length !== 8) {
        alert('CEP inválido');
        return;
      }

      var xhr = new XMLHttpRequest();
      xhr.open('GET', 'https://viacep.com.br/ws/' + cep + '/json/', true);

      xhr.onload = function () {
        if (xhr.status === 200) {
          var data = JSON.parse(xhr.responseText);

          if (!data.erro) {
            document.querySelector('.estado').value = data.uf;
            document.querySelector('.cidade').value = data.localidade;
            document.querySelector('.bairro').value = data.bairro;
          } else {
            alert('CEP não encontrado');
          }
        } else {
          alert('Erro ao buscar CEP');
        }
      };

      xhr.send();
    }

   
    document.querySelector('.cep').addEventListener('blur', function () {
      buscarCep();
    });

    
    document.querySelector('.nascimento').addEventListener('blur', function () {
      var dataFormatada = formatarData(this.value);
      if (dataFormatada) {
        this.value = dataFormatada;
      }
    });



  });

