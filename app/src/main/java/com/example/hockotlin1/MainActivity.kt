package com.example.hockotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //********Biến và kiểu duẽ liệu trong Kotlin************
        var a: String="hahah"
        a="kaka"
        //ép kiểu trong kotlin
        a.toInt()
        //val thì chỉ dc định nghĩa 1 lầ ko gán giá trị lại dc nữa, chỉ lấy ra sử dụng
        val b:String="Final"
        ///***************null sffety trong kotlin*************
        var name1:String ="Kotlin"
        name1=null///Trong kottlin thì 1 niến khi đã gán giá trị rồi thì không dc gán bằng null
        var name2: String? ="Kotlin"//dấu ? cho phép 1 biến đã dc gán giá trị rồi sau đso gán giá trị băng null
        name2=null
        var name3 :String ="Kotlin"!!//dấu !! có ý nghĩ akhoong cho phép biến đso nhận giá trị null
        name3=null
        //*********Câu lệnh rẽ nhánh if-else trong Kotlin**********
        var a1:Int =15
        var a2:Int=10
        if(a>b){
            Log.d("AAA",a+" lớn hơn "+b)
        }else{
            Log.d("AAA",b+" lớn hơn "+a)
        }
        //********Câu lệnh when trong Kotlin*********
        var name5:String="Kotlin"
        when(name5){
            "Kotlin"-> Log.d("AAA","Chào Kotlin")
            "Java"->Log.d("AAA","Chào Java")
            "Python"->Log.d("AAA","Chào Python")
        }
        var name6:Int=7
        when(name6){
            1,2,3->Log.d("BBB","Tháng "+name6+" thuộc quý I")
            4,5,6->Log.d("BBB","Thámg "+name6+" thuộc quý II")
            7,8,9->Log.d("BBB","Tháng "+name6+" thuộc quý III")
            10,11,12->Log.d("BBB:","Tháng "+name6+" thuộc quý IV")
        }
        when(name6){
           in 1..3->Log.d("BBB","Tháng "+name6+" thuộc quý I")
            in 4..6->Log.d("BBB","Thámg "+name6+" thuộc quý II")
            in 7..9->Log.d("BBB","Tháng "+name6+" thuộc quý III")
            in 10..12 ->Log.d("BBB:","Tháng "+name6+" thuộc quý IV")
            else->Log.d("BBB","tháng không phù hợp")

        }
        //******Vòng lặp While trong Kotlin*********
        var name7:Int =0
        while(name7<10){
            Log.d("CCC","Chà0 bạn lần thứ "+(name7+1))
            name7++
        }//*********Vòng lặp For trong Kotlin************
        var name8:Int =8
        for(i in 0 until name8) //lặp từ 0 đến 7
            {
            Log.d("HHH","Chào bạn lần thứ "+i)
        }
        for(i in name8 downTo 0)//lặp từ name xuống 0
            {
            Log.d("HHH","Chào bạn lần thứ "+i)
        }
        for(i in 0..name7 step 2)//bước nhảy bằng 2
        {
            Log.d("HHH","Chàn bạn lần thứ "+i)
        }
        //********Array trong Kotlin*************
        //Cách1:
        var array1 :IntArray= intArrayOf(1,2,3,4,5,6,7) ///Không hỗ trợ kiểu StringArray
        array1.get(1)
        //Cach 2:
        var array2 :List<String> = listOf("Kotlin","Java","Python")
        array2.get(1)
        //Cách 3:
        var array3:ArrayList<String> = ArrayList()
        array3.add("Kotlin")
        array3.add("Java")
        array3.add("Python")
        //kiểm tra số luọng phần t ử trong mảng
        array1.size
        array2.size
        array3.size
        ///Xóa 1 phần tử
        array3.remove("Python")//xóa theo giá trị phần tử
        array3.removeAt(2)//Xóa theo vị trí phần tử trong mmảng
        //Sửa phần tử trong mảng
        array3.set(2,"JS")
        //**********Hàn trong Kotlin***********
        fun ShowName(ten:String){
            Log.d("LLL","Chào bạn "+ten)
        }
     }
}