public class MaheStack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(5);
        System.out.println("Top of the stack is "+ s.top());
        System.out.println("size of the stack is "+ s.size());
        System.out.println("delete the element "+ s.pop());
        System.out.println("top of the stack is "+ s.top());
        System.out.println("After pushing the element "+s.push(8));


    }

}
class Stack{
    int size=100;
    int arr[]=new int[size];
    int top=-1;
    int push(int x){
        arr[++top]=x;
        return x;
    }
    int pop(){
       int x= arr[top--];
       return x;
    }
    int size(){
        return top+1;

    }
    int top(){
        return arr[top];
    }

}

/*
Top of the stack is 5
size of the stack is 3
delete the element 5
top of the stack is 2
After pushing the element 8

*/
