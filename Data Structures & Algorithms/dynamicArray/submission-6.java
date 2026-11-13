class DynamicArray {

    private int[] array;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            array = new int[capacity];
        }
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        if (array == null) {
            return;
        }
        array[i] = n;
    
    }

    public void pushback(int n) {
    if (size < capacity) {  
        array[size] = n;    
        size++;
        return;
    }
    
    resize();
    array[size] = n;
    size++;
}

    public int popback() {
        this.size--;
        int popEl = this.get(size);
        array[size] = 0;
        return popEl;
    }

    private void resize() {
        var copyArray = copyArrayDoubledSize();
        this.capacity = copyArray.getCapacity();
        setArray(copyArray.getArray());
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void increaseCapacity() {
        this.capacity++;
    }

    public DynamicArray copyArray() {
        DynamicArray copyArr = new DynamicArray(getCapacity());
        for (int i=0; i<capacity; i++) {
            copyArr.set(i, this.get(i)); 
        }
        return copyArr;
    }

    public DynamicArray copyArrayDoubledSize() {
        DynamicArray copyArr = new DynamicArray(getCapacity() * 2);
        for (int i=0; i<capacity; i++) {
            copyArr.set(i, this.get(i)); 
        }
        return copyArr;
    }

    public void setArray(int[] arr) {
        this.array = arr;
    }

    public int[] getArray() {
        return this.array;
    }
}
