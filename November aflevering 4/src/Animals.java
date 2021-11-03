public class Animals extends Life
{
    //The animals class takes the variables from the Life parent class so I can make an animal object in the Encyclopedia main.
    public Animals(String latinName, String kingdom)
    {
        super(latinName, kingdom);
    }

    public String animalInformation()
    {
        return "Animals inhales oxygen and expel carbon dioxide. Animals consumes organic matter and water to survive";
    }

    //The override method lets me create new String text together with my latinName and kingdom.
    @Override
    public String toString()
    {
        return "Animals have the" +
                " latin name = " + latinName +
                ", and they belong to " + kingdom;
    }
}
