public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get weight and height from the user
        System.out.print("Enter weight (in kilograms): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();
        
        // Calculate BMI
        double bmi = calculateBMI(weight, height);
        
        // Display the result
        System.out.printf("Your BMI is: %.2f%n", bmi);
        
        // Display BMI category
        String category = getBMICategory(bmi);
        System.out.println("BMI Category: " + category);
    }
    
    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    
    // Method to determine BMI category
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}