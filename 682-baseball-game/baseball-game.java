class Solution {
    public int calPoints(String[] op) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < op.length; i++) {
            String ch = op[i];
            if (!ch.equals("+") && !ch.equals("C") && !ch.equals("D")) {
                list.add((Integer.parseInt(ch)));
            } else {
                if (ch.equals("+")) {
                    int add = list.get(list.size() - 1) + list.get(list.size() - 2);
                    list.add(add);
                } else if (ch.equals("D")) {
                    list.add((list.get(list.size() - 1)) * 2);
                } else {
                    list.remove(list.get(list.size() - 1));
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}