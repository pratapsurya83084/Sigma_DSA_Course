
class TilingWay {

    public static int TileaddingWay(int n) {

         if (n == 1 || n == 0) {
            return 1;
         }

        // vertically 2 X 1
        int verticalWay = TileaddingWay(n - 1);
        // horizontally 2 X 1
        int horizontalWay = TileaddingWay(n - 2);

        int way = verticalWay + horizontalWay;

        return way;

    }

    public static void main(String[] args) {

        int n = 2;
        int res = TileaddingWay(n);
        System.out.println(res);
    }
}