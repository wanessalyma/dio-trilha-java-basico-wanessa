package edu.wanessa.dominandoLinguagemJava.sintaxeJava;
public class NomeCompleto {
    public static void main(String[] args) {
        String nome = "Wanessa";
        String sobrenome = "Lima";
        String nomeCompleto = nomeCompleto(nome,sobrenome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String nome, String sobrenome){
        return "Nome: " + nome.concat(" ").concat(sobrenome);
    }

}
