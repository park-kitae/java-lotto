package step02.model.numberRule;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static step02.utils.LottoConfig.*;

public class InputNumberRule extends NumberRule {
    List<Integer> inputNumber;

    public InputNumberRule(String inputNumber) {
        this.inputNumber = splitNumber(inputNumber);
    }

    @Override
    public List<Integer> makeNumbers() {
        return inputNumber;
    }

    private List<Integer> splitNumber(String numbers) {
        String numbersNoBlank = numbers.replaceAll(BLANK, NO_BLANK);
        List<Integer> numberSplit = Arrays.stream(numbersNoBlank.trim().split(REGEX))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        boolean unique = numberSplit.stream().allMatch(new HashSet<>()::add);

        if (unique) {
            return numberSplit;
        }
        throw new IllegalArgumentException(ERROR_DUPLICATED_NUMBER);
    }
}
