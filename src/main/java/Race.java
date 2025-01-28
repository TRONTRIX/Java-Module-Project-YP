class Race {
    String leadRace = "";
    int leadDistance = 0;
    int draw = 0;
    public void makeRace(Car newCar) {
        int time = 24;
        int distance = time * newCar.speed;
        if (distance > this.leadDistance) {
            this.leadRace = newCar.brand;
            this.leadDistance = distance;
        }

        if (distance == this.leadDistance) {
            this.draw = -1;
        }

    }
}