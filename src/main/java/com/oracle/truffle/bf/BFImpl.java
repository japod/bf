package com.oracle.truffle.bf;

import com.oracle.truffle.bf.BFParser.Operation;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author chumer
 */
public abstract class BFImpl {

    public abstract void prepare(Operation[] operations, InputStream in, OutputStream out);

    public abstract void run() throws IOException;

}
