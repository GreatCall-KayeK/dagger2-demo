package com.greatcall.dagger2demo.demolibrary;

import dagger.Module;
import dagger.Provides;

@Module
public class FooBarModule {
    @Provides
    static Foo provideFoo() {
        return new Foo();
    }

    @Provides
    static Bar provideBar() {
        return new Bar();
    }
}
