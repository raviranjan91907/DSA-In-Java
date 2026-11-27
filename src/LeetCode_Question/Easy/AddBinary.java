package LeetCode_Question.Easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        String ans="";

        while(i>=0 && j>=0){
            int x=a.charAt(i)-'0';
            int y=b.charAt(j)-'0';
            int sum=x+y+carry;

            System.out.println(sum);

            if(sum==0){
                ans='0'+ans;
                System.out.println(ans);
            }
            else{
                carry=sum/2;
                ans=((char)sum%2)+ans;
            }

            i--;
            j--;
        }

        while(i>=0){

            int sum=carry+(a.charAt(i)-'0');

            if(sum==0){
                ans='0'+ans;
            }
            else{
                carry=sum/2;
                ans=((char)sum%2)+ans;
            }
            i--;
        }

        while(j>=0){
            int sum=carry+(b.charAt(j)-'0');

            if(sum==0){
                ans='0'+ans;

            }
            else{
                carry=sum/2;
                ans=((char)sum%2)+ans;
            }
            j--;
        }

        ans=(carry==0 ? "":'1') + ans;

        return ans;
    }
}
