class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans = []
        while root:
            if root.right is None:
                ans.append(root.val)
                root = root.left
            else:
                next = root.right
                while next.left and next.left != root:
                    next = next.left
                if next.left != root:
                    ans.append(root.val)
                    next.left = root
                    root = root.right
                else:
                    next.left = None
                    root = root.left
        return ans[::-1]
