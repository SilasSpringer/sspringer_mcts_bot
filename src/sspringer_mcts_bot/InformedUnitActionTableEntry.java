/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sspringer_mcts_bot;

import java.util.List;
import rts.UnitAction;
import rts.units.Unit;

/**
 *
 * @author santi
 */
public class InformedUnitActionTableEntry {
    public Unit u;
    public int nactions = 0;
    public List<UnitAction> actions;
    public double[] prior_distribution;
    public double[] accum_evaluation;
    public int[] visit_count;
    
    
    public InformedUnitActionTableEntry(Unit a_u, List<UnitAction> a_actions, double []a_prior) 
    {
        u = a_u;
        actions = a_actions;
        nactions = actions.size();
        accum_evaluation = new double[nactions];
        visit_count = new int[nactions];
        for (int i = 0; i < nactions; i++) {
            accum_evaluation[i] = 0;
            visit_count[i] = 0;
        }
        prior_distribution = a_prior;
        assert(a_prior.length == nactions);
    }
}
