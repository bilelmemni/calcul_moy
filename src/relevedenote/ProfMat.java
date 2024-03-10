package relevedenote;

public class ProfMat {
    public static void main(String[] args) {
        notes etudien1 = new notes();
        etudien1.setNote_physique(22);
        System.out.println(etudien1.getNote_physique());
        etudien1.setnotemath(14);
        System.out.println(etudien1.getnote_math());

    }

}
