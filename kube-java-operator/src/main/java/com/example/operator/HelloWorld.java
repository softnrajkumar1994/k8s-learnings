
package com.example.operator;

import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.api.model.Namespaced;

public class HelloWorld extends CustomResource<HelloWorldSpec, HelloWorldStatus> implements Namespaced {
}
