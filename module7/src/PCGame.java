public class PCGame extends Game {

    private float minRam;

    private float minHardDriveSpace;

    private float minCPUSpeed;

    public PCGame(String description) {
        super(description);
    }

    public PCGame(String description, float minRam, float minHardDriveSpace, float minCPUSpeed) {
        super(description);
        this.minRam = minRam;
        this.minHardDriveSpace = minHardDriveSpace;
        this.minCPUSpeed = minCPUSpeed;
    }

    public float getMinRam() {
        return minRam;
    }

    public void setMinRam(float minRam) {
        this.minRam = minRam;
    }

    public float getMinHardDriveSpace() {
        return minHardDriveSpace;
    }

    public void setMinHardDriveSpace(float minHardDriveSpace) {
        this.minHardDriveSpace = minHardDriveSpace;
    }

    public float getMinCPUSpeed() {
        return minCPUSpeed;
    }

    public void setMinCPUSpeed(float minCPUSpeed) {
        this.minCPUSpeed = minCPUSpeed;
    }

    @Override
    public String toString() {
        return "Description: " + getDescription() + "\n" +
                "Min. Memory: " + this.minRam + " MB\n" +
                "Size: " + this.minHardDriveSpace + " MB\n" +
                "Min. CPU: " + this.minCPUSpeed + " GHz";
    }
}
