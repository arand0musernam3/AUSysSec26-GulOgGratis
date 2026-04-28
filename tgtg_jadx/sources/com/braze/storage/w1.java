package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f10732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f10733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Function0 function0, x1 x1Var, String str, x70.c cVar) {
        super(2, cVar);
        this.f10732b = function0;
        this.f10733c = x1Var;
        this.f10734d = str;
    }

    public static final String a(String str) {
        return e0.f.k("Failed to ", str);
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        w1 w1Var = new w1(this.f10732b, this.f10733c, this.f10734d, cVar);
        w1Var.f10731a = obj;
        return w1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        v80.b0 b0Var = (v80.b0) this.f10731a;
        try {
            this.f10732b.invoke();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.m(this.f10734d, 20), 4, (Object) null);
            this.f10733c.a(e5);
        }
        return Unit.f26487a;
    }
}
