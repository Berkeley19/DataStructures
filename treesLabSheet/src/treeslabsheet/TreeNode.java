package treesLabSheet;



public class TreeNode {
        Object obj;
        TreeNode[] offspring;
        boolean visited;
        private static int MAX_OFFSPRING=20;
        int level=0;
        
        int numOffspring=0;
        TreeNode(Object o, int l){
            obj=o;
            offspring=new TreeNode[MAX_OFFSPRING]; 
            level=l;
        }
        TreeNode(Object o){
            obj=o;
            offspring=new TreeNode[MAX_OFFSPRING];  
            numOffspring=0;
            
        }
        boolean isFull(){
            if(numOffspring==offspring.length)
                return true;
            return false;
        }
        void add(TreeNode tr){
            if(!isFull())
                offspring[numOffspring++]=tr;
        }
        void setLevel(int l){
            level=l;
        }
        TreeNode[] getOffspring(){
            return offspring;
        } 

        @Override
        public String toString() {
            return obj.toString();
        }
        
        
        
    }
