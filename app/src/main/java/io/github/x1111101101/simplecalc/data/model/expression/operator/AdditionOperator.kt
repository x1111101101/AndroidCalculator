package io.github.x1111101101.simplecalc.data.model.expression.operator

import io.github.x1111101101.simplecalc.data.model.expression.ExpressionElementNest
import io.github.x1111101101.simplecalc.data.model.expression.constant.Constant

object AdditionOperator: BinaryOperator {

    override val priority: Int get() = OperatorPriorities.ADDITION
    override val associativity: Associativity get() = Associativity.LeftToRight

    override fun <C> calculate(left: Constant<C>, right: Constant<C>): Constant<C> {
        return left + right
    }
}