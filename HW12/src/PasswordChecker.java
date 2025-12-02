public class PasswordChecker {

    int minLength;
    int maxRepeats;

    public void setMinLength(int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("Не допустимое значение параметра длины пароля");
        } else {
            this.minLength = minLength;
        }
    }

    public void setMaxRepeats(int maxRepeats) {

        if (maxRepeats <= 0) {
            throw new IllegalArgumentException("Не допустимое значение парамера количество повторений");
        } else {
            this.maxRepeats = maxRepeats;
        }
    }

    public boolean verify(String password) {

        if (minLength == 0 || maxRepeats == 0) {
            throw new IllegalStateException("Не заполнены параметры проверки пароля");
        } else {
            if (password.length() >= minLength) {
                boolean bolRepeats = true;

                for (int i = 0; i < password.length(); i++) {

                    char a = password.charAt(i);
                    int countRepeats = 0;

                    for (int j = i + 1; j < password.length(); j++) {

                        char b = password.charAt(j);

                        if (a == b) {
                            countRepeats++;
                        }
                        else{
                            break;
                        };
                    }

                    if (countRepeats >= maxRepeats) {
                        bolRepeats = false;
                        break;
                    }

                }
                return bolRepeats;

            } else {
                return false;
            }
        }
    }
}
