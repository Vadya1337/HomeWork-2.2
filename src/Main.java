//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          Griffindor[] studentsGriffindor = {
                  new Griffindor("Гарри ","Поттер ",12, 10,
                          15,15,10),
                  new Griffindor("Рон ","Уизли ",5, 12,
                          10,13,8),
                  new Griffindor("Гермиона ","Поттер ",14, 10,
                          13,15,10),
          };
        Slytherin[] studentsSlytherin = {
                new Slytherin("Драко ","Малфой ",12, 5,15,
                        3,10, 15),
                new Slytherin("Том ","Редлл ",15, 15,15,
                        15,15,15),
                new Slytherin("Северус ","Снейп ",13, 15,8,
                        15,10, 12),
        };
        Hufflepuff[] studentsHufflepuff = {
                new Hufflepuff("Седрик  "," Дигори ",10, 15,15,12,15),
                new Hufflepuff("Ньют "," Саламандор ",14, 15,15,13,15),
                new Hufflepuff("Меган "," Джонс ",12, 5,11,15,10),
        };
        Ravenclaw[] studentsRavenclaw = {
                new Ravenclaw(" Палумна "," Лавгуд ",12, 15,15,15,15),
                new Ravenclaw(" Маркус "," Белби ",7, 4,14,13,15),
                new Ravenclaw(" Чжоу "," Чанг ",10, 13,13,12,10),
        };
        System.out.println(studentsGriffindor[0].toString());
        System.out.println(studentsSlytherin[1].toString());
        System.out.println(studentsHufflepuff[2].toString());
        System.out.println(studentsRavenclaw[1].toString());
        System.out.println();
Hogwarts.comparingStudents(studentsGriffindor[0], studentsSlytherin[1]);
Griffindor.comparingStudentsGriffindor(studentsGriffindor[0], studentsGriffindor[2]);
Slytherin.comparingStudentsSlytherin(studentsSlytherin[0],studentsSlytherin[2]);
Hufflepuff.comparingStudentsHufflepuff(studentsHufflepuff[2],studentsHufflepuff[0]);
Ravenclaw.comparingStudentsRavenclaw(studentsRavenclaw[1],studentsRavenclaw[2]);
    }
}