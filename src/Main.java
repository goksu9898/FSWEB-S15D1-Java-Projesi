import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            int number = myObj.nextInt();
            ArrayList<String> itemList = new ArrayList<String>();
             itemList.add("domates");
            itemList.add("patates");
            if(number==0){
                return;
            }
            else if (number==1){
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String addedItems = myObj.next();
                addItems(itemList,addedItems);
            }
            else{
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                String removedItems = myObj.next();
                removeItems(itemList,removedItems);
        }

        }

        public static void addItems(ArrayList<String> itemList,String addedItems){
            String[] addedItemList= addedItems.split(",");
            for(int i=0; i<addedItemList.length; i++){
                if(!checkItemIsInList(itemList,addedItemList[i])){
                    itemList.add(addedItemList[i]);
                }

            }
            printSorted(itemList);
        }

    public static void removeItems(ArrayList<String> itemList,String removedItems){
        String[] removedItemList= removedItems.split(",");
        for(int i=0; i<removedItemList.length; i++){
            if(checkItemIsInList(itemList,removedItemList[i])){
            itemList.remove(removedItemList[i]);}
        }
        printSorted(itemList);
    }
    public static boolean checkItemIsInList(ArrayList<String> itemList,String item){
            return itemList.contains(item);
    }

public static void printSorted(ArrayList<String> itemList){
    Collections.sort(itemList);
    System.out.println(itemList);

}

}