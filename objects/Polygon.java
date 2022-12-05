package objects;

import core.Shape;
import core.Vector2;

import java.util.Iterator;

public class Polygon extends Shape
{
    // Parameterized Constructor
    public Polygon(Vector2[] vertexArray) throws Exception
    {
        super();
        if(vertexArray.length >= 3)
        {
            checkIfAnyVerticesAreEqual(vertexArray);
            setVertices(vertexArray);
        }
        else
        {
            throw new Exception("ERROR: objects.Polygon is constructed with less than 3 vertices");
        }
    }

    // private methods

    private void checkIfAnyVerticesAreEqual(Vector2[] vertexArray) throws Exception
    {
        for (int i = 0; i < vertexArray.length - 1; i++)
        {
            for (int j = i + 1; j < vertexArray.length; j++) {
                // check if any of the Vector2s are the same
                if(vertexArray[i].equals(vertexArray[j]))
                {
                    throw new Exception("ERROR: objects.Polygon constructed with at least one vertex that is the same as another one");
                }
            }
        }
    }

}