import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class exe {
    public static void main(String[] args){
    Professor professor = new Professor("carol", "informatica", LocalDate.of(2008, 12, 5), "matematia");
   
        String nome = JOptionPane.showInputDialog("digite seu nome aluno: ");

        String curso = JOptionPane.showInputDialog("digite seu curso: ");
    
       String idades = JOptionPane.showInputDialog("digite sua idadde (yyyy-MM-dd)");
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
     LocalDate idade = LocalDate.parse(idades, formatter);  

        Aluno aluno = new Aluno(nome, curso, idade);
     
      
  
  JOptionPane.showMessageDialog(null, aluno.saudacao(aluno));
    JOptionPane.showMessageDialog(null, aluno.saudacao(professor));
            aluno.Aula("matematica");
            aluno.Aula("portugues");
            aluno.Aula("ingles");
            aluno.Aula("historia");
            aluno.Aula("geografia");
            aluno.Aula("educacao fisica");
            aluno.Aula("quimica");
            aluno.Aula("fisica");
            aluno.Aula("biologia");
            aluno.Aula("programacao");
            
            JOptionPane.showMessageDialog(null, aluno.Aulas());
  
       JOptionPane.showMessageDialog(null, "seu nome é: " + aluno.nome+"\n"+
        "seu curso é: " + aluno.curso +"\n "+ 
        "sua idade é:"  + aluno.calcularIdade());



    
     }
}