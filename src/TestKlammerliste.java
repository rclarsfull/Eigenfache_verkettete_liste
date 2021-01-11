public class TestKlammerliste {
    public static void main(String[]args){
        KlammernKette kette=new KlammernKette();
        Klammer test=new Klammer("rot");
        Klammer test1=new Klammer("rot2");
        Klammer test2=new Klammer("rot3");

        kette.vorneEinfügen(test);
        kette.vorneEinfügen(test1);
        kette.vorneEinfügen(test2);

        System.out.println(kette.toString());

        kette.vorneEntfernen();



        System.out.println(kette.laenge());
        System.out.println(kette.laengeRekusiv());
        System.out.println(kette.toString());
    }
}
