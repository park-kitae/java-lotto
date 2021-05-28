# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 로또 자동 기능 요구 사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.
<pre>
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
</pre>

## 로또 자동 구현 기능 목록
* [x] 로또 번호 자동 생성 기능
    * 1에서 45까지 중복되지않는 6개의 숫자 생성 기능
    * 1에서 45까지 범위안의 숫자인지 유효성 검사하는 기능
* [x] 입력한 구입금액 기준 1장 이상의 로또 구매 기능
    * 입력으로 들어온 구매 매수를 기준으로 로또 구매 기능
* [x] 구입 금액 입력 기능
    * 1장 구매 가격(1000) 보다 작은 값이 입력되었을 경우 에러 발생 기능
    * 입력된 구입 가격 기준으로 로또 구매 매수 계산 기능
* [x] 구입한 로또 번호 출력 기능
* [x] 구매 매수 출력 기능
* [x] 지난주 당첨 번호 입력 기능
    * ',' 기준으로 6개의 숫자가 입력되었는지 확인하는 기능
* [x] 구매한 로또들 당첨 결과 계산 기능
* [x] 수익률 계산 기능
* [x] 당첨 통계 출력 기능
    * 당첨 결과 출력 기능
    * 수익률 출력 기능

## 로또 2등 기능 요구사항
* 2등을 위해 추가 번호를 하나 더 추첨한다.
* 당첨 통계에 2등도 추가해야 한다.
<pre>
지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
</pre>

## 로또 2등 구현 기능 목록
* [x] 보너스볼 입력 기능
    * LottoStore class에서 보너스볼 입력 및 보너스볼 원시값 포장 객체 생성 기능
    * 숫자만 입력 가능하도록 유효성 검사 기능  
    * 이미 입력한 당첨번호와 중복된 번호가 입력되었는지 유효성 검사 기능
* [x] 로또 2등 당첨 여부 결과 계산 기능
    * Rank enum 2등 추가
* [x] 당첨 통계 2등 항목 추가

## 로또 수동 기능 요구사항
* 현재 로또 생성기는 자동 생성 기능만 제공한다. 사용자가 수동으로 추첨 번호를 입력할 수 있도록 해야 한다.
* 입력한 금액, 자동 생성 숫자, 수동 생성 번호를 입력하도록 해야 한다.
<pre>
구입금액을 입력해 주세요.
14000

수동으로 구매할 로또 수를 입력해 주세요.
3

수동으로 구매할 번호를 입력해 주세요.
8, 21, 23, 41, 42, 43
3, 5, 11, 16, 32, 38
7, 11, 16, 35, 36, 44

수동으로 3장, 자동으로 11개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
</pre>

## 로또 2등 구현 기능 목록
* [ ] 수동으로 구매할 로또 수 입력 기능
    * 입력값 유효성 검사 기능
    * 입력된 구입 금액의 구매 가능 수량 보다 작거나 같은 값인지 확인하는 기능
    * 0이 입력되었을때 수동으로 구매할 번호 입력 기능 미출력
* [ ] 수동으로 구매할 번호 입력 기능
    * 입력값으로 받은 로또 구매 수량과 입력된 로또 수 유효성 검사 기능
* [ ] 수동 구매 수량을 제외한 자동 로또 구매 기능
