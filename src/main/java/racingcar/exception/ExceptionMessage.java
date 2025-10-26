package racingcar.exception;

public enum ExceptionMessage {
  EMPTY_NAME("자동차 이름이 비어있습니다."),
  NAME_TOO_LONG("자동차 이름은 5자 이하여야 합니다."),
  DUPLICATE_NAME("자동차 이름이 중복되어있습니다."),
  IS_NOT_INTEGER("입력받은 숫자값이 정수가 아닙니다."),
  IS_NOT_POSITIVE_NUM("입력받은 숫자값이 양수가 아닙니다. 또는 0입니다.");

  private String message;

  private ExceptionMessage(String message){
    this.message = message;
  }

  public String getMessage(){
    return message;
  }
}
