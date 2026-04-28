package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aa f11415a;

    public fb(aa aaVar) {
        this.f11415a = aaVar;
    }

    public static o30.a b(Task task) {
        ga gaVar = new ga();
        gaVar.f11433h = task;
        o30.g0 g0Var = o30.g0.INSTANCE;
        task.c(g0Var, new s5(gaVar, 10));
        return o30.o0.a(gaVar, ApiException.class, eb.f11381b, g0Var);
    }

    public final o30.a a(bd bdVar) throws Throwable {
        String string;
        String simpleName = ca.class.getSimpleName();
        aa aaVar = this.f11415a;
        qz.m mVarRegisterListener = aaVar.registerListener(bdVar, simpleName);
        String strA = vz.d.a();
        if (strA == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strA.length() + 1;
            int iIdentityHashCode = System.identityHashCode(ca.class);
            StringBuilder sb2 = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb2.append(strA);
            sb2.append("|");
            sb2.append(iIdentityHashCode);
            string = sb2.toString();
        }
        a8.h hVar = new a8.h(aaVar, string, mVarRegisterListener, 10);
        h1 h1Var = h1.f11448e;
        b5.j1 j1Var = new b5.j1();
        j1Var.f5851e = mVarRegisterListener;
        j1Var.f5849c = hVar;
        j1Var.f5850d = h1Var;
        j1Var.f5852f = new pz.d[]{h.f11442b};
        j1Var.f5848b = false;
        return b(aaVar.doRegisterEventListener(j1Var.c()));
    }
}
