class Student {
    private int id;
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public static void main(String args[])
    {
        Student st=new Student();
        st.setId(3);
        System.out.println(st.getId());
    }
}
