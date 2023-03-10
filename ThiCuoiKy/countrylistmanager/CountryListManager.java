package countrylistmanager;

import java.util.*;

public class CountryListManager {
    // Singleton pattern
    private static CountryListManager instance;

    private List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new CountryListManager();
        }
        return instance;
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        /* TODO */
        this.countryList.add(country);
    }

    public void add(AbstractCountry country, int index) {
        /* TODO */
        this.countryList.add(index, country);
    }

    public void remove(int index) {
        /* TODO */
        this.countryList.remove(index);
    }

    public void remove(AbstractCountry country) {
        /* TODO */
        this.countryList.remove(country);
    }

    public AbstractCountry countryAt(int index) {
        /* TODO */
        return this.countryList.get(index);
    }

    public List<AbstractCountry> sortPopulationIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortPopulationDecreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return right.getPopulation() - left.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (left.getArea() > right.getArea()) {
                    return 1;
                } else if (left.getArea() < right.getArea()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaDecreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (left.getArea() > right.getArea()) {
                    return -1;
                } else if (left.getArea() < right.getArea()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortGdpIncreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (left.getGdp() > right.getGdp()) {
                    return 1;
                } else if (left.getGdp() < right.getGdp()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortGdpDecreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (left.getArea() > right.getArea()) {
                    return -1;
                } else if (left.getArea() < right.getArea()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    public List<AbstractCountry> filterContinent(String continent) {
        /* TODO */
        List<AbstractCountry> result = new ArrayList<>();
        for (AbstractCountry country : this.countryList) {
            if (country.getContinent().equals(continent)) {
                result.add(country);
            }
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesMostPopulous(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortPopulationDecreasing();
        List<AbstractCountry> result = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            result.add(list.get(i));
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesLeastPopulous(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortPopulationIncreasing();
        List<AbstractCountry> result = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            result.add(list.get(i));
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesLargestArea(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortAreaDecreasing();
        List<AbstractCountry> result = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            result.add(list.get(i));
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesSmallestArea(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortAreaIncreasing();
        List<AbstractCountry> result = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            result.add(list.get(i));
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesHighestGdp(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortGdpDecreasing();
        List<AbstractCountry> result = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            result.add(list.get(i));
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesLowestGdp(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortGdpIncreasing();
        List<AbstractCountry> result = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            result.add(list.get(i));
        }
        return result;
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
