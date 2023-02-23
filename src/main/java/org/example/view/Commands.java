package org.example.view;

public enum Commands {
    READ(1),
    CREATE(2),
    TRAIN(3),
    LIST_COMMANDS(4),
    EXIT(5);

    private final int code;

    Commands(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static Commands getValueByCode(int code) {
        for (Commands brand : Commands.values()) {
            if (brand.code == code) {
                return brand;
            }
        }
        throw new IllegalArgumentException("Такой команды не существует!");
    }
}
