class StaticInit{

    static int age;
    String sex;
    String name;

    public StaticInit(){
        System.out.println("construction");
        name="Tom";
    }

    {
        System.out.println("init.....");
        sex="male";
    }
    static {
        System.out.println("init Static....");
        age =30;
    }

    public void show() {
        System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
        
    }


    public static void main(String args[]) {
        StaticInit obj = new StaticInit();
        System.out.println(obj);
        // exit;
        // obj.show();
    }
}