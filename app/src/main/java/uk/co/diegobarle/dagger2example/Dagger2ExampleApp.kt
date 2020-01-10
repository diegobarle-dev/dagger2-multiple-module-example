package uk.co.diegobarle.dagger2example

import android.app.Application
import uk.co.diegobarle.dagger2example.di.AppComponent
import uk.co.diegobarle.dagger2example.di.DaggerAppComponent

open class Dagger2ExampleApp : Application() {

    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }
}