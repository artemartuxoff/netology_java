class SmartRobot extends Robot {
    private int steps;

    @Override
    public void moveRight() {
        super.moveRight();
        steps++;
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        steps++;
    }

    @Override
    public void moveUp() {
        super.moveUp();
        steps++;
    }

    @Override
    public void moveDown() {
        super.moveDown();
        steps++;
    }

    public int getStepsCount() {
        return steps; // ваш код
    }
}