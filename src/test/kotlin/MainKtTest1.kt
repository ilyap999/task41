import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculationCommis_Vkpay() {
        val payType = PayType.Vkpay
        val sumAmount = 100000
        val amount = 50000

        val result = calculationCommis(payType = payType, sumAmount = sumAmount, amount = amount)

        //assertEquals(0, result)
        assertEquals(1, result)
    }

    @Test
    fun calculationCommis_Mastercard() {
        val payType = PayType.Mastercard
        val sumAmount = 10000
        val amount = 62000

        val result = calculationCommis(payType = payType, sumAmount = sumAmount, amount = amount)

        assertEquals(2372, result)
    }

    @Test
    fun calculationCommis_Maestro() {
        val payType = PayType.Maestro
        val sumAmount = 100000
        val amount = 50000

        val result = calculationCommis(payType = payType, sumAmount = sumAmount, amount = amount)

        assertEquals(0, result)
    }

    @Test
    fun calculationCommis_Visa() {
        val payType = PayType.Visa
        val sumAmount = 10000
        val amount = 1000000

        val result = calculationCommis(payType = payType, sumAmount = sumAmount, amount = amount)

        assertEquals(7500, result)
    }

    @Test
    fun calculationCommis_Mir() {
        val payType = PayType.Mir
        val sumAmount = 10000
        val amount = 5000

        val result = calculationCommis(payType = payType, sumAmount = sumAmount, amount = amount)

        assertEquals(3500, result)
    }

}