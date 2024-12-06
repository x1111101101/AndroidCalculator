package io.github.x1111101101.simplecalc.data.model.expression.operator

import io.github.x1111101101.simplecalc.data.model.expression.constant.Constant

interface SuffixOperator: Operator {
    override val associativity: Associativity
        get() = Associativity.RightToLeft

    fun <C> calculate(right: Constant<C>): Constant<C>
}