public class Hufflepuff extends Hogwarts {
    private final int trydolybie;
    private final int chestnost;
    private final int vernost;

    public Hufflepuff(String name, String lastName, int powerMagic, int transgressionDistance,
                      int trydolybie, int chestnost, int vernost) {
        super(name, lastName, powerMagic, transgressionDistance);
        this.trydolybie = trydolybie;
        this.chestnost = chestnost;
        this.vernost = vernost;
    }

    @Override
    public String toString() {
        return "Пуффендуй " + " Имя: " + name +
                " Фамилия: " + lastName +
                " Сила Магии: " + powerMagic +
                " Дистанция трансгрессирования: " + transgressionDistance +
                " Трудолюбие: " + trydolybie +
                " Честность: " + chestnost +
                " Верность: " + vernost;
    }
    private int summBallovHufflepuff (){
        return trydolybie + chestnost + vernost ;
    }
    public static void comparingStudentsHufflepuff(Hufflepuff studentOne, Hufflepuff studentTwo){
        if (studentOne.summBallovHufflepuff() > studentTwo.summBallovHufflepuff()){
            System.out.println(studentOne + " Более сильный волшебник,чем " + studentTwo);
        }else if (studentOne.summBallovHufflepuff() < studentTwo.summBallovHufflepuff()) {
            System.out.println(studentTwo + " Более сильный волшебник,чем " + studentOne);
        }else {
            System.out.println( " Равны по силе магии");
        }
    }
}
