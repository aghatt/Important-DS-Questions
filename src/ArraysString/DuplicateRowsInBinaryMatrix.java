/*

Problem: Find duplicate rows in a binary matrix
Given a binary matrix A of integers 0 and 1, of size N x M.
Find and return the indices of the rows which are duplicate of rows which are already present in the matrix.
If row[i] and row[j] are same and i < j then answer will contain only index j.
Note: Rows are numbered from top to bottom and columns are numbered from left to right. There will be at least one duplicate row in the matrix.
Input Format
The first argument given is the integer matrix A.
Output Format
Return the indices of the rows in the form of an integer array.
Constraints

2 <= N, M <= 1000
0 <= A[i] <= 1
For Example
Input 1:
    A = [   [1, 0, 0]
            [0, 1, 0]
            [0, 1, 0]   ]
Output 1:
    [3]

Input 2:
    A = [   [1, 1, 1, 0]
            [0, 0, 0, 1]
            [1, 1, 1, 0]
            [0, 0, 0, 1]    ]
Output 2:
    [3, 4]


Solution: We can store the rows as string in a map. And then check if current
(row converted into string) exists in map, if yes then put row number in answer.
Else, You can use Trie data structure as well.
Insert as string in Trie and search iteratively..
 */


package ArraysString;

public class DuplicateRowsInBinaryMatrix {
}


/*

//struct the Trie
struct Trie
{
            bool leaf;
            Trie* children[2];
            };

            //function to get Trienode
            Trie* getNewTrieNode()
            {
            Trie* node = new Trie;
            node->children[0] = node->children[1] = NULL;
            node->leaf = false;
            return node;
            }

            // function to insert a row in Trie
            bool insert(Trie*& head, vector<int> arr, int N)
            {
            Trie* curr = head;

            for (int i = 0; i < N; i++)
            {
            //creating a new path if it don not exist
            if (curr->children[arr[i]] == NULL)
            curr->children[arr[i]] = getNewTrieNode();

            curr = curr->children[arr[i]];
            }

            //if the row already exist return false
            if (curr->leaf)
            return false;

            //making leaf node tree and return true
            return (curr->leaf = true);
            }
            void mydelete(Trie * head)
            {
            if(head->children[0]!=NULL)
            {
            mydelete(head->children[0]);
            }
            if(head->children[1]!=NULL)
            {
            mydelete(head->children[1]);
            }
            delete(head);
            }
            vector<int> Solution::solve(vector<vector<int> > &mat)
            {

            vector<int> ans;

            int M = mat.size();

            int N = mat[0].size();

            Trie* head = getNewTrieNode();

            //inserting into Trie and checking for dulpicates
            for (int i = 0; i < M; i++)

            {// If already exists
            if (!insert(head, mat[i], N))
            {
            ans.push_back(i+1);
            }
            }
            mydelete(head);

            return ans;
            }
 */