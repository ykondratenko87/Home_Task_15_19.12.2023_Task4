public class Main {
    public static void main(String[] args) {
        CustomCollection<String> customCollection = new CustomCollection<>();

        customCollection.add("Element 1");
        customCollection.add("Element 2");
        customCollection.add("Element 3");

        System.out.println("Contains 'Element 2': " + customCollection.contains("Element 2"));

        System.out.println("Element at index 1: " + customCollection.get(1));

        customCollection.remove("Element 2");
        System.out.println(customCollection.contains("Element 2"));

        customCollection.clear();
        System.out.println("Size after clearing: " + customCollection.getSize());
    }
}