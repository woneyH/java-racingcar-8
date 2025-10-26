package racingcar.controller;

import racingcar.service.Service;
import racingcar.view.Input;
import racingcar.view.Output;

public class Controller {
  private Input input;
  private Output output;
  private Service service;

  public Controller(Input input, Output output,Service service){
    this.input = input;
    this.output = output;
    this.service = service;
  }

  public void run(){
    service.createCar(input.inputCarNames());
    service.race(input.inputRaceCount(),output);
  }
}
