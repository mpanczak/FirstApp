
package pl.panczak.mateusz.firstapp;


public class BodyMassIndex {

double weight;
double height;
double bmi;



    public BodyMassIndex(double weight, double height) {
        this.weight = weight;
        this.height = height;

    }
    public void calculate(){
        double bmi = weight/(height*height);
        System.out.format("Twoje BMI to: %f", bmi);
    }

    public double getBmi() {
        return bmi;
    }

    public void getClassification() {

        //double bmi = weight/(height*height); //o poprawy to

        if (bmi > 30) {
            System.out.println("Masz nadwagę");
        } else if (bmi < 18.5) {
            System.out.println("Masz niedowagę");
        } else {
            System.out.println("Masz prawidłową wagę");
        }


    }

}
