class Rental {
    private Movie _movie;
    private int _daysRented;

    public Movie getMovie() {
        return _movie;
    }

    public Rental(Movie movie, DataRange dataRange) {
        _movie = movie;
        _daysRented = (int)((dataRange.getEnd().getTime() - dataRange.getStart().getTime()) / (1000 * 60 * 60 * 24));
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public String getTitle() {
        return _movie.getTitle();
    }
    
    public int getPriceCode() {
        return _movie.getPriceCode();
    }

    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    public int getFrequentRenterPoints(int frequentRenterPoints) {
        frequentRenterPoints ++;
        // add bonus for a two day new release rental
        if ((getPriceCode() == Movie.NEW_RELEASE)
                && getDaysRented() > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
