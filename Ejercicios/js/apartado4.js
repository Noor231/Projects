//creamos constants para poder usar los elementos en html (inputs)
const solveButton = document.getElementById("solve");
const aInput = document.getElementById("a");
const bInput = document.getElementById("b");
const cInput = document.getElementById("c");
const resultParagraph = document.getElementById("result");


//creamos un evento de button click (Cuando el usuario clique boton "Solve" ejecute el siguente codigo)
solveButton.addEventListener("click", function(event) {
  event.preventDefault();
//cogemos values de los inputs
  const a = parseFloat(aInput.value);
  const b = parseFloat(bInput.value);
  const c = parseFloat(cInput.value);

  if (isNaN(a) || isNaN(b) || isNaN(c)) { //si los ipputs introducidos no son numeros imprima "Please enter valid numbers."
    result.textContent = "Please enter valid numbers.";
    return;
  }
//hacemos el calculo
  const x = (c - b) / a;
//mostramos el resultado
  resultParagraph.textContent = `x = ${x}`;
});