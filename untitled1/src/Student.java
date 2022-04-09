//public class Student {
//
//    private final String firstName; // mandatory
//    private final String lastName; // mandatory
//    private final String age; // optional
//    private final String gender; // optional
//    private final boolean isGraduate; // optional
//    private final boolean hasExperience; // optional
//    private final String city; // optional
//    private final String state; // optional
//    private final boolean isEarning; // optional
//
//
//
//    public static void main(String args[])
//    {
//        Student.StudentBuilder
//        //System.out.println(student);
//    }
//
//
//    static class StudentBuilder{
//        private  String firstName; // mandatory
//        private  String lastName; // mandatory
//        private  String age; // optional
//        private  String gender; // optional
//        private  boolean isGraduate; // optional
//        private  boolean hasExperience; // optional
//        private  String city; // optional
//        private  String state; // optional
//        private  boolean isEarning; // optional
//
//        public StudentBuilder(String firstName , String lastName){
//            this.firstName = firstName;
//            this.lastName  = lastName;
//        }
//
//        public StudentBuilder setAge(String age) {
//            this.age = age;
//            return this;
//        }
//
//        public StudentBuilder setGender(String gender) {
//            this.gender = gender;
//            return this;
//        }
//
//        public StudentBuilder setGraduate(boolean graduate) {
//            isGraduate = graduate;
//            return this;
//        }
//
//        public StudentBuilder setHasExperience(boolean hasExperience) {
//             this.hasExperience = hasExperience;
//            return this;
//        }
//
//        public StudentBuilder setCity(String city) {
//            this.city = city;
//            return this;
//        }
//
//        public StudentBuilder setState(String state) {
//            this.state = state;
//            return this;
//        }
//
//        public StudentBuilder setEarning(boolean earning) {
//            isEarning = earning;
//            return this;
//        }
//    }
//}