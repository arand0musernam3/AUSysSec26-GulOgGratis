package com.braze.coroutine;

import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import sr.r;
import v80.b0;
import v80.f0;
import v80.i1;
import v80.p0;
import v80.y;
import v80.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0003J=\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/braze/coroutine/BrazeCoroutineScope;", "Lv80/b0;", "<init>", "()V", "", "cancelChildren", "", "startDelayInMs", "Lkotlin/coroutines/CoroutineContext;", "specificContext", "Lkotlin/Function1;", "Lx70/c;", "", "block", "Lv80/i1;", "launchDelayed", "(Ljava/lang/Number;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Lv80/i1;", "", "shouldReRaiseExceptions", "Z", "getShouldReRaiseExceptions$android_sdk_base_release", "()Z", "setShouldReRaiseExceptions$android_sdk_base_release", "(Z)V", "Lv80/z;", "exceptionHandler", "Lv80/z;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeCoroutineScope implements b0 {
    public static final BrazeCoroutineScope INSTANCE = new BrazeCoroutineScope();
    private static final CoroutineContext coroutineContext;
    private static final z exceptionHandler;
    private static boolean shouldReRaiseExceptions;

    static {
        c cVar = new c(y.f42175a);
        exceptionHandler = cVar;
        c90.f fVar = p0.f42144a;
        coroutineContext = c90.e.f7834b.plus(cVar).plus(f0.d());
    }

    private BrazeCoroutineScope() {
    }

    public static final void cancelChildren() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeCoroutineScope, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new r(7), 6, (Object) null);
        f0.l(brazeCoroutineScope.getCoroutineContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelChildren$lambda$1() {
        return "Cancelling children of BrazeCoroutineScope";
    }

    public static /* synthetic */ i1 launchDelayed$default(BrazeCoroutineScope brazeCoroutineScope, Number number, CoroutineContext coroutineContext2, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            coroutineContext2 = brazeCoroutineScope.getCoroutineContext();
        }
        return brazeCoroutineScope.launchDelayed(number, coroutineContext2, function1);
    }

    @Override // v80.b0
    public CoroutineContext getCoroutineContext() {
        return coroutineContext;
    }

    public final boolean getShouldReRaiseExceptions$android_sdk_base_release() {
        return shouldReRaiseExceptions;
    }

    public final i1 launchDelayed(Number startDelayInMs, CoroutineContext specificContext, Function1<? super x70.c<? super Unit>, ? extends Object> block) {
        startDelayInMs.getClass();
        specificContext.getClass();
        block.getClass();
        return f0.B(this, specificContext, null, new b(startDelayInMs, block, null), 2);
    }

    public final void setShouldReRaiseExceptions$android_sdk_base_release(boolean z11) {
        shouldReRaiseExceptions = z11;
    }
}
