import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

    String nome;
    String curso;
    LocalDate idade;
    ArrayList <String> aulasAssistidas = new ArrayList<>();

    public Aluno (String nome, String curso , LocalDate idade){
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

  public int calcularIdade() {
    return Period.between(idade, LocalDate.now()).getYears();
  }

public  void Aula(String aula) {
   
    this.aulasAssistidas.add(aula);
    System.err.println("eu assisti " + aula);
}

 public String Aulas(){
    String aulas = "";
    aulas += aulasAssistidas + " ";
    return "eu assisti essas aulas " + aulas;
    
 }
 
 public String saudacao (Aluno aluno) {
    LocalTime horashow = LocalTime.now();
    int hora = horashow.getHour();

    if (hora >= 6 && hora <= 12 ) {
        return("Bom Dia  "+ nome);           
        }
        else if (hora >= 13 && hora <= 18){ 
            return("boa tarde  "+ nome);
        
        }
        else if (hora >= 19 && hora <= 23){
            return("Boa noite  " +nome);
        } else {
            return("vá dormir  " + nome);
        }
    }

 public String saudacao (Professor professor) {
    LocalTime horashow = LocalTime.now();
    int hora = horashow.getHour();

    if (hora >= 6 && hora <= 12 ) {
        return("Bom Dia senhorita "+ nome);           
        }
        else if (hora >= 13 && hora <= 18){ 
            return(" boa tarde senhorita "+ nome);
        
        }
        else if (hora >= 19 && hora <= 23){
            return("Boa noite senhor " +nome);
        } else {
            return("vá dormir senhor " + nome);
        }
    
 }

}