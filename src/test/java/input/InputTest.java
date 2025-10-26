package input;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.view.InputValid;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputTest {
  private InputValid inputValid;

  @BeforeEach
  public void setUpInput(){
    inputValid = new InputValid();
  }

  @DisplayName("공백문자 입력 테스트")
  @Test
  void 공백문자입력(){
    //given
    String inputCase = " , ";

    //when
    assertThatThrownBy(() -> inputValid.checkInputString(inputCase))
      .isInstanceOf(IllegalArgumentException.class);
  }

  @DisplayName("중복된 자동차 이름 입력 테스트")
  @Test
  void 자동차이름_중복입력(){
    String inputCase = "pobi,pobi";
    //when
    assertThatThrownBy(() -> inputValid.checkInputString(inputCase))
      .isInstanceOf(IllegalArgumentException.class);
  }

  @DisplayName("race 횟수 입력 음수와 소수 입력  테스트")
  @Test
  void 소수와음수_입력(){
    String case1 = "1.5";
    String case2 = "-5";

    assertThatThrownBy(()-> inputValid.numberCheck(case1))
      .isInstanceOf(IllegalArgumentException.class);

    assertThatThrownBy(()-> inputValid.numberCheck(case2))
      .isInstanceOf(IllegalArgumentException.class);
  }
}
