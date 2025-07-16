package datastructures.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        this.heap.add(value);
        int curr = this.heap.size() - 1;
        while(curr > 0 && this.heap.get(curr) > this.heap.get(parent(curr))) {
            swap(curr, parent(curr));
            curr = parent(curr);
        }
    }

    public Integer remove() {

        int sizeHeap = heap.size();

        if(sizeHeap == 0) return null;

        if(sizeHeap == 1) return heap.remove(0);

        Integer lastElement = heap.remove(sizeHeap - 1);

        Integer actualFirst = heap.get(0);

        heap.set(0, lastElement);

        // sinkDown(0);
        return actualFirst;
    }

    private void sinkDown(int index){
        
    }
}
