import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");

        Date dataainicio = formate.parse("10/08/2024");
        Date dataTrmino = formate.parse("11/08/2024");

        Profissional luiz = new Profissional("Luiz", "luiz@gmail.com", "23907-08");
        Profissional ricardo = new Profissional("Ricardo", "ricardo@gamil.com", "896453-90");

        Projetos sala = new Projetos("Forro Sala", dataainicio, dataTrmino);

        Execucao luizSala = new Execucao(luiz, sala,"Eletrecista" ,5 , "casa", 30);
        Execucao luizCozinha = new Execucao(luiz,sala,"Eletrecista", 5 , "casa", 30);

        System.out.println(luizSala);


        }
    }
