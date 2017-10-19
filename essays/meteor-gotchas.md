---
layout: essay
type: essay
title: "Meteor Gotchas"
date: 2017-10-19
labels:
  - Software Engineering
  - Meteor
---

 Meteor is tough. Or can be tough. Why does Meteor seem tough to most people? The answer is not that simple. There's a variety of reasons why many people would find Meteor tough to use. 
 
 For instance, when content on your application, say the digits application, doesn't show up at all ont the client's side. Meteor has refreshed its server and everything seems fine on their end. Yet, the text, tables or images aren't appearing on your app at al. It's just blank, save for maybe a menu bar. This is a very common problem many encounter, including myself. Usually, there's a simple fix to this unbearable problem. 
 
 One being forgetting to import files in the index.js file of the current directory, especially on the client and server directories. It's so easy to not check the index.js file and remembering to put the path to your file in there so that everything shows up. This is why I always check my index.js in all of the directories I'm working on to see if I imported the files. It's a crucial yet forgettable step to do in the process. Going off on that, the files being imported need to be imported <em>correctly</em>. It's also very easy to mispell a word or forget a backslash in your path. I've also experienced this when I'm checking if I correctly "linked" my paths to the client/server. To be honest, once you figured out the cause of this problem and fix it, you'll want to both pat yourself on the back because you've fixed your app and hit yourself on the head for not realizing sooner/forgetting the little details! With that being said, remember to import (it's literally the key to everything)!
 
 Another problem I've experienced is when the application is just a blank page. It's a very strange and rare phenonmenon that doesn't seem to be fixable at first. Everything looks good on the coding side but your application is just blank. All white and nothing else on the page. In this situation, I've tried restarting my project but it usually doesn't help very much. 
 
 
 
     
 