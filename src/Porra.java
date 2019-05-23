import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Porra {
    static BufferedReader reader;
    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Aposta> porra = new HashSet<>();
        int operacio=0;
        while(operacio!=3){
            System.out.println("1) afegeix una aposta");
            System.out.println("2) veure els o els guañadors");
            System.out.println("3) salir");
            String linia = reader.readLine();
            switch(linia){
                case "1":
                    if(afegirAposta(porra)){
                        System.out.println("Aposta afegida");

                    }
                    else{
                        System.out.println("Hi ha agut algun error al intoduir la aposta tornau a porvar mes tard.");
                    }
                    break;
                case "2":
                    Guanyador(porra);
                    break;
                default:
                    operacio=3;
                    System.out.println("audeu bona nit.");

            }

        }
    }
    public static boolean afegirAposta(HashSet porra){
        try{
            System.out.println("Dni del jugador");
            String dni= reader.readLine();

            System.out.println("Goles locales");
            String gLocalesS=reader.readLine();
            int gLocales=Integer.parseInt(gLocalesS);


            System.out.println("Goles visitantes");
            String gVisitantesS=reader.readLine();
            int gVisitantes=Integer.parseInt(gVisitantesS);


            Aposta a=new Aposta(dni,gLocales,gVisitantes);

            porra.add(a);

            return true;

        }
        catch(Exception e){
            return false;
        }

    }

    public static void Guanyador(HashSet porra){
        boolean a=true;
        while(a) {
            try {
                System.out.println("Gols del equip local");
                String gLocalesS = reader.readLine();
                System.out.println("Gols del equip visitant");
                String gVisitantesS=reader.readLine();
                String marcadorReal=gLocalesS+gVisitantesS;

                Iterator<Aposta> it = porra.iterator();
                String marcadorApostes;
                Aposta p;
                while (it.hasNext()){
                    p=it.next();
                    marcadorApostes=Integer.toString(p.getGolsLocal())+Integer.toString(p.getGolsVisitant());
                    if(marcadorReal.equals(marcadorApostes)){
                        System.out.println(p.getDni());
                    }
                }
                a=false;
            } catch (Exception e) {
                System.out.println("something is going wrong try it again!!!!");
            }
        }
    }
}
