inptE = document.getElementById("inpt-email");
inptS = document.getElementById("inpt-senha");
inptSL = document.getElementById("inpt-submit-login")

const emailADM = "123"
const senhaADM = "123"

function testarInputs(){
    document.addEventListener("click", inptSL)
        if(inptE.value === emailADM && inptS.value === senhaADM){
            window.location.href = "cadastroDeFigurinhas.html"
        }
        return console.log("email: ", inptE.value,"senha: ", inptS.value)

}

