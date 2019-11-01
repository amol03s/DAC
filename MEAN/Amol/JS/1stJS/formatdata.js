function displaydata()
{
   var nm=document.getElementById("txt1").value;
   var hb=document.getElementsByName("hobbies");
   var gn=document.getElementsByName("radiogen");
   var degree=document.getElementById("de1").value;
   var str="";
   for(var i=0;i<hb.length;i++)
   {
   	if(hb[i].checked == true)
   	{
   		str+=hb[i].value + ",";
   	}
   
   }
   var gen="";
   for(var i=0;i<gn.length;i++)
   {
   	if(gn[i].checked == true)
   	{
   		gen+=gn[i].value ;
   		break;
   	}
   
   }
 
   var str1="";
   str1+="Name is :"+nm+"<br> Hobbies:"+str+"</br>Gender:"+gen+"</br>Degree:"+degree;
   document.getElementById("myid").innerHTML=str1;

}
