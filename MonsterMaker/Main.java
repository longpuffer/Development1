public class Main {
  public static void main(String[] args) {
    Monster[] m =new Monster[4];
    m[0]=new WhiteRider(23,45,65,60);
    m[1]=new RedRider(58,80,12,43);
    m[2]=new BlackRider(10,100,20,20);
    m[3]=new PaleRider(80,80,50,50);

    for(int i=0; i<m.length; i++){
      m[i].displayData();
    }
  }
}
