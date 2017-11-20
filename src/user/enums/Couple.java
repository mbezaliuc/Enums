package user.enums;

public class Couple {

    private User man;
    private User woman;

    public Couple(User man, User woman) {
        this.man = man;
        this.woman = woman;
        man.setMaritalStatus(MaritalStatus.MARRIED);
        woman.setMaritalStatus(MaritalStatus.MARRIED);
    }

    public User getMan() {
        return man;
    }

    public void setMan(User man) {
        this.man = man;
    }

    public User getWoman() {
        return woman;
    }

    public void setWoman(User woman) {
        this.woman = woman;
    }

    @Override
    public String toString() {
        return "Couple{" +
                "man=" + man.getName() + " " + man.getMaritalStatus()+

        ", woman=" + woman.getName() + " "+ woman.getMaritalStatus() +
                " just Married!";

    }
}
