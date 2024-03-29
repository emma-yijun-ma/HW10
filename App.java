import java.util.ArrayList;
import java.util.List;


public class App {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>>ans=new ArrayList<>();
        pre(root,0,ans);
        return ans;
    }
    public static void pre(TreeNode root,int l,List<List<Integer>>ans)
    {
        if(root==null)
            return;
        if(ans.size()==l)
        {
            List<Integer>li=new ArrayList<>();
            li.add(root.val);
            ans.add(li);
        }
        else
            ans.get(l).add(root.val);
        pre(root.left,l+1,ans);
        pre(root.right,l+1,ans);
    } 

}
