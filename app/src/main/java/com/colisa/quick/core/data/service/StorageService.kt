package com.colisa.quick.core.data.service

import com.colisa.quick.core.data.models.Task

interface StorageService {
    fun addListener(
        userId: String,
        onDocumentEvent: (Boolean, Task) -> Unit,
        onError: (Throwable) -> Unit
    )

    fun removeListener()
    fun getTask(taskId: String, onError: (Throwable) -> Unit, onSuccess: (Task) -> Unit)
    fun saveTask(task: Task, onResult: (Throwable?) -> Unit)
    fun updateTask(task: Task, onResult: (Throwable?) -> Unit)
    fun deleteTask(taskId: String, onResult: (Throwable?) -> Unit)
    fun deleteAllForUser(userId: String, onResult: (Throwable?) -> Unit)
    fun updateUserId(oldUserId: String, newUserId: String, onResult: (Throwable?) -> Unit)
}