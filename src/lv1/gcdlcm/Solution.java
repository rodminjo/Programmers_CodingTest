package lv1.gcdlcm;

class Solution {
    public int[] solution(int n, int m) {
        int a = n;
        int b = m;
        int c = 0;
        if(n==m){return new int[]{n,m};}
        else if (n > m) {a= m ; b= n;}

        do{ c = b % a;
                b= a;
                a= c;
        } while (c!=0);

        return new int[]{b, n * m / b};
    }

    //재귀함수로 만들면 반복자 사용하지 않아도 됨.
}