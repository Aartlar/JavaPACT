public class LogicalFun {
    public static void main(String[] args){
        boolean isRaining = true;
        boolean isWarm = true;

        boolean combined = isRaining && isWarm;

        System.out.println("Is it raining AND warm?: " + combined);

        combined = isRaining || isWarm;

        System.out.println("Is it raining OR warm? :" + combined);

        combined = !isRaining;

        System.out.println("Is is NOT raining outside? :" + combined);

    }
}
