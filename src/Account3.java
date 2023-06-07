public class Account3 {
    public static void main(String[] args) {
        Account3 account = new Account3();
        account.setName("bright");
        System.out.println("before changeAccountName:: "+account);
        changeAccountName(account);
        System.out.println("after changeAccount::"+account);

    }

    private static void changeAccountName(Account3 account) {
    }

    private void setName(String  name) {
    }
}
