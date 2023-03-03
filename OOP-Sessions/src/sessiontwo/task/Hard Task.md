Any GUI (graphical user interface) framework tool has a system hierarchy called `Widget`, in cases of Swing framework it was named `JComponent`, in cases of JavaFx it was named `Controller` after the fact that you have `Scenes` and `Listenables`, anyway, recall that we want to build our micro system for managing GUI datas :

Any `Widget` has the following features :
- Widget Size.
- Widget background color.
- Widget listener (that records user clicks).

Any `Window` has the following extra features :
- Window Title.
- Window Bar buttons.
- Window listeners (that records user clicks on bar buttons).

A window should `extends` a `Widget`.


Any `Button` has the following features :
- Button text.
- Button listener (that records user clicks).

A button should `extends` a `Widget`.

Task : Build a `Widget` hierarchy that consists of the base class `Widget` and the children `Window` and `Button`, owing that the user would have the accessbility to set and control the widget size, color and listeners.
