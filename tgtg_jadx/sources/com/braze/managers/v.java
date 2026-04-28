package com.braze.managers;

import com.braze.Braze;
import com.braze.h2;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f10098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, x70.c cVar) {
        super(2, cVar);
        this.f10098b = wVar;
    }

    public static final String a() {
        return "Requesting data flush on internal session close flush timer.";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new v(this.f10098b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.f10098b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10097a;
        if (i11 == 0) {
            ba0.g.M(obj);
            long j9 = w.f10103o;
            this.f10097a = 1;
            if (v80.f0.o(j9, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w.f10102n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.r(7), 14, (Object) null);
        Braze.INSTANCE.getInstance(this.f10098b.f10105a).requestImmediateDataFlush();
        return Unit.f26487a;
    }
}
