public class Father extends Human {

    private Car myCar;
    private Son son;
    public Father(String name, float money) {
        super(money, name);
    }

    public void setMyCar(Car car) {
        this.myCar = car;
    }

    public void setSon(Son son) {
        this.son = son;
    }



    public void sendSonToWashCar(){
        if (myCar.isClear()){
            System.out.println("Don`t need to wash my car");
        }else {
            System.out.println( this.getMoney());
            System.out.println(son.getMoney());

            giveMoney(200,son);

            System.out.println( this.getMoney());
            System.out.println(son.getMoney());

            son.washCar();
        }
    }
}
