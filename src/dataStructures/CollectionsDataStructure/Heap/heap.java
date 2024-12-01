package dataStructures.CollectionsDataStructure.Heap;

import java.util.ArrayList;

import java.util.List;

public class heap {
    private List<Integer> heap;
    public heap(){
        this.heap=new ArrayList<>();
    }

    //returning the copy of AL heap to prevent the others to access it
    public ArrayList<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    //helper methods
    private int leftChild(int index){
        return 2*index+1;
    }

    private int rightChild(int index){
        return 2*index+2;
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private void swap(int index1, int index2){
        int temp=heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,temp);
    }
    public void insert(int value){
        heap.add(value);
        int current =heap.size()-1;

        for(;current>0 && heap.get(current)>heap.get(parent(current));){
            swap(current,parent(current));
            current=parent(current);
        }
    }
    //removing the top node
    private void sinkDown(int index){
        int maxIndex=index;
        int rightIndex,leftIndex;
        for(;;){
            rightIndex=rightChild(index);
            leftIndex=leftChild(index);
            if(leftIndex<heap.size() && heap.get(leftIndex)>heap.get(maxIndex)){maxIndex=leftIndex;}
            if(rightIndex<heap.size() && heap.get(rightIndex)>heap.get(maxIndex)){maxIndex=rightIndex;}
            if(maxIndex!=index){
                swap(index,maxIndex);
                index=maxIndex;
            }else{
                return;
            }
        }
    }
    public Integer remove(){
        if(heap.size()==0){return null;}
        if(heap.size()==1){return heap.remove(0);}
        //sink down
        int maxValue=heap.get(0);
        //assigning the bottom right index to 0th index
        heap.set(0,heap.remove(heap.size()-1));
        sinkDown(0);
        return maxValue;
    }
}
