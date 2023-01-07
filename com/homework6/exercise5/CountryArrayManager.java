package com.homework6.exercise5;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }
        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }
        if (this.length >= this.countries.length) {
            allocateMore();
        }
        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }
        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }
        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }
        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }
        return this.countries[index];
    }

    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[minIndex].getPopulation()) {
                    minIndex = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[minIndex];
            newArray[minIndex] = temp;
        }
        return newArray;
    }

    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[maxIndex].getPopulation()) {
                    maxIndex = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[maxIndex];
            newArray[maxIndex] = temp;
        }
        return newArray;
    }

    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getArea() < newArray[minIndex].getArea()) {
                    minIndex = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[minIndex];
            newArray[minIndex] = temp;
        }
        return newArray;
    }

    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getArea() > newArray[maxIndex].getArea()) {
                    maxIndex = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[maxIndex];
            newArray[maxIndex] = temp;
        }
        return newArray;
    }

    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getGdp() < newArray[minIndex].getGdp()) {
                    minIndex = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[minIndex];
            newArray[minIndex] = temp;
        }
        return newArray;
    }

    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getGdp() > newArray[maxIndex].getGdp()) {
                    maxIndex = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[maxIndex];
            newArray[maxIndex] = temp;
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof AfricaCountry) {
                count++;
            }
        }
        AfricaCountry[] array = new AfricaCountry[count];
        int appendIndex = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof AfricaCountry) {
                array[appendIndex] = (AfricaCountry) countries[i];
                appendIndex++;
            }
        }
        return array;
    }

    public AsiaCountry[] filterAsiaCountry() {
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                count++;
            }
        }
        AsiaCountry[] array = new AsiaCountry[count];
        int appendIndex = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                array[appendIndex] = (AsiaCountry) countries[i];
                appendIndex++;
            }
        }
        return array;
    }

    public EuropeCountry[] filterEuropeCountry() {
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                count++;
            }
        }
        EuropeCountry[] array = new EuropeCountry[count];
        int appendIndex = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                array[appendIndex] = (EuropeCountry) countries[i];
                appendIndex++;
            }
        }
        return array;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                count++;
            }
        }
        NorthAmericaCountry[] array = new NorthAmericaCountry[count];
        int appendIndex = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                array[appendIndex] = (NorthAmericaCountry) countries[i];
                appendIndex++;
            }
        }
        return array;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                count++;
            }
        }
        OceaniaCountry[] array = new OceaniaCountry[count];
        int appendIndex = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                array[appendIndex] = (OceaniaCountry) countries[i];
                appendIndex++;
            }
        }
        return array;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        int count = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof SouthAmericaCountry) {
                count++;
            }
        }
        SouthAmericaCountry[] array = new SouthAmericaCountry[count];
        int appendIndex = 0;
        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof SouthAmericaCountry) {
                array[appendIndex] = (SouthAmericaCountry) countries[i];
                appendIndex++;
            }
        }
        return array;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] decreasingPopulationArray = sortByDecreasingPopulation();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = decreasingPopulationArray[i];
        }
        return result;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] increasingPopulationArray = sortByIncreasingPopulation();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = increasingPopulationArray[i];
        }
        return result;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] decreasingAreaArray = sortByDecreasingArea();
        Country[] result =  new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = decreasingAreaArray[i];
        }
        return result;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] increasingAreaArray = sortByIncreasingArea();
        Country[] result =  new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = increasingAreaArray[i];
        }
        return result;
    }

    public Country[] filterHightestGdpCountries(int howMany) {
        Country[] decreasingGdpArray = sortByDecreasingGdp();
        Country[] result =  new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = decreasingGdpArray[i];
        }
        return result;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] increasingGdpArray = sortByIncreasingGdp();
        Country[] result =  new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = increasingGdpArray[i];
        }
        return result;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country =  countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode()).append(" ");
            }
        }
        return codeOfCountries.toString().trim() + "]\n";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.println(countriesString.toString().trim() + "]");
    }
}
