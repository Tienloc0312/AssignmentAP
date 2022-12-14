/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public interface ActionBorrow<L, L1, L2> extends Action<L>{
    public Object add(ArrayList<L> list , ArrayList<L1> list2, ArrayList<L2> list3);
    public boolean edit(ArrayList<L> list , ArrayList<L1> list2, ArrayList<L2> list3);
    public boolean delete(ArrayList<L> list );
    public void show(ArrayList<L> list );
    public void search(ArrayList<L> list );
}
