/**
 * Created with IntelliJ IDEA.
 * User: daldosso
 * Date: 15/06/13
 * Time: 11.15
 * To change this template use File | Settings | File Templates.
 */

package com.objectmentor.utilities.args;

import java.util.*;

public class Args {

    private Map<Character, ArgumentMarshaler> marshalers;
    private Set<Character> argsFound;
    private ListIterator<String> currentArgument;

    public Args( String schema, String[] args) throws ArgsException {
        marshalers = new HashMap <Character, ArgumentMarshaler >();
        argsFound = new HashSet<Character >();
        parseSchema(schema);
        parseArgumentStrings(Arrays.asList(args));
    }

}