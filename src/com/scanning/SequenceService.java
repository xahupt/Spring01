package com.scanning;

import com.scanning.Sequence;
import com.scanning.SequenceDao;

public class SequenceService {

    SequenceDao sequenceDaoImpl;

    public String generate(String id) {
        Sequence sequence = sequenceDaoImpl.getSequence(id);
        int value = sequenceDaoImpl.getNextValue(id);
        return sequence.getPrefix() + "::" + value + "::" + sequence.getSuffix();
    }

    public void setSequenceDao(SequenceDao sequenceDao) {
        sequenceDaoImpl = sequenceDao;
    }

}
