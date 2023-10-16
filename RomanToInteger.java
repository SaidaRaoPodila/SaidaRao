import java.util.*;

public class RomanToInteger
	{
    public static void main(String[] args) 
		{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int result = romanToInt(romanNumeral);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInt(String s)
		{
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('A', 1);
        romanMap.put('B', 2);
        romanMap.put('C', 3);
        romanMap.put('D', 4);
        romanMap.put('E', 7);
        romanMap.put('F', 8);
        romanMap.put('G', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) 
			{
            int currentVal = romanMap.get(s.charAt(i));
            int nextVal = (i < s.length() - 1) ? romanMap.get(s.charAt(i + 1)) : 0;

            if (currentVal < nextVal)
				{
                result -= currentVal;
            }
			else 
				{
                result += currentVal;
            }
        }

        return result;
    }
}