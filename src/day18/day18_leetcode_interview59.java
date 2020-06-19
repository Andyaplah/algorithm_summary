package day18;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class day18_leetcode_interview59 {

    //leetcode submit region begin(Prohibit modification and deletion)
    static class MaxQueue {
        Queue<Integer> queue1 = null;
        Deque<Integer> queue2 = null;
        Deque<Integer> queue3 = new LinkedList<>();
        public MaxQueue() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();

        }

        public int max_value() {
            if(queue2.isEmpty()){
                return -1;
            }else{
                return queue2.peek();
            }
        }

        public void push_back(int value) {
            queue1.add(value);
            if(queue2.isEmpty()){
                queue2.add(value);
            }else{
                if(queue2.peek() > value){   //逻辑有问题  万一   15  11   然后添加14  这样逻辑变成  15  11  14   导致11和14比较不了
                    queue2.add(value);
                }else if(queue2.peek() == value){

                }else{
                    while (queue2.peek()!= null){
                        queue2.poll();
                    }
                    queue2.add(value);
                }
            }
        }

        public int pop_front() {
            if(!queue1.isEmpty()){
                if(!queue2.isEmpty()){
                    if(queue1.peek() == queue2.peek()){
                        queue2.poll();
                    }
                }
                return queue1.poll();
            }else{
                return -1;
            }
        }
    }

    /**
     * Your MaxQueue object will be instantiated and called as such:
     * MaxQueue obj = new MaxQueue();
     * int param_1 = obj.max_value();
     * obj.push_back(value);
     * int param_3 = obj.pop_front();
     */
//leetcode submit region end(Prohibit modification and deletion)
    public static void main(String[] args) {
        MaxQueue mq = new MaxQueue();

        mq.push_back(3);  //3
        mq.push_back(5);  // 3 5
        System.out.println(mq.max_value());  //5
        mq.push_back(4);  //3 5 4
        System.out.println(mq.max_value());  //5
        mq.pop_front();   //5 4
        mq.pop_front();   //4
        System.out.println(mq.max_value());  //4
        mq.push_back(3); //4 3
        System.out.println(mq.max_value());  //4
        mq.pop_front(); //3
        System.out.println(mq.max_value());  //3

    }
}
