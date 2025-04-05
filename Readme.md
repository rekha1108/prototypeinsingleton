# Inject prototype bean in a singleton bean:

If I have a singleton bean that needs to use a prototype bean, I can’t just inject it directly because Spring will only create one instance of the prototype — at the time the singleton is created.

So, to get a new instance every time, I can use one of two ways:

1. @Lookup annotation – I define a method that Spring will override behind the scenes to return a new instance of the prototype bean each time I call it.

2. ObjectProvider<Bean> – This lets me request a new instance when I actually need it, using objectProvider.getObject(). It’s flexible and easier to test too.

## I usually prefer ObjectProvider, because:

* It works well with constructor injection

* It’s easier to write tests for

* It gives me more control.