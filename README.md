Welcome! This repository contains code that helps reflect on software design questions. I will keep adding to it from time to time, depending on inspiration and on your questions.

Here's the first one:

# 1. When do you use single-use objects and when do you use multi-use objects? Why?

A single-use object is an object you create by passing all parameters to the constructor and then execute something on those parameters. The object cannot be used with other values; to do the same operation with other values you have to create a new instance.

A multi-use object is an object you create by passing only common parameters to the constructor (eg. parse settings) and pass the input parameters to the processing method. This object can be reused because you can pass different input parameters to the processing method.

See the classes SingleUseParser and MultiUseParser for a very simple illustration of the difference.
