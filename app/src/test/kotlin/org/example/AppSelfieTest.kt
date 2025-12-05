package org.example

import com.diffplug.selfie.coroutines.expectSelfie
import io.kotest.core.spec.style.FunSpec

class AppSelfieTest: FunSpec({
    test("test simple selfie") {
        expectSelfie("what").toMatchDisk_TODO()
    }
})