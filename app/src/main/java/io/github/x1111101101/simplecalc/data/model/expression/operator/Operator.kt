package io.github.x1111101101.simplecalc.data.model.expression.operator

import io.github.x1111101101.simplecalc.data.model.expression.ExpressionElement

interface Operator: ExpressionElement {
    val priority: Int
    val associativity: Associativity
}

