# 목차
[D1](#D1)
- [2047](#2047)
- [2068](#2068)
- [2071](#2071)


---
## D1
### 2047
#### String
toUpperCase() : 대상 문자열을 모두 대문자로 변환  
toLowerCase() : 대상 문자열을 모두 소문자로 변환  
trim() : 대상 문자열의 앞/뒤 공백문자를 모두 제거하여 리턴  
#### Character
isUpperCase() : 매개변수로 char 타입의 값 또는 int 타입의 값 전달 | 전달된 값이 대문자인 경우 true 반환, 그렇지 않으면 false 반환  
isLowerCase() : 매개변수로 char 타입의 값 또는 int 타입의 값 전달 | 전달된 값이 소문자인 경우 true 반환, 그렇지 않으면 false 반환  
#### String일 때 대소문자 여부를 확인하는 방법
```
private static boolean isStringUpperCase(String str){
  char[] charArray = str.toCharArray();

  for(int index = 0; index < charArray.length; index++){
    if( Character.isUpperCase( charArray[index] ))
      return true;
  }
  return false;
}

public static void main(String args[]) {
  String strValue1 = "ABC";
  String strValue2 = "abc";
  String strValue3 = "A1B2";

  System.out.println("\"" + strValue1 + "\"는 대문자인가? " + isStringUpperCase(strValue1));
  System.out.println("\"" + strValue2 + "\"는 대문자인가? " + isStringUpperCase(strValue2));
  System.out.println("\"" + strValue3 + "\"는 대문자인가? " + isStringUpperCase(strValue3));
```
```
private static boolean isStringUpperCase(String str){
  if(str.equals(str.toUpperCase())) return true;
  return false;
}

public static void main(String args[]) {
  String strValue1 = "ABC";
  String strValue2 = "abc";

  System.out.println("\"" + strValue1 + "\"는 대문자인가? " + isStringUpperCase(strValue1));
  System.out.println("\"" + strValue2 + "\"는 대문자인가? " + isStringUpperCase(strValue2));
}
```
#### 주의사항
String 클래스의 toUpperCase()와 toLowerCase()는 숫자 또는 특수 기호를 변경하지 않음  
따라서, 문자열에 숫자 또는 특수 기호가 존재하는 경우 반복문을 사용하는 방법과 대문자 또는 소문자로 변경 후 비교하는 방법의 결과가 다를 수 있음

### 2068
자바 배열 최대값, 최소값 구하기  
```
int arr[] = {3, 1, 40, 2, 5, 237, 4};

// for 이용
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}

// Arrays.sort 이용
Arrays.sort(arr);
max = arr[arr.length-1];
min = arr[0];

// Stream을 이용
max = Arrays.stream(arr).max().getAsInt();
min = Arrays.stream(arr).min().getAsInt();
```

### 2071
#### 실수한 점
int로 sum을 구하고 10으로 나누었기 때문에 자동으로 소수점을 버림 → 소수점을 이미 버렸기 때문에 반올림이 되지 않음  
float으로 sum을 구하고 10으로 나누어야 소수점까지 나옴 → 반올림 가능
#### Math
round() : 실수의 소수점 첫번째 자리를 반올림하여 정수로 반환  
ceil() : 실수의 소수점 첫번째 자리를 올림하여 정수로 반환  
floor() : 실수의 소수점 첫번째 자리를 내림하여 정수로 반환  
```
double a = 3.123456789;

System.out.println("첫째 자리 반올림 : " + Math.round(a));
System.out.println("둘째 자리 반올림 : " + Math.round(a * 10) / 10.0);

System.out.println("첫째 자리 올림 : " + Math.ceil(a));
System.out.println("셋째 자리 올림 : " + Math.ceil(a * 100) / 100.0);
		
System.out.println("첫째 자리 버림 : " + Math.floor(a));
System.out.println("넷째 자리 버림 : " + Math.floor(a * 1000) / 1000.0);
```