package basic.sample;

class StaticSample {
    //staticMethodのサンプル

    /**
     * 足し算をするメソッド
     * @param x int 一つ目の整数
     * @param y int 二つ目の整数
     * @return int 加算した結果
     */
    static int add(int x,int y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(StaticSample.add(10,20));//30
        int ans = add(100,50);
        System.out.println(ans);
    }
}
