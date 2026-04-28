package com.braze.dispatch;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.braze.events.internal.o;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f9675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f9676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Intent intent, BroadcastReceiver.PendingResult pendingResult, x70.c cVar) {
        super(2, cVar);
        this.f9674b = fVar;
        this.f9675c = intent;
        this.f9676d = pendingResult;
    }

    public static final String a() {
        return "Retrieving connectivity event data in background";
    }

    public static final String b() {
        return "Failed to process connectivity event.";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        c cVar2 = new c(this.f9674b, this.f9675c, this.f9676d, cVar);
        cVar2.f9673a = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        b0 b0Var = (b0) this.f9673a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new tr.e(5), 6, (Object) null);
        try {
            f fVar = this.f9674b;
            com.braze.enums.e eVar = fVar.f9693j;
            fVar.f9693j = com.braze.support.c.a(this.f9675c, fVar.f9692i);
            f fVar2 = this.f9674b;
            com.braze.enums.e eVar2 = fVar2.f9693j;
            if (eVar != eVar2) {
                fVar2.f9685b.b(new o(eVar, eVar2), o.class);
            }
            this.f9674b.b();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new tr.e(6), 4, (Object) null);
            f fVar3 = this.f9674b;
            fVar3.a(fVar3.f9685b, e5);
        }
        this.f9676d.finish();
        return Unit.f26487a;
    }
}
