package bx;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import ax.a0;
import ax.h0;
import ax.k0;
import ax.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.StringCompanionObject;
import tx.c0;
import tx.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ScheduledFuture f6725c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile se.b f6723a = new se.b(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f6724b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f6726d = new c(1);

    public static final h0 a(b bVar, x xVar, boolean z11, androidx.constraintlayout.widget.z zVar) {
        Set set = yx.a.f46339a;
        if (!set.contains(j.class)) {
            try {
                String str = bVar.f6707a;
                tx.z zVarK = c0.k(str, false);
                String str2 = h0.f4915j;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                h0 h0VarZ = qb.e.z(null, String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1)), null, null);
                h0VarZ.f4925i = true;
                Bundle bundle = h0VarZ.f4920d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String str3 = bVar.f6708b;
                if (str3 == null) {
                    Date date = ax.b.l;
                    ax.b bVarV = pd.g.v();
                    str3 = bVarV != null ? bVarV.f4875e : null;
                }
                if (str3 != null) {
                    bundle.putString("access_token", str3);
                }
                synchronized (m.c()) {
                    set.contains(m.class);
                }
                String str4 = m.f6734c;
                String strR = r40.d.r();
                if (strR != null) {
                    bundle.putString("install_referrer", strR);
                }
                h0VarZ.f4920d = bundle;
                int iD = xVar.d(h0VarZ, a0.a(), zVarK != null ? zVarK.f40583a : false, z11);
                if (iD != 0) {
                    zVar.f2542b += iD;
                    h0VarZ.j(new ax.c(1, bVar, h0VarZ, xVar, zVar));
                    return h0VarZ;
                }
            } catch (Throwable th2) {
                yx.a.a(j.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final ArrayList b(se.b bVar, androidx.constraintlayout.widget.z zVar) {
        x xVar;
        if (yx.a.f46339a.contains(j.class)) {
            return null;
        }
        try {
            bVar.getClass();
            boolean zF = a0.f(a0.a());
            ArrayList arrayList = new ArrayList();
            for (b bVar2 : bVar.r()) {
                synchronized (bVar) {
                    bVar2.getClass();
                    xVar = (x) ((HashMap) bVar.f39010b).get(bVar2);
                }
                if (xVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                h0 h0VarA = a(bVar2, xVar, zF, zVar);
                if (h0VarA != null) {
                    arrayList.add(h0VarA);
                    if (dx.f.f15188a) {
                        HashSet hashSet = dx.q.f15211a;
                        try {
                            a0.c().execute(new d1.e(h0VarA, 5));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            yx.a.a(j.class, th2);
            return null;
        }
    }

    public static final void c(p pVar) {
        if (yx.a.f46339a.contains(j.class)) {
            return;
        }
        try {
            pVar.getClass();
            f6724b.execute(new al.u(pVar, 11));
        } catch (Throwable th2) {
            yx.a.a(j.class, th2);
        }
    }

    public static final void d(p pVar) {
        if (yx.a.f46339a.contains(j.class)) {
            return;
        }
        try {
            pVar.getClass();
            f6723a.c(i.a());
            try {
                androidx.constraintlayout.widget.z zVarF = f(pVar, f6723a);
                if (zVarF != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", zVarF.f2542b);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (q) zVarF.f2543c);
                    d9.c.a(a0.a()).c(intent);
                }
            } catch (Exception e5) {
                Log.w("bx.j", "Caught unexpected exception while flushing app events: ", e5);
            }
        } catch (Throwable th2) {
            yx.a.a(j.class, th2);
        }
    }

    public static final void e(b bVar, h0 h0Var, k0 k0Var, x xVar, androidx.constraintlayout.widget.z zVar) {
        q qVar;
        if (yx.a.f46339a.contains(j.class)) {
            return;
        }
        try {
            k0Var.getClass();
            ax.w wVar = k0Var.f4943c;
            q qVar2 = q.SUCCESS;
            if (wVar == null) {
                qVar = qVar2;
            } else if (wVar.f5019b == -1) {
                qVar = q.NO_CONNECTIVITY;
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{k0Var.toString(), wVar.toString()}, 2));
                qVar = q.SERVER_ERROR;
            }
            a0.g(m0.APP_EVENTS);
            xVar.b(wVar != null);
            q qVar3 = q.NO_CONNECTIVITY;
            if (qVar == qVar3) {
                a0.c().execute(new a40.l(23, bVar, xVar));
            }
            if (qVar == qVar2 || ((q) zVar.f2543c) == qVar3) {
                return;
            }
            qVar.getClass();
            zVar.f2543c = qVar;
        } catch (Throwable th2) {
            yx.a.a(j.class, th2);
        }
    }

    public static final androidx.constraintlayout.widget.z f(p pVar, se.b bVar) {
        if (!yx.a.f46339a.contains(j.class)) {
            try {
                pVar.getClass();
                bVar.getClass();
                androidx.constraintlayout.widget.z zVar = new androidx.constraintlayout.widget.z(1, (byte) 0);
                zVar.f2543c = q.SUCCESS;
                ArrayList arrayListB = b(bVar, zVar);
                if (!arrayListB.isEmpty()) {
                    l50.a aVar = f0.f40508d;
                    l50.a.A(m0.APP_EVENTS, "bx.j", "Flushing %d events due to %s.", Integer.valueOf(zVar.f2542b), pVar.toString());
                    Iterator it = arrayListB.iterator();
                    while (it.hasNext()) {
                        ((h0) it.next()).c();
                    }
                    return zVar;
                }
            } catch (Throwable th2) {
                yx.a.a(j.class, th2);
                return null;
            }
        }
        return null;
    }
}
