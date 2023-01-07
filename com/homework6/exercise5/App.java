package com.homework6.exercise5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

//Exercise 1.5. Country Manager
public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        System.out.println("Original data: ");
        testOriginalData();
        System.out.println("Sort increasing by population: ");
        testSortIncreasingByPopulation();
        System.out.println("Sort decreasing by population: ");
        testSortDecreasingByPopulation();
        System.out.println("Sort increasing by area: ");
        testSortIncreasingByArea();
        System.out.println("Sort decreasing by area: ");
        testSortDecreasingByArea();
        System.out.println("Sort increasing by gdp: ");
        testSortIncreasingByGdp();
        System.out.println("Sort decreasing by gdp: ");
        testSortDecreasingByGdp();
        System.out.println("Filter Africa countries: ");
        testFilterAfricaCountry();
        System.out.println("Filter Asia countries: ");
        testFilterAsiaCountry();
        System.out.println("Filter Europe countries: ");
        testFilterEuropeCountry();
        System.out.println("Filter North America countries: ");
        testFilterNorthAmericaCountry();
        System.out.println("Filter South America countries: ");
        testFilterSouthAmericaCountry();
        System.out.println("Filter Oceania countries:");
        testFilterOceaniaCountry();
        System.out.println("Filter top 10 most populous countries: ");
        testFilterMostPopulousCountries();
        System.out.println("Filter top 10 least populous countries: ");
        testFilterLeastPopulousCountries();
        System.out.println("Filter top 10 largest area countries: ");
        testFilterLargestAreaCountries();
        System.out.println("Filter top 10 smallest area countries: ");
        testFilterSmallestAreaCountries();
        System.out.println("Filter top 10 highest gdp countries: ");
        testFilterHighestGdpCountries();
        System.out.println("Filter top 10 lowest gdp countries: ");
        testFilterLowestGdpCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
                int index = 0;
                Country country = new Country(dataList.get(0), dataList.get(1));
                switch(dataList.get(5)) {
                    case "Asia":
                        country = new AsiaCountry(dataList.get(0),
                                dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        break;
                    case "Europe":
                        country = new EuropeCountry(dataList.get(0),
                                dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        break;
                    case "North America":
                        country = new NorthAmericaCountry(dataList.get(0),
                                dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        break;
                    case "South America":
                        country = new SouthAmericaCountry(dataList.get(0),
                                dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        break;
                    case "Oceania":
                        country = new OceaniaCountry(dataList.get(0),
                                dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        break;
                    case "Africa":
                        country = new AfricaCountry(dataList.get(0),
                                dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        break;
                }
                countryManager.add(country, index);
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "C:/Users/DELL/Downloads/CountryManager/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(10);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(10);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(10);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(10);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHightestGdpCountries(10);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(10);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }
}
