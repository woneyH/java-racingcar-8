package racingcar.dto;

public class Cars {
  private String name;
  private int point;

  public Cars(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void goUpPoint(int random){
    if(random>=4){
      point++;
    }
  }

  public int getPoint(){
    return point;
  }
}
