package A8_Basic_Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public void main(String[] args) {
        int[] a = {3, 1, 2, 1, 1, 4, 5, 5};
        int[] b = {6, 1, 1, 4, 4, 2, 8};
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while((i< a.length) && (j< b.length)){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if (a[i]<b[j]) i++;
            else j++;
        }
        System.out.println(ans);

    }

}

//ab do pointer banayenge ek i aur dusra j
//i ko a ke 0 index par rakhenge
//j ko b ke 0 index par rakhenge
//a[i] == b[j] toh i ko arraylist mei add kar denge
//aur i++ ; j++
//ab dono unequal hue aur dono mei se jo element chota hoga
//uska poiner aage badhega like agar a[i] jyda hai toh i++
//agr i ya j dono mei se koi bhi a ya b ke length tak pahuchega toh loop band karo
