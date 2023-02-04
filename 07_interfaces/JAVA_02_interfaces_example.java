class Phone {

    public void call() {

        System.out.println("Phone call : ");
    }

    public void sms() {

        System.out.println("Phone Message : ");
    }
}

interface Camera {

    void click();

    void record();
}

interface Music_player {

    void play();

    void stop();
}

class Smart_phone extends Phone implements Camera, Music_player // phone class inherited and camera, Music_Player interfaces are implemented
{
    @Override
    public void click() {

        System.out.println("Picture clicked : ");
    }

    @Override
    public void record() {

        System.out.println("video record : ");
    }

    @Override
    public void play() {

        System.out.println("Music play : ");
    }

    @Override
    public void stop() {

        System.out.println("Music stop : ");
    }

    public void extra_feature() {

        System.out.println("Extra features of smart phone ");
    }
}

public class JAVA_02_interfaces_example {

    public static void main(String[] args) {

        Smart_phone ph1;
        ph1 = new Smart_phone();

        ph1.call();
        ph1.sms();
        ph1.click();
        ph1.record();
        ph1.play();
        ph1.stop();

        //////////////////////////////////////////////////////////

        Phone ph2;
        ph2 = new Smart_phone();

        ph2.call();
        ph2.sms();
        // ph2.click(); <--- Not allowed
        // ph2.record(); <--- Not allowed
        // ph2.play(); <--- Not allowed
        // ph2.stop(); <--- Not allowed

        /////////////////////////////////////////////////////////

        Camera ph3;
        ph3 = new Smart_phone();

        ph3.click();
        ph3.record();
        // ph3.call(); <---- Not allowed
        // ph3.sms(); <---- Not allowed
        // ph3.play(); <---- Not allowed
        // ph3.stop(); <---- Not allowed

        //////////////////////////////////////////////////////////

        Music_player ph4;
        ph4 = new Smart_phone();

        ph4.play();
        ph4.stop();
        // ph4.call(); <---- Not allowed
        // ph4.sms(); <---- Not allowed
        // ph4.click(); <---- Not allowed
        // ph4.record(); <---- Not allowed
    }

}

// Phone call : 
// Phone Message : 
// Picture clicked :
// video record :
// Music play :
// Music stop :

// Phone call :
// Phone Message :

// Picture clicked :
// video record :

// Music play :
// Music stop :