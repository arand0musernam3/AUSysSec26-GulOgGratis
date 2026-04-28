package a3;

import android.content.Context;
import android.os.Build;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.d3 f323a = new m3.d3(new c0(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f324b = new d0(0);

    public static final void a(o2.a aVar, Context context, boolean z11, CharSequence charSequence, m5.t0 t0Var, u uVar, Function1 function1) {
        if (Build.VERSION.SDK_INT >= 28 && charSequence != null && t0Var != null && uVar != null && (uVar instanceof b0)) {
            ((b0) uVar).b(aVar, charSequence, t0Var.f29650a, function1);
            n2.b.a(aVar, context, z11, charSequence, t0Var.f29650a);
            return;
        }
        function1.invoke(aVar);
        if (charSequence == null || t0Var == null) {
            return;
        }
        n2.b.a(aVar, context, z11, charSequence, t0Var.f29650a);
    }

    public static final u b(g0 g0Var, t5.c cVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.a0(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            sVar.q(false);
            return null;
        }
        Context context = (Context) sVar.j(c5.v0.f7390b);
        CoroutineContext coroutineContext = (CoroutineContext) sVar.j(f323a);
        boolean zF = ((((i11 & 112) ^ 48) > 32 && sVar.f(cVar)) || (i11 & 48) == 32) | sVar.f(coroutineContext) | sVar.f(context);
        Object objM = sVar.M();
        if (zF || objM == m3.m.f29332a) {
            f324b.getClass();
            objM = new b0(coroutineContext, context, g0Var, cVar);
            sVar.k0(objM);
        }
        u uVar = (u) objM;
        sVar.q(false);
        return uVar;
    }
}
