public class Runner {
    public static void main(String[] args) {

        Person person = new Person("Collin", "Englahd");
        Person person2 = new Person("Lamees", "Wimbledon");


        String person1greeting = person.greet(" lovely morn");
        String person2greeting = person2.greet(" evening");

        person.setName("Layla");
        System.out.println(person.getName());
    }
}
