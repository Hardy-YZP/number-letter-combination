package org.example.enums;

/**
 * Description
 *
 * @title: AlphabetEnum
 * @Author: zhouping.yan
 * @Date: 2020/12/24 15:59
 * @Version 1.0
 */
public enum AlphabetEnum {

    ZERO(0, ""),
    ONE(1, ""),
    TWO(2, "abc"),
    THREE(3, "def"),
    FOUR(4, "ghi"),
    FIVE(5, "jkl"),
    SIX(6, "mno"),
    SEVEN(7, "pqrs"),
    EIGHT(8, "tuv"),
    NINE(9, "wxyz");

    private final Integer num;

    private final String alphabet;

    AlphabetEnum(Integer num, String alphabet) {
        this.num = num;
        this.alphabet = alphabet;
    }

    public Integer getNum() {
        return num;
    }

    public String getAlphabet() {
        return alphabet;
    }

    /**
     * @param num
     * @return
     */
    public static String getEn(Integer num) {
        for (AlphabetEnum alphabetEnum : AlphabetEnum.values()) {
            if (alphabetEnum.getNum().equals(num)) {
                return alphabetEnum.getAlphabet();
            }
        }
        return "";
    }

}
