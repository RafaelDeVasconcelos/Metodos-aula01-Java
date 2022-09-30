public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("--> Exercício Calculadora");
        Calculadora.soma(10, 25);
        Calculadora.subtrair(37, 25);
        Calculadora.multiplicar(10, 5);
        Calculadora.dividir(45, 10);

        //Mensagem
        System.out.println("--> Exercício Mensagem");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(30); //Hora incorreta para gerar a mensagem de erro

        //Empréstimo
        System.out.println("--> Exercício Empréstimo");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(2000, Emprestimo.getDuasParcelas()); // Passando o método por referência
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas()); // Passando o método por referência
        Emprestimo.calcular(1000, 7); // Gerando a mensagem de erro na quantidade de parcelas
    }
}