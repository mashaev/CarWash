public class Main {

    public static void main(String[] args) {
        Father father = new Father("Nurbek",1000);
        Son son = new Son("Timur",100);
     father.setSon(son);

     Car car = new Car();
    car.setClear(false);
    father.setMyCar(car);
    father.sendSonToWashCar();

    }



}
