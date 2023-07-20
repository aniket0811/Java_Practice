public class Items {

    int panipuriQ;
    int khakaraQ;

    void setInitialQuantity(int panipuri,int khakara){
        panipuriQ = panipuri;
        khakaraQ = khakara;
    }

    void requestedQ(int requestPanipuri,int requestedKhakra){
        if(requestPanipuri>panipuriQ){
            System.out.println("Sorry we only have "+panipuriQ+"Can't serve you");
        }
        else{
            panipuriQ=panipuriQ-requestPanipuri;
        }
        if(requestedKhakra>khakaraQ){
            System.out.println("Sorry we only have "+khakaraQ +"Items, Can't serve you");
            khakaraQ=0;
        }
        else{
            khakaraQ=khakaraQ-requestedKhakra;
        }
    }

    void displayQuantity(){
        System.out.println("Total Quantity of Panipuri is "+panipuriQ);
        System.out.println("Total Quantity of Khakra is "+khakaraQ);
    }
    public static void main(String[] args) {
        Items item = new Items();
        item.setInitialQuantity(30,40);
        item.displayQuantity();
        item.requestedQ(20,42);
        item.displayQuantity();
    }
}
