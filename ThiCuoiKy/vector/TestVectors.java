package vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestVectors {
    public static void main(String[] args) {
        /* TODO */
        //ListVector
        System.out.println("List Vector");
        ListVector listVector = new ListVector();
        listVector.append(1);
        listVector.append(2);
        listVector.append(3);
        System.out.println(listVector);

        listVector.insert(4, 1);
        System.out.println(listVector);

        listVector.remove(1);
        System.out.println(listVector);

        System.out.println(listVector.length());

        System.out.println(listVector.magnitude());

        double[] listElements = listVector.elements();
        System.out.println(Arrays.toString(listElements));

        System.out.println(listVector.element(1));

        ListVector listVector2 = new ListVector(Arrays.asList(1.0, 2.0, 3.0));
        ListVector listVector3 = listVector.plus(listVector2);
        System.out.println(listVector3);

        ListVector listVector4 = listVector.minus(listVector2);
        System.out.println(listVector4);

        ListVector listVector5 = listVector.scale(2);
        System.out.println(listVector5);

        System.out.println(listVector.dot(listVector2));


        //ArrayVector
        System.out.println("\nArray Vector");
        ArrayVector v1 = new ArrayVector();
        v1.append(1);
        v1.append(2);
        v1.append(3);
        System.out.println(v1);

        v1.insert(4, 1);
        System.out.println(v1);

        v1.remove(1);
        System.out.println(v1);

        System.out.println(v1.length());

        System.out.println(v1.magnitude());

        double[] arrayElements = v1.elements();
        System.out.println(Arrays.toString(arrayElements));

        System.out.println(v1.element(1));

        ArrayVector v2 = new ArrayVector(new double[] {1, 2, 3});
        ArrayVector v3 = v1.plus(v2);
        System.out.println(v3);

        ArrayVector v4 = v1.minus(v2);
        System.out.println(v4);

        ArrayVector v5 = v1.scale(2);
        System.out.println(v5);

        System.out.println(v1.dot(v2));
    }
}
