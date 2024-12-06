package io.github.x1111101101.simplecalc.data.model.expression.operator

import io.github.x1111101101.simplecalc.data.model.expression.constant.Constant

interface BinaryOperator: Operator {
    fun <C> calculate(left: Constant<C>, right: Constant<C>): Constant<C>
}