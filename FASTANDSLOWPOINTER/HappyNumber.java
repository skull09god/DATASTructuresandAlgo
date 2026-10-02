public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(19));

}
public int sumOfSquare(int num){
    int sum=0;
    while(num>0){
        int digit=num%10;
        sum+=digit*digit;
        num/=10;
    }
    return sum;

}
public boolean isHappy(int n){
    int slow=n;
    int fast=n;

    while(fast!=1){
        slow=sumOfSquare(slow);
        fast=sumOfSquare(sumOfSquare(fast));
        if(fast==1){
            return true;
        }
        else if(slow==fast){
            return false;
        }
    }
    return false;
}
}