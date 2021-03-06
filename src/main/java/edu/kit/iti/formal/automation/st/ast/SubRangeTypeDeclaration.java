package edu.kit.iti.formal.automation.st.ast;

/*-
 * #%L
 * iec61131lang
 * %%
 * Copyright (C) 2016 Alexander Weigl
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import edu.kit.iti.formal.automation.scope.GlobalScope;
import edu.kit.iti.formal.automation.datatypes.RangeType;
import edu.kit.iti.formal.automation.datatypes.values.ScalarValue;
import edu.kit.iti.formal.automation.visitors.Visitor;
import edu.kit.iti.formal.automation.datatypes.AnyInt;

/**
 * Created by weigl on 13.06.14.
 *
 * @author weigl
 * @version $Id: $Id
 */
public class SubRangeTypeDeclaration extends TypeDeclaration<ScalarValue<? extends AnyInt, Long>> {
    private Range range;

    /**
     * <p>Getter for the field <code>range</code>.</p>
     *
     * @return a {@link edu.kit.iti.formal.automation.st.ast.Range} object.
     */
    public Range getRange() {
        return range;
    }

    /**
     * <p>Setter for the field <code>range</code>.</p>
     *
     * @param range a {@link edu.kit.iti.formal.automation.st.ast.Range} object.
     */
    public void setRange(Range range) {
        this.range = range;
    }

    /** {@inheritDoc} */
    @Override
    public RangeType getDataType(GlobalScope globalScope) {
        RangeType rt = new RangeType(
                (long) range.getStart().getValue(),
                (long) range.getStop().getValue(),
                (AnyInt) super.getDataType(globalScope));
        setBaseType(rt);
        return rt;
    }

    /** {@inheritDoc} */
    @Override
    public <T> T visit(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
