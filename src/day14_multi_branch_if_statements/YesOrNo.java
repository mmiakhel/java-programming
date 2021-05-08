package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this app?\n");
        char selection = 'y';
        boolean answer;
        String result;

        if (selection == 'y') {
            System.out.println("Your file will be deleted \n");
            answer = true;
            result = "File deleted";
        } else {
            System.out.println("File deletion cancelled\n");
            answer = false;
            result = "File not deleted";
        }

        System.out.println("Did file get deleted? - " + answer + "\n");
        System.out.println(result);
    }
}
