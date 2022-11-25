package ConversorUpgradeNoJava;

import java.util.Scanner;
import java.text.DecimalFormat;// biblioteca para limitar as casas decimais

public class Main {

    public static void main(String[] args) {

        float[][] temperaturas = new float[4][3];
        float[][] aux = new float[4][3];
        int input;
        float temperaturaFahrenheit = 0, temperaturaCelsius = 0, dolar, reais, cotacao, temp = 0;
        int i, j;
        boolean soResultado = false, valido = false;
        Scanner leia = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        DecimalFormat inte = new DecimalFormat("00");

        do {
            /*ordenar()*/
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 3; j++) {
                    if ((temperaturas[j][0] > temperaturas[i][0]) && (temperaturas[i][0] != 0)) {
                        aux[i][0] = temperaturas[i][0];
                        aux[i][1] = temperaturas[i][1];
                        aux[i][2] = temperaturas[i][2];
                        temperaturas[i][0] = temperaturas[j][0];
                        temperaturas[i][1] = temperaturas[j][1];
                        temperaturas[i][2] = temperaturas[j][2];
                        temperaturas[j][0] = aux[i][0];
                        temperaturas[j][1] = aux[i][1];
                        temperaturas[j][2] = aux[i][2];
                    }
                }
            }
            //input = menu();
            for (int t = 0; t < 50; t++) {
                System.out.println("");
            }
            System.out.println("Escolha uma das opções:");
            System.out.println("¤-------------------------------------------------¤");
            System.out.println("¦1 - Temperatura (Celsius e Fahrenheit)           ¦");
            System.out.println("¦-------------------------------------------------¦");
            System.out.println("¦2 - Moeda (Real e Dólar)                         ¦");
            System.out.println("¦-------------------------------------------------¦");
            System.out.println("¦3 - Converter 4 temperaturas salvas              ¦");
            System.out.println("¦-------------------------------------------------¦");
            System.out.println("¦4 - Sair do programa                             ¦");
            System.out.println("¤-------------------------------------------------¤");

            do {
                System.out.print("> ");
                input = leia.nextInt();
                if ((input == 1) || (input == 2) || (input == 3) || (input == 4)) {
                    valido = true;
                } else {
                    System.out.println("!!Valor inválido!!");
                }
            } while (!valido);
            valido = false;

            System.out.println("");
            switch (input) {
                case 1:
                    //input = /*converterTemp()*/;
                    System.out.println("Você deseja converter de que jeito?");
                    System.out.println("1 - Celsius para Fahrenheit");
                    System.out.println("2 - Fahrenheit para Celsius");
                    do {
                        System.out.print("> ");
                        input = leia.nextInt();
                        if ((input == 1) || (input == 2)) {
                            valido = true;
                        } else {
                            System.out.println("!!Valor inválido!!");
                        }
                    } while (!valido);
                    valido = false;

                    System.out.println("");

                    switch (input) {
                        case 1:
                            System.out.println("Insira temperatura em Celsius");
                            //do {
                            System.out.print("> ");
                            temperaturaCelsius = leia.nextFloat();
                            //                //  try {
                            //                //      String s = null;
                            //                temperaturaCelsius = Float.parseFloat(s);
                            //                break;
                            //        }
                            //        catch (Exception e) {
                            //                        System.out.println("!!Valor inválido!!");
                            //                        break;
                            //                    }
                            //}
                            //while (true);
                            //valido = false;
                            //converterCparaF(temperaturaCelsius);
                            float fahrenheit;
                            if (soResultado == true) {
                                fahrenheit = (temperaturaCelsius * 1.8f) + 32f;
                                temp = fahrenheit;
                            } else {
                                System.out.println("");
                                fahrenheit = (temperaturaCelsius * 1.8f) + 32f;
                                System.out.println("A temperatura em Fahrenheit é de: " + deci.format(fahrenheit) + " ° F");
                                if (temperaturas[3][2] == 0) {
                                    System.out.println("--Aperte 5 para salvar, 0 para voltar--");
                                    do {
                                        System.out.print("> ");
                                        input = leia.nextInt();
                                        if ((input == 5) || (input == 0)) {
                                            valido = true;
                                        } else {
                                            System.out.println("!!Valor inválido!!");
                                        }
                                    } while (!valido);
                                    valido = false;

                                    if ((input == 5) || (input == 5)) {
                                        for (i = 0; i < 4; i++) {
                                            if (temperaturas[i][0] == 0) {
                                                temperaturas[i][0] = temperaturaCelsius;
                                                System.out.println("Qual a hora que você registrou esta temperatura?");
                                                do {
                                                    System.out.print("> ");
                                                    temperaturas[i][1] = leia.nextFloat();
                                                    if (input < 24) {
                                                        valido = true;
                                                    } else {
                                                        System.out.println("!!Valor inválido!!");
                                                    }
                                                } while (!valido);
                                                valido = false;
                                                temperaturas[i][2] = -1000;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("--Limite de 4 temperaturas salvas alcançado, aperte 0 para voltar--");
                                    do {
                                        System.out.print("> ");
                                        input = leia.nextInt();
                                        if (input == 0) {
                                            valido = true;
                                        } else {
                                            System.out.println("!!Valor inválido!!");
                                        }
                                    } while (!valido);
                                    valido = false;
                                }
                                continue;
                            }

                        case 2:
                            System.out.println("Insira temperatura em Fahrenheit");
                            System.out.print("> ");
                            temperaturaFahrenheit = leia.nextFloat();
                            //converterFparaC(temperaturaFahrenheit);
                            float celsius;
                            if (soResultado == true) {
                                celsius = (temperaturaFahrenheit - 32f) / 1.8f;
                                temp = celsius;
                            } else {
                                System.out.println("");
                                celsius = (temperaturaFahrenheit - 32f) / 1.8f;
                                System.out.println("A temperatura em Celsius é de: " + deci.format(celsius) + " ° F");
                                if (temperaturas[3][2] == 0) {
                                    System.out.println("--Aperte 5 para salvar, 0 para voltar--");
                                    do {
                                        System.out.print("> ");
                                        input = leia.nextInt();
                                        if ((input == 5) || (input == 0)) {
                                            valido = true;
                                        } else {
                                            System.out.println("!!Valor inválido!!");
                                        }
                                    } while (!valido);
                                    valido = false;
                                    if ((input == 5) || (input == 5)) {
                                        for (i = 0; i < 4; i++) {
                                            if (temperaturas[i][0] == 0) {
                                                temperaturas[i][0] = temperaturaFahrenheit;
                                                System.out.println("Qual a hora que você registrou esta temperatura?");
                                                do {
                                                    System.out.print("> ");
                                                    temperaturas[i][1] = leia.nextFloat();
                                                    if (input < 24) {
                                                        valido = true;
                                                    } else {
                                                        System.out.println("!!Valor inválido!!");
                                                    }
                                                } while (!valido);
                                                valido = false;
                                                temperaturas[i][2] = -2000;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("--Limite de 4 temperaturas salvas alcançado, aperte 0 para voltar--");
                                    do {
                                        System.out.print("> ");
                                        input = leia.nextInt();
                                        if (input == 0) {
                                            valido = true;
                                        } else {
                                            System.out.println("!!Valor inválido!!");
                                        }
                                    } while (!valido);
                                    valido = false;
                                }
                                continue;
                            }

                    }

                case 2:
                    //menuMoeda();

                    System.out.println("Insira a cotação do dólar atual:");
                    System.out.print("> ");
                    cotacao = leia.nextFloat();
                    System.out.println("");
                    System.out.println("Você deseja converter de que jeito?");
                    System.out.println("1 - Real para Dólar");
                    System.out.println("2 - Dólar para Real");
                    do {
                        System.out.print("> ");
                        input = leia.nextInt();
                        if ((input == 1) || (input == 2)) {
                            valido = true;
                        } else {
                            System.out.println("!!Valor inválido!!");
                        }
                    } while (!valido);
                    valido = false;
                    System.out.println("");
                    switch (input) {
                        case 1 -> {
                            System.out.println("Digite o valor em real");
                            System.out.print("> ");
                            reais = leia.nextFloat();
                            //converterRealemDolar(reais);
                            System.out.println("");
                            dolar = reais / cotacao;
                            System.out.println("O valor em dólar é: U$" + deci.format(dolar));
                            System.out.println("--Aperte 0 para voltar--");
                            do {
                                System.out.print("> ");
                                input = leia.nextInt();
                                if (input == 0) {
                                    valido = true;
                                } else {
                                    System.out.println("!!Valor inválido!!");
                                }
                            } while (!valido);
                            valido = false;
                            continue;
                        }
                        case 2 -> {
                            System.out.println("Digite o valor em dólares");
                            System.out.print("> ");
                            dolar = leia.nextFloat();
                            //converterDolaremReal(dolar);
                            System.out.println("");
                            reais = dolar * cotacao;
                            System.out.println("O valor em real é: R$" + deci.format(reais));
                            System.out.println("--Aperte 0 para voltar--");
                            do {
                                System.out.print("> ");
                                input = leia.nextInt();
                                if (input == 0) {
                                    valido = true;
                                } else {
                                    System.out.println("!!Valor inválido!!");
                                }
                            } while (!valido);
                            valido = false;
                            continue;
                        }
                    }

                case 3:
                    //listinha();
                    for (i = 0; i < 4; i++) {
                        if (temperaturas[i][0] < 100) {     // e (temperaturas[i,1] <> 0)
                            System.out.print(" ");
                            if (temperaturas[i][0] < 10) {
                                System.out.print(" ");
                            }
                            if (temperaturas[i][0] != 0) {
                                System.out.print(temperaturas[i][0]);
                            } else {
                                System.out.print("-Espaço " + i + " Vazio-");
                            }
                        } else {
                            System.out.print(temperaturas[i][0]);
                        }
                        for (j = 0; j < 3; j++) {
                            if (temperaturas[i][j] == -1000) {
                                System.out.print("(Celsius)");
                                soResultado = true;
                                //converterCparaF(temperaturas[i,1]);
                                //temperaturaCelsius = temperaturas[i][0];
                                float fahrenheit;
                                if (soResultado == true) {
                                    fahrenheit = (temperaturas[i][0] * 1.8f) + 32f;
                                    temp = fahrenheit;
                                }
                                if (temp <= 100) {
                                    System.out.print("    Fahrenheit = " + deci.format(temp));//um espaço a mais
                                    soResultado = false;
                                    temp = 0;
                                    System.out.print("  (Criado às " + inte.format(temperaturas[i][1]) + "h)");
                                } else {
                                    System.out.print("    Fahrenheit = " + deci.format(temp));
                                    soResultado = false;
                                    temp = 0;
                                    System.out.print(" (Criado às " + inte.format(temperaturas[i][1]) + "h)");//um espaço a mais
                                }
                            }
                            if (temperaturas[i][j] == -2000) {
                                System.out.print("(Fahrenheit)");
                                soResultado = true;
                                //converterFparaC(temperaturas[i][0]);
                                //temperaturaFahrenheit = temperaturas[i][0];
                                float celsius;
                                if (soResultado == true) {
                                    celsius = (temperaturas[i][0] - 32f) / 1.8f;
                                    temp = celsius;
                                }
                                if (temp <= 100) {
                                    System.out.print("    Celsius = " + deci.format(temp));//um espaço a mais
                                    soResultado = false;
                                    temp = 0;
                                    System.out.print("  (Criado às " + inte.format(temperaturas[i][1]) + "h)");
                                } else {
                                    System.out.print("    Celsius = " + deci.format(temp));
                                    soResultado = false;
                                    temp = 0;
                                    System.out.print(" (Criado às " + inte.format(temperaturas[i][1]) + "h)");//um espaço a mais
                                }
                            }
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    System.out.println("--Aperte 0 para voltar--");
                    do {
                        System.out.print("> ");
                        input = leia.nextInt();
                        if (input == 0) {
                            valido = true;
                        } else {
                            System.out.println("!!Valor inválido!!");
                        }
                    } while (!valido);
                    valido = false;
            }
        } while (input != 4);
        for (int t = 0; t < 50; t++) {
            System.out.println("");
        }
        System.out.println("-----------------------");
        System.out.println("--Programa finalizado--");
        System.out.println("-----------------------");
    }
}
