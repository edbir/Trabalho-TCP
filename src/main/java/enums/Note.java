package enums;

public enum Note {
    A("A", "A"),
    B("B", "B"),
    C("C", "C"),
    D("D", "D"),
    E("E", "E"),
    F("F", "F"),
    G("G", "G"),
    SPACE(" ", " ");
    private final String name;
    private final String note;
    private int oitavaAtual;

    private static final int OITAVA_DEFAULT = 5;

    Note(String name, String note) {
        this.name = name;
        this.note = note;
        this.oitavaAtual = OITAVA_DEFAULT;
    }

    public Note aumentaUmaOitava(){
        if(this.oitavaAtual < 12){
            this.oitavaAtual++;
        }
        return this;
    }

    public Note diminuiUmaOitava(){
        if(this.oitavaAtual > 0){
            this.oitavaAtual--;
        }
        return this;
    }

    private String getNote(){
        return this.note;
    }

    private String getOitavaAtual(){
        return String.valueOf(this.oitavaAtual);
    }

    @Override
    public String toString() {
        return getNote() + getOitavaAtual();
    }
}
