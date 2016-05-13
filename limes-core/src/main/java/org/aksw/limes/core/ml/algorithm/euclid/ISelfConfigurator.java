/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aksw.limes.core.ml.algorithm.euclid;

import org.aksw.limes.core.io.cache.Cache;
import org.aksw.limes.core.io.mapping.Mapping;
import org.aksw.limes.core.measures.measure.Measure;

/**
 *
 * @author ngonga
 */
public interface ISelfConfigurator {
    public void computeMeasure(Cache source, Cache target, String parameters[]);
    public String getMeasure();
    public String getThreshold();
    public Mapping getResults();    
    public void setMeasure(Measure measure);

}