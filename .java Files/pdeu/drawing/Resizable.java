package pdeu.drawing;

import java.util.Objects;
// Create an interface Resizeable
interface Resizeable {
    void resize(int factor);
}

// Square and Circle implement the Resizeable interface
class ResizableSquare extends Square implements Resizeable {
    public ResizableSquare(String color, String pattern, double side) {
        super(color, pattern, side);
    }

    @Override
    public void resize(int factor) {
        this.side *= factor;
    }
}

class ResizableCircle extends Circle implements Resizeable {
    public ResizableCircle(String color, String pattern, double radius) {
        super(color, pattern, radius);
    }

    @Override
    public void resize(int factor) {
        this.radius *= factor;
    }
}
