package samples;

public class Demo {
    public static void main(String[] args) {

        SampleClass sampleClass = new SampleClass("aaa", 1234);
        sampleClass.setFirstField("qqq");
        sampleClass.getFirstField();
        SampleClass another = new SampleClass();
    }
}
