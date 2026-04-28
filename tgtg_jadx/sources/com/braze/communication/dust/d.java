package com.braze.communication.dust;

import com.braze.h2;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import v80.b0;
import v80.f0;
import x80.t;
import x80.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BufferedReader f9610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f9611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BufferedReader bufferedReader, u uVar, x70.c cVar) {
        super(2, cVar);
        this.f9610c = bufferedReader;
        this.f9611d = uVar;
    }

    public static final String a(Exception exc) {
        return b3.i.l("Stream producer job cancelled ", exc);
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        d dVar = new d(this.f9610c, this.f9611d, cVar);
        dVar.f9609b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, v80.b0] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ?? r12 = this.f9608a;
        try {
            if (r12 == 0) {
                ba0.g.M(obj);
                b0 b0Var = (b0) this.f9609b;
                String line = this.f9610c.readLine();
                if (line == null) {
                    return Unit.f26487a;
                }
                u uVar = this.f9611d;
                this.f9609b = b0Var;
                this.f9608a = 1;
                if (((t) uVar).f44084d.f(line, this) == aVar) {
                    return aVar;
                }
            } else {
                if (r12 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
        } catch (Exception e5) {
            if (f0.y(r12)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.f9627d, BrazeLogger.Priority.D, (Throwable) e5, false, (Function0) new q60.a(22), 8, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.f9627d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mw.c(1, e5), 14, (Object) null);
            }
        }
        return Unit.f26487a;
    }

    public static final String a() {
        return "Caught unexpected exception in dust stream producer";
    }
}
