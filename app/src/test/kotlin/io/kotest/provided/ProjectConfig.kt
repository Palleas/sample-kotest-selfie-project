package io.kotest.provided

import com.diffplug.selfie.kotest.SelfieExtension
import io.kotest.core.config.AbstractProjectConfig

object ProjectConfig: AbstractProjectConfig() {
    override val extensions = listOf(SelfieExtension(this))
}