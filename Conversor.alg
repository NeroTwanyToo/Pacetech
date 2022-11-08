algoritmo "Projeto Algoritmo Semana 4"
//Função :Converter temperatura de Celsius para Fahrenheit e vice e versa. Converter moeda de Reais para Dólares e vice e versa.
// Criado por : Gabriel Sofiati Rausch
// Data : 08/11/2022
var
input: literal
temperaturaFahrenheit, temperaturaCelsius: real
dolar, reais, cotacao: real
inicio
repita
   limpatela
   Escreval("Escolha uma das opções")
   Escreval("1 - Temperatura (Celsius e Fahrenheit)")
   Escreval("2 - Moeda (Real e Dólar)")
   Escreval("3 - Sair do programa")
   leia(input)
   Escreval("")
   Escolha input
   caso "1"
      Escreval("Você deseja converter de que jeito?")
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
         Escreval("A temperatura em Fahrenheit é de: ", temperaturaFahrenheit:1:2, " ° F")
         Escreval("--Aperte enter para voltar--")
         leia(input)
      caso "F"
         Escreval("Insira temperatura em Fahrenheit")
         leia(temperaturaFahrenheit)
         Escreval("")
         temperaturaCelsius <- (temperaturaFahrenheit - 32) / 1.8
         Escreval("A temperatura em Celsius é de: ", temperaturaCelsius:1:2," ° C")
         Escreval("--Aperte enter para voltar--")
         leia(input)
      fimescolha
   caso "2"
      Escreval("Insira a cotação do dólar atual")
      leia(cotacao)
      Escreval("")
      Escreval("Você deseja converter de que jeito?")
      Escreval("R - Real para Dólar")
      Escreval("D - Dólar para Real")
      leia(input)
      Escreval("")
      Escolha input
      caso "R"
         Escreval("Digite o valor em real")
         leia(reais)
         Escreval("")
         dolar <- reais / cotacao
         Escreval("O valor em dólar é: U$", dolar:1:2)
         Escreval("--Aperte enter para voltar--")
         leia(input)
      caso "D"
         Escreval("Digite o valor em dólares")
         leia(dolar)
         Escreval("")
         reais <- dolar * cotacao
         Escreval("O valor em real é: R$", reais:1:2)
         Escreval("--Aperte enter para voltar--")
         leia(input)
      fimescolha

   fimescolha

ate (input = "3")
Escreval("")
Escreval("--Programa finalizado--")
fimalgoritmo
