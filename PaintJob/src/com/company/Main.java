package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(7.25,4.3,2.35));
    }
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;
        }
        double area=width*height;
        return (int)Math.ceil((area-(extraBuckets*areaPerBucket))/areaPerBucket);
    }
    public static int getBucketCount(double width,double height, double areaPerBucket){
        return (width<=0||height<=0||areaPerBucket<=0)? -1 :(int)Math.ceil(width*height/areaPerBucket);

    }
    public static int getBucketCount(double area , double areaPerBucket){
        return (area<=0||areaPerBucket<=0)? -1 :(int)Math.ceil(area/areaPerBucket);
    }


}
