public class Borderlands extends PCGame{

    private BorderlandsCharacter borderlandsCharacter;
    private BorderlandsDifficultyMode borderlandsDifficultyMode;

    public Borderlands() {
        super("Borderlands", 1000f, 8000f, 2.4f);
    }

    public Borderlands(String description) {
        super(description);
    }

    public Borderlands(String description, float minRam, float minHardDriveSpace, float minCPUSpeed) {
        super(description, minRam, minHardDriveSpace, minCPUSpeed);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
