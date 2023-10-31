## Diagrams
|  |  | 
| :---: | :---: |
| **Class** | **Use Case** |
| ![](/diagrams/20231031/class.png) [Class Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/class.png) | ![](/diagrams/20231031/usecase.png) [Use Case Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/usecase.png) |
| **State** | **Sequence** |
| ![](/diagrams/20231031/state.png) [State Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231031/state.png) | ![](/diagrams/20231031/sequence.png) [Sequence Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/20231031/sequence.png) | |

### Diagram Descriptions
**Class**<br/>
Opted for the minimum classes (Post, User, and Comment) as well as a Page object that interacts with Posts and Users. In phase 1's scope, the Page object is responsible for managing the display of post and user information/status.
<br/>
<br/>
**Use Case**<br/>
Shows how users, new and existing, interact with the database and authentication service to create and manage accounts, as well as create, edit, and search posts and comments.
<br/>
<br/>
**State**<br/>
The state diagram was split into three sub-diagrams to illustrate different operations local to each big-picture operation. For example, there is a simple authentication sub-diagrams to illustrate the user authentication status logic. There is also a "Page Creation/Viewing" sub-diagrams to illustrate the flow of searching for and creating/deleting posts (such as on the homepage or subreddit page). Lastly, there is a sub-diagram for post page operations for leaving comments or editing posts (being on the actual reddit post).
<br/>
<br/>
**Sequence**<br/>
The sequence diagram was split into three sub-diagrams to describe how classes would interact when the user comments, posts, and logs in/interacts with the home page. It describes, step by step, the actions that the user takes and how they go down class-by-class to create a chain-reaction that displays posts, comments, and the home page to the user. For example, when the user comments, it first determines whether it is a regular comment or reply. Then, a comment is instantiated with the desired text and is added into the comments list in the post(its in the class). Then, the post, along with its updated comment section, is displayed on the post page. 
<br/>
<br/>
