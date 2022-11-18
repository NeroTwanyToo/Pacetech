algoritmo "Conversor Upgrade"
//Função : Converter temperatura de Celsius para Fahrenheit e vice e versa.
//Converter moeda de Reais para Dólares e vice e versa.
// Criado por : Gabriel Sofiati Rausch
// Data : 17/11/2022
var
temperaturas: vetor[1..4,1..3] de real
aux: vetor[1..4,1..3] de real
input: literal
temperaturaFahrenheit, temperaturaCelsius: real
dolar, reais, cotacao: real
i,j: inteiro
soResultado: logico
temp: real

funcao menu(): literal
inicio
limpatela
Escreval("Escolha uma das opções:")
Escreval("¤-------------------------------------------------¤")
Escreval("¦1 - Temperatura (Celsius e Fahrenheit)           ¦")
Escreval("¦-------------------------------------------------¦")
Escreval("¦2 - Moeda (Real e Dólar)                         ¦")
Escreval("¦-------------------------------------------------¦")
Escreval("¦3 - Converter 4 temperaturas salvas              ¦")
Escreval("¦-------------------------------------------------¦")
Escreval("¦4 - Sair do programa                             ¦")
Escreval("¤-------------------------------------------------¤")
leia(input)
Escreval("")
retorne input
fimfuncao

funcao converterTemp(): literal
inicio
Escreval("Você deseja converter de que jeito?")
Escreval("C - Celsius para Fahrenheit")
Escreval("F - Fahrenheit para Celsius")
leia(input)
Escreval("")
retorne input
fimfuncao

procedimento converterCparaF(celsius,)
var
fahrenheit: real
inicio
se soResultado = verdadeiro entao
   fahrenheit <- (celsius * 1.8) + 32
   temp <- fahrenheit
senao
   Escreval("")
   fahrenheit <- (celsius * 1.8) + 32
   Escreval("A temperatura em Fahrenheit é de: ", fahrenheit:1:2, " ° F")
   se (temperaturas[4,3] = 0) entao
      Escreval("--Aperte S para salvar, ENTER para voltar--")
      leia(input)
      se (input = "S") ou (input = "s") entao
         para i de 1 ate 4 faca
            se temperaturas[i,1] = 0 entao
               temperaturas[i,1] <- celsius
               Escreval("Qual a hora que você registrou esta temperatura?")
               leia(temperaturas[i,2])
               temperaturas[i,3] <- -1000
               interrompa
            fimse
         fimpara
      fimse
   senao
      Escreval("--Limite de 4 temperaturas salvas alcançado, aperte ENTER para voltar--")
      leia(input)
   fimse
fimse
fimprocedimento

procedimento converterFparaC(fahrenheit,)
var
celsius: real
inicio

se soResultado = verdadeiro entao
   celsius <- (fahrenheit - 32) / 1.8
   temp <- celsius
senao
   Escreval("")
   celsius <- (fahrenheit - 32) / 1.8
   Escreval("A temperatura em Celsius é de: ", celsius:1:2," ° C")
   Escreval("--Aperte S para salvar, ENTER para voltar--")
   leia(input)
   se (input = "S") ou (input = "s") entao
      para i de 1 ate 5 faca
         se temperaturas[i,1] = 0 entao
            temperaturas[i,1] <- fahrenheit
            Escreval("Qual a hora que você registrou esta temperatura? (Só digite o número da hora mesmo)")
            leia(temperaturas[i,2])
            temperaturas[i,3] <- -2000
            interrompa
         fimse
      fimpara
   fimse
fimse
fimprocedimento

procedimento listinha()
inicio
para i de 1 ate 4 faca
   se (temperaturas[i,1] < 10) entao    // e (temperaturas[i,1] <> 0)
      Escreva(" ")
      se temperaturas[i,1] <> 0 entao
         Escreva(temperaturas[i,1])
      senao
         Escreva("-Espaço", i, " Vazio-")
      fimse
   senao
      Escreva(temperaturas[i,1])
   fimse
   para j de 1 ate 3 faca
      se (temperaturas[i,j] = -1000) entao
         Escreva("(Celsius)")
         soResultado <- verdadeiro
         converterCparaF(temperaturas[i,1])
         se temp <= 100 entao
            Escreva("  | Fahrenheit = ", temp:1:2)//um espaço a mais
            soResultado <- falso
            temp <- 0
            Escreva("  (Criado às", temperaturas[i,2], "h)")
         senao
            Escreva(" | Fahrenheit = ", temp:1:2)
            soResultado <- falso
            temp <- 0
            Escreva(" (Criado às", temperaturas[i,2], "h)")//um espaço a mais
         fimse
      fimse
      se (temperaturas[i,j] = -2000) entao
         Escreva("(Fahrenheit)")
         soResultado <- verdadeiro
         converterFparaC(temperaturas[i,1])
         se temp <= 100 entao
            Escreva("  | Celsius = ", temp:1:2)//um espaço a mais
            soResultado <- falso
            temp <- 0
            Escreva("  (Criado às", temperaturas[i,2], "h)")
         senao
            Escreva(" | Celsius = ", temp:1:2)
            soResultado <- falso
            temp <- 0
            Escreva(" (Criado às", temperaturas[i,2], "h)")//um espaço a mais
         fimse
      fimse
   fimpara
   Escreval("")
fimpara
Escreval("")
Escreval("--Aperte enter para voltar--")
fimprocedimento

procedimento menuMoeda()
inicio
Escreval("Insira a cotação do dólar atual")
leia(cotacao)
Escreval("")
Escreval("Você deseja converter de que jeito?")
Escreval("R - Real para Dólar")
Escreval("D - Dólar para Real")
fimprocedimento

procedimento converterRealemDolar(reais,)
var
dolar: real
inicio
Escreval("")
dolar <- reais / cotacao
Escreval("O valor em dólar é: U$", dolar:1:2)
Escreval("--Aperte enter para voltar--")
fimprocedimento

procedimento converterDolaremReal(dolar,)
var
reais: real
inicio
Escreval("")
reais <- dolar * cotacao
Escreval("O valor em real é: R$", reais:1:2)
Escreval("--Aperte enter para voltar--")
fimprocedimento

procedimento ordenar()
inicio

para i de 1 ate 4 faca
   para j de 1 ate 3 faca
      se (temperaturas[j,1] > temperaturas[i,1]) e (temperaturas[i,1] <> 0) entao
         aux[i,1] <- temperaturas[i,1]
         aux[i,2] <- temperaturas[i,2]
         aux[i,3] <- temperaturas[i,3]
         temperaturas[i,1] <- temperaturas[j,1]
         temperaturas[i,2] <- temperaturas[j,2]
         temperaturas[i,3] <- temperaturas[j,3]
         temperaturas[j,1] <- aux[i,1]
         temperaturas[j,2] <- aux[i,2]
         temperaturas[j,3] <- aux[i,3]
      fimse
   fimpara
fimpara
fimprocedimento

inicio
repita
   ordenar()
   input <- menu()
   Escolha input
   caso "1"
      input <- converterTemp()
      Escolha input
      caso "C"
         Escreval("Insira temperatura em Celsius")
         leia(temperaturaCelsius)
         converterCparaF(temperaturaCelsius)
      caso "F"
         Escreval("Insira temperatura em Fahrenheit")
         leia(temperaturaFahrenheit)
         converterFparaC(temperaturaFahrenheit)
      fimescolha
   caso "2"
      menuMoeda()
      leia(input)
      Escreval("")
      Escolha input
      caso "R"
         Escreval("Digite o valor em real")
         leia(reais)
         converterRealemDolar(reais)
         leia(input)
      caso "D"
         Escreval("Digite o valor em dólares")
         leia(dolar)
         converterDolaremReal(dolar)
         leia(input)
      fimescolha

   caso "3"
      listinha()
      leia(input)
   fimescolha

ate (input = "4")
Escreval("")
Escreval("--Programa finalizado--")
fimalgoritmo
