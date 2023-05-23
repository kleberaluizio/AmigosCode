package com.kleberaluizio;

import org.springframework.stereotype.Service;

@Service
public class FooService {

    private final Main.Foo foo;

    public FooService(Main.Foo foo) {
        this.foo = foo;
    }

    String getFooName(){
        return foo.name();
    }

//    @Bean("foo")
//    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)

}

