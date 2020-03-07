package com.sc.assessment.Lydia1;

import com.sc.assessment.controller.SearchItem;

public class App 
{
    public static void main( String[] args )
    {
        SearchItem si = new SearchItem();
        int result = si.searchItem(42);
        System.out.println("Value found on index : "+ result);
    }
}
