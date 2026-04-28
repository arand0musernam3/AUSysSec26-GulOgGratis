package com.braze;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Braze f10342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f10344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f10345g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z11, Braze braze, Object obj, Function2 function2, Function0 function0, x70.c cVar) {
        super(2, cVar);
        this.f10341c = z11;
        this.f10342d = braze;
        this.f10343e = obj;
        this.f10344f = function2;
        this.f10345g = function0;
    }

    public static final String a(Function0 function0) {
        return j4.s.j(function0.invoke(), "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > ");
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        q qVar = new q(this.f10341c, this.f10342d, this.f10343e, this.f10344f, this.f10345g, cVar);
        qVar.f10340b = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f10339a;
        if (i11 != 0) {
            if (i11 == 1) {
                ba0.g.M(obj);
                return obj;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        v80.b0 b0Var = (v80.b0) this.f10340b;
        if (this.f10341c && this.f10342d.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new i2(1, this.f10345g), 6, (Object) null);
            return this.f10343e;
        }
        Function2 function2 = this.f10344f;
        this.f10339a = 1;
        Object objInvoke = function2.invoke(b0Var, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
