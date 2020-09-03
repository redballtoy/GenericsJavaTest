public class UsingKeyValueParam_03_01 {
    public static void main(String[] args) {
        KeyValuePair<String,Integer> keyValuePair = new KeyValuePair<>()


    }
}

//this class is used to create key-value object type
class KeyValuePair <K, V> {
    K key;
    V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValuePair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
