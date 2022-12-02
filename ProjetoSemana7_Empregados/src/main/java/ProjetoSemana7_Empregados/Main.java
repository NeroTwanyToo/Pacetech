/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjetoSemana7_Empregados;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
Requisitos a serem cumpridos
A fim de representar empregados em uma empresa, crie uma classe chamada
Empregado que inclui as três informações a seguir como atributos:

um primeiro nome,
um sobrenome,
um salário mensal.
Sua classe deve ter um construtor que inicializa os três atributos.
Forneça um método set e get para cada atributo. Se o salário mensal não for
positivo, configure-o como 0.0.

Escreva um aplicativo de teste que demonstra as capacidades da classe.
Crie duas instâncias da classe e exiba o salário anual de cada instância.
Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de
cada empregado.
 */
/**
 *
 * @author Windows
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float salarioE = 5000.0f;
        float salarioR = 2500.0f;
        float acrescimo = 0;
        NumberFormat dinh = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        //DecimalFormat dinh = new DecimalFormat("R$ #,##0.00"); outra forma
        DecimalFormat porc = new DecimalFormat("00.0");
        
        //Empregado e = new Empregado("Emerson", "Alcântara", salarioE);
        //Empregado r = new Empregado("Rodrigo", "Peneira", salarioR);
        
        System.out.println("Digite o nome, sobrenome e salário do funcionário 1: ");
        Empregado e = new Empregado(leia.next(), leia.next(), leia.nextFloat());
        System.out.println("Digite o nome, sobrenome e salário do funcionário 2: ");
        Empregado r = new Empregado(leia.next(), leia.next(), leia.nextFloat());

        System.out.println("O salário mensal do vendedor " + e.getNome() +
                " " + e.getSobrenome() + " é: " + dinh.format(e.calculaSalario(acrescimo)));
        System.out.println("O salário anual do vendedor " + e.getNome() +
                " " + e.getSobrenome() + " é: " + (dinh.format(e.calculaSalario(acrescimo) * 12)));
        System.out.println("O salário mensal do vendedor " + r.getNome() +
                " " + r.getSobrenome() + " é: " + dinh.format(r.calculaSalario(acrescimo)));
        System.out.println("O salário anual do vendedor " + r.getNome() + 
                " " + r.getSobrenome() + " é: " + (dinh.format(r.calculaSalario(acrescimo) * 12)));
        System.out.println("");
        System.out.println("Digite o aumento que deseja dar aos funcionários(%): ");
        acrescimo = leia.nextFloat() / 100.0f;
        System.out.println("");
        System.out.println("Houve um aumento de " + porc.format(acrescimo * 100) +
                "% no salário dos funcionários");
        System.out.println("");
        System.out.println("O salário mensal do vendedor " + e.getNome() +
                " " + e.getSobrenome() + " é: " + dinh.format(e.calculaSalario(acrescimo)));
        System.out.println("O salário anual do vendedor " + e.getNome() +
                " " + e.getSobrenome() + " é: " + (dinh.format(e.calculaSalario(acrescimo) * 12)));
        System.out.println("O salário mensal do vendedor " + r.getNome() +
                " " + r.getSobrenome() + " é: " + dinh.format(r.calculaSalario(acrescimo)));
        System.out.println("O salário anual do vendedor " + r.getNome() +
                " " + r.getSobrenome() + " é: " + (dinh.format(r.calculaSalario(acrescimo) * 12)));

    }
}
