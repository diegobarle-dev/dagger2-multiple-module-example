package uk.co.diegobarle.dagger2example.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import uk.co.diegobarle.dagger2example.main.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [HeavyModule::class])
interface AppComponent{

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
}