package dto_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.dto.Cars;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
  @DisplayName("객체 생성 테스트")
  @Test
  void 객체생성테스트(){
    //given
    Cars car = new Cars("pobi");

    //then
    assertThat(new Cars("pobi").getName()).isEqualTo(car.getName());
  }
}
