public class Population
{
    public static void main(String[] args)
    {
        int currentPopulation = 331002651;
        int secondsInFiveYears = 5*365*24*60*60;
        int birthsInFiveYears = secondsInFiveYears/7;
        int deathsInFiveYears = secondsInFiveYears/13;
        int newPopulationInFiveYears = currentPopulation + birthsInFiveYears-deathsInFiveYears;
        System.out.println("The current population is " + currentPopulation + "\nThe population in 5 years will be " + newPopulationInFiveYears);
        System.out.println("There will be " + (birthsInFiveYears-deathsInFiveYears) + " more people in 5 years.");
    }
}
