public class Main {
    public static void main(String[] args) {

    Boss myBoss=new Boss();
    myBoss.setBossHealth(700);
    myBoss.setBossDamage(50);
    myBoss.getBossWeapon(WeaponType.FIRE_ARMS);
        System.out.println(" boss hp: "+myBoss.getBossHealth()+" boss Damage: "+
                myBoss.getBossDamage()+" boss weapon: "+WeaponType.FIRE_ARMS);

    Sceleton sceleton=new Sceleton();
    sceleton.setBossHealth(500);
    sceleton.setBossDamage(40);
    sceleton.setBossDefense("magic");
    sceleton.setArrows(50);
        System.out.println(sceleton.printInfo());


        Sceleton sceleton2=new Sceleton();
        sceleton2.setBossHealth(600);
        sceleton2.setBossDamage(38);
        sceleton2.setBossDefense("physical");
        //sceleton2.setArrows(50);
        System.out.println(sceleton2.printInfo2());
    }



}