package com.scanning;

import com.scanning.Sequence;

public interface SequenceDao {
    public int getNextValue(String id);
    public Sequence getSequence(String id);
}
