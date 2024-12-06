package io.github.x1111101101.simplecalc.data.model.expression.operator

import io.github.x1111101101.simplecalc.data.model.expression.constant.Constant

interface PrefixOperator: Operator {
    override val associativity: Associativity
        get() = Associativity.LeftToRight

    fun <C> calculate(right: Constant<C>): Constant<C>
}