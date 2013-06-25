package org.primefaces.util.expression.impl;

import javax.faces.component.UIComponent;

import org.primefaces.util.expression.SearchExpressionResolver;

/**
 * {@link SearchExpressionResolver} for the "@parent" keyword.
 */
public class ParentExpressionResolver implements SearchExpressionResolver {

	public UIComponent resolve(UIComponent source, UIComponent last, String expression) {
		return last.getParent();
	}
}
