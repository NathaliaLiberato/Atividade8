import java.util.Scanner;


class Main {
  public static void main(String[] args) {
   
    int quantidadeFuncionario = 0;
    String nomeDigitado;
    double salarioDigitado;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Entre com o número de funcionários:");
   quantidadeFuncionario = scanner.nextInt();


   Funcionario[] funcionarioObjects = new Funcionario[quantidadeFuncionario];

   
    for(int i = 0; i<quantidadeFuncionario; i++){
 
      System.out.println("Entre com o nome do Funcionário " + i);
      nomeDigitado = scanner.next();
   
      System.out.println("Entre com o salário do Funcionário " + i);
      salarioDigitado = scanner.nextDouble();
      
      funcionarioObjects[i] = new Funcionario();
      funcionarioObjects[i].setNome(nomeDigitado);
      funcionarioObjects[i].setSalario(salarioDigitado);

       System.out.println("\n-------------------"); 
    }


    for(int i = 0; i<quantidadeFuncionario; i++){
       System.out.println("Funcionário " + funcionarioObjects[i].getNome() );

        System.out.println("Salário " + funcionarioObjects[i].getSalario() );

        System.out.println("Bônus " + funcionarioObjects[i].getBonus() );

       System.out.println("Salário Líquido " + (funcionarioObjects[i].getSalario() + funcionarioObjects[i].getBonus()) );
      System.out.println("\n-------------------"); 
    }

  }
}

