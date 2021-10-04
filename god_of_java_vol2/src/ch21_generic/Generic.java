package ch21_generic;

import com.sun.tools.javah.Gen;

public class Generic {

    public static void main(String[] args) {

//        g.setCar(new Bus());

//        g.getCar().run();

        new Generic().multiGenericMethod(
                new GenericType<Bus>("BMW")
                , new Bus()
                , "Beamer"
        );

    }

    public <T extends Car, S> void multiGenericMethod(GenericType<T> t, T addValue, S another) {
        t.setCar(addValue);
        t.getCar().sell(another);
    }
}

class GenericType<T extends Car> {
    T car;
    public String carName;

    public GenericType(String carName) {
        this.carName = carName;
    }


    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }
}

class Car {


    public String companyName;

    public <T> void sell(T g) {
        System.out.println("chitching.... got some G unit of .... : " + g);
    }

    public void run() {
        System.out.println("runing.....");
    }
}

class Bus extends Car {


}
