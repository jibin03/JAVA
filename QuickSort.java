import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<String> names = new ArrayList<>();
        System.out.println("Enter the names:");

        for (int i = 0; i < n; i++) {
            names.add(scanner.nextLine());
        }
        scanner.close();

        System.out.println("Original list of names: " + names);

        quickSort(names, 0, names.size() - 1);

        System.out.println("Sorted list of names: " + names);
    }

    public static void quickSort(List<String> names, int low, int high) {
        if (low < high) {
            int pi = partition(names, low, high);
            quickSort(names, low, pi);
            quickSort(names, pi + 1, high);
        }
    }

    public static int partition(List<String> names, int low, int high) {
        String pivot = names.get(low);
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (names.get(i).compareTo(pivot) < 0);
            do {
                j--;
            } while (names.get(j).compareTo(pivot) > 0);
            if (i >= j)
                return j;
            Collections.swap(names, i, j);
        }
    }
}
