package javatopics;

//Generic Interface with Multiple Type Parameters
interface BiFunction<T, U, R> {
 R apply(T t, U u);
}

//Generic Class with Multiple Type Parameters
class Pair<K, V> {
 private K key;
 private V value;

 public Pair(K key, V value) {
     this.key = key;
     this.value = value;
 }

 public K getKey() {
     return key;
 }

 public void setKey(K key) {
     this.key = key;
 }

 public V getValue() {
     return value;
 }

 public void setValue(V value) {
     this.value = value;
 }

 @Override
 public String toString() {
     return "Pair{" +
            "key=" + key +
            ", value=" + value +
            '}';
 }
}

//Generic Method with Multiple Type Parameters
class Utility {
 public static <T, U> void printPair(Pair<T, U> pair) {
     System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
 }
}

public class MultipleTypeParameters{
 public static void main(String[] args) {
     // Using the Pair class with different type parameters
     Pair<String, Integer> pair1 = new Pair<>("Age", 30);
     Utility.printPair(pair1);

     Pair<Integer, String> pair2 = new Pair<>(1, "One");
     Utility.printPair(pair2);

     // Using the BiFunction interface
     BiFunction<Integer, Integer, Integer> addFunction = new BiFunction<>() {
         @Override
         public Integer apply(Integer a, Integer b) {
             return a + b;
         }
     };

     System.out.println("Sum: " + addFunction.apply(5, 3));
 }
}
