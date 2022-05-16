public class RenderGrades {

    public static void main(String[] args) {
        System.out.println("Starting the testing ground from here!!!");
        System.out.println("========================================");

        RenderGrades renderGrades = new RenderGrades();
        System.out.println(renderGrades.getGrades(123));

    }

    public String getGrades(int percentile){

        if(percentile <50 && percentile > 0){
            return "F";
        }
        if(percentile < 65 && percentile > 50){
            return "D";
        }
        if(percentile <75 && percentile > 65 ){
            return "C";
        }
        if(percentile <85 && percentile > 75) {
            return "B";
        }
        if(percentile <95 && percentile > 85){
            return "A";
        }
        if(percentile <100 && percentile > 95){
            return "A+";
        }
        if(percentile > 100){
            throw new IllegalArgumentException("Percentile cannot be over 100!!!");
        }
        if(percentile < 0){
            throw new IllegalArgumentException("Negative Percentile entered !!!");
        }
        return null;
    }
}
