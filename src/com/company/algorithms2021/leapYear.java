public final boolean isLeapYear(int year) {

        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true;
        } else if ( year % 4 == 0 && year % 100 != 0 ) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        return isLeap;
    }