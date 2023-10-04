# CS151 Project Team - Git Commit Die
For the Professor Shukla's FA23 CS151 project.<br/>
<br/>

## Diagrams
|  |  | 
| :---: | :---: |
| **Class** | **Use Case** |
| ![](/diagrams/20231003/class.png) [Class Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231003/class.png) | ![](/diagrams/20231003/usecase.png) [Use Case Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231003/usecase.png) |
| **State** | **Sequence** |
| ![](/diagrams/20231003/state.png) [State Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/diagrams/20231003/state.png) | ![](/diagrams/20231003/sequence.png) [Sequence Diagram Link](https://github.com/vsawce/CS151-GitCommitDie/blob/main/20231003/sequence.png) | |

### Diagram Descriptions
**Class**<br/>
Opted for the minimum classes (Post, User, and Comment) as well as a Page object that interacts with Posts and Users. In phase 1's scope, the Page object is responsible for managing the display of post and user information/status.
<br/>
<br/>
**Use Case**<br/>
Shows how users, new and existing, interact with the database and authentication service regarding accounts, posts, and comments. New users are limited to creating accounts and browsing posts and comments, while existing users will be able to manage their accounts as well as create or edit their posts and comments in addition to browsing.
<br/>
<br/>
**State**<br/>
The state diagram was split into three sub-diagrams to illustrate different operations local to each big-picture operation. For example, there is a simple authentication sub-diagrams to illustrate the user authentication status logic. There is also a "Page Creation/Viewing" sub-diagrams to illustrate the flow of searching for and creating/deleting posts (such as on the homepage or subreddit page). Lastly, there is a sub-diagram for post page operations for leaving comments or editing posts (being on the actual reddit post).
<br/>
<br/>
**Sequence**<br/>
description here
<br/>
<br/>

## Dependencies
TODO<br/>
<br/>

## Environment Setup
<br/>

## Project Team
_Vincent Saw_<br/>
_Victoria Le_<br/>
_Acyuta Raman_<br/>
<br/>

## Links
