package uk.co.diegobarle.dagger2example.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import uk.co.diegobarle.backend.di.CoreModule
import uk.co.diegobarle.dagger2example.main.MainViewModel
import javax.inject.Singleton

@Singleton
@Component(modules = [CoreModule::class, HeavyModule::class])
interface AppComponent{

    @Component.Builder
    interface Builder {
        @BindsInstance fun applicationContext(applicationContext: Context): Builder
        fun build(): AppComponent
    }

    fun mainViewModelFactory(): ViewModelFactory<MainViewModel>
}