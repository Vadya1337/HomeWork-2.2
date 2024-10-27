public class Griffindor extends Hogwarts {
 private  int hrabrost;
 private  int blagorodstvo;
 private  int chest;

    public Griffindor(String name, String lastName, int powerMagic, int transgressionDistance,int hrabrost, int blagorodstvo, int chest) {
        super(name, lastName, powerMagic, transgressionDistance);
        this.hrabrost = hrabrost;
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
    }

    public int getHrabrost() {
        return hrabrost;
    }

    public void setHrabrost(int hrabrost) {
        this.hrabrost = hrabrost;
    }

    public int getBlagorodstvo() {
        return blagorodstvo;
    }

    public void setBlagorodstvo(int blagorodstvo) {
        this.blagorodstvo = blagorodstvo;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    @Override
    public String toString() {
        return "Гриффиндор " +  " Имя: " + name +
                " Фамилия: " + lastName +
                " Сила Магии: " + powerMagic +
                " Дистанция трансгрессирования: " + transgressionDistance +
                " Храбрость: " + hrabrost +
                " Благородство: " + blagorodstvo +
                " Честь: " + chest;
    }
    private int summBallovGriffindor (){
        return hrabrost + blagorodstvo + chest;
    }
    public static void comparingStudentsGriffindor(Griffindor studentOne, Griffindor studentTwo){
        if (studentOne.summBallovGriffindor() > studentTwo.summBallovGriffindor()){
            System.out.println(studentOne + " Более сильный волшебник,чем " + studentTwo);
        }else if (studentOne.summBallovGriffindor() < studentTwo.summBallovGriffindor()) {
            System.out.println(studentTwo + " Более сильный волшебник,чем " + studentOne);
        }else {
            System.out.println( " Равны по силе магии");
        }
    }
}
