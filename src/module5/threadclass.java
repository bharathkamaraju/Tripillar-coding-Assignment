package module5;
//program6

public class threadclass extends Thread{
    String college;
    int usn;
    int time;
    String access;
    public threadclass(String college, int usn, int time, String access) {
        this.college = college;
        this.usn = usn;
        this.time = time;
        this.access=access;
    }
    public void run(){
        System.out.println(college+" "+usn+" "+time+" "+access);
    }
}
class collegeentry {
    public static void main(String[] args) {
        threadclass s1=new threadclass("Sapthagiri",20,8,"Allow");
        threadclass s2=new threadclass("Sapthagiri",20,9,"Allow");
        threadclass s3=new threadclass("Sapthagiri",20,11,"Access denied");
        s1.start();
        s2.start();
        s3.start();
    }
}
