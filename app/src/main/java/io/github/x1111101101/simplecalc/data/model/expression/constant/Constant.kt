package io.github.x1111101101.simplecalc.data.model.expression.constant

import io.github.x1111101101.simplecalc.data.model.expression.ExpressionElement

interface Constant<C>: ExpressionElement {
    val value: C
    operator fun unaryMinus(): Constant<C>
    operator fun plus(other: Constant<C>): Constant<C>
    operator fun times(other: Constant<C>): Constant<C>
    operator fun div(other: Constant<C>): Constant<C>
}

