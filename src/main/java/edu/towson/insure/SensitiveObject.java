package edu.towson.insure;

import io.github.novacrypto.SecureCharBuffer;


public class SensitiveObject implements AutoCloseable {

    private SecureCharBuffer buffer;
    private char[] characters;

    public SensitiveObject(){
        buffer = new SecureCharBuffer();
    } //Default 512 Bytes
    public SensitiveObject(int length){ buffer = SecureCharBuffer.withCapacity(length); }

    public void append(final Object object){
        buffer.append(String.valueOf(object));
    }

    public char[] read(){
        final int length = buffer.length();
        characters = new char[length];
        for (int i = 0; i < length; i++) {
            characters[i] = buffer.get(i);
        }
        return characters;
    }

    public void clear(){
        for (int i = 0; i < characters.length; i++){
            characters[i]=' ';
        }
        buffer.close();
    }
    
    public boolean equals(CharSequence charSequence) {
        final int length = buffer.length();
        boolean bool = true;
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != buffer.get(i)) {
                bool = false;
            }
        }
        return bool;
    }

    @Override
    public void close() {
        clear();
    }
}
