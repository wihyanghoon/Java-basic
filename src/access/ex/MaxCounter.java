package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max = 5;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if(this.count > this.max){
            System.out.println("최대값을 초과했습니다.");
        } else {
            this.count++;
        }
    }

    public int getCount(){
        return this.count;
    }
}
