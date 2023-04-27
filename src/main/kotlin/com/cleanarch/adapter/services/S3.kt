package com.cleanarch.adapter.services

import aws.sdk.kotlin.services.s3.S3Client
import aws.sdk.kotlin.services.s3.model.BucketLocationConstraint
import aws.sdk.kotlin.services.s3.model.CreateBucketRequest
import aws.sdk.kotlin.services.s3.model.PutObjectRequest
import aws.smithy.kotlin.runtime.content.ByteStream
import aws.smithy.kotlin.runtime.content.asByteStream
import jakarta.inject.Singleton
import jdk.internal.org.jline.keymap.KeyMap
import jdk.internal.org.jline.keymap.KeyMap.key
import kotlinx.coroutines.runBlocking
import java.io.File
import java.util.UUID


@Singleton
class S3 {



    fun createObject(): Unit = runBlocking {
        S3Client
            .fromEnvironment { region = REGION }
            .use { s3 ->
                createBucket(s3)

                val put = PutObjectRequest {
                    bucket = BUCKET
                    key = UUID.randomUUID().toString()
                    body = File("").asByteStream()
                    metadata =
                }
                s3.putObject(put)
            }
    }

    suspend fun createBucket(s3: S3Client) {

        s3.createBucket(CreateBucketRequest {
            bucket = BUCKET
            createBucketConfiguration {
                locationConstraint = BucketLocationConstraint.fromValue(REGION)
            }
        })

    }

    companion object{
        const val REGION = "sa-east-2"
        const val BUCKET = "bucket-upload"
        val KEY = "key"
    }

}