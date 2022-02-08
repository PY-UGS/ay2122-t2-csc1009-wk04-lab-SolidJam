public class BMI {
    private static double weight;
    private static double height;
    private static double BMI;

    public double getBMI() {
        return calculateBMI();
    }

    public String getInfo()
    {
        return thisBMI();
    }
    public void setWeight(double NewWeight)
    {
        weight = NewWeight;
    }
    public void setHeight(double NewHeight)
    {
        height = NewHeight;
    }
    private double convertWeight()
    {
        return (weight * 0.45359237);
    }
    private double convertHeight()
    {
        return (height * 0.0254);
    }
    private double calculateBMI() {
        double sqHeight = (convertHeight()) * (convertHeight());
        BMI = convertWeight() / sqHeight;
        return BMI;
    }

    private String thisBMI() {
        String status = "NIL";

        if (calculateBMI()<18.5) {
            status = "Underweight";
        }
        else if (18.5<=calculateBMI() && calculateBMI()<25) {
            status = "Normal";
        }
        else if (25<=calculateBMI() && calculateBMI()<30) {
            status = "Overweight";
        }
        else if (30<=calculateBMI()) {
            status = "Obese";
        }
        return status;
    }
}
