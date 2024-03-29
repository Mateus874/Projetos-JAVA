/*--------------------------------------------------------------
7. A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as
três informações a seguir como atributos:
a. um primeiro nome,
b. um sobrenome
c. um salário mensal
Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para
cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste
que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada
instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
empregado.
---------------------------------------------------------------*/

//-------------------- MAIN TESTES -----------------------------

public static void main(String[] args) { 
    Scanner leitor = new Scanner(System.in);

    Funcionario Empregado1 = new Funcionario("Mateus", "Oliveira", 5000.0);
    Funcionario Empregado2 = new Funcionario("Pedro", "Carlos", 3000.0);

    Empregado1.Aumento(10);

    System.out.print("Novo salário de Empregado1: " + Empregado1.getSalarioMensal());

//CLASS FUNCIONARIO ------------------------------------------------------------------

public class Funcionario{
           //atributos
     
           private String primeiroNome;
           private String sobrenome;
           private double salarioMensal;


           public Funcionario(String primeiroNome, String sobrenome, double salarioMensal) {
            this.primeiroNome = primeiroNome;
            this.sobrenome = sobrenome;
            // Verifica se o salário mensal é positivo e o configura como 0.0 se não for
            if (salarioMensal > 0) {
                this.salarioMensal = salarioMensal;
            } else {
                this.salarioMensal = 0.0;
            }
        }
             


                                     //metodo Aumento
                                        public void Aumento(double porcentagem){
                                        double aumento = salarioMensal * (porcentagem / 100);  
                                        this.salarioMensal += aumento;
                                        
                                        }
