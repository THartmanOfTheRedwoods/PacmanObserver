// Concrete Observer: WitchDoctor
class WitchDoctor implements Adversary {
    @Override
    public void update(Edibles edible) {
        // Handle update logic for WitchDoctor
        System.out.println("WitchDoctor updated by: " + edible);
    }
}

