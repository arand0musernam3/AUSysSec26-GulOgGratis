package com.braze;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Braze f10300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f10301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f10302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z11, boolean z12, boolean z13, Braze braze, Function0 function0, Function0 function02, x70.c cVar) {
        super(2, cVar);
        this.f10297b = z11;
        this.f10298c = z12;
        this.f10299d = z13;
        this.f10300e = braze;
        this.f10301f = function0;
        this.f10302g = function02;
    }

    public static final String a(Function0 function0) {
        return j4.s.j(function0.invoke(), "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > ");
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        o oVar = new o(this.f10297b, this.f10298c, this.f10299d, this.f10300e, this.f10301f, this.f10302g, cVar);
        oVar.f10296a = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        v80.b0 b0Var = (v80.b0) this.f10296a;
        if (this.f10297b && Braze.INSTANCE.isDisabled()) {
            return Unit.f26487a;
        }
        if (this.f10298c && Braze.INSTANCE.isDelayedInitializationEnabled()) {
            return Unit.f26487a;
        }
        if (this.f10299d && this.f10300e.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new i2(0, this.f10302g), 6, (Object) null);
            return Unit.f26487a;
        }
        this.f10301f.invoke();
        return Unit.f26487a;
    }
}
