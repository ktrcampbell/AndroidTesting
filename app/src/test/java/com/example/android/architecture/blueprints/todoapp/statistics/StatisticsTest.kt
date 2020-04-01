package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import org.hamcrest.Matchers.`is`
import org.junit.Assert.*
import org.junit.Test

class StatisticsTest{

    @Test
    fun getActiveAndCompletedStats_noCompleted_returnHundredZero(){

        //create an active task (false makes it active)
        val tasks = listOf<Task>(
                Task("Clean", "Take out trash", isCompleted = false)
        )

        //call the function
        val result = getActiveAndCompletedStats(tasks)

        //check the result
//        assertEquals(result.completedTasksPercent, 0f)
//        assertEquals(result.activeTasksPercent, 100f)
        //replaced using Hamcrest
        assertThat(result.activeTasksPercent, `is`(100f))
        assertThat(result.completedTasksPercent, `is`(0f))

    }
}