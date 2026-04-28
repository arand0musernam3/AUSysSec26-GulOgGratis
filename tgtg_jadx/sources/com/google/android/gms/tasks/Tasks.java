package com.google.android.gms.tasks;

import android.os.Looper;
import androidx.annotation.NonNull;
import c50.w;
import com.braze.h2;
import com.google.android.gms.common.internal.i0;
import d10.h;
import d10.j;
import d10.o;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import lz.i;
import w0.a;
import x0.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class Tasks {
    public static Object a(Task task, long j9, TimeUnit timeUnit) throws TimeoutException {
        i0.g("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            h2.b("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        i0.i(task, "Task must not be null");
        i0.i(timeUnit, "TimeUnit must not be null");
        if (task.m()) {
            return f(task);
        }
        i iVar = new i(8);
        Executor executor = h.f13699b;
        task.h(executor, iVar);
        task.f(executor, iVar);
        task.b(executor, iVar);
        if (((CountDownLatch) iVar.f28446b).await(j9, timeUnit)) {
            return f(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        i0.g("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            h2.b("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        i0.i(task, "Task must not be null");
        if (task.m()) {
            return (TResult) f(task);
        }
        i iVar = new i(8);
        a aVar = h.f13699b;
        task.h(aVar, iVar);
        task.f(aVar, iVar);
        task.b(aVar, iVar);
        ((CountDownLatch) iVar.f28446b).await();
        return (TResult) f(task);
    }

    public static o b(Executor executor, Callable callable) {
        i0.i(executor, "Executor must not be null");
        o oVar = new o();
        executor.execute(new f(9, oVar, callable));
        return oVar;
    }

    public static o c(Exception exc) {
        o oVar = new o();
        oVar.r(exc);
        return oVar;
    }

    public static o d(Object obj) {
        o oVar = new o();
        oVar.p(obj);
        return oVar;
    }

    public static o e(List list) {
        if (list == null || list.isEmpty()) {
            return d(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                w.l("null tasks are not accepted");
                return null;
            }
        }
        o oVar = new o();
        j jVar = new j(list.size(), oVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            a aVar = h.f13699b;
            task.h(aVar, jVar);
            task.f(aVar, jVar);
            task.b(aVar, jVar);
        }
        return oVar;
    }

    public static Object f(Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }
}
