public enum Category {
    TV("TV"),
    MV("Movie");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
