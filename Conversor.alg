algoritmo "Projeto Algoritmo Semana 4"
//Fun??o :Converter temperatura de Celsius para Fahrenheit e vice e versa. Converter moeda de Reais para D?lares e vice e versa.
// Criado por : Gabriel Sofiati Rausch
// Data : 08/11/2022
var
input: literal
temperaturaFahrenheit, temperaturaCelsius: real
dolar, reais, cotacao: real
inicio
repita
   limpatela
   Escreval("Escolha uma das op??es")
   Escreval("1 - Temperatura (Celsius e Fahrenheit)")
   Escreval("2 - Moeda (Real e D?lar)")
   Escreval("3 - Sair do programa")
   leia(input)
   Escreval("")
   Escolha input
   caso "1"
      Escreval("Voc? deseja converter de que jeito?")
      Escreval("C - Celsius para Fahrenheit")
      Escreval("F - Fahrenheit para Celsius")
      leia(input)
      Escreval("")
      Escolha input
      caso "C"
         Escreval("Insira temperatura em Celsius")
         leia(temperaturaCelsius)
         Escreval("")
         temperaturaFahrenheit <- (temperaturaCelsius * 1.8) + 32
         Escreval("A temperatura em Fahrenheit ? de: ", temperaturaFahrenheit:1:2, " ? F")
         Escreval("--Aperte enter para voltar--")
         leia(input)
      caso "F"
         Escreval("Insira temperatura em Fahrenheit")
         leia(temperaturaFahrenheit)
         Escreval("")
         temperaturaCelsius <- (temperaturaFahrenheit - 32) / 1.8
         Escreval("A temperatura em Celsius ? de: ", temperaturaCelsius:1:2," ? C")
         Escreval("--Aperte enter para voltar--")
         leia(input)
      fimescolha
   caso "2"
      Escreval("Insira a cota??o do d?lar atual")
      leia(cotacao)
      Escreval("")
      Escreval("Voc? deseja converter de que jeito?")
      Escreval("R - Real para D?lar")
      Escreval("D - D?lar para Real")
      leia(input)
      Escreval("")
      Escolha input
      caso "R"
         Escreval("Digite o valor em real")
         leia(reais)
         Escreval("")
         dolar <- reais / cotacao
         Escreval("O valor em d?lar ?: U$", dolar:1:2)
         Escreval("--Aperte enter para voltar--")
         leia(input)
      caso "D"
         Escreval("Digite o valor em d?lares")
         leia(dolar)
         Escreval("")
         reais <- dolar * cotacao
         Escreval("O valor em real ?: R$", reais:1:2)
         Escreval("--Aperte enter para voltar--")
         leia(input)
      fimescolha

   fimescolha

ate (input = "3")
Escreval("")
Escreval("--Programa finalizado--")
fimalgoritmo
