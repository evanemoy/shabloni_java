package prac4;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Realization implements ExecutorService {
    private ExecutorService fs;

    public Realization(int count) {
        this.fs = Executors.newFixedThreadPool(count);
    }

    public void shutdown() {
        this.fs.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.fs.shutdownNow();
    }

    public boolean isShutdown() {
        return this.fs.isShutdown();
    }

    public boolean isTerminated() {
        return this.fs.isTerminated();
    }

    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return this.fs.awaitTermination(timeout, unit);
    }

    public <T> Future<T> submit(Callable<T> task) {
        return this.fs.submit(task);
    }

    public <T> Future<T> submit(Runnable task, T result) {
        return this.fs.submit(task, result);
    }

    public Future<?> submit(Runnable task) {
        return this.fs.submit(task);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return this.fs.invokeAll(tasks);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return this.invokeAll(tasks, timeout, unit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return this.fs.invokeAny(tasks);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.fs.invokeAny(tasks, timeout, unit);
    }

    public void execute(Runnable command) {
        this.fs.execute(command);
    }
}

