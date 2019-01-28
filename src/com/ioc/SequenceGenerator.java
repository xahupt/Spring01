package com.ioc;

import java.util.*;

public class SequenceGenerator {
    private String prefix;
    private String suffix;
    private int inital;

    private List<Object> lists;
    private Object[] arrs;
    private Set<Object> sets;
    private Map<Object, Object> maps;
    private Properties properties;

    public SequenceGenerator() {
    }

    public SequenceGenerator(String prefix, String suffix, int inital) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.inital = inital;

    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getInital() {
        return inital;
    }

    public void setInital(int inital) {
        this.inital = inital;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Object[] getArrs() {
        return arrs;
    }

    public void setArrs(Object[] arrs) {
        this.arrs = arrs;
    }

    public Set<Object> getSets() {
        return sets;
    }

    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }

    public Map<Object, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<Object, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "SequenceGenerator{" +
                "prefix='" + prefix + '\'' +
                ", suffix='" + suffix + '\'' +
                ", inital=" + inital +
                ", lists=" + lists +
                ", arrs=" + Arrays.toString(arrs) +
                ", sets=" + sets +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }
}
