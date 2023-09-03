class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int top1 = stack.pop();
                int top2 = stack.peek();
                int sumRound = top1 + top2;
                stack.push(top1);
                stack.push(sumRound);
            } else if (op.equals("D")) {
                int top = 2 * stack.peek();
                stack.push(top);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                int score = Integer.parseInt(op);
                stack.push(score);
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}
