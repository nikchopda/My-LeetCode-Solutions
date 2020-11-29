class Solution {
    public String reformatDate(String date) {
        String[] items = date.split(" ");
        String day=items[0].substring(0, items[0].length() - 2);
        String[] month={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        int month_c=0;
        for(int i=0;i<month.length;i++){
            if(month[i].equals(items[1]))
                month_c=i+1;
        }
        int i=Integer.parseInt(day);
        if(i<10){
            day="0"+i;
        }
        String fin="";
        if(month_c>9)
            fin=items[2]+"-"+month_c+"-"+day;   
        else
            fin=items[2]+"-0"+month_c+"-"+day;
        return fin;
    }
}