package com.javaex.mysql.javapractice.collection;

import java.util.HashSet;
import java.util.Iterator;

public class ProductTest {
    private HashSet<Product> hs = new HashSet<>();    // Product type의 HashSet 선언

    public static void main(String[] args) {
        ProductTest pt = new ProductTest();
        pt.setValuesHash();   // product 객체 생성

        /*
            1. 객체를 만든다.
            2. hashset에 넣기 전에 이미 있는 id인지 체크한다.
            3. 있으면 넣지말고 이미 있다고 출력한다.
            4. 없으면 넣고 저장 성공했다고 출력한다.
         */
       /*
       bool -> false 면 add X
        */
        pt.addObject(new Product("p100","TV","20000"));
        pt.addObject(new Product("p100","TV","20000"));

        pt.addObject(new Product("p100","TV","20000"));
    }

    /*
        add to hashset
     */
    public void addObject(Product p){

        if(checkProductID(p)){
            hs.add(p);
        }else{
            System.out.println("이미 있다.");
        }
    }
    /*
     * input values to hashset
     *
     */
    public void setValuesHash(){
        checkProductID(new Product("p100","TV","20000"));
        checkProductID(new Product("p100","TV","20000"));
        checkProductID(new Product("p100","TV","20000"));
        checkProductID(new Product("p100","TV","20000"));

    }

    /*
    Check a product id if they are same
     */
    public boolean checkProductID(Product p) {
        Iterator<Product> pi = hs.iterator();  // iterator로 셋들 다 불러오기

        while(pi.hasNext()) {     // 다음값 있으면 true 없으면 false 반환
            if(pi.next().equals(p)) {    // 이미 있는 id면 false
                return false;
            }
//            else{
//                System.out.println("test");
//                hs.add(pi.next());
//            }
        }
        return true;
    }

    /*
        Print method
     */
    public void displayResult(){
        System.out.println("제품ID       제품명        가격      ");
        System.out.println("--------------------------------");
        System.out.println(toString());
    }
}