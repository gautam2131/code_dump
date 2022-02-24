class GFG {
    public static void main(String[] args) {
        for (Day day: Day.values()){
            System.out.println(day+" : " +day.getOrder());
        }
        Day day = Day.MONDAY;
        System.out.println(day);

        Zero zero = new Zero();
        zero.addition();
        zero.methodD();





    }
}