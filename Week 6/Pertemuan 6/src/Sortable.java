abstract interface Sortable {
    public abstract int compare(Sortable b); // Abstract method to compare two Sortable objects

    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        int gap = n / 2;

        // Shell sort algorithm
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
            gap /= 2;
        }
    }
}
