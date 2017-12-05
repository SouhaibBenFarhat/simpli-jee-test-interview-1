package fr.simplifia.output.impl;

import fr.simplifia.output.SmpOutputWriter;

import java.io.PrintStream;

public class SmpOutputWriterImpl implements SmpOutputWriter {

    private PrintStream stream;

    public SmpOutputWriterImpl(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void print(final String input) {
        stream.println(input);
    }
}
