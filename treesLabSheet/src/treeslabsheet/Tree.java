package treesLabSheet;

import java.util.*;

/**
 *
 * @author mfc17uyu
 */
public class Tree {

    TreeNode root;
    int height;
    int numNodes;

    public Tree() {
        root = null;
    }

    public static Tree createExampleTree1() {
        Tree t = new Tree();
        t.root = new TreeNode("ARSENAL");
        t.root.add(new TreeNode("Forty"));
        t.root.add(new TreeNode("Nine"));
        t.root.add(new TreeNode("Undefeated"));
        t.root.offspring[0].add(new TreeNode("I"));
        t.root.offspring[0].add(new TreeNode("Bet"));
        t.root.offspring[1].add(new TreeNode("You"));
        t.root.offspring[2].add(new TreeNode("Are"));
        t.root.offspring[2].add(new TreeNode("Sick"));
        t.root.offspring[2].add(new TreeNode("Of"));
        t.root.offspring[2].add(new TreeNode("Arsenal"));
        t.root.offspring[2].offspring[1].add(new TreeNode("Examples"));

        return t;
    }

    public static Tree createExampleTree2() {
        Tree t = new Tree();
        t.root = new TreeNode("Trees:");
        t.root.add(new TreeNode("Oak"));
        t.root.add(new TreeNode("Willow"));
        t.root.offspring[0].add(new TreeNode("Beech"));
        t.root.offspring[0].add(new TreeNode("Horse Chestnut"));

        return t;
    }

    public static Tree buildExample() {
        Tree t = new Tree();
        t.root = new TreeNode("Hello");
        t.root.add(new TreeNode("what"));
        t.root.offspring[0].add(new TreeNode("write"));
        t.root.offspring[0].offspring[0].add(new TreeNode("BAH"));
        t.root.add(new TreeNode("shall"));
        t.root.offspring[1].add(new TreeNode("God"));

        Stack stack = new Stack();
        stack.push("LALALALALA");
        Object s = stack.pop();
        Queue q = new LinkedList();
        return t;
    }
    
    public void toString1()
    {
        toString1(root);
    }

    //recursively DFS
    private void toString1(TreeNode tn) {
        if (tn != null) {
            System.out.println(tn);
            TreeNode[] offspring = tn.getOffspring();
            for (int i = 0; i < offspring.length; i++) {
                if (offspring[i] != null) {
                    toString1(offspring[i]);
                }
            }
        }
    }

    //iterative BFS
    public void toString2() {
        if (this.root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(this.root);
            while (queue.isEmpty() == false) {
                TreeNode t = queue.poll();
                System.out.println(t);
                TreeNode[] offspring = t.getOffspring();
                for (int i = 0; i < offspring.length; i++) {
                    if (offspring[i] != null) {
                        queue.add(offspring[i]);
                    }
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree tree = Tree.createExampleTree1();
        tree.toString1();
        //tree.root.getOffspring(tn)
        System.out.println();
        tree.toString2();
       
       
    }

}
