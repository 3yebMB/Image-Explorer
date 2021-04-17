package dev.m13d.imageexplorer.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dev.m13d.imageexplorer.data.UnsplashRepository

class GalleryViewModel @ViewModelInject constructor(
        private val repository: UnsplashRepository
    ) : ViewModel() {
}