package quiz;

public class C extends A{

    private int departmentCode;
    public void merge()
    {
        this.departmentCode = this.getIdentification() + 7;
    }

    public String attach() {
        return "noname";
    }
}
