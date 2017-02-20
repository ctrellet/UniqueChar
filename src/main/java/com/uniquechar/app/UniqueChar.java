package com.uniquechar.app;

/**
 * Created by christophe on 16/02/17.
 */
public class UniqueChar {

    public boolean isUniqueChar(String str2check) {

        if(str2check==null||str2check.isEmpty()){
            return false;
        }

        //System.out.println("str2check:"+str2check);

        String existingChars = "";
        for(String aChar:str2check.split("(?!^)") ){

            //System.out.println("aChar:"+aChar);

            if(existingChars.contains(aChar)) {
                //System.out.println("existingChars:"+existingChars+"  contient:"+aChar+" ==> false");
                return false;
            }else{
                //System.out.println("existingChars:"+existingChars+"  ne contient pas:"+aChar+" ==> on l'ajoute");
                existingChars = existingChars + aChar;
                //System.out.println("existingChars:"+existingChars);
            }
        }
        //System.out.println("existingChars:"+existingChars+"  fin de boucle ==> true");
        return true;

    }

}
