/*----------------------------------------------------------------------------------------------------
4. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
disponibilizar os seguintes métodos:
a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
prédio (os elevadores sempre começam no térreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);
----------------------------------------------------------------------------------------------------*/

public class pessoa{
           //atributos
     private int andarAtual;
     private int totalAndares;
     private float capacidadeElevador;
     private int qtdPessoas;
              
      pessoa(int qtdPessoas, int totalAndares, int andarAtual){
         this.qtdPessoas = qtdPessoas;
         this.totalAndares = totalAndares;
         this.andarAtual = andarAtual;
           
      }
         
                        //metodo =b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
         
                           public void AcrescentarPessoa(int umaPessoa){
                               if (qtdPessoas > umaPessoa){
                               this.qtdPessoas -= umaPessoa;}
                               else{
                                   System.out.println("Perigo de acidente, proibida a entrada:");
                               }}
                                   
                        // c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
                                public void diminuirPessoa(int umaPessoa){
                                if (qtdPessoas > 0){
                                this.qtdPessoas += umaPessoa;}
                                 else{
                                   System.out.println("Perigo de acidente, proibida a entrada:");
                               }}
                        
                                
                        // d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
                                public void selecionarAndar(int andarDesejado){
                                if (andarDesejado <= totalAndares && andarDesejado > 0){
                                   this.andarAtual = andarDesejado;}
                                else{
                                    System.out.println("Não existe mais andar acima");}
                                }        
                        /*/e. Desce: para descer um andar (não deve descer se já estiver no térreo);       
                                public void selecionarAndar(int andar){
                                if (this.andarAtual > 0){
                                   this.andarAtual += andar;}
                                else{
                                    System.out.println("Não existe andar abaixo");}*/
    public int getAndarAtual(){
        return andarAtual;}

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public float getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(float capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas; }
    }

//
------- ----------------- TESTES MAIN ------------------------
// entrada (Permissão)
         System.out.println("pode entrar no elevador, porém diga quantas pessoas vão entrar");
         ObjetoPessoa.AcrescentarPessoa(leitor.nextInt());
         //System.out.println("Ainda tem vaga para: ");
         System.out.println(ObjetoPessoa.getQtdPessoas());
         
         
        System.out.println("");

         
         // saida(Permissão)
         System.out.println("Quantas pessoas vão sair?");
         ObjetoPessoa.diminuirPessoa(leitor.nextInt());
         System.out.println(ObjetoPessoa.getQtdPessoas());

         System.out.println("");
         
         //subir elevador
         System.out.println("Para qual andar você deseja ir?");
         ObjetoPessoa.selecionarAndar(leitor.nextInt());
         System.out.println("você tá no andar: " + ObjetoPessoa.getAndarAtual());

        System.out.println("");
         
        /* //Descer elevador
         System.out.println("Para qual andar você deseja ir? só pode ir para baixo");
         ObjetoPessoa.subirAndar(leitor.nextInt());
         System.out.println("você tá no andar: " + ObjetoPessoa.getAndarAtual());*/
