package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ic f11829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qc f11830b;

    public final qc a(final oa oaVar) {
        final ic icVar = this.f11829a;
        ic icVar2 = qc.f11792j;
        if (icVar != icVar2) {
            s5 s5Var = qc.f11791i;
            s5Var.getClass();
            final a1.b bVar = new a1.b(3);
            bVar.f189b = false;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) s5Var.f11844b;
            Context context = oaVar.f11702b;
            String str = icVar.f11496d;
            if (str == null) {
                str = (String) icVar.f11493a.apply(context);
                icVar.f11496d = str;
            }
            jc jcVar = (jc) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: com.google.android.gms.internal.measurement.pc
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    jc jcVar2 = new jc(new qc(oaVar, icVar));
                    bVar.f189b = true;
                    return jcVar2;
                }
            });
            if (bVar.f189b) {
                Context context2 = oaVar.f11702b;
                s5 s5Var2 = new s5(s5Var, 13);
                if (fd.f11420a == null) {
                    synchronized (fd.class) {
                        try {
                            if (fd.f11420a == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new fd(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new fd(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                fd.f11420a = s5Var2;
                            }
                        } finally {
                        }
                    }
                }
            }
            this.f11830b = jcVar.f11519a;
            this.f11829a = icVar2;
        }
        return this.f11830b;
    }
}
