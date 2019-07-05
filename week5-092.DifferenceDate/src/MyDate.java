public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public int differenceInYears(MyDate comparedDate) {
        int difference = this.year - comparedDate.year;
        if (difference > 0) {
            if (comparedDate.month > this.month) {
                difference--;
            } else if (comparedDate.month == this.month
                    && comparedDate.day > this.day) {
                difference--;
            }
        } else if (difference < 0) {
            difference = Math.abs(difference);
            if (comparedDate.month < this.month) {
                difference--;
            } else if (comparedDate.month == this.month
                    && comparedDate.day < this.day) {
                difference--;
            }
        }
        return difference;
    }
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
