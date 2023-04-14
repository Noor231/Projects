from turtle import *
speed(10)
pensize(1)
color('cyan','red')
bgcolor("black")
begin_fill()
while True:
    forward(200)
    left(170)
    if abs(pos()) < 1:
        break
end_fill()
done()