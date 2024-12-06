package io.github.x1111101101.simplecalc.data.model.expression

import io.github.x1111101101.simplecalc.data.model.expression.value.SimpleValue
import io.github.x1111101101.simplecalc.data.model.expression.value.Value

interface ExpressionElementNest<C>: SimpleValue<C> {
    val elements: List<ExpressionElement>

}