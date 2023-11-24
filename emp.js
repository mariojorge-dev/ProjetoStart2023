document.addEventListener('DOMContentLoaded', function () {
    const formularioemp = document.querySelector(".formemp");
    const Inomeemp = document.querySelector(".nomeemp");
    const Icnpjemp = document.querySelector(".cnpjemp");
    const Idatanemp = document.querySelector(".datanemp");
    const Iemailemp = document.querySelector(".emailemp");
    const Icep = document.querySelector(".cep");
    const Iestado = document.querySelector(".estado");
    const Icidade = document.querySelector(".cidade");
    const Imunicipio = document.querySelector(".municipio");
    const Iendereco = document.querySelector(".endereco");
    const Icontatoemp = document.querySelector(".contatoemp");
    const Isenhaemp = document.querySelector(".senhaemp");

    function cadastrar() {
        fetch("http://localhost:8080/empreendedor", {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({
                nome: Inomeemp.value,
                cnpj: Icnpjemp.value,
                datanascimento: Idatanemp.value,
                email: Iemailemp.value,
                cep: Icep.value,
                estado: Iestado.value,
                cidade: Icidade.value,
                municipio: Imunicipio.value,
                endereco: Iendereco.value,
                contato: Icontatoemp.value,
                senha: Isenhaemp.value,
            })
        })
            .then(function (res) { console.log(res) })
            .catch(function (res) { console.log(res) });
    }

    function limpar() {
        Inomeemp.value = "";
        Icnpjemp.value = "";
        Idatanemp.value = "";
        Iemailemp.value = "";
        Icep.value = "";
        Iestado.value = "";
        Icidade.value = "";
        Imunicipio.value = "";
        Iendereco.value = "";
        Icontatoemp.value = "";
        Isenhaemp.value = "";
    }

    formularioemp.addEventListener('submit', function (event) {
        event.preventDefault();
        cadastrar();
        limpar();
    });

    document.addEventListener('DOMContentLoaded', function () {
        // Função para formatar a data
        function formatarData(datanemp) {
            // Verifica se a data está no formato esperado
            var regexData = /^\d{2}\/\d{2}\/\d{4}$/;
            if (!regexData.test(datanemp)) {
                alert('Formato de data inválido');
                return null;
            }

            // Divide a data em dia, mês e ano
            var partes = datanemp.split('/');
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

        // Adiciona evento de blur para formatar a data ao sair do campo de data
        document.querySelector('.nascimento').addEventListener('blur', function () {
            var dataFormatada = formatarData(this.value);
            if (dataFormatada) {
                this.value = dataFormatada;
            }
        });

        // ... Outros scripts ou funções que você possa ter ...
    });
});