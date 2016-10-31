public class EightQueen{
    static boolean isOk(int[][] m,int x,int y){
        int tx,ty;
        //同行
        for(ty = 0;ty < y;ty++){
            if(m[x][ty] == 1) return false;
        }
        //同列，不可能
        //斜线
        tx = x; ty = y;
        while( --tx >= 0 && --ty >= 0){
            if(m[tx][ty] == 1) return false;
        }
        tx = x; ty = y;
        while(++tx < m.length && --ty >= 0){
            if(m[tx][ty] == 1) return false;
        }

        return true;
    }
    static int count  = 1;
    static void print(int[][] m){
        System.out.println(">" + count);
        count++;

        for(int i = 0;i< m.length;i++){
            for(int j = 0;j < m.length;j++){
                System.out.print(" "+ m[i][j]);
            }
            System.out.println();
        }
    }

    static void listAll(int[][] m,int y){
        for(int x = 0;x < m.length;x++){
            m[x][y] = 1;
            if(isOk(m,x,y)){
                if(y == m.length - 1) print(m);
                else listAll(m,y+1);
            }
            m[x][y] = 0;
        }
    }

    public static void main(String[] args){
        int[][] m = new int[8][8];
        for(int i = 0;i < 8;i++){
            for(int j = 0;j < 8;j++) {
                m[i][j] = 0;
            }
        }
        listAll(m,0);
    }
}
