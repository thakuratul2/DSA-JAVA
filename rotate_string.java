class rotate_string {
    public boolean rotateString(String s, String goal) {
        
        return (s.length() == goal.length() && (s+s).contains(goal));
    }
}