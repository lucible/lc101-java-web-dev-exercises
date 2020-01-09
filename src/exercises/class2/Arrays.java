package exercises.class2;

public class Arrays {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 5, 8};
        for (int i : nums) {
            // System.out.println(i);
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        String catinhat = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String words[] = catinhat.split("(?<=\\.) ");
        for (String s : words) {
            System.out.println(s);
        }
    }
}