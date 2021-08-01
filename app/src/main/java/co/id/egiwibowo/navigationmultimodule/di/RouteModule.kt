package co.id.egiwibowo.navigationmultimodule.di

import co.id.egiwibowo.features.modulea.routes.ModuleARoutes
import co.id.egiwibowo.features.moduleb.routes.ModuleBRoutes
import co.id.egiwibowo.navigation.modulea.IModuleARouteContract
import co.id.egiwibowo.navigation.moduleb.IModuleBRouteContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RouteModule {

    @Provides
    fun provideModuleARoute(): IModuleARouteContract {
        return ModuleARoutes()
    }

    @Provides
    fun provideModuleBRoute(): IModuleBRouteContract {
        return ModuleBRoutes()
    }
}