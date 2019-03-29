import java.util.*;
public class EntityApplication
{
   public static void main (String[] args)
   {
       /*
       Entity e1 = new Entity("entity 1");
       p(e1);
       
       Thing t1 = new Thing();
       t1.setValue(21);
       p(t1);
       p(t1.getValue());
       
       Person p1 = new Person();
       p1.setAge(169);
       p(p1);
       p(p1.getAge());
       
       Place pl1 = new Place();
       pl1. setPopulation(42);
       p(pl1);
       p(pl1.getPopulation());
       
       Idea i1 = new Idea();
       i1. setFollower(1000);
       p(i1);
       p(i1.getFollower());
       */
      
       List<Entity> entities =  new ArrayList<Entity>();
       Person person = new Person("Bob");
       Place place = new Place("South Sudan");
       Thing thing = new Thing("Airplane");
       Idea idea = new Idea("Islam");
           
       entities.add(person);
       entities.add(place);
       entities.add(thing);
       entities.add(idea);
       
       for (Entity e : entities)
       {
           p(e.getName());
           if (e instanceof Idea)
           {
               Idea i = (Idea) e;
               p(i.getFollower());
            }
       }
   }
   
   public static void p(Object string)
   {
       System.out.println(string);
   }
}
