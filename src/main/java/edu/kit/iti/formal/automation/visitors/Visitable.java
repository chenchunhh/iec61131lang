package edu.kit.iti.formal.automation.visitors;

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

/**
 * <p>Visitable interface.</p>
 *
 * @author weigla (24.06.2014)
 * @version 1
 */
public interface Visitable {
    /**
     * <p>visit.</p>
     *
     * @param visitor a {@link edu.kit.iti.formal.automation.visitors.Visitor} object.
     * @param <T> a T object.
     * @return a T object.
     */
    public <T> T visit(Visitor<T> visitor);
}
