class animal{
    public String name="animal";
    void sound(){
        System.out.println("animal make sound");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("dog barks");
        System.out.println(name);
    }

}

class cat extends animal{
    void sound(){
        System.out.println("cat mewous");
        
    }
}

class Main{
    public static void main(String[] args){
        dog d=new dog();
        d.sound();    
        cat c=new cat();
        c.sound();
    }
}