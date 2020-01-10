package uk.co.diegobarle.dagger2example.di

import android.app.Activity

interface DaggerComponentProvider {
    val appComponent: AppComponent
}

val Activity.injector get() = (application as DaggerComponentProvider).appComponent