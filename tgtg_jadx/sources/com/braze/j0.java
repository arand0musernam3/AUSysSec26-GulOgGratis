package com.braze;

import com.braze.storage.u3;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f9882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(BrazeUser brazeUser, String str, x70.c cVar) {
        super(2, cVar);
        this.f9882b = brazeUser;
        this.f9883c = str;
    }

    public static final String a(String str) {
        return w.a0.p("Successfully set LINE ID: ", str, ".");
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        j0 j0Var = new j0(this.f9882b, this.f9883c, cVar);
        j0Var.f9881a = obj;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        v80.b0 b0Var = (v80.b0) this.f9881a;
        u3 u3Var = this.f9882b.userCache;
        String str = this.f9883c;
        synchronized (u3Var) {
            u3Var.c("native_line_id", str);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e2(this.f9883c, 20), 6, (Object) null);
        return Unit.f26487a;
    }
}
