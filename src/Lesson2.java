import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {

        Random random = new Random();
        StringBuilder line = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            int randomnum = random.nextInt(10);
            line.append(randomnum);
            if (i < 4) {
                line.append("-");//в задании указано убрать какие-то тире поэтому я их добавил как разделитель меж числами
            }
        }

        System.out.println("the resulting string: " + line);

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '1') {
                line.setCharAt(i, 'i');
            }
            if (line.charAt(i) == '-') {
                line.deleteCharAt(i);
            }
            if (line.charAt(i) == '0') {
                line.setCharAt(i, 'o');
            }
            if (line.charAt(i) == '6') {
                line.setCharAt(i, 'b');
            }
        }

        System.out.println("the line with the changes: " + line);

        int a = line.indexOf("23");
        if (a != -1){
            System.out.println("this line has a substring - 23");
        } else System.out.println("this line does not have a substring - 23");

        int a1 = line.indexOf("ob");
        if (a1 != -1){
            System.out.println("substring index: "+a1);
        } else System.out.println("there is no substring \"ob\"");

        castSpell();
    }

    public static String castSpell()
    {
        String spell = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        String spellLowerCase = spell.toLowerCase();
        System.out.println(spellLowerCase);

        Random random = new Random();
        int randomindex = random.nextInt(spellLowerCase.length());//подменил значение рандома до длины строки ибо там может выйти за рамки)

        String substring = spellLowerCase.substring(randomindex);
        System.out.println(substring);

        StringBuilder Spell = new StringBuilder(substring);
        Spell.reverse();
        String reverseSpell = Spell.toString();
        System.out.println(reverseSpell);

        if (reverseSpell.length() >= 2) {
            char zero = reverseSpell.charAt(0);
            char one = reverseSpell.charAt(1);
            reverseSpell = one + String.valueOf(zero) + reverseSpell.substring(2);
        }
        System.out.println(reverseSpell);
        return reverseSpell;
    }
}
