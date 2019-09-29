package com.kv.algorithm.day16;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;

import java.util.List;

public class TreeNodeN {

    private int key;
    private List<TreeNodeN> childs;

    public TreeNodeN(int key) {
        this.key = key;
    }


    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public List<TreeNodeN> getChilds() {
        return childs;
    }

    public void setChilds(List<TreeNodeN> childs) {
        this.childs = childs;
    }

    @Override
    public String toString() {
        return new Yaml(new Representer() {
            @Override
            protected NodeTuple representJavaBeanProperty(Object javaBean, Property property, Object propertyValue, Tag customTag) {
                // if value of property is null, ignore it.
                if (propertyValue == null) {
                    return null;
                } else {
                    return super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
                }
            }
        }).dump(this);
    }
}
