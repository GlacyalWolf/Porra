public class Aposta {
    private String dni;
    private int  golsLocal;
    private int golsVisitant;

    public Aposta(String dni,int golslocal,int golsVisitant){
        this.dni=dni;
        this.golsLocal=golslocal;
        this.golsVisitant=golsVisitant;
    }

    public int getGolsLocal() {
        return golsLocal;
    }

    public int getGolsVisitant() {
        return golsVisitant;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setGolsLocal(int golsLocal) {
        this.golsLocal = golsLocal;
    }

    public void setGolsVisitant(int golsVisitant) {
        this.golsVisitant = golsVisitant;
    }


}
