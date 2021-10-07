People Counter
Hinge Engineering Homework Assignment

===================================================================================

For this project I decided to use an MVP architecture. I chose MVP over other potential
options for several reasons. Firstly because it allows for much easier unit testing than
something like MCP. Secondly for its modularity and and ability to more easliy
add new features in the future. Lastly for the relatively simple and easy set up. I deviated from a strict
adherence to this architecture in at least one major way when trying to keep the data persistent I
used a ViewModel and its corresponding factory. In trying to resolve the issue of keeping the app
state persistent I found a template from android that had the viewModelProvider so I used
that, I don't fully understand how they work but im definitely eager to learn more. To keep the data persistent
though app usages I used sharedPreferences instead of a database for the simple reason that i felt
the app in its current state didn't warrant such an involved set up as a database because it had so
little to store locally.
In general I really enjoyed this project. I haven't had much experience talking about and dealing with architecture
in such explict ways. I have certainly used them and understand them but rarely in this way. I've learned a ton just
this week and really look forward to expanding and crystalizing my understanding of android development.

===================================================================================