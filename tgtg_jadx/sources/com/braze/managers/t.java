package com.braze.managers;

import android.content.BroadcastReceiver;
import com.braze.support.BrazeLogger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f10092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f10093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, BroadcastReceiver.PendingResult pendingResult, x70.c cVar) {
        super(2, cVar);
        this.f10092b = wVar;
        this.f10093c = pendingResult;
    }

    public static final String a() {
        return "Failed to log throwable during seal session.";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        t tVar = new t(this.f10092b, this.f10093c, cVar);
        tVar.f10091a = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        v80.b0 b0Var = (v80.b0) this.f10091a;
        w wVar = this.f10092b;
        ReentrantLock reentrantLock = wVar.f10112h;
        reentrantLock.lock();
        try {
            try {
                wVar.j();
            } catch (Exception e5) {
                try {
                    wVar.f10107c.b(e5, Throwable.class);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new zv.r(5), 4, (Object) null);
                }
            }
            Unit unit = Unit.f26487a;
            reentrantLock.unlock();
            this.f10093c.finish();
            return unit;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
