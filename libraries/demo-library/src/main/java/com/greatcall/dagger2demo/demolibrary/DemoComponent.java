package com.greatcall.dagger2demo.demolibrary;

import dagger.Component;

@Component(modules = FooBarModule.class)
public interface DemoComponent {
    Foo foo();
    Bar bar();
}
