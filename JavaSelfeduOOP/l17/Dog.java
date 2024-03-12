package JavaSelfeduOOP.l17;

public class Dog {
    private String name;
    private Foot foot;
    private int numOfFoot;
    private  static int numOfDog;

    public Dog() {
    }

    public Dog(int numOfFoot) {
        foot.nunOfFoot = numOfFoot;
    }

    public Dog(String name, int foot) {
        this.name = name;

    }


    {
        numOfDog++;
        System.out.println("Общее количество собак = " + numOfDog);
        name = "";
        numOfFoot = 4;
        foot = new Foot(numOfFoot);
        System.out.println("Создан экземпляр класса foot "  + "Hashcode " + foot.hashCode());
    }

    public void run(){
        foot.run();
    }

    class Foot {
        int nunOfFoot;

        public Foot() {
        }

        public Foot(int numOfFoot) {
            this.nunOfFoot = numOfFoot;
        }

        void run(){
            System.out.println("Dog " + name + " is runing with " + this.nunOfFoot + " foots");
        }
    }

}
