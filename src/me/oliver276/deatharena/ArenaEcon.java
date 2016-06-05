package me.oliver276.deatharena;

public class ArenaEcon {

    private int joinMoney;
    private int killMoney;
    private int deathMoney;


    public ArenaEcon(int joinMoney, int killMoney, int deathMoney) {
        this.joinMoney = joinMoney;
        this.killMoney = killMoney;
        this.deathMoney = deathMoney;
    }

    public int getJoinMoney() {
        return joinMoney;
    }

    public void setJoinMoney(int joinMoney) {
        this.joinMoney = joinMoney;
    }

    public int getDeathMoney() {
        return deathMoney;
    }

    public void setDeathMoney(int deathMoney) {
        this.deathMoney = deathMoney;
    }

    public int getKillMoney() {
        return killMoney;
    }

    public void setKillMoney(int killMoney) {
        this.killMoney = killMoney;
    }
}
