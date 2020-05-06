package Strategy;

public class Array {
    private Integer[] array;
    private Integer[] sortedArray;

    public Array(int i) {
        array = new Integer[i];
        for (int x = 0; x < i; x++) {

            array[x] = (int) ((Math.random() * 1000) + 1);
        }
    }

    public Integer[] getArray() {
        return this.array.clone();
    }

    public void setSortedArray(Integer[] arr) {
        this.sortedArray = arr;
    }

    public void showArray() {
        System.out.println("Nieposortowana tablica:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }

    public void showSortedArray() {
        System.out.println();
        System.out.println("Posortowana Tablica:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + ", ");
        }
    }
}
