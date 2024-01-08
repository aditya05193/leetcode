package array;

public class ReverseString {
    public static void main(String[] args){
        Character[] s = {'h','e','l','l','o'};
        System.out.println("Program started");
        Character[] ans = reverse(s);
        for (int i=0;i<s.length;i++)
            System.out.println(ans[i]);


    }

    static Character[] reverse(Character[] s){
        int left = 0;
        int right =s.length-1;
        while(left<right){
            Character temp;
            temp=s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
}
