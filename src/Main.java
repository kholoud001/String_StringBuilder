//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nomPatient= "Jean Dupont";
        //System.out.printf(nomPatient);

        String nomMedecin1=  "Dr. House";
        String nomMedecin2=  "Dr. House";


        // Boolean
//        if(nomMedecin1.equals(nomMedecin2)){
//            System.out.println("Les médecins en le même nom");
//        }else {
//            System.out.println("les médecins sont différent ");
//        }
//        if(nomMedecin1 == nomMedecin2){
//            System.out.println("Les médecins en la même réference");
//        }else {
//            System.out.println("les médecins ont une référence différente ");
//        }

        //System.out.println("Référence de nomMedecin1 : " + System.identityHashCode(nomMedecin1));
        //System.out.println("Référence de nomMedecin2 : " + System.identityHashCode(nomMedecin2));

        //Compare to (0 if equals / > 0 if a>b/ < 0 if a<b)
        //System.out.println(nomMedecin1.compareTo(nomMedecin2));

        //concat
//        String s= nomMedecin1.concat("is a cardiologist");
//        System.out.println(s);

        //contains (bool)
        System.out.println(nomMedecin1.contains("Dr"));




    }
}