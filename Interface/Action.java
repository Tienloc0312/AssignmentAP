/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.util.ArrayList;

/**
 *
 * @author hp
 * @param <L>
 */
public interface Action<L> {
    public Object add(ArrayList<L> list);
    public boolean edit(ArrayList<L> list);
    public boolean delete(ArrayList<L> list);
    public void show(ArrayList<L> list);
    public void search(ArrayList<L> list);
    public boolean checkID(ArrayList<L> list, String id); 
}
