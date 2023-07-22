    public class Person {

        String name;
        String town;
        int age;
        boolean completedCourse;

        public Person(String name, String town) {
            this.name = name;
            this.town = town;
            this.age = 0;
            this.completedCourse = false;
        }
        String greet(String timeOfDay){
            return "Good " + timeOfDay + "   !";
        }

        public String getName(){
            return this.name;

        }
        public void setName(String updatedName){
            this.name = updatedName;
        }
    }