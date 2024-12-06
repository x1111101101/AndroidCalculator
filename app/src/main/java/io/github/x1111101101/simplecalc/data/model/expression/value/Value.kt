package io.github.x1111101101.simplecalc.data.model.expression.value

import io.github.x1111101101.simplecalc.data.model.expression.constant.Constant
import io.github.x1111101101.simplecalc.data.model.expression.context.ExpressionContext

interface Value<X: ExpressionContext, C> {

    fun calculate(context: X): Constant<C>

}