package com.zwu.todo

import java.sql.Timestamp

data class TodoItem(
    val content: String,
    val time: Timestamp
)
