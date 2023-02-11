package lv1.oongaree;

class Solution {

    public int solution(String[] babbling) {
        int count = 0;

        for (String b : babbling){

            String s = "";
            StringBuilder sb = new StringBuilder(b);

            while(sb.length() > 1){
                try {
                    if (sb.charAt(0) == 'y' || sb.charAt(0) == 'm') {
                        String twoSb = sb.substring(0, 2);
                        if (s.equals(twoSb)) {
                            break;
                        } else if (twoSb.equals("ye") || twoSb.equals("ma")) {
                            sb.replace(0, 2, "");
                            s = twoSb;
                        } else {
                            break;
                        }
                    } else if (sb.charAt(0) == 'a' || sb.charAt(0) == 'w') {
                        String thrSb = sb.substring(0, 3);
                        if (s.equals(thrSb)) {
                            break;
                        } else if (thrSb.equals("aya") || thrSb.equals("woo")) {
                            sb.replace(0, 3, "");
                            s = thrSb;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    break;
                }
            }

            if(sb.length() == 0){
                count ++;
            }

        }



        return count;
    }
}
