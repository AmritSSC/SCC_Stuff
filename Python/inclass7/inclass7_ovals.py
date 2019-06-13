from graphics import *


def draw_ovals():

    win = GraphWin('Shapes', 400, 400)
    winarea = Rectangle(Point(0,0), Point(400,400))
    winarea.setFill('Black')
    winarea.draw(win)

    Center = Point(200, 200)
    
    circ1 = Circle(Point(200, 202), 175)
    circ1.setFill('white')
    circ1.setOutline('white')
    circ1.draw(win)
    
    circ1 = Circle(Center, 175)
    circ1.setFill('gray')
    circ1.setOutline('gray')
    circ1.draw(win)

    oval1 = Oval(Point(125, 220), Point(275, 250))
    oval1.setFill('Black')
    oval1.draw(win)

    oval2 = oval1.clone()
    oval2.move(0,-20)
    oval2.setFill('gray')
    oval2.setOutline('gray')
    oval2.draw(win)

    oval3 = oval1.clone()
    oval3.move(0,-30)
    oval3.draw(win)

    oval4 = oval2.clone()
    oval4.move(0,-30)
    oval4.draw(win)

    oval5 = oval3.clone()
    oval5.move(0,-30)
    oval5.draw(win)

    
def main():

    draw_ovals()
   
main()
