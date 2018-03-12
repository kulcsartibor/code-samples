package com.kdev.formula;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/23/2018
 * @since
 */
public class Formula
{

    private List<FormulaChunk> chunks = new ArrayList<>();

    public Formula(String formula)
    {
        Pattern pattern = Pattern.compile("\\$\\{([A-Z_]+):?(\\d+)?\\}");

        int prevEnd = 0;

        Matcher matcher = pattern.matcher(formula);
        while (matcher.find( )) {
            if(matcher.start() > prevEnd){
                chunks.add(new StringChunk(formula.substring(prevEnd, matcher.start())));
            }
            chunks.add(new TokenChunk(FormatToken.valueOf(matcher.group(1)), Integer.parseInt(matcher.group(2))));

            prevEnd = matcher.end();
        }

        if(prevEnd < formula.length()){
            chunks.add(new StringChunk(formula.substring(prevEnd)));
        }
    }

    public String substitute(ReferenceNumberContext context)
    {
        StringBuilder builder = new StringBuilder();
        chunks.forEach(c -> builder.append(c.getValue(context)));
        return builder.toString();
    }

    private abstract class FormulaChunk
    {
        public abstract String getValue(ReferenceNumberContext context);
    }

    private class StringChunk extends FormulaChunk
    {
        private final String value;

        public StringChunk(String value)
        {
            this.value = value;
        }

        @Override
        public String getValue(ReferenceNumberContext context)
        {
            return value;
        }
    }

    private class TokenChunk extends FormulaChunk
    {
        private final FormatToken token;
        private final Integer length;

        public TokenChunk(FormatToken token, Integer length)
        {
            this.token = token;
            this.length = length;
        }

        @Override
        public String getValue(ReferenceNumberContext context)
        {
            return token.substitute.apply(context, this.length);
        }
    }
}
