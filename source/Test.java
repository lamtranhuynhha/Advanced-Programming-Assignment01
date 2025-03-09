import java.io.*;

public class Test {
    
    public static double min(double a, double b){
        return a < b ? a : b;
    }

    public static int testKnightandWarror(FileWriter writer) throws IOException {
        int [] baseHP = {100, 999, 500, 501, 9};
        int [] baseWP = {1, 2};
        int [] baseGround = {1, 2, 6};
        int numberoftest = 2 * 3 * 5;
        writer.write("---Test Knight and Warrior---\n");
        
        for(int i = 0; i < numberoftest; ++i){
            int hp = baseHP[i % 5];
            int wp = baseWP[(i / 5) % 2];
            Battle.GROUND = baseGround[(i / 10) % 3];
            Combatable knight = new Knight(hp, wp);
            Combatable warrior = new Warrior(hp, wp);

            double knightScore = knight.getCombatScore();
            double warriorScore = warrior.getCombatScore();
            writer.write(String.format("Test %d: Knight = %.2f, Warrior = %.2f\n", i, knightScore, warriorScore));
        }
        return -1;
    }

    public static int testPaladin(FileWriter writer) throws IOException {
        int [] baseWP = {1, 2};
        int [] fibo = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040};

        writer.write("---Test Paladin---\n");

        for(int i = 0; i < fibo.length * 2 - 1; ++i){
            int hp = fibo[i % fibo.length];
            if(i >= fibo.length){
                hp += 9;
            }
            int wp = baseWP[i % 2];
            Combatable paladin = new Paladin(hp, wp);
            double combatScore = paladin.getCombatScore();
            writer.write(String.format("Test %d: Paladin = %.2f\n", i, combatScore));
        }
        return -1;
    }

    public static int testDeathEater(FileWriter writer) throws IOException {
        Complex[] Mana = {new Complex(0, 0), new Complex(3 , 4) ,new Complex(300, 200), new Complex(200, 300), new Complex(33.3, 22.2), new Complex(22.2, 33.33)};
        
        writer.write("---Test DeathEater---\n");

        for(int i = 0; i < Mana.length; ++i){
            DeathEater deathEater = new DeathEater(Mana[i]);
            double combatScore = deathEater.getCombatScore();
            writer.write(String.format("Test %d: DeathEater = %.2f\n", i, combatScore));
        }
        return -1;
    }

    public static void runTests() {
        try (FileWriter writer = new FileWriter("test_results.txt")) {
            testKnightandWarror(writer);
            testPaladin(writer);
            testDeathEater(writer);
            writer.write("All tests completed.\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void compareResults() {
        File expectedFile = new File("TestExpected.txt");
        File actualFile = new File("test_results.txt");

        try (BufferedReader expectedReader = new BufferedReader(new FileReader(expectedFile));
             BufferedReader actualReader = new BufferedReader(new FileReader(actualFile))) {

            String expectedLine, actualLine;
            int lineNumber = 1;
            boolean matched = true;

            while ((expectedLine = expectedReader.readLine()) != null &&
                   (actualLine = actualReader.readLine()) != null) {
                if (!expectedLine.equals(actualLine)) {
                    System.err.printf("Mismatch at line %d:\nExpected: %s\nActual  : %s\n", lineNumber, expectedLine, actualLine);
                    matched = false;
                }
                lineNumber++;
            }

            if (matched && expectedReader.readLine() == null && actualReader.readLine() == null) {
                System.out.println("Test results match expected output!");
            } else {
                System.err.println("Test results do not match expected output.");
            }

        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        runTests();
        compareResults();
    }
}
