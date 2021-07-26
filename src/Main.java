
public class Main {
    public static void main(String[] args){
        System.out.println("Beginning Prblems:");
        System.out.println("Problem 1:");
        Problem1.subarray(97, new int[]{14, 12, 70, 15, 99, 65, 21, 90});
        System.out.println("Beginning Problem 2:");
        Stack<Integer> stack = new Stack();
        System.out.println("Testing Empty on new Stack:");
        System.out.println(stack.empty());
        System.out.println("Adding numbers 1-6 to the stack:");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Testing Empty on populated stack:");
        System.out.println(stack.empty());
        System.out.println("Testing Peak function:");
        System.out.println(stack.peak());
        System.out.println(stack.peak());
        System.out.println("Testing Pop function:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Testing search function with value at position 4 in stack:");
        System.out.println(stack.search(1));
        System.out.println("Testing Search function with value not in stack:");
        System.out.println(stack.search(92));

        System.out.println("Logic Problem:\n" +
                            "The value of the word is found by multiplying the length of the word by 1 less than the length. I have written a function to find the value of whatever String you input into the function to the value of DISTRIBUTION is: " + LogicProblem.value("DISTRIBUTION"));
        System.out.println("Value of supercalifragilisticexpialidocious: " + LogicProblem.value("supercalifragilisticexpialidocious"));
    }
    
}
