/*
 * AWIS: Adventure Works Information Systems, Android App
 * Created for the MM543-0900-3-2020 course.
 * Team: Tobias Briones, Juan Varela
 *
 * Copyright (c) 2020 Tobias Briones.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.mm543.awis.domain.model

import java.time.LocalDateTime

data class CreditCard(
    val creditCardId: Int,
    val cardType: String,
    val cardNumber: String,
    val expMonth: String,
    val expYear: String,
    val modifiedDate: LocalDateTime
)
