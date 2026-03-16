import java.util.HashSet;

class hashmap {
    public static void main(String[] args) {

        int[] day1Visitors = {101, 102, 110, 118, 120, 168, 167};
        int[] day2Visitors = {231, 784, 786, 123, 110, 118, 101, 120};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int v : day1Visitors) {
            set1.add(v);
        }

        for (int v : day2Visitors) {
            set2.add(v);
        }

        // Union
        HashSet<Integer> uniVisitors = new HashSet<>(set1);
        uniVisitors.addAll(set2);
        System.out.println("Union: " + uniVisitors);

        // Intersection
        HashSet<Integer> commonvisitors = new HashSet<>(set1);
        commonvisitors.retainAll(set2);
        System.out.println("Intersection: " + commonvisitors);
    }
}