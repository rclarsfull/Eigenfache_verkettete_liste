public class Klammer {
    private String farbe;
    public Klammer naechste;

    public Klammer(){
        naechste=null;
    }
    public Klammer(String farbe) {
        this.farbe = farbe;
        naechste=null;
    }




    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
