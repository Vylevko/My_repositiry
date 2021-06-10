package com.jl2;

import static java.lang.System.*;

public class ArraysMax {
    private int lnght;
    private int[] array;
    private int maxVal;
    private int maxPos;
    private int minPos;
    private int minPos2;
    private int minVal;
    private int minVal2;
    //private int array[lnght];
    public ArraysMax(int lnght) {
        this.lnght = lnght;
        array = new int[this.lnght];
    }

    public void setArrayValues(int val, int pos) {
        array[pos] = val;
    }
    public int getArrayValues(int pos) {
        return array[pos];
    }
    public int[] returnArray() {
        return this.array;
    }
    public void showArrayValues() {
        out.println("Array");
        for(int curr : array) {
            out.print(curr + " ");
        }
        out.println(" ");
    }
    public void showArray(int[] a){
        out.println("Array");
        for(int curr : a) {
            out.print(curr + " ");
        }
        out.println(" ");
    }
    private void findMaxValPos() {
        for(int i = 0; i < array.length; i++) {
            if (maxVal < array[i]) {
                maxVal = array[i];
                maxPos = i;
            }
        }
    }
    private void findMinValPos() {
        for (int i = 0; i < array.length; i++) {
            if (minVal > array[i]) {
                minVal = array[i];
                minPos = i;
            }

            if ((minVal <= array[i]  && minVal2 > array[i] && minVal2 >= minVal) || minPos == minPos2)  {
                minVal2 = array[i];
                minPos2 = i;
            }
        }
    }
    public void orderArrayBubbble(char way) {
        for (int a = 0; a < array.length; a++) {
            //out.println("Up cycle run " + a);
            int tmp = array[0];
            for (int i = 0; i < array.length - a; i++) {
                //out.println("Inner cycle run" + i);
                switch (way) {
                    case 'A':
                        if (tmp < array[i]) {
                            array[i-1] = array[i];
                            array[i] = tmp;
                        } else {
                            tmp = array[i];
                        }
                        break;
                    default:
                        if (tmp > array[i]) {
                            array[i-1] = array[i];
                            array[i] = tmp;
                        } else {
                            tmp = array[i];
                        }
                        break;
                }
            }
        }

    }
    public int[] orderArrayFastStep1(int[] basicArr,int pnt) {
        int pntVal = basicArr[pnt];
        out.println("Basic val " + pntVal);
        int[] tmpArr = new int[basicArr.length];
        int i = 0;
        int j = basicArr.length-1;
        for (int k = 0; k < basicArr.length; k++){
            if (basicArr[k] <= pntVal) {
                tmpArr[i] = basicArr[k];
                i++;
            } else{
                tmpArr[j] = basicArr[k];
                j--;
            }
        }
        return tmpArr;
    }
    public void showMaxValPos() {
        maxVal = array[0];
        minVal = array[0];
        minVal2 = array[0];
        findMaxValPos();
        findMinValPos();
        out.println("Max Value " + maxVal);
        out.println("The pos of max value " + maxPos);
        out.println("Min Value " + minVal + " MinPos " + minPos);
        out.println("Min Value second " + minVal2 + " MinPos second " + minPos2);
    }
}
