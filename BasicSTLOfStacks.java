import java.util.*;
class BasicSTLOfStacks
{
    public static void main(String []args)
    {
        Stack<String> st = new Stack<>();
        st.push("Khushi");
        st.push("Preet");
        st.push("Rishika");
        st.push("Isha");
        st.push("Pragya");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        
    }
}