/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoSemana7_Empregados;

/**
 *
 * @author Windows
 */
public final class Empregado {
    
    private String nome;
    private String sobrenome;
    private float salario;
    //private float aumento;

    /**
     *
     * @param nome
     * @param sobrenome
     * @param salario
     */
    public Empregado(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        //this.aumento = aumento;
        this.salario = salario;
        
    }
    public Empregado() {
        
    }

    public float calculaSalario(float aumento) {
        float salarioFinal = salario + (salario * aumento);
        return salarioFinal;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }
    }
    
    //public void setAumento(float aumento) {
       //this.aumento = aumento;
//if (ano > 2022) {
        //    this.aumento = 0.10f;
        //} else {
        //    this.aumento = 1.0f;
        //}
   // }
    //public float getAumento() {
    //    return aumento;
    //}
}
