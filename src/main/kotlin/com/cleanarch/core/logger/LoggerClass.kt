package com.cleanarch.core.logger

import io.micronaut.http.context.ServerRequestContext
import org.slf4j.LoggerFactory


open class LoggerClass {

    private val logHeadersList = listOf("x-header", "x-header2")
    private fun getLoggableHeaders() = ServerRequestContext.currentRequest<Any>().get().headers
        .filter { logHeadersList.contains(it.key) }
        .map { it.key to it.value }

    companion object {
        private val logger = LoggerFactory.getLogger(this::class.java)
    }
}