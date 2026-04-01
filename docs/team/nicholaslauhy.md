# Nicholas Lau Hongyi - Project Portfolio Page

## Overview

---
We created FinTrackPro, a CLI-based individual BTO budget planner for university students planning to 
apply for BTO. 

It turns messy finances into a clear downpayment plan - showing how much the individual 
needs to save and whether additional financing is required.

## Summary of Contributions

---
### Code Contributed for tP: [link](https://nus-cs2113-ay2526-s2.github.io/tp-dashboard/?search=&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2026-02-20T00%3A00%3A00&filteredFileName=)

---
### Enhancements implemented: <br>
I created the initial OOP structure which consisted of the following classes:
- FinTrackPro: the main class which contains the main method and runs the program
- UI: handles all interactions with the user, such as displaying messages and receiving input
- InputUtil: handles all user input and parsing of commands
whereby the InputUtil class, was placed in the ui package.

Next, I added the `save` command into the CommandHandler to simulate adding expenditures month by month, and used MonthlyArchive 
and ArchivedExpense to implement the functionality of saving the current month of expenditures.

---
### Contributions to the UG: <br>
I created the initial User Guide which included all the commands that were in our User Guide draft. After which,
I edited it to fit what we actually implemented in v1.0. I updated it again to include the additional functions that I had
implemented in v2.0, which was the save command. 

**Contributions to the DG:** <br>
I neatened the format of the DG so that it was clearly broken down into sections, and ensured consistency in the naming
and formatting of each section.

I created the Architecture Diagram which showcased how each of the classes were integrated with each other, and added the
documentation for the Architecture Diagram.

I also included the class and sequence diagram, along with their documentation for the save command,
which was implemented in v2.0.

---
### Contributions to team-based tasks: <br>
I tried to initiate weekly discussions with my groupmates to ensure that we were always on task, drafting meeting minutes
and ensuring that everyone was on the same page and agreeable to the workload distribution.

I was one of the people in the group in charge of updating the User Guide Excel Sheet, with all the functions that we 
had initially planned to do.

Additionally, I reviewed the User Guide draft and compared it with our implemented v1.0 to ensure that we were staying on-track,
ensuring that v1.0 achieved minimum viable product status, in which we had to cut down on multiple functions.

I was also responsible for maintaining the GitHub Issues, ensuring that all PRs were tagged with the correct
milestone, and ensuring that all issues were relevant and tagged appropriately.

Lastly, I assisted with the splitting of tasks to ensure even contribution within the group, and ensured that everyone knew the
deadlines for each of the tasks that we were required to do.
---
### Review/mentoring contributions: <br>
As the first person to start on the tP, I had to figure out how to pass Gradle checks and how the system works. I
then relayed the information I learnt to the team to ensure that we could pass Gradle checks and pushing PRs would be less tedious.

PRs reviewed:
- [PR #149](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/149)
- [PR #139](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/139)
- [PR #138](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/138)
- [PR #135](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/135)
- [PR #134](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/134)
- [PR #128](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/128)
- [PR #122](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/122)
- [PR #115](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/115)
- [PR #112](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/112)
- [PR #76](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/76)
- [PR #75](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/75)
- [PR #66](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/66)
- [PR #57](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/57)
- [PR #56](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/56)
- [PR #44](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/44)
- [PR #43](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/43)
- [PR #42](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/42)
- [PR #16](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/16)
- [PR #9](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/9)
- [PR #2](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/2)
- [PR #1](https://github.com/AY2526S2-CS2113-T14-2/tp/pull/1)

**Contributions beyond the project team:** NIL