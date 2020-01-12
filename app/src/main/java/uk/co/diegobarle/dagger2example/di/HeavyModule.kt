package uk.co.diegobarle.dagger2example.di

import dagger.Module
import dagger.Provides
import uk.co.diegobarle.backend.model.HeavyDetails
import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class MainHeavy1

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class MainHeavy2

@Module
class HeavyModule{

    @MainHeavy1
    @Provides
    fun provideHeavyDetails(): HeavyDetails {
        return HeavyDetails(1, "Hello Dagger 2")
    }

    @MainHeavy2
    @Provides
    fun provideHeavyDetails2(): HeavyDetails {
        return HeavyDetails(1, "Goodbye Dagger 2")
    }
}