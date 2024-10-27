public class Slytherin extends Hogwarts {
    private  int hitrost;
    private  int reshitilnost;
    private  int ambicioznost;
    private int vlast;

    public Slytherin(String name, String lastName, int powerMagic, int transgressionDistance,
                     int hitrost, int reshitilnost, int ambicioznost, int vlast) {
        super(name, lastName, powerMagic, transgressionDistance);
        this.hitrost = hitrost;
        this.reshitilnost = reshitilnost;
        this.ambicioznost = ambicioznost;
        this.vlast = vlast;
    }

    public int getHitrost() {
        return hitrost;
    }

    public void setHitrost(int hitrost) {
        this.hitrost = hitrost;
    }

    public int getReshitilnost() {
        return reshitilnost;
    }

    public void setReshitilnost(int reshitilnost) {
        this.reshitilnost = reshitilnost;
    }

    public int getVlast() {
        return vlast;
    }

    public void setVlast(int vlast) {
        this.vlast = vlast;
    }

    public int getAmbicioznost() {
        return ambicioznost;
    }

    public void setAmbicioznost(int ambicioznost) {
        this.ambicioznost = ambicioznost;
    }

    @Override
    public String toString() {
        return "Cлизерин " +" Имя: " + name +
                " Фамилия: " + lastName +
                " Сила Магии: " + powerMagic +
                " Дистанция трансгрессирования: " + transgressionDistance +
                " Хитрость " + hitrost +
                " Решительность " + reshitilnost +
                " Амбициозность " + ambicioznost +
                " Власть " + vlast;
    }
    private int summBallovSlytherin (){
        return hitrost + reshitilnost + ambicioznost + vlast;
    }
    public static void comparingStudentsSlytherin(Slytherin studentOne, Slytherin studentTwo){
        if (studentOne.summBallovSlytherin() > studentTwo.summBallovSlytherin()){
            System.out.println(studentOne + " Более сильный волшебник,чем " + studentTwo);
        }else if (studentOne.summBallovSlytherin() < studentTwo.summBallovSlytherin()) {
            System.out.println(studentTwo + " Более сильный волшебник,чем " + studentOne);
        }else {
            System.out.println( " Равны по силе магии");
        }
    }
}

