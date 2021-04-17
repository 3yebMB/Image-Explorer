package dev.m13d.imageexplorer.data

import dev.m13d.imageexplorer.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}