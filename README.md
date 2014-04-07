ProxyAndObserverExample
=======================

Project 3 advanced OOP.

************************
ProxyAndObserverExample
=======================

Project 3 advanced OOP.

Architecture


BlogPost implements the Proxy Pattern
The blog post is created with an id, but none of the content of the blog is loaded (from the mock dao)
until a peice of the information is requested. The point of this is to not do the expensive task of getting
the images for the blog post that are presumably in a database

The BlogPostContainer and the driver (the client) implements the observer pattern.

The container is really just a list of posts. When the posts are loaded (the proxy loads the concrete blog post)
the observer (BlogPostObserver objects) will be updated and will print to the terminal information from the posts;

The posts will print twice because when you use update the posts both observers in the driver will print

The Observer could have observed blogpost objects but we wanted to keep the two patterns separated from eachother
in our example
