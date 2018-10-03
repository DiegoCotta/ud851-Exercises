package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> task;

    public LiveData<TaskEntry> getTask() {
        return task;
    }

    public AddTaskViewModel(AppDatabase mDb, int mTaskId) {
        task = mDb.taskDao().loadTaskById(mTaskId);
    }


}
