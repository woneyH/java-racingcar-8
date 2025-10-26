package racingcar.view;

import racingcar.exception.ExceptionMessage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputValid {
  private List<String> splitList;

  public void checkInputString(String carName){
    splitList = List.of(carName.split(","));
    validInputString(carName);
    validCheck(splitList);
    validateDuplicateNames(splitList);
  }

  public Integer numberCheck(String countNum){
    if(!countNum.matches("\\d+")){
      throw new IllegalArgumentException(ExceptionMessage.IS_NOT_INTEGER.getMessage());
    }
    Integer stringToNum = Integer.parseInt(countNum);
    if(stringToNum<0){
      throw new IllegalArgumentException(ExceptionMessage.IS_NOT_POSITIVE_NUM.getMessage());
    }
    return stringToNum;
  }

  private void validInputString(String carNames) {
    if(carNames==null || carNames.trim().isEmpty()){
      throw new IllegalArgumentException(ExceptionMessage.EMPTY_NAME.getMessage());
    }

    List<String> splitList = List.of(carNames.split(","));
    validCheck(splitList);
    validateDuplicateNames(splitList);
  }

  private void validCheck(List<String> carNames) {
    for(String name:carNames){
      if(name==null || name.trim().isEmpty()){
        throw new IllegalArgumentException(ExceptionMessage.EMPTY_NAME.getMessage());
      }
      if(name.length()>5){
        throw new IllegalArgumentException(ExceptionMessage.NAME_TOO_LONG.getMessage());
      }
    }
  }

  private void validateDuplicateNames(List<String> names) {
    Set<String> uniqueNames = new HashSet<>(names);
    if(uniqueNames.size() != names.size()) {
      throw new IllegalArgumentException(ExceptionMessage.DUPLICATE_NAME.getMessage());
    }
  }

}
