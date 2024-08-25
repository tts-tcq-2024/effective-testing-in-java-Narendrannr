import java.util.ArrayList;
import java.util.List;

public class Misaligned {

    static String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
    static String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};

    static List<String> generateColorCodePairs() {
        List<String> colorCodePairs = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                colorCodePairs.add(i * 5 + j + " | " + majorColors[i] + " | " + minorColors[i]);
            }
        }
        return colorCodePairs;
    }
    
    static int printColorMap() {
        List<String> colorCodePairs = generateColorCodePairs();
        colorCodePairs.forEach(System.out::println);
        return colorCodePairs.size();
    }
    
    static void testColorMapping() {
        List<String> expectedColorCodePairs = new ArrayList<>();
        expectedColorCodePairs.add("0 | White | Blue");
        expectedColorCodePairs.add("1 | White | Orange");
        expectedColorCodePairs.add("2 | White | Green");
        expectedColorCodePairs.add("3 | White | Brown");
        expectedColorCodePairs.add("4 | White | Slate");
        expectedColorCodePairs.add("5 | Red | Blue");
        expectedColorCodePairs.add("6 | Red | Orange");
        expectedColorCodePairs.add("7 | Red | Green");
        expectedColorCodePairs.add("8 | Red | Brown");
        expectedColorCodePairs.add("9 | Red | Slate");
        expectedColorCodePairs.add("10 | Black | Blue");
        expectedColorCodePairs.add("11 | Black | Orange");
        expectedColorCodePairs.add("12 | Black | Green");
        expectedColorCodePairs.add("13 | Black | Brown");
        expectedColorCodePairs.add("14 | Black | Slate");
        expectedColorCodePairs.add("15 | Yellow | Blue");
        expectedColorCodePairs.add("16 | Yellow | Orange");
        expectedColorCodePairs.add("17 | Yellow | Green");
        expectedColorCodePairs.add("18 | Yellow | Brown");
        expectedColorCodePairs.add("19 | Yellow | Slate");
        expectedColorCodePairs.add("20 | Violet | Blue");
        expectedColorCodePairs.add("21 | Violet | Orange");
        expectedColorCodePairs.add("22 | Violet | Green");
        expectedColorCodePairs.add("23 | Violet | Brown");
        expectedColorCodePairs.add("24 | Violet | Slate");

        List<String> actualColorCodePairs = generateColorCodePairs();

        assert(!actualColorCodePairs.equals(expectedColorCodePairs)) : "Test should fail due to misalignment!";
        System.out.println("Test executed (failure expected)!");
    }

    public static void main(String[] args) {
        int result = printColorMap();
        assert(result == 25);
        testColorMapping();
        System.out.println("All is well (maybe!)");
    }
}
