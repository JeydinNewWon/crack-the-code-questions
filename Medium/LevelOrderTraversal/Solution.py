from collections import deque
from typing import Optional


class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []
        q = deque()
        if root:
            q.append(root)

        while len(q) > 0:
            level = []

            for i in range(len(q)):
                n = q.popleft()
                level.append(n.val)
                if n.left:
                    q.append(n.left)
                if n.right:
                    q.append(n.right)

            result.append(level)

        return result
