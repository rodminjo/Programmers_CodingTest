package lv1.minimum_rectangle;

// 최소 명함지갑 크기를 구할것
// 1. 각 명함의 가로세로를 큰 길이, 작은 길이 순으로 정렬
// 2. 큰 길이중 최댓값, 작은 길이중 최댓값을 구함.
// 3. 곱해서 출력.

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for(int[] nametag : sizes){
            if(nametag[0]>= nametag[1]){
                maxW = maxW < nametag[0] ? nametag[0] : maxW;
                maxH = maxH < nametag[1]? nametag[1] : maxH;
            }else {
                maxW = maxW < nametag[1]? nametag[1] : maxW;
                maxH = maxH < nametag[0]? nametag[0] : maxH;
            }
        }

        return maxH * maxW;
    }
}
