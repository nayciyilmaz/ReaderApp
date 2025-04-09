package com.example.readerapp.screens.details

import androidx.lifecycle.ViewModel
import com.example.readerapp.data.Resource
import com.example.readerapp.model.İtem
import com.example.readerapp.repository.BookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val repository: BookRepository)

    : ViewModel(){
    suspend fun getBookInfo(bookId: String): Resource<İtem> {
        return repository.getBookInfo(bookId)
    }
}