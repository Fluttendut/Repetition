public class Plants extends Life
{
    //The plant class takes the variables from the Life parent class so I can make a plant object in the Encyclopedia main.
    public Plants(String latinName, String kingdom)
    {
        super(latinName, kingdom);
    }

    //This method returns information on plants
    public String plantInformation()
    {
        return "Plants survive due to a process called photosynthesis where they use sunlight, water and carbon dioxide to create oxygen and energy in form of glucose ";
    }
    //The override method lets me create new String text together with my latinName and kingdom.
    @Override
    public String toString()
    {
        return "Plants have the" +
                " latin name = " + latinName +
                ", and they belong to " + kingdom;
    }
}

