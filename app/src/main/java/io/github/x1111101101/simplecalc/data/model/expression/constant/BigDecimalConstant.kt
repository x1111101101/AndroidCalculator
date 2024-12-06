package io.github.x1111101101.simplecalc.data.model.expression.constant

import java.math.BigDecimal

class BigDecimalConstant(
    override val value: BigDecimal
): Constant<BigDecimal> {
    override fun unaryMinus(): Constant<BigDecimal> {
        return value.multiply(BigDecimal.valueOf(-1)).toConstant()
    }

    override fun div(other: Constant<BigDecimal>): Constant<BigDecimal> {
        return value.div(other.value).toConstant()
    }

    override fun times(other: Constant<BigDecimal>): Constant<BigDecimal> {
        return value.times(other.value).toConstant()
    }

    override fun plus(other: Constant<BigDecimal>): Constant<BigDecimal> {
        return value.plus(other.value).toConstant()
    }
}

private fun BigDecimal.toConstant() = BigDecimalConstant(this)