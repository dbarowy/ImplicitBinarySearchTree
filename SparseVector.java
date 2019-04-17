public class SparseVector<T> {
    protected Object[] data;
    protected int capacity = 10;

    public SparseVector() {
        data = new Object[capacity];
    }

    public void add(int index, T value) {
        ensureCapacity(index + 1);
        data[index] = value;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= capacity()) {
            return null;
        }
        return (T)data[index];
    }

    public int capacity() {
        return capacity;
    }

    protected void ensureCapacity(int cap) {
        if (cap > capacity) {
            while (capacity < cap) {
                capacity = capacity * 2;
            }
            Object[] newData = new Object[capacity];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }
}
