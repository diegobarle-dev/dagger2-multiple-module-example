package uk.co.diegobarle.dagger2example.di

import dagger.Module
import dagger.Provides
import uk.co.diegobarle.backend.model.HeavyDetails
import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class MainHeavy

@Module
class HeavyModule{

    @MainHeavy
    @Provides
    fun provideHeavyDetails(): HeavyDetails {
        return HeavyDetails(1, "Hello Dagger 2")
    }
}