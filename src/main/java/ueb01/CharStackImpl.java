package ueb01;

class CharStackImpl implements CharStack {

    private char [] stack = new char [0];

    public void push (char c) {


        char [] newStack = new char [stack.length + 1];
        System.arraycopy(stack,0, newStack, 0, stack.length);
        newStack [newStack.length - 1] = c;
        stack = newStack;

    }

    public char pop () {

        char character = stack[stack.length-1];
        char [] newStack = new char [stack.length - 1];
        System.arraycopy(stack, 0, newStack, 0, stack.length - 1);
        stack = newStack;
        return character;

    }

    public int size () {

        return stack.length;

    }
}
