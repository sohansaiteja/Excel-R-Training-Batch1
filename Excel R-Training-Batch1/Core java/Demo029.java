class Friend {
    private String name;
    private String address;
    private String phoneNo;

    public Friend(String name, String address, String phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}

public class Demo029 {
    public static void main(String[] args) {
        Friend[] friends = new Friend[10];

        friends[0] = new Friend("Sanju", "kphb", "8523641576");
        friends[1] = new Friend("Sonu", "miyapur", "8456974542");
        friends[2] = new Friend("Manjith", "bahadurpally", "9551562635");
        friends[3] = new Friend("Tarun", "kphb", "7895858456");
        friends[4] = new Friend("Raju", "bachupally", "7152364595");
        friends[5] = new Friend("Rahul", "maharastra", "9985657125");
        friends[6] = new Friend("Rohit", "maismmaguda", "7588986562");
        friends[7] = new Friend("Sanjith", "rc puram", "9888873456");
        friends[8] = new Friend("Surya", "beeramguda", "7898988564");
        friends[9] = new Friend("Vijay", "lingampally", "9548554587");

        System.out.println("Friends' Details:");
        for (int i = 0; i < friends.length; i++) {
            System.out.println("Name: " + friends[i].getName());
            System.out.println("Address: " + friends[i].getAddress());
            System.out.println("Phone Number: " + friends[i].getPhoneNo());
            System.out.println();
        }
    }
}