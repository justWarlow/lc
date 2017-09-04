public class NestedIterator implements Iterator<Integer> {
    Stack<Iterator<NestedInteger>> st;
    NestedInteger cur;

    public NestedIterator(List<NestedInteger> nestedList) {
        st = new Stack();
        st.push(nestedList.iterator());
    }

    @Override
    public Integer next() {
        return cur.getInteger();
    }

    @Override
    public boolean hasNext() {
        do {
            while (!st.empty() && !st.peek().hasNext()) st.pop();
            if (st.empty()) return false;
            for (cur = st.peek().next(); !cur.isInteger(); cur = st.peek().next()) {
                st.push(cur.getList().iterator());
                if (!st.peek().hasNext()) break;
            } 
        } while (!cur.isInteger());
        return true;
    }
}
