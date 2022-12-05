//  Name : Harsh Patel
//  Date : 4th Dec 2022


import core.Vector2;
import objects.Polygon;

public class Main {
    public static void main(String[] args)
    {
        Vector2 p1 = new Vector2();



        Polygon triangle = null;

        Vector2[] verts = {new Vector2(0, 2), new Vector2(2, 2), new Vector2(2, 3)};

        try
        {
            triangle = new Polygon(verts);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(triangle);



    }
}
