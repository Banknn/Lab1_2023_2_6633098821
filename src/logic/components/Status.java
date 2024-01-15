package logic.components;

import exception.BadStatusException;

public class Status {
    private int hp;
    private int durability;
    private int attack;
    private int magic;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) throws BadStatusException{
        if(hp < 0) throw new BadStatusException();
        else this.hp = hp;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) throws BadStatusException{
        if(durability < 0) throw new BadStatusException();
        else this.durability = durability;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) throws BadStatusException{
        if(attack < 0) throw new BadStatusException();
        else this.attack = attack;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) throws BadStatusException{
        if(magic < 0) throw new BadStatusException();
        else this.magic = magic;
    }

    public Status(int hp, int durability, int attack, int magic) throws BadStatusException{
        this.setHp(hp);
        this.setDurability(durability);
        this.setMagic(magic);
        this.setAttack(attack);
    }

    public boolean equals(Object o) {
        Status s = (Status) o;
        return (this.hp == s.hp) && (this.durability == s.durability) && (this.attack == s.attack) && (this.magic == s.magic);
    }

    public void addStatus(Status another) throws BadStatusException {
        this.hp += another.hp;
        this.durability += another.durability;
        this.attack += another.attack;
        this.magic += another.magic;
    }
}
