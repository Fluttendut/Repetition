public class Mushrooms extends Life
{
    ////The mushroom class takes the variables from the Life parent class so I can make a mushroom object in the Encyclopedia main.
    public Mushrooms(String latinName, String kingdom)
    {
        super(latinName, kingdom);
    }

    public String MushroomtInformation()
    {
        return "Fungi reproduce by releasing tiny spores that then germinate (sprout) and grow into a new fungus. Unlike animals, fungi do not ingest (take into their bodies) their food. \nFungi release digestive enzymes into their food and digest it externally.";
    }
    //The override method lets me create new String text together with my latinName and kingdom.
    @Override
    public String toString()
    {
        return "Mushrooms have the" +
                " latin name = " + latinName +
                ", and they belong to " + kingdom;
    }
}
