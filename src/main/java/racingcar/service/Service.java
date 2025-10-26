package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.dto.Cars;
import racingcar.view.Output;

import java.util.ArrayList;
import java.util.List;

public class Service {
  private final List<Cars> cars = new ArrayList<>();
  private final int RANDOM_MIN = 0;
  private final int RANDOM_MAX = 9;

  public void createCar(String input){
    List<String> splitList = List.of(input.split(","));
    for(String carName: splitList){
      cars.add(new Cars(carName));
    }
  }

  public void race(Integer count, Output output){
    output.firstPrint();
    for(int i=0; i<count; i++){
      randomNumberGrant(output);
    }
    output.printWinner(findWinner());
  }

  private void randomNumberGrant(Output output){
    for(Cars player: cars){
      int picked = Randoms.pickNumberInRange(RANDOM_MIN, RANDOM_MAX);
      player.goUpPoint(picked);
    }
    output.printRoundStatus(cars);
  }

  private List<Cars> findWinner(){
    int max = cars.stream()
      .mapToInt(Cars::getPoint)
      .max()
      .orElseThrow(IllegalArgumentException::new);

    List<Cars> winnerList = cars.stream()
      .filter(car -> car.getPoint()==max)
      .toList();

    if(winnerList.isEmpty()) throw new IllegalArgumentException("우승자가 없습니다.");

    return winnerList;
  }
}
