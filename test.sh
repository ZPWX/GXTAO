#!/bin/bash
#echo "hello world!"
#for file in ls /etc 将/etc下目录下的文件名循环输出
#my_name="GXTAO"
#echo $my_name
#echo ${my_name}
#for skill in Ada Coffe Action Java;do
 #   echo "I am good at ${skill}Script"
#done

#myUr1="http://www.w3cschool.cc"
#readonly myUr1
#myUr1="http://www.runoob.com"

#unset myUr1
#echo $myUr1

#string="runoob is a great site"
#echo `expr index "$string" is
#echo ${string:1:4}

#echo "shell 传递参数实例";
#echo "执行文件名：$0";
#echo "第一个参数为：$1";
#echo "第二个参数为：$2";
#echo "第三个参数为：$3";

#echo "参数个数为：$#";
#echo "一个参数为：$1";
#echo "传递的参数作为一个字符串显示：$*";

#echo "-- \$* show ---"
#for i in "$*";do
 #   echo $i
#done

#echo "-- \$@ show ---"
#for i in "$@";do
 #   echo $i
#done

#if [ -n "$1" ];then
 #   echo "包含第一个参数"
#else
 #   echo "没有包含第一个参数"
#fi

myarray=(A "B" "C" D)

echo "第一个元素为：${myarray[0]}"
echo "第二个元素为：${myarray[1]}"
echo "第三个元素为：${myarray[2]}"
echo "第三个元素为：${myarray[3]}"

echo "数组元素为：${myarray[*]}"
echo "数组元素为：${myarray[@]}"

echo "数组元素个数为：${#myarray[*]}"
echo "数组元素个数为：${#myarray[@]}"

echo "第一个元素为：${myarray[0]}"
echo "第二个元素为：${myarray[1]}"
echo "第二个元素为：${myarray[2]}"
echo "第二个元素为：${myarray[3]}"

echo "-----for循环遍历输出-------"
for i in ${myarray[@]}
do
    echo $i
done

echo "-----while循环遍历输出-----"
j=0;
while [ $j -lt ${#myarray[@]} ]
do
    echo ${myarray[$j]}
    let j++
done
