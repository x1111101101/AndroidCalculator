package io.github.x1111101101.simplecalc.data.model.expression.function

import io.github.x1111101101.simplecalc.data.model.expression.ExpressionElement
import io.github.x1111101101.simplecalc.data.model.expression.value.SimpleValue
import io.github.x1111101101.simplecalc.data.model.expression.value.Value

interface Function<C>: ExpressionElement, SimpleValue<C> {

}