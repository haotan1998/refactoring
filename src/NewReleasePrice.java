public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        //determine amounts for each line
        double result = 0;
        result += daysRented * 3;

        return result;
    }
}
