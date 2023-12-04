document.addEventListener('DOMContentLoaded', function() {
});
const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Icpf = document.querySelector(".cpf");
const Idatanascimento = document.querySelector(".datanascimento");
const Iemail = document.querySelector(".email");
const Icep = document.querySelector(".cep");
const Iestado = document.querySelector(".estado");
const Icidade = document.querySelector(".cidade");
const Imunicipio = document.querySelector(".municipio");
const Iendereco = document.querySelector(".endereco");
const Icontato = document.querySelector(".contato");
const Isenha = document.querySelector(".senha");
const Isexo = document.querySelector(".sexo");

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
        datanascimento: Idatanascimento.value,
        email: Iemail.value,
        cep: Icep.value,
        estado: Iestado.value,
        cidade: Icidade.value,
        municipio: Imunicipio.value,
        endereco: Iendereco.value,
        contato: Icontato.value,
        senha: Isenha.value,
        sexo: Isexo.value

    })
})
.then(function (res) { console.log(res) })
.catch(function (res) { console.log(res) })
}

function limpar () {
Inome.value = "";
Icpf.value = "";
Idatanascimento.value = "";
Iemail.value = "";
Icep.value = "";
Iestado.value = "";
Icidade.value = "";
Imunicipio.value = "";
Iendereco.value = "";
Icontato.value = "";
Isenha.value = "";
Isexo.value = "";
};

formulario.addEventListener('submit', function (event) {
event.preventDefault();
console.log("Valor do sexo:", Isexo.value);
cadastrar();
limpar();
});


  document.addEventListener('DOMContentLoaded', function () {
    // Função para formatar a data
    function formatarData(datanascimento) {
      // Verifica se a data está no formato esperado
      var regexData = /^\d{2}\/\d{2}\/\d{4}$/;
      if (!regexData.test(datanascimento)) {
        alert('Formato de data inválido');
        return null;
      }

      // Divide a data em dia, mês e ano
      var partes = datanascimento.split('/');
      var dia = partes[0];
      var mes = partes[1];
      var ano = partes[2];

      // Formata a data para o formato desejado (yyyy-mm-dd)
      var dataFormatada = ano + '-' + mes + '-' + dia;

      return dataFormatada;
    }

    // Função para buscar informações do CEP
    function buscarCep() {
      var cep = document.querySelector('.cep').value.replace(/\D/g, ''); // Remove caracteres não numéricos

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
            document.querySelector('.municipio').value = data.bairro;
          } else {
            alert('CEP não encontrado');
          }
        } else {
          alert('Erro ao buscar CEP');
        }
      };

      xhr.send();
    }

    // Adiciona evento de blur para acionar a função ao sair do campo de CEP
    document.querySelector('.cep').addEventListener('blur', function () {
      buscarCep();
    });



    function recuperarSexo() {
        console.log('Função recuperarSexo está sendo executada.');

        const selectedValue = selectElement.value;

        if (selectedValue) {
            console.log('Valor do sexo:', selectedValue);
            return selectedValue;
        } else {
            console.log('Valor do sexo: naoinformou');
            return "naoinformou";
        }
    }


  });