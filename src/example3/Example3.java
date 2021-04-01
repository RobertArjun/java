package example3;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        // anyMatch it will check the data if any of the data are match then return true otherwise false
        // if any the match it won't check rest of the value
        boolean n1 = numbers.stream().anyMatch(x -> x % 2 == 0); // true
        // allMatch it will check all data until to match all then return true otherwise false
        boolean n2 = numbers.stream().allMatch(x -> x % 2 == 0); // false
        // noneMatch it will check all data until to noneMatch all then return true otherwise false
        boolean n3 = numbers.stream().noneMatch(x -> x % 2 == 0); // false

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
