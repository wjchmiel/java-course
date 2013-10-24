package com.chmielowiec.lecture61;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;


public class UrlLibrary implements Iterable<String> {

    private LinkedList<String> urls = new LinkedList<String>();

    private class UrlIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {

            StringBuilder stringBuilder = new StringBuilder();

            try {
                URL url = new URL(urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                String line = null;

                while ((line = br.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append("\n");
                }

                br.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

            index++;

            return stringBuilder.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);
        }
    }

    public UrlLibrary() {
        urls.add("http://www.caveofprogramming.com");
        urls.add("http://www.cft.edu.pl");
        urls.add("http://www.uw.edu.pl");
    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    /*
    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
    */


}
