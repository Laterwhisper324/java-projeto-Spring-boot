const inptNome = document.getElementById("nome");
const inptSelecao = document.getElementById("selecao");
const inptPosicao = document.getElementById("posicao");
const inptPreco = document.getElementById("preco");
const inptRaridade = document.getElementById("raridade");


inptSC = document.getElementById("inpt-summit-cadastro")

function retornarValores(){

    const dadosFigurinha = {
        nome: inptNome.value,
        selecao: inptSelecao.value,
        posicao: inptPosicao.value,
        preco: inptPreco.value,
        raridade: inptRaridade.value
    };
    fetch("http://localhost:8080/figurinhas", {
        method: "POST", // Diz que é uma inserção (igual ao POST do arquivo .http)
        headers: {
            "Content-Type": "application/json" // Avisa ao Java que está indo um JSON (igual ao Content-Type do .http)
        },
        body: JSON.stringify(dadosFigurinha) // Envia os dados convertidos em texto JSON no corpo
    }).then()

    const jsonFigurinhas = JSON.stringify(dadosFigurinha, null, 2);

    console.log(jsonFigurinhas)
}