package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class Input {
  private final String messageIntro = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
  private final String messageRaceCount = "시도할 횟수는 몇 회인가요?";
  private InputValid inputValid;

  public Input(InputValid inputValid){
    this.inputValid = inputValid;
  }

  public String inputCarNames(){
    System.out.println(messageIntro);
    String carNames = Console.readLine();
    inputValid.checkInputString(carNames);
    return carNames.trim();
  }

  public Integer inputRaceCount(){
    System.out.println(messageRaceCount);
    String count = Console.readLine();
    return inputValid.numberCheck(count);
  }

}
