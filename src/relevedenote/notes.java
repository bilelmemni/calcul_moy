package relevedenote;

public class notes {
    // attribue
    private int note_physique;
    private int note_math;

    public int getNote_physique() {
        return note_physique;
    }

    // constructeur
    public void setNote_physique(int note_physique) {
        if (note_physique >= 0 && note_physique <= 20) {
            this.note_physique = note_physique;
        }
    }

    // setter note math
    public void setnotemath(int note_math) {
        this.note_math = note_math;
    }

    // geter note math
    public int getnote_math() {
        return note_math;
    }

}
