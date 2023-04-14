function suma(){
    //guardamos values de todos los input en vars
    var num1=parseInt(document.getElementsByClassName("inputApartat3")[0].value);
    var num2=parseInt(document.getElementsByClassName("inputApartat3")[1].value);
    var num3=parseInt(document.getElementsByClassName("inputApartat3")[2].value);
    var num4=parseInt(document.getElementsByClassName("inputApartat3")[3].value);
    var num5=parseInt(document.getElementsByClassName("inputApartat3")[4].value);
    var Result;
    //calculamos el resultado
    Result= num1+num2+num3+num4+num5;
        //mostramos el resultado
    document.getElementById("Rsuma").innerHTML = Result;
}
function media(){
        //guardamos values de todos los input en vars
    var num1=parseInt(document.getElementsByClassName("inputApartat3")[0].value);
    var num2=parseInt(document.getElementsByClassName("inputApartat3")[1].value);
    var num3=parseInt(document.getElementsByClassName("inputApartat3")[2].value);
    var num4=parseInt(document.getElementsByClassName("inputApartat3")[3].value);
    var num5=parseInt(document.getElementsByClassName("inputApartat3")[4].value);
    var Resultm;
        //calculamos el resultado
    Resultm =  (num1 + num2 + num3 + num4 + num5) / 5;
    //mostramos el resultado
    document.getElementById("Rmedia").innerHTML = Resultm;
}