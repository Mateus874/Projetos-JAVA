/*- 5 - Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua média (aritmética);
    
  */
    Scanner leitorScanner = new Scanner(System.in);
            
            System.out.print("Nome do aluno: ");
            String nomeFun = leitorScanner.next();
            
            System.out.print("prova 1: ");
            float prova1 = leitorScanner.nextFloat();
            
            System.out.print("prova 2: ");
            float prova2 = leitorScanner.nextFloat();
            
             System.out.print("prova 3: ");
            float prova3 = leitorScanner.nextFloat();
            
            
            
            float mediadoAluno = (prova1 + prova2 + prova3)/3;
            System.out.println("A média foi: " + mediadoAluno);
    ```
