class Balance {
    private int bal;
    public void setId(int bal)
    {
        this.bal=bal;
    }
    public int getId()
    {
        return bal;
    }
    public static void main(String args[])
    {
        Balance st=new Balance();
        st.setId(1000);
        System.out.println(st.getId());
    }
}
