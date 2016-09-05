/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.todivefor.stack;

import javax.swing.JOptionPane;

/**
 *
 * @author peterream
 */
public class Stack
{
    public int top;                             // Current position of stack
    public int maxSize;                         // Max size of stack
    public String arrayStack[];                 // Stack
    
    public Stack(int n)
    {
        maxSize = n;                            // Set max size of stack
        arrayStack = new String[maxSize];       // Allocate stack
        top = 0;                                // Initialize top of empty stack
    }
    
    public boolean empty()                      // Check for empty stack
    {
        if (top == 0)                           // top = 0?
        {
            return true;                        // Yes, stack is empty
        }
        else                                    // No
        {
            return false;                       // Stack is not empty
        }
    }
    
    public void push(String item)               // push item to stack
    {
        if (top < maxSize)                      // Room to push?                         
        {
            arrayStack[top] = item;             // Yes, add item to stack
            top++;                              // increment current position   
        }
        else                                    // No, no room
        {
            JOptionPane.showMessageDialog(null, "Stack overflow!!  Depth - " + (top + 1) );
            System.out.println("Stack overflow!!");
        }
    }
    
    public String pop()
    {
        if (!this.empty())                          // Stack empty?
        {
            String temp = arrayStack[top-1];        // No, return top item
            arrayStack[top-1] = null;               // Clear top item
            top--;                                  // Decrement top
            return temp;                            // Return top item
        }
        return null;
    }
    
    public String peek()                            // Pop top item on stack without incrementing
    {
        if (top > 0)                                // Stack empty?
        {
            return arrayStack[top-1];                 // Return top item  
        }
        else                                        // Yes
        {
            return null;                            // Return null
        }
    }
}
