package creational.builder;

/**
 * @author derek
 * @version 1.0
 */
abstract class Builder {
    abstract String show1();
    abstract String show2();
}

class BuilderA extends Builder{
    @Override
    String show1() {
        return "A1";
    }

    @Override
    String show2() {
        return "A2";
    }
}
class BuilderB extends Builder{
    @Override
    String show1() {
        return "B1";
    }

    @Override
    String show2() {
        return "B2";
    }
}

class Director{
    private Builder builder;
    void setBuilder(Builder builder){
        this.builder = builder;
    }
    String show(){
        return builder.show1() +  builder.show2();
    }
}