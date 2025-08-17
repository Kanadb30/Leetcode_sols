package Leetcode_sols.Stacks_and_Queues;

public class Implement_Queue_Using_Stacks {
    //## INPUT EFFICIENT METHOD



//    class MyQueue {
//        Stack<Integer> queue;
//        Stack<Integer> dupe;
//
//        public MyQueue() {
//            queue = new Stack<>();
//            dupe = new Stack<>();
//
//        }
//
//        public void push(int x) {
//            queue.push(x);
//        }
//
//        public int pop() {
//
//            while(!queue.isEmpty()){
//                dupe.push(queue.pop());
//            }
//            int remove = dupe.pop();
//            while(!dupe.isEmpty()){
//                queue.push(dupe.pop());
//            }
//            return remove;
//        }
//
//        public int peek() {
//
//            while(!queue.isEmpty()){
//                dupe.push(queue.pop());
//            }
//            int remove = dupe.peek();
//            while(!dupe.isEmpty()){
//                queue.push(dupe.pop());
//            }
//            return remove;
//        }
//
//        public boolean empty() {
//            if(queue.size()==0){
//                return true;
//            }
//            return false;
//        }

//      }


    // ## OUTPUT EFFICIENT METHOD

//    class MyQueue {
//        Stack<Integer> first;
//        Stack<Integer> second;
//
//        public MyQueue() {
//            first = new Stack<>();
//            second = new Stack<>();
//        }
//
//        public void push(int x) {
//            while(!first.isEmpty()){
//                second.push(first.pop());
//            }
//            second.push(x);
//            while(!second.isEmpty()){
//                first.push(second.pop());
//            }
//        }
//
//        public int pop() {
//            return first.pop();
//        }
//
//        public int peek() {
//            return first.peek();
//        }
//
//        public boolean empty() {
//            return first.isEmpty();
//        }
//    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
