public class ShortestPath {

    public static void Shortest(String str){
        int x = 0;
        int y = 0;
        int start = 0;
        int end = str.length()-1;
        while(start<=end) {
            char currChar = str.charAt(start);
            if(currChar == 'N'){
                y++;
            } else if (currChar == 'S') {
                y--;
            } else if(currChar == 'E') {
                x++;
            } else {
                x--;
            }

            start++;
        }
        
        int ShortestPath = (int)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(ShortestPath);
    }
    
    
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        Shortest(str);
    }
}