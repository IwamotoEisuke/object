package basic.ex.inventory;

class PersonalComputer {
    private String userName; // 使用者名
    private int pcNo; // PC番号
    private int storageNo; // 倉庫番号
    private int price; // 金額
    private int bit; // Bit数
    private String OS; // OS

    public PersonalComputer(String userName, int pcNo, int storageNo, int price, int bit, String OS) {
        this.userName = userName;
        this.pcNo = pcNo;
        this.storageNo = storageNo;
        this.price = price;
        this.bit = bit;
        this.OS = OS;
    }

    public String getUserName() {
        return userName;
    }

    public int getPcNo() {
        return pcNo;
    }

    public int getStorageNo() {
        return storageNo;
    }

    public int getPrice() {
        return price;
    }

    public int getBit() {
        return bit;
    }

    public String getOS() {
        return OS;
    }
}
