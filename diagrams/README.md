## Diagrams
|  |  | 
| :---: | :---: |
| **Class** | **Use Case** |
| ![](/diagrams/20231031/class.png) [Class Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/class.png) | ![](/diagrams/20231031/usecase.png) [Use Case Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/usecase.png) |
| **State** | **Sequence** |
| ![](/diagrams/20231031/state_auth.png) [Authentication State Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/state_auth.png) ![](/diagrams/20231031/state_post.png) [Post State Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/state_post.png) ![](/diagrams/20231031/state_postcreateview.png) [Page Creation/Viewing State Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/state_postcreateview.png) | ![](/diagrams/20231031/sequence_user.png) [User Sequence Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/sequence_user.png) ![](/diagrams/20231031/sequence_post.png) [Post Sequence Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/sequence_post.png) ![](/diagrams/20231031/sequence_comment.png) [Comment Sequence Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/sequence_comment.png) |

### Diagram Descriptions
**Class**<br/>
Opted for the minimum classes (Post, User, and Comment) as well as a Page object that interacts with Posts and Users. In phase 1's scope, the Page object is responsible for managing the display of post and user information/status. In phase 2, there were additions to the Page, Post, and User classes to handle upvoting, downvoting, karma, and sorting, as well as a new class called KarmaPostSet that deals with limiting each user to upvoting or downvoting a post only once.
<br/>
<br/>
**Use Case**<br/>
Shows how users, new and existing, interact with the database and authentication service to create and manage accounts, as well as create, edit, and search posts and comments. As of phase 2, the diagram displays the interactions between the users and upvoting/downvoting posts and comments. When viewing posts or comments, users will also be able to sort by date created or amount of karma.
<br/>
<br/>
**State**<br/>
The state diagram was split into three sub-diagrams to illustrate different operations local to each big-picture operation. For example, there is a simple authentication sub-diagrams to illustrate the user authentication status logic. There is also a "Page Creation/Viewing" sub-diagrams to illustrate the flow of searching for and creating/deleting posts (such as on the homepage or subreddit page) and sorting posts or comments by date created or amount of karma. Lastly, there is a sub-diagram for post page operations for leaving comments, editing, or upvoting/downvoting posts and comments (being on the actual reddit post).
<br/>
<br/>
**Sequence**<br/>
The sequence diagram was split into three sub-diagrams to describe how classes would interact when the user, comments, posts, upvotes or downvotes, and logs in/interacts with the home page. It describes, step by step, the actions that the user takes and how they go down class-by-class to create a chain-reaction that displays posts, comments, updated karma, and the home page to the user. For example, when the user comments, it first determines whether it is a regular comment or reply. Then, a comment is instantiated with the desired text and is added into the comments list in the post(its in the class). Then, the post, along with its updated comment section, is displayed on the post page. When users upvote or downvote a post, the amount of karma will be updated for that post and be displayed for the user to view.
<br/>
<br/>
