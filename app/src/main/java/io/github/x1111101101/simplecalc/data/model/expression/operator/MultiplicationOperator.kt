package io.github.x1111101101.simplecalc.data.model.expression.operator

import io.github.x1111101101.simplecalc.data.model.expression.constant.Constant

object MultiplicationOperator: BinaryOperator {

    override val priority: Int get() = OperatorPriorities.MULTIPLICATION
    override val associativity: Associativity get() = Associativity.LeftToRight

    override fun <C> calculate(left: Constant<C>, right: Constant<C>): Constant<C> {
        return left * right
    }

}