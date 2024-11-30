package AimsProject.src.hust.soict.dsai.test.disc;
 // Wrapper class to hold a DigitalVideoDisc

import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

class DigitalVideoDiscWrapper {
    DigitalVideoDisc dvd;

    public DigitalVideoDiscWrapper(DigitalVideoDisc dvd) {
        this.dvd = dvd;
    }

    public DigitalVideoDisc getDvd() {
        return dvd;
    }

    public void setDvd(DigitalVideoDisc dvd) {
        this.dvd = dvd;
    }
}

public class TestPassingParameter {

    public static void main(String[] args) {
        // Create two DigitalVideoDisc objects
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // Print initial titles
        System.out.println("Before swap:");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        // Create wrapper objects to hold the DVDs
        DigitalVideoDiscWrapper wrapper1 = new DigitalVideoDiscWrapper(jungleDVD);
        DigitalVideoDiscWrapper wrapper2 = new DigitalVideoDiscWrapper(cinderellaDVD);

        // Swap the objects inside the wrappers
        swap(wrapper1, wrapper2);

        // Print titles after swap
        System.out.println("After swap:");
        System.out.println("Jungle DVD title: " + wrapper1.getDvd().getTitle());
        System.out.println("Cinderella DVD title: " + wrapper2.getDvd().getTitle());
    }

    public static void swap(DigitalVideoDiscWrapper wrapper1, DigitalVideoDiscWrapper wrapper2) {
        // Swap the DVD references inside the wrapper objects
        DigitalVideoDisc temp = wrapper1.getDvd();
        wrapper1.setDvd(wrapper2.getDvd());
        wrapper2.setDvd(temp);
    }
}
