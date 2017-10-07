class MethordBenchmark extends Benchmark{
    void benchmark(){
    }

    public static void main(String[] args){
        int count = Integer.parseInt(args[0]);
        long time = new MethordBenchmark().repeat(count);
        System.out.println(count+" methods in "+time+"milliseconds");
    }
}
