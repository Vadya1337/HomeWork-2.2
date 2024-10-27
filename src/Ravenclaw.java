public class Ravenclaw extends Hogwarts
{
    private final int ym;
    private final int mydrost;
    private final int tvorchestvo;

    public Ravenclaw(String name, String lastName, int powerMagic, int transgressionDistance,int ym, int mydrost, int tvorchestvo) {
        super(name, lastName, powerMagic, transgressionDistance);
        this.ym = ym;
        this.mydrost = mydrost;
        this.tvorchestvo = tvorchestvo;

    }

    @Override
    public String toString() {
        return "Когтевран " + " Имя: " + name +
                " Фамилия: " + lastName +
                " Сила Магии: " + powerMagic +
                " Дистанция трансгрессирования: " + transgressionDistance +
                " Ум: " + ym +
                " Мудрость: " + mydrost +
                " Творчество: " + tvorchestvo ;
    }
    private int summBallovRavenclaw (){
        return ym + mydrost + tvorchestvo;
    }
    public static void comparingStudentsRavenclaw(Ravenclaw studentOne, Ravenclaw studentTwo){
        if (studentOne.summBallovRavenclaw() > studentTwo.summBallovRavenclaw()){
            System.out.println(studentOne + " Более сильный волшебник,чем " + studentTwo);
        }else if (studentOne.summBallovRavenclaw() < studentTwo.summBallovRavenclaw()) {
            System.out.println(studentTwo + " Более сильный волшебник,чем " + studentOne);
        }else {
            System.out.println( " Равны по силе магии");
        }
    }
}
