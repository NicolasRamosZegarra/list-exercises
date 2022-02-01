package org.iesfm.list;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise1 {
    private static final Logger log= LoggerFactory.getLogger(Exercise1.class);

    public static void main(String[] args) {

        java.util.List<String> nameslist = new ArrayList<>();

        nameslist.add("Adri");
        nameslist.add("Gema");
        nameslist.add("Alba");
        nameslist.add("Ana");

        for (int i = 0; i < nameslist.size() ; i++) {
            log.info(""+ nameslist.get(i));
        }


    }
}
