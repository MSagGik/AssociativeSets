import java.util.HashSet;

public class AssociativeSets {
    public static void main(String[] args) {
        HashSet<String> popularCitiesAndCountriesMarvel = new HashSet<>();

        System.out.println("Is popularCitiesAndCountriesMarvel set empty? : " + popularCitiesAndCountriesMarvel.isEmpty()); // true

        popularCitiesAndCountriesMarvel.add("Wakanda");
        popularCitiesAndCountriesMarvel.add("Latveria");
        popularCitiesAndCountriesMarvel.add("Madripoor");
        popularCitiesAndCountriesMarvel.add("Transia");
        popularCitiesAndCountriesMarvel.add("Attilan");
        popularCitiesAndCountriesMarvel.add("Transia");

        System.out.println("Number of cities in the HashSet " + popularCitiesAndCountriesMarvel.size()); // size() = 5

        HashSet<String> popularCitiesAndCountriesDC = new HashSet<>();
        popularCitiesAndCountriesDC .add("Calvin City");
        popularCitiesAndCountriesDC.add("Gotham City");
        popularCitiesAndCountriesDC.add("Metropolis");

        HashSet<String> unity = new HashSet<>();
        unity.addAll(popularCitiesAndCountriesMarvel);
        unity.addAll(popularCitiesAndCountriesDC);
        System.out.println("Union of sets = " + unity);

        HashSet<String> intersection = new HashSet<>(popularCitiesAndCountriesMarvel);
        intersection.retainAll(popularCitiesAndCountriesDC);
        System.out.println("Intersection of sets = " + intersection);

        HashSet<String> difference = new HashSet<>(popularCitiesAndCountriesMarvel);
        difference.removeAll(popularCitiesAndCountriesDC);
        System.out.println("Set subtraction = " + difference);

        String cityName = "Latveria";
        if(popularCitiesAndCountriesMarvel.contains(cityName))
            System.out.println(cityName + " is in the popular cities set."); // true
        else
            System.out.println(cityName + " is not in the popular cities set.");
        popularCitiesAndCountriesMarvel.remove("Latveria");
        if(popularCitiesAndCountriesMarvel.contains(cityName))
            System.out.println(cityName + " is in the popular cities set."); // false
        else
            System.out.println(cityName + " is not in the popular cities set.");
    }
}

