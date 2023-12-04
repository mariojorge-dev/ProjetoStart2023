document.addEventListener('DOMContentLoaded', function () {
});
const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Icpf = document.querySelector(".cpf");
const Idatanascimento = document.querySelector(".datanascimento");
const Iemail = document.querySelector(".email");
const Icep = document.querySelector(".cep");
const Iestado = document.querySelector(".estado");
const Icidade = document.querySelector(".cidade");
const Ibairro = document.querySelector(".bairro");
const Iendereco = document.querySelector(".endereco");
const Icontato = document.querySelector(".contato");
const Isenha = document.querySelector(".senha");
const Isenha1 = document.querySelector(".senha1");
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
      bairro: Ibairro.value,
      endereco: Iendereco.value,
      contato: Icontato.value,
      senha: Isenha.value,
      sexo: Isexo.value

    })
  })
    .then(function (res) { console.log(res) })
    .catch(function (res) { console.log(res) })
}

function limpar() {
  Inome.value = "";
  Icpf.value = "";
  Idatanascimento.value = "";
  Iemail.value = "";
  Icep.value = "";
  Iestado.value = "";
  Icidade.value = "";
  Ibairro.value = "";
  Iendereco.value = "";
  Icontato.value = "";
  Isenha.value = "";
  Isenha1.value = "";
  Isexo.value = "";
};

formulario.addEventListener('submit', function (event) {
  event.preventDefault();

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

  Isenha.addEventListener('input', validarSenhas);
  Isenha1.addEventListener('input', validarSenhas);

  function validarSenhas() {
    const senha = Isenha.value;
    const senhaRepetida = Isenha1.value;

    // Verifica se as senhas são iguais
    return senha === senhaRepetida;
  }

  //

  function validarCPF(cpf) {
    const cpfLimpo = cpf.replace(/\D/g, '');

    if (cpfLimpo.length !== 11) {
        return false;
    }

    if (/^(\d)\1+$/.test(cpfLimpo)) {
        return false;
    }

    let soma = 0;
    for (let i = 0; i < 9; i++) {
        soma += parseInt(cpfLimpo.charAt(i)) * (10 - i);
    }
    let digito1 = 11 - (soma % 11);
    if (digito1 > 9) {
        digito1 = 0;
    }

    if (parseInt(cpfLimpo.charAt(9)) !== digito1) {
        return false;
    }

    soma = 0;
    for (let i = 0; i < 10; i++) {
        soma += parseInt(cpfLimpo.charAt(i)) * (11 - i);
    }
    let digito2 = 11 - (soma % 11);
    if (digito2 > 9) {
        digito2 = 0;
    }

    if (parseInt(cpfLimpo.charAt(10)) !== digito2) {
        return false;
    }

    return true;
}

const cpfValido = validarCPF("123.456.789-09");

  //

  formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    if (validarSenhas()) {
        const cpfInput = document.querySelector('.cpf');
        if (validarCPF(cpfInput.value)) {
            cadastrar();
            limpar();
        } else {
            alert('CPF inválido');
        }
    } else {
        alert('Senhas são diferentes');
    }
});



});