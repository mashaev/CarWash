public class Human {
    private float money;
    private String name;

    public Human(float money, String name) {
        this.money = money;
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    protected void giveMoney(float money, Human human){
      this.money -= money;
      human.takeMoney(money);
    }
    protected void takeMoney(float money){
        this.money += money;
    }
}
