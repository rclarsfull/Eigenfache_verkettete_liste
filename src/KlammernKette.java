public class KlammernKette {
    private Klammer ersteKlammer;

    KlammernKette(){
        ersteKlammer=null;
    };

    public Klammer getErsteKlammer(){
        return ersteKlammer;
    }

    public void vorneEinfügen(Klammer k){
        if (ersteKlammer==null){
            ersteKlammer=k;
            //System.out.println("ersteKlammer");
        }else {
            Klammer temp=ersteKlammer;
            ersteKlammer=k;
            ersteKlammer.naechste=temp;
            //System.out.println("nächsteKlammer");
        }
    }

    public void vorneEntfernen(){
        if (ersteKlammer.naechste==null){
            ersteKlammer=null;
            //System.out.println("letzteKlammer");
        }else {
            Klammer temp=ersteKlammer.naechste;
            ersteKlammer=temp;
            //System.out.println("nich letzteKlammer");
        }
    }


    public int laenge(){
        Klammer temp=this.ersteKlammer;
        int summe=0;
        while (temp!=null){
            summe++;
            temp=temp.naechste;
        }
        return summe;
    }


    public int laengeRekusiv(){
        return laengeRekusivhelp(this.ersteKlammer);
    }

    private int laengeRekusivhelp(Klammer k){
        if (k.naechste==null){
            return 1;
        }
        return laengeRekusivhelp( k.naechste) + 1;

    }

    public String toString(){
        String ausgabe="";
        Klammer auswahl=ersteKlammer;
        for (int i = 0; i < this.laenge(); i++) {
            ausgabe+=i+1+". "+auswahl.getFarbe()+"\n";
            auswahl=auswahl.naechste;
        }
        return ausgabe;
    }
}
