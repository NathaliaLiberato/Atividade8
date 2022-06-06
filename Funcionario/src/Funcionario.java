public class Funcionario{
  private String nome;
  private double salario;

  public Funcionario(){
    
  }
  
  public Funcionario(String nome, double salario){
    this.nome = nome;
    this.salario = salario;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public double getSalario(){
    return this.salario;
  }

  public void setSalario(double salario_parametro){
    this.salario = salario_parametro;
  }

  public double getBonus(){
    
    // Bonus 20%
    if(this.salario <= 1000){
      return this.salario * 0.2;
    }

    // Bonus 10%
    if(this.salario > 1000 && this.salario <=2000){
      return this.salario * 0.1;
    }else{
      return this.salario * 0.1 * -1;
    }

    
  
    
  }
  
  
}