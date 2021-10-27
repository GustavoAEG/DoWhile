fun main(args: Array<String>) {

    var x =1
    var soma=0
    var media=0.0
    var contador=0
    var cont_soma=0
    var menor=1
    var maior=0
    var cont=0

    /*

     5 - Crie um programa que leia um número do teclado até que
     encontre um número igual a zero. No final, mostre:

 - A soma dos números digitados.
 - A média deles
 - O menor número digitado
 - O maior número digitado

      */



    do {

        println("Informe um numero")
        x = readLine()!!.toInt()

        if (x > maior) {

            maior = x
        }

            if (x != 0) {

                menor = x
                cont = cont + 1

                soma = soma + x
                media = (soma / cont).toDouble()

            } else if (x == 0) {

                println("Informe valors diferentes de zero")



                break
            }

    }

    while (cont != 0)

    println(" A soma  é $soma")
    println("A media é $media")
    println("O maior n° é $maior")
    println("O menor é $menor")

}