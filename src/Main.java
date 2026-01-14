
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("Data de nascimento: ");
    LocalDate nascimento = LocalDate.parse(scanner.nextLine(),format1);

    Period idade = Period.between(nascimento, LocalDate.now());
    System.out.println("idade: "+ idade.getYears()+ " anos");
    LocalDateTime dataAgora = LocalDateTime.now();
    System.out.print("Data do cadastro: "+ dataAgora.format(format2));
    System.out.println();

    if (idade.getYears()>= 18){
        System.out.println("Status: O Usuário é maior de idade ");
    }
    else {
        System.out.println("Status: O Usuário é menor de idade");
    }


    scanner.close();
    }
}
