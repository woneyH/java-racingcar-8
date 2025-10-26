package racingcar.view;

import racingcar.dto.Cars;

import java.util.List;
import java.util.StringJoiner;

public class Output {
  private final String OUT_PRINT_INTRO = "실행 결과";

  public void firstPrint(){
    System.out.println();
    System.out.println(OUT_PRINT_INTRO);
  }

  public void printRoundStatus(List<Cars> cars){
    for(Cars car:cars){
      System.out.println(car.getName()+" : "+"-".repeat(car.getPoint()));
    }
      System.out.println(); //라운드별 공백
  }

  public void printWinner(List<Cars> cars){
    StringBuilder sb = new StringBuilder();
    sb.append("최종 우승자 : ");
    for(int i=0; i<cars.size(); i++){
      sb.append(cars.get(i).getName());
      if(i<cars.size()-1){
        sb.append(", ");
      }
    }
    System.out.println(sb);
  }
}
