package basic.inspection;

class Result {
    private String id;
    private String name;
    private String dateTime;
    private double bT;
    private int pulse;
    private int sBP;
    private int dBP;

    public Result(String id, String name, String dateTime, double bT, int pulse, int sBP, int dBP) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.bT = bT;
        this.pulse = pulse;
        this.sBP = sBP;
        this.dBP = dBP;
    }
    public double getMBP() {
        return dBP + (sBP - dBP) / 3.0;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %d %d %d %.2f",id,name,dateTime,bT,pulse,sBP,dBP,getMBP());
    }
}
