package com.sda.bogdan.advanced.exception.ex4;

import java.time.LocalDate;

/**
 * Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
 * Provide one version of the class that uses generics and one that does not.
 * Feel free to use any additional APIs for storing and retrieving the media.
 */
public class Main {
    public static void main(String[] args) {
        GenericLibrary<Book> library = new GenericLibrary<>();
        library.addMedia(new Book("abc", 132, LocalDate.now().minusDays(3), "asd"));
        library.addMedia(new Book("dsc", 150, LocalDate.now().minusDays(5), "dfg"));
        library.addMedia(new Book("avd", 116, LocalDate.now().minusDays(2), "sdf"));

        System.out.println(library.getAllMediaWithPriceLowerThan(118));
        System.out.println("\n" + library.getAllMediaWithReleaseDateAfter(LocalDate.now().minusDays(3)));
        System.out.println("\n" + library.getMediaByTitle("abc"));
        System.out.println("\n" + library.getMediaByTitle("avd"));
        System.out.println("\n" + library.getAllMedia());
    }
}
