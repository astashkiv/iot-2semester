public class Calendar extends Good {
    private String year;

    public Calendar(String name, CategoryEnum categoryEnum, boolean aviability, int price, String year, int pages) {
        super(name, categoryEnum, aviability, price, year, 1);
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "year";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + year;
    }
}