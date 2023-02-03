package org.example.practicetwo;
import org.example.practicetwo.checkuniquecharacters.UniqueCharacters;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(UniqueCharacters.check("isunique"));
        System.out.println(UniqueCharacters.check("isNotUnique"));
        System.out.println(UniqueCharacters.check("collection in Java"));
        System.out.println(UniqueCharacters.check("sTriNg Input"));
        System.out.println(UniqueCharacters.check("pRactice"));
        System.out.println(UniqueCharacters.check("practicetwo"));
    }

}


