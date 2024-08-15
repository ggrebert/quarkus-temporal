package io.quarkiverse.temporal.deployment.binding;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface SimpleWorkflow {

    @WorkflowMethod
    void transfer();
}
