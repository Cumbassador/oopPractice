package enums;

public enum Days {
    Monday("Понедельник"),Tuesday("Вторник"),Wednesday("Среда"),Thursday("Четврег"),
    Friday("Пятница"),Saturday("Суббота"),Sunday("Воскресенье");

    private final String translate;
    Days(String translate) {
        this.translate=translate;
    }

    public String getTranslate() {
        return translate;
    }

    @Override
    public String toString() {
        return "Days{ " +super.toString()+
                " translate=' " + translate + '\'' +
                '}';
    }
}
