package uk.co.diegobarle.backend

import android.app.Application
import uk.co.diegobarle.backend.di.AppComponent
import uk.co.diegobarle.backend.di.DaggerAppComponent

open class BackendApp : Application() {

    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }
}