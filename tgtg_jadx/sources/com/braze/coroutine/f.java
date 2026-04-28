package com.braze.coroutine;

import com.braze.support.BrazeLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import sr.r;
import v80.b0;
import v80.b1;
import v80.f0;
import v80.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9657a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static com.braze.events.d f9658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CoroutineContext f9659c;

    static {
        e eVar = new e(y.f42175a);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        f9659c = new b1(executorServiceNewSingleThreadExecutor).plus(eVar).plus(f0.d());
    }

    public static final String b() {
        return "Cancelling children of SerialCoroutineScope";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new r(8), 6, (Object) null);
        f0.l(f9659c);
    }

    @Override // v80.b0
    public final CoroutineContext getCoroutineContext() {
        return f9659c;
    }
}
