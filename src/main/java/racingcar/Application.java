package racingcar;

import racingcar.controller.Controller;
import racingcar.service.Service;
import racingcar.view.Input;
import racingcar.view.InputValid;
import racingcar.view.Output;

public class Application {
  public static void main(String[] args) {
    Controller controller = new Controller(
      new Input(new InputValid()),
      new Output(),
      new Service()
    );
    controller.run();
  }
}
