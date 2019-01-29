/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trielabsheet;

/**
 *
 * @author mfc17uyu
 */
public class TrieLabSheet {

    /**
     * @param args the command line arguments
     */
    class TrieNode {
        char c;
        TrieNode[] arr;
        boolean complete;
        TrieNode(char object){
            this.arr = new TrieNode[26];
            this.c = object;
        }
        
        boolean add(TrieNode trie){
            int index = Math.abs(97 - getAscValue(trie.c));
            if(arr[index] == null){
                arr[index] = trie;
                return true;
            }
            return false;
        }    
        
        int getAscValue(char c){
            return c;
        }
        
    }
    class Trie{
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
