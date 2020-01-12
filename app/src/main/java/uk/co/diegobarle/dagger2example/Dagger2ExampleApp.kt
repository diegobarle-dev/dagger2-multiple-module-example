package uk.co.diegobarle.dagger2example

import uk.co.diegobarle.backend.CoreApp
import uk.co.diegobarle.dagger2example.di.AppComponent
import uk.co.diegobarle.dagger2example.di.DaggerAppComponent
import uk.co.diegobarle.dagger2example.di.DaggerComponentProvider

open class Dagger2ExampleApp : CoreApp(), DaggerComponentProvider {

    override val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.builder()
            .applicationContext(applicationContext)
            .build()
    }
}