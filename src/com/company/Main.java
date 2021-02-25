package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
       //List<Integer> arr = Arrays.asList(5,6,8,11); //YES
       // List<Integer> arr = Arrays.asList(0 ,0, 1); //NO
       // List<Integer> arr = Arrays.asList(3 ,2, 3); //NO
       // List<Integer> arr = Arrays.asList(1, 2, 3, 3);//YES
       // List<Integer> arr = Arrays.asList(1, 2, 3, 4 ,1,2 ,3); //YES
      // List<Integer> arr = Arrays.asList(2, 0 ,0, 0); //YES
       // List<Integer> arr = Arrays.asList(0, 0, 2, 0 ); //YES
        /*List<Integer> arr = Arrays.asList(75 ,26 ,45, 72, 81, 47, 29,
                97 ,2 ,75, 25 ,82, 84 ,17, 56 ,32 ,2 ,28 ,37 ,57 ,39 ,18 ,11 ,79, 6,
                40 ,68, 68, 16, 40, 63, 93, 49, 91 ,10, 55 ,68, 31 ,80, 57 ,18 ,34 ,
                28 ,76, 55, 21, 80, 22, 45, 11, 67, 67, 74, 91 ,4 ,35 ,34 ,65 ,80 ,
                21 ,95, 1 ,52 ,25, 31 ,2 ,53 ,96, 22 ,89 ,99 ,7 ,66, 32 ,2, 68, 33,
                75 ,92, 84, 10, 94, 28, 54, 12, 9, 80 ,43, 21 ,51, 92 ,20, 97 ,7, 25 ,67 ,17 ,38, 100 ,86
        );*/ //no

        List<Integer> arr = Arrays.asList(185, 170 ,208 ,216 ,236 ,
                155, 88 ,206, 211 ,209, 84 ,99, 130, 245, 232, 125, 127,
                232, 187 ,140, 92 ,213 ,221 ,231, 129 ,197 ,221, 168 ,95,
                186, 136, 180, 94, 125 ,150 ,244, 249, 248 ,140, 207 ,125,
                84 ,123, 85 ,100, 175 ,67 ,116, 107 ,143, 158 ,75 ,165 ,172,
                115, 134, 175, 123, 115, 123, 159, 181, 63, 176 ,158 ,109 ,67,
                154, 126, 141 ,111, 95 ,138 ,161 ,71 ,118, 151 ,189 ,126 ,109,
                194, 176, 159 ,151, 189, 71 ,95 ,133, 154 ,157 ,109, 78 ,101 ,
                174 ,169, 152 ,94, 193 ,176, 137);





        String result = "";
        long sumLeft=0;
        long sumRight=0;
        boolean isExist=false;
        long sum=0;

        sumRight = arr.stream().reduce(0, (a,b)-> a+b);

        System.out.println(sumRight);

        if(arr.size()>3){
            int i=0;
            while (sumRight>=0){
                if(i< arr.size()){
                    sumRight-= arr.get(i);
                    if(i>=1){
                        sumLeft+=arr.get(i-1);
                    }
                    System.out.println(arr.get(i)+"   "+sumLeft+"  "+sumRight);
                    if(sumLeft==sumRight){
                        isExist=true;
                        break;
                    }
                    i++;
                }else {
                    break;
                }
            }
        }else if(arr.size()==3){
            if(arr.get(0)==arr.get(2)){
                isExist=true;
            }else if(arr.get(1)==0 && arr.get(2)==0 || arr.get(0)==0 && arr.get(1)==0){
                isExist=true;
            }
        }else if(arr.size()==2){
            if(arr.get(0)==0 || arr.get(1)==0){
                isExist=true;
            }
        }else if(arr.size()==1){
            isExist=true;
        }

        if(isExist==true){
            result="YES";
        }else {
            result="NO";
        }
        System.out.println(result);

    }
}

