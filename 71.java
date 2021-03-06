class Solution {
    public String simplifyPath(String path) {
        String[] elems = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
	for (int i = 0; i < elems.length; i++ ) {
	    switch (elems[i]) {
                case ""  : break;
	        case "." : break;
                case "..": if (!stack.isEmpty() ) {
                               stack.pop();
                           } break;
                default  : stack.push("/" + elems[i]);
	    }
        }
	if (stack.isEmpty()) {
        stack.push("/");
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();    
    }
}
