package quiz;

public abstract class A
{
    private int identification;
    private String name;
    private double salary;

    public A()
    {
        this(1000, "", 25000);
    }

    public A(int identification, String name, double salary)
    {
        this.identification = identification;
        this.name = name;
        this.salary = salary;
    }

    public int getIdentification()
    {
        return this.identification;
    }

    public void merge()
    {
        this.identification += 5;
    }

    public String attach()
    {
        this.identification += 25;
        return this.name;
    }
}