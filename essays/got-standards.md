---
layout: essay
type: essay
title: Got Standards?
date: 2017-09-21
labels:
  - Coding Standards
  - ESLint
  - IntelliJ
---

## Which Error is Your Kryptonite?

Syntax errors are your worst enemy. It is most definitely your kryptonite. Indeed, a tiny spelling error can cause mayhem in any coder's life. Now, you may be thinking "what's a syntax error?" To put it simply, it's an error the compiler deems grammatically incorrect in the specific language one is coding in. And yes, misspelled words count as a grammatical error, a very big one at that. It may not seem that bad at first, what can a small misspelled word do to my program? Oh everything, it can do everything. One syntax error can initiate a snowball effect of errors that may or may not have anything to do with the actual problem.
 
 <p align="center">
   <img class="ui rounded image" width="300" src="../images/syntaxerrorsolution.png">
 </p>
 
 For instance, a simple grammatical error could mask the bigger problem of a runtime error, which are the trickiest to catch (among other errors). These often go unnoticed to programmers and could potentially cause mayhem to a coder's life. Avoiding these types of errors may be possible if one understands the importance of **coding standards**, an essential part of programming. 

## So, What On Earth Are Coding Standards?

Simply put, coding standards are guidelines to how a programmer should construct their source
code. *Summed perfectly by David Mytton who wrote the article
“[Why You Need Coding Standards](https://www.sitepoint.com/coding-standards/),” he explains how a 
 coding standard “tells developers how they must write their code.”* Mytton further suggests how one should develop or declare their coding standards and provides examples 
to various coding standards seen in various computer languages, such as Javascript. For instance, the 
coding standard implemented in my Information & Computer Science 314 course, Software Engineering, is [ESLint](https://eslint.org/docs/about/).
The job of ESLint is simple: it finds errors, like our good friend syntax errors, in real-time while the 
programmer is writing their source code in an Integrated Development Environment, or IDE. To note, the IDE used in my class is IntelliJ. This particular IDE is very powerful and versatile as programmers can write in various languages within it, inccluding Javascript, HTML, and many more. A very useful tool for writing source code for a web application for instance. 

### IntelliJent Enough to Earn the Green Check?

<img class="ui left floated tiny rounded image" width="300" src="../images/greencheckmark.png">

In IntelliJ, a green check mark may appear in the right hand corner to signify the correctness of your source code. That is, if there are no syntax errors or other errors that may hinder your progress. The real errors on the other hand will definitely pop up if a red or yellow box appears in the corner of the editor. These are bad colors, very bad colors. If something red or yellow (mainly red) appears on your code, then you may be doing something *very* wrong. These colors mean that your source code either does not follow the set coding standard, the language, or a spelling error could exist (e.g. “wrod” 
instead of “word”). With that said, the green check mark is a **goal** every programmer should aim for so that one's code will function.    

But let’s get real here, that green check mark is both a *blessing* and a **_curse_**. Seeing nothing but red or yellow square can be agonizing. It’s always difficult to debug, or
searching and fixing errors, one’s code whether it’s a syntax error or some other type of 
error and could take hours trying to figure out what was wrong with the code. Of course, it 
will be **_incredibly_** frustrating to discover that the whole reason your code isn’t 
executing correctly, after days of searching, is because of *one* syntax error. It’s 
possible you might result to breaking your computer after staring at that code for days and 
hoping it would tell you what was wrong with it, but that doesn’t get anyone anywhere. I 
speak from experience, it’s a really rough and long 48 hours. Yet, one will experience 
extreme relief and gratitude when there are no errors present in the code. 

<img class="ui right floated medium rounded image" height="300" src="../images/comic.jpg">

Even though this coding standard allows one to see errors in real-time, I believe it does not
give programmers the chance to learn important skills. One of these essential tools is tracing. In sum, tracing is going through the source code line by line and imitating what the compiler would do to the code. By imitating the compiler, a programmer can see what is potentially going on in their source code, including errors. Past experience has taught me that tracing is one of **_the most important_** skills one could ever learn in their programming career. Having
used both C/C++ on a Unix machine and Java on an [Eclipse](https://eclipse.org/ide/)
IDE allowed me to see that real-time error checking doesn’t allow for much learning. Yes,
programmers can fix their source code quickly and easily when error checking is in real-time,
however, it comes with a risk of not understanding **WHY** the code is wrong. Understanding *how*
the program functions step by step allows the people to become better programmers in the long 
run. The problem I see with real-time error checking is not being able to trace through code
effectively by problem solving to see where the problem lies in their code. For instance, 
using a compiler and linker separately (whether one is given a choice or not) forces programmers 
to thoroughly understand their code because multiple errors could stem from one syntax error. What happens in this case is always the same: programmers will try to fix the "error" in the wrong place, especially when they don't know what is going on in their code.   

## Coding Standards are the New Style

With this discussion about coding standards in mind, I ultimately believe having coding 
standards in place is important in terms of **style**. For one, having coding standards makes source code look cleaner and more user-friendly for others to view and edit that piece of code 
(if it is a part of a collaboration project). I’m sure most people have encountered source 
code that is difficult to read and hurts the eyes (maybe even blinding people) because of 
how messy it is. A potential reason for messy and unreadable code could come from not 
implementing or adhering to a specific coding standard. And as we all know, unreadable code 
means difficulty in understanding what the code actually does. In short, without coding 
standards, code can get really messy and complicated fast!

Although I understand some coding standards improve the appearance of the source code than others, it is entirely up to one’s perception on coding standards and the coding world. Perhaps 
varying coding standards between languages *does* improve the quality, readability, and 
appearance of the source code. Or perhaps using a preferred way to, in essence, style one’s code so that it fits their standards ()after experiencing other coding standards) is the best way to go. Ultimately, it is good to enforce coding standards for beginners so that they become 
accustomed to how code should be styled in a particular language. However, everyone 
eventually develops their own standard for coding they are comfortable with in order to make their code readable and understandable to others. 

**Lesson learned: we should all code in style.**
