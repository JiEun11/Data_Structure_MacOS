package javaex.datastructure.second.sungjuk;

//Student 정보를 담는 클래스

class Student {

    private String name;

    private int kor;

    private int eng;

    private int math;

    private int total;

    private float avg;

    public Student() {

    }

    public Student(String name, int kor, int eng, int math) {

        this.name = name;

        this.kor = kor;

        this.eng = eng;

        this.math = math;

        this.total = kor + eng + math;

        this.avg = total / 3.f;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getKor() {

        return kor;

    }

    public void setKor(int kor) {

        this.kor = kor;

    }

    public int getEng() {

        return eng;

    }

    public void setEng(int eng) {

        this.eng = eng;

    }

    public int getMath() {

        return math;

    }

    public void setMath(int math) {

        this.math = math;
    }

    public int getTotal() {

        return total = kor + eng + math;

    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getAvg() {

        return avg = getTotal() / 3.f;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public String toString() {

        return "이름: " + name + "\t" + "국어점수: " + kor + "\t" + "영어점수: " + eng + "\t" + "수학점수: " + math + "\t" + "합계: "
                + getTotal() + "\t" + "평균: " + getAvg();

    }

    // Set에서 객체 중복 처리
    @Override
    public int hashCode() {
//        System.out.println((this.name + this.kor + this.eng + this.math).hashCode());
        return (this.name + this.kor + this.eng + this.math).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student other = (Student)obj;
            return (other.name==this.name && other.kor==this.kor
                    && other.eng == this.eng && other.math== this.math);
        }
        return super.equals(obj);
    }
}