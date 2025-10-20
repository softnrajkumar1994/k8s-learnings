package com.example.operator;

import io.javaoperatorsdk.operator.api.reconciler.*;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

@ControllerConfiguration
public class HelloWorldReconciler implements Reconciler<HelloWorld> {

    @Override
    public UpdateControl<HelloWorld> reconcile(HelloWorld resource, Context context) {
        System.out.println("HelloWorld message: " + resource.getSpec().getMessage());

        // Update status
        HelloWorldStatus status = new HelloWorldStatus();
        status.setProcessed(true);
        resource.setStatus(status);

        return UpdateControl.updateStatus(resource);
    }
}
