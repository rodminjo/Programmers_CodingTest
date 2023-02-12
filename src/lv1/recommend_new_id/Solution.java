package lv1.recommend_new_id;

class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();

        StringBuilder sb = new StringBuilder(new_id);



        for(int i =0; i < new_id.length(); i++){
            if (new_id.charAt(i) >= 97 && new_id.charAt(i) <= 122){

            }else if (new_id.charAt(i) == '-' ||new_id.charAt(i)=='_'||new_id.charAt(i)=='.'){

            }else if(new_id.charAt(i) >= 48 && new_id.charAt(i)<=57){

            }else{
                sb.replace(i, i+1," ");
            }
        }


        String s1 = sb.toString().replace(" ","");
        String s2 =s1.replace("..",".");
        while(s1 != s2){
            s1 = s2;
            s2 = s1.replace("..",".");
        }

        try {
            if (s1.charAt(0) == '.') {
                s1 = s1.substring(1);
            }
        } catch (IndexOutOfBoundsException e){};

        try {
        if (s1.charAt(s1.length()-1)=='.'){
            s1 = s1.substring(0, s1.length()-1);
        }
        } catch (IndexOutOfBoundsException e){};

        if (s1.length() == 0){
            s1 = "a";
        }

        if (s1.length() >= 16){
            s1 = s1.substring(0, 15);
        }
        try {
            if (s1.charAt(s1.length() - 1) == '.') {
                s1 = s1.substring(0, s1.length() - 1);
            }
        } catch (IndexOutOfBoundsException e){};

        try {
            if(s1.length() <= 2){
                s1 = s1 + String.valueOf(s1.charAt(s1.length()-1)).repeat(3-s1.length());
            }
        } catch (IndexOutOfBoundsException e){};

        return s1;
    }
}
