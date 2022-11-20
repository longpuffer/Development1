abstract class Monster {
  private String name;
  private int health,attack,defence,speed;
  Monster(int health,int attack,int defence,int speed){
    StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
    this.name=ste.getClassName();
    this.health=health;
    this.attack=attack;
    this.defence=defence;
    this.speed=speed;
  }
  public int getHealth(){return this.health;}
  public int getAttack(){return this.attack;}
  public int getDefence(){return this.defence;}
  public int getSpeed(){return this.speed;}
  public void setName(String name){this.name=name;}
  public void displayData(){
    System.out.println("name:"+name);
    System.out.println("health:"+health);
    System.out.println("attack:"+attack);
    System.out.println("defence:"+defence);
    System.out.println("speed:"+speed+"\n");
  }
}
