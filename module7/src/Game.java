public abstract class Game
{
    private String description;

    public Game(String description)
    {
        this.setDescription(description);
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String toString()
    {
        return String.format("Description: %s", this.description);
    }
}