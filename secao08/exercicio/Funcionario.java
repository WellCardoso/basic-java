package secao08.exercicio;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return
                "Employee: " + name + " R$" + netSalary() + "\n";
    }
}
