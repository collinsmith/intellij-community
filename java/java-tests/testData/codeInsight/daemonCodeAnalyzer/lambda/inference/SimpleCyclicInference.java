class NoLambda {
    interface I<T> {
        void f(T t);
    }

    <Z> void bar(I<Z> iz) {
    }

    void bazz() {
        bar(null);
        bar((z)-> {System.out.println();});
    }
  
    static <T> T id(T i2) {return i2;}

    {
       id(<error descr="Object is not a functional interface">() -> {System.out.println("hi");}</error>);
       NoLambda.<Runnable>id(() -> {System.out.println("hi");});
    }
}