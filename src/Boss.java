public class Boss extends GameEntity {
    Weapon bossWeapon=new Weapon();

    public Weapon getBossWeapon(WeaponType fireArms) {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }
    public String printInfo(){
        return "skeleton hp: "+ getBossHealth()+" damage: "+getBossDamage()+" defens: "+getBossDefense();
    }
     public String printInfo2(){
        return " ";
   }

}
