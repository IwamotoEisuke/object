package basic.ex.person2;

public enum  Birthplace {
    HOKKAIDO("北海道"),
    TOKYO("東京"),
    OSAKA("大阪"),
    FUKUOKA("福岡");

    private String placeName;

    Birthplace(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceName() {
        return placeName;
    }
}
