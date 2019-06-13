from graphics import *


def draw_cross():

    win = GraphWin('Shapes', 400, 400)
    Center = Point(150, 150)
    circ = Circle (Center, 100)
    circ.setFill('green')
    circ.setOutline('green')
    circ.draw(win)

    rect1 = Rectangle(Point(148, 100), Point(152, 200))
    rect1.setFill('white')
    rect1.setOutline('white')
    rect1.draw(win)
    rect2 = Rectangle(Point(100, 148), Point(200, 152))
    rect2.setFill('white')
    rect2.setOutline('white')
    rect2.draw(win)

    circ2 = Circle(Point(150, 100), 2)
    circ2.setFill('white')
    circ2.setOutline('white')
    circ2.draw(win)

    circ3 = circ2.clone()
    circ3.move(-50,50)
    circ3.draw(win)
    
    circ4 = circ2.clone()
    circ4.move(50,50)
    circ4.draw(win)

    circ5 = circ2.clone()
    circ5.move(0,100)
    circ5.draw(win)


def main():

    draw_cross()
   







main()
