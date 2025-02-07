// Concrete Observer: Ghost
class Ghost implements Adversary {
    @Override
    public void update(Edibles edible) {
        // Handle update logic for Ghost
        System.out.println("Ghost updated by: " + edible);
    }
}
