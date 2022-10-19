public class Sceleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String printInfo(){
        return super.printInfo()+" стрелы: "+ this.arrows;
    }

    public String printInfo2(){
        return  super.printInfo2()+"skeleton hp: "+ getBossHealth()+" damage: "+
                getBossDamage()+" defens: "+getBossDefense();
    }
}
