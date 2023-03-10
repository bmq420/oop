package countrylistmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryListManager manager = CountryListManager.getInstance();

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                CountryData newCountryData = new CountryData.CountryDataBuilder(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .setContinent(dataList.get(5))
                        .build();

                /* TODO
                * Từ dữ liệu nhận được, tạo các đối tượng Country và đưa và CountryListManager để quản lý. 
                */
                CountryFactory factory = CountryFactory.getInstance();
                manager.append(factory.createCountry(newCountryData.getName(), newCountryData));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
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

    public static void main(String[] args) {
        testOriginalData();
        /* TODO */
    }

    public static void init() {
        String filePath = "C:/Users/DELL/IdeaProjects/OOPPrinciples/src/countrylistmanager/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        String codes = manager.codeOfCountriesToString(CountryListManager.getInstance().getCountryList());
        System.out.print(codes);
    }

    public static void testSortPopulationIncreasing() {
        /* TODO */
        List<AbstractCountry> countries = manager.sortPopulationIncreasing();
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.toString());
        }
    }

    public static void testSortPopulationDecreasing() {
        /* TODO */
        List<AbstractCountry> countries = manager.sortPopulationDecreasing();
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.toString());
        }
    }

    public static void testSortAreaIncreasing() {
        /* TODO */
        List<AbstractCountry> countries = manager.sortAreaIncreasing();
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.toString());
        }
    }

    public static void testSortAreaDecreasing() {
        /* TODO */
        List<AbstractCountry> countries = manager.sortAreaDecreasing();
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.toString());
        }
    }

    public static void testSortGdpIncreasing() {
        /* TODO */
        List<AbstractCountry> countries = manager.sortGdpIncreasing();
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.toString());
        }
    }

    public static void testSortGdpDecreasing() {
        /* TODO */
        List<AbstractCountry> countries = manager.sortGdpDecreasing();
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.toString());
        }
    }

    public static void testFilterContinent() {
        /* TODO */
        List<AbstractCountry> countries = manager.filterContinent("Asia");
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.toString());
        }
    }

    public static void testFilterCountriesMostPopulous() {
        init();
        List<AbstractCountry> countries = manager.sortPopulationDecreasing();
        List<AbstractCountry> nMostPopulousCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nMostPopulousCountries.add(countries.get(i));
        }
        String codeString = manager.codeOfCountriesToString(nMostPopulousCountries);
        System.out.print(codeString);
    }

    public static void testFilterCountriesLeastPopulous() {
        init();
        List<AbstractCountry> countries = manager.sortPopulationIncreasing();
        List<AbstractCountry> nLeastPopulousCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLeastPopulousCountries.add(countries.get(i));
        }

        String codeString = manager.codeOfCountriesToString(nLeastPopulousCountries);
        System.out.print(codeString);
    }

    public static void testFilterCountriesLargestArea() {
        /* TODO */
        List<AbstractCountry> countries = manager.sortAreaDecreasing();
        System.out.println(countries.get(0));
    }

    public static void testFilterCountriesSmallestArea() {
        /* TODO */
        List<AbstractCountry> countries = manager.sortAreaDecreasing();
        System.out.println(countries.get(0));
    }

    public static void testFilterCountriesHighestGdp() {
        /* TODO */
        List<AbstractCountry> countries = manager.sortGdpDecreasing();
        System.out.println(countries.get(0));
    }

    public static void testFilterCountriesLowestGdp() {
        /* TODO */
        List<AbstractCountry> countries = manager.sortGdpIncreasing();
        System.out.println(countries.get(0));
    }

}
