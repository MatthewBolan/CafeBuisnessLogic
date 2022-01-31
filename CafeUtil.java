import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

public class CafeUtil {



        public int getStreakGoal() {

        int sum = 0;

        for(int week = 1; week <= 10; week++) {

            sum+= week;

        }

        return sum;

    }






        public void printPriceChart(String productName, double price, int maxNumber) {

            double totalPrice = 0;

        for( int order = 1; order <= maxNumber; order++) {

            totalPrice = price * order;

            System.out.println();

            System.out.printf("Product: " + productName + "\n" + "Quantity: " + order + "\n" + "Total: " + totalPrice);

            System.out.println();

            

        }


        }






        public double getOrderTotal(double[] lineItems){

            double sum = 0;

            for (int price = 0; price<lineItems.length; price++){

                sum += lineItems[price];

            }

            return sum;

        }






        public void displayMenu (List<String> loadMenu, List<Double> loadPrices) {

            for (int item=0; item<loadMenu.size(); item++){

                System.out.println (loadMenu.get(item) + " $" + loadPrices.get(item));
            }

        }






        public void addCustomer (ArrayList<String> customers) {

            System.out.println("Please enter your name:");

            String userName = System.console().readLine();

            System.out.println("Hello " + userName + "!");

            System.out.println("There are " + (customers.size()) + " people in front of you");

            customers.add(userName);

            System.out.println(customers);

        }





}
