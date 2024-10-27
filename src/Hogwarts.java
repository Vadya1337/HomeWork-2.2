import java.util.Objects;

public class Hogwarts {
    protected final String name;
    protected final String lastName;
    protected int powerMagic;
    protected int transgressionDistance;;

    public Hogwarts(String name, String lastName, int powerMagic, int transgressionDistance) {
        this.name = name;
        this.lastName = lastName;
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                " Имя " + name + '\'' +
                " Фамилия " + lastName + '\'' +
                " Сила Магии" + powerMagic +
                " Дистанция Трансгрессирования " + transgressionDistance +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) object;
        return powerMagic == hogwarts.powerMagic && transgressionDistance == hogwarts.transgressionDistance && Objects.equals(name, hogwarts.name) && Objects.equals(lastName, hogwarts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, powerMagic, transgressionDistance);
    }

    private int summBallov(){
        return powerMagic + transgressionDistance;
    }
    public static void comparingStudents(Hogwarts studentOne, Hogwarts studentTwo){
        if (studentOne.summBallov() > studentTwo.summBallov()){
            System.out.println(studentOne + " Более сильный волшебник,чем " + studentTwo);
        }else if (studentOne.summBallov() < studentTwo.summBallov()) {
            System.out.println(studentTwo + " Более сильный волшебник,чем " + studentOne);
        }else {
                System.out.println( " Равны по силе магии");
            }
    }


}
