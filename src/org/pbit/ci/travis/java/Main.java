package org.pbit.ci.travis.java;

public class Main {

    /*
     * The main function of the program.
     *
     * @param args The arguements that are given when running the program.
     *
     * @return Returns 0 when the function completes
     */
    public static int main(String[] args) {
        // Intro section
        printDivider();
        System.out.println("Jekyll Helper release checklist");
        printDivider();

        // Return a value to show that the function has finished running
        return 0;
    }

    /*
     * Function to print a divider across the terminal window
     *
     * @return Returns 0 if the function suceedes, and 1 if the function fails.
     */
    private static int printDivider() {
        int counter = 0;
        int number_of_characters = 40;
        while(counter < number_of_characters) {
            System.out.printf("-");
            counter++;
        }
        System.out.printf("\n");

        // Check to make sure the function ran correctly
        if(counter == number_of_characters)
            return 0;
        else
            return 1;
    }

}
