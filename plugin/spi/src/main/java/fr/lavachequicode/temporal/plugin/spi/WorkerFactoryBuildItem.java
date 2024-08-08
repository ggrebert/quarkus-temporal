package fr.lavachequicode.temporal.plugin.spi;

import io.quarkus.builder.item.SimpleBuildItem;
import io.quarkus.runtime.RuntimeValue;
import io.temporal.worker.WorkerFactory;

public final class WorkerFactoryBuildItem extends SimpleBuildItem {

    public final RuntimeValue<WorkerFactory> workerFactory;

    public WorkerFactoryBuildItem(RuntimeValue<WorkerFactory> workerFactory) {
        this.workerFactory = workerFactory;
    }
}
