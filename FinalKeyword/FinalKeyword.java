package com.riigsoft;

/**
 * @author Abdallah
 * @linked https://www.linkedin.com/in/abdallahmahmud/
 * final keyword :
 * 1. Final Variables
 * 2. Final Methods
 * 3. Final Classes
 * 4. Final Reference
 **/

//1. Final Classes

/**
 * final classes can't be extend
 */
public class FinalKeyword {
    //2. Final Variables
    //field  variable with final key word.
    private final float pi = 3.14f;

    /**
     * Now if we try to modify it throws error.
     * It will say this pi is final field and we can't modify
     * its value.
     **/
    //pi = 3.15f;

    //final parameters
    public float area(final float radius) {
        /**
         * Here we can't change/modify radius value
         * because it is final.
         * It throws error.
         * **/
        // Cannot assign a value to final variable 'radius'
        // radius = 3.15f;
        return pi * (radius * radius);
    }

    //3. Final Methods.

    /**
     * Final  method can't be override in subclasses
     */
    public final float perimeter(float radius) {
        //this method can't be override.
        return 2 * pi * radius;
    }

    public static void main(String[] args) {
        //Final Reference can't be refer to another reference
        final var  keyword = new FinalKeyword();

        //this throw error because it is final by its reference
        //keyword = new FinalKeyword();

        float area = keyword.area(3.5f);
        System.out.println(area);

        // area can be re-assign new value because it is not final.
        area = keyword.area(2.5f);
        System.out.println(area);
    }
}
