package com.javarush.tasts.level9.lesson8.task3;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Bean {
    public void log(Exception e) {
        System.out.println(e.getMessage() + ", " + e.getClass().getSimpleName());
    }

    public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {

        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new CharConversionException();
        if (i == 1)
            throw new FileSystemException("");
        if (i == 2)
            throw new IOException();
    }
}