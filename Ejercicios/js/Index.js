function changeExercise(pos) {
   
    for(let i=0; i<document.getElementsByClassName('row').length; i++) {//bucle que ejecuta "num de row" veces
        document.getElementsByClassName('row')[i].style.display='none';//esconder el elmento row
        document.getElementsByTagName('a')[i].style.background = 'transparent';//cambiar colo de fondo de los elemento "a"
    }
    // SHOW THE EXERCISE CLICKED 
    document.getElementsByClassName('row')[pos].style.display='flex'; //mostar el ejercicio

    document.getElementsByTagName('a')[pos].style.background = 'gray'; //cambio fondo de los elementos "a"


    
}
