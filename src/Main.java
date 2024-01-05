//Crea una classe Péerson con i campi
//firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e
// dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali)
//per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();

        Person persona1 = builder.setFirstName("Mario").setLastName("Rossi").build();
        Person persona2 = builder.setFirstName("Bruno").setLastName("Barbieri").build();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

    }
}