public class User {
        public static void main(String[] args) {

        }
        private  String name;
        private  int age;
        private  String phoneNumber;
        private  String address;
        private String email;

        public void setName(String Name){
            this.name = Name;
        }

        public String getName () {
            return name;

        }
        public  void  setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return  age;
        }
        public void setPhoneBook(String PhoneNumber){
            this.phoneNumber = PhoneNumber;
        }
        public  String GetPhoneNumber(){
            return phoneNumber;
        }
        public  void setEmail(String Email){
            this.email =Email;
        }

        public String getEmail() {
            return email;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "User================\n" +
                    "Name ->" + name + "\n"  +
                    "Age ->" + age + "\n" +
                    "PhoneNumber ->" + phoneNumber + "\n" +
                    "Address ->" + address + "\n" +
                    "Email ->" + email + "\n" +
                   " ==========================";

        }
    }


