class MedianFinder {
    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;

    public MedianFinder() {
        max=new PriorityQueue<>(Collections.reverseOrder());
        min=new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        
        if(max.isEmpty() || max.peek()>num)
        {
            max.add(num);
        }else
        {
            min.add(num);
        }
        
        
        
        if(max.size()>min.size()+1)
        {
            min.add(max.poll());
        }
        else if(min.size()>max.size()+1){
            max.add(min.poll());
        }
        
        
        
        
        
        
        
    }
    
    public double findMedian() {
        
        
        if(min.size()==max.size()) return (double)(max.peek()+min.peek())/2;
        
        if(min.size()>max.size()) return (double)min.peek();
        
        if(max.size()>min.size()) return (double)max.peek();
        
        
        return 0.0;
        
    }
}