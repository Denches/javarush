package com.javarush.tasts.level9.lesson8.task3;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/**
 *1. Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
 * 2. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
 * 2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
 * 2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его - вызвать метод BEAN.log
 * 3. Добавь в сигнатуру метода processExceptions класс исключения, которое ты пробрасываешь в п.2.1.
 * 4. В методе main обработай оставшееся исключение - логируй его. Используй try..catch
 *
 * Подсказка:
 * Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
 * catch (MyException e) {
 *    throw e;
 * }
 */

public class Solution {

    public static Bean BEAN = new Bean();

    public static void main(String[] args) {

        try {
            processExceptions();
        } catch (FileSystemException e){
            BEAN.log(e);
        }

    }

    public static void processExceptions() throws FileSystemException {

        try {
            BEAN.methodThrowExceptions();
        } catch (FileSystemException e) {
            BEAN.log(e);
            throw e;
        } catch (CharConversionException e){
            BEAN.log(e);
        } catch (IOException e){
            BEAN.log(e);
        }

    }

}
