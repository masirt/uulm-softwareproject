package NetworkStandard.DataTypes.Gadgets;

import NetworkStandard.DataTypes.GadgetEnum;
/**
 * @author Marios Sirtmatsis
 */
public class Grapple extends Gadget {
    private int grappleRange;
    private double grappleProbability;

    public Grapple(GadgetEnum gadget) {
        super(gadget);
    }

    public int getGrappleRange() {
        return grappleRange;
    }

    public double getGrappleProbability() {
        return grappleProbability;
    }

    public void setGrappleRange(int grappleRange) {
        this.grappleRange = grappleRange;
    }

    public void setGrappleProbability(double grappleProbability) {
        this.grappleProbability = grappleProbability;
    }
}
