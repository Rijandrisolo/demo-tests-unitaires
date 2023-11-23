package fr.diginamic.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


 class StringUtilsTest {


 //StringUtils stringUtils =new StringUtils();
  @Test
  void levenshteinDistance(){
   //int res = StringUtils.levenshteinDistance("Chien","chine");
   //int res1 = StringUtils.levenshteinDistance("machins","machine");
   int res2 = StringUtils.levenshteinDistance("avirons","avion");
   int res3 = StringUtils.levenshteinDistance("distance","instance");
   //assertEquals(res,1);
   //assertEquals(res1,1);
    assertEquals(res2,2);
   //assertEquals(res2,2);


  }



}