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

## The Worst Type of Error

Syntax errors are your worst enemy. Initially, a simple syntax error, which could be a 
misspelled word, may not seem so bad; however, if not caught immediately it can thoroughly 
ruin anyone’s code. In a sense, one syntax error can initiate a snowball effect of other 
errors that may or may not have anything to do with the actual error that could break the code, such as a runtime error. These types of errors are also the trickiest to catch (among other errors) since they often go unnoticed to programmers. In order to increase the chances of catching these errors, one must understand the importance of coding standards, an essential part of programming. 

<p align="center">
  <img class="ui rounded image" width="300" src="../images/syntaxerrorsolution.png">
</p>

## So, What On Earth Are Coding Standards?

Simply put, coding standards are guidelines to how a programmer should construct their source
code. *Summed perfectly by David Mytton who wrote the article
“[Why You Need Coding Standards](https://www.sitepoint.com/coding-standards/),” he explains how a 
 coding standard “tells developers how they must write their code.”* Mytton further suggests how one should develop or declare their coding standards and provides examples 
to various coding standards seen in computer languages, such as Javascript. For instance, the 
coding standard implemented in my Information & Computer Science 314 course is [ESLint](https://eslint.org/docs/about/)
It finds various errors, such as our well-known enemy syntax errors, in real-time while the 
programmer is writing their source code in their Integrated Development Environment, or IDE. The IDE used in my class is IntelliJ, which is an editor that allows programmers to write various languages of code, including Javascript, HTML, and many more in the class.

### IntelliJent Enough for the Green Check?

<img class="ui left floated tiny rounded image" width="300" src="../images/greencheckmark.png">

To signify the correctness of the code, a green checkmark will appear, possibly in the right
corner, of their IDE. On the other hand, errors will definitely pop up if a red or yellow box 
appears in the corner of the editor. These colors signify that the source code is either not 
adhering to the coding standard, the language, or spelling errors could exist (e.g. “wrod” 
instead of “word”). Given this information, the green checkmark becomes a goal every 
programmer should aim for to prevent errors that could hinder the functioning of their code.   

Let’s get real here, getting the green checkmark to appear is both a blessing and a curse. 
Seeing nothing but red or yellow square can be agonizing. It’s always difficult to debug, or
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

Lesson being: we all should code in style.
