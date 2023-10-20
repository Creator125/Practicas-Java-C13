package addlistdelete;

import java.io.*;

public class MyObjectOutStream extends ObjectOutputStream{
    public MyObjectOutStream() throws IOException{
        super();
    }

    public MyObjectOutStream(OutputStream out) throws IOException {
        super(out);
    }
}
