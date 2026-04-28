package com.google.android.gms.internal.measurement;

import android.app.ActivityManager;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 implements c2, qz.q, j30.l, d10.b, p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h1 f11445b = new h1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f11446c = new h1(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f11447d = new h1(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h1 f11448e = new h1(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h1 f11449f = new h1(12);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h1 f11450g = new h1(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11451a;

    public /* synthetic */ h1(int i11) {
        this.f11451a = i11;
    }

    public static final t1 c(long j9, Object obj) {
        t1 t1Var = (t1) w2.i(j9, obj);
        if (((o0) t1Var).f11682a) {
            return t1Var;
        }
        int size = t1Var.size();
        t1 t1VarK = t1Var.k(size == 0 ? 10 : size + size);
        w2.j(j9, obj, t1VarK);
        return t1VarK;
    }

    public static pf d(String str, bg bgVar) {
        boolean z11;
        yf yfVarM0;
        sf sfVar = rf.f11834e;
        bgVar.getClass();
        xf xfVarC = hf.c();
        yf yfVar = xfVarC.f12043b;
        if (yfVar == of.f11732g) {
            yfVar = null;
            hf.b(xfVarC, null);
            z11 = true;
        } else {
            z11 = false;
        }
        if (yfVar == null) {
            UUID uuidB = jf.f11525c.b();
            String strA = bf.a(uuidB);
            zzvr zzvrVar = mf.f11637g;
            k30.m mVar = (k30.m) hf.f11474a.get();
            if (!mVar.isEmpty()) {
                mVar.forEach(new lf(1));
            }
            yfVarM0 = new nf(uuidB, strA, str, sfVar, zzvrVar, xfVarC);
        } else {
            yfVarM0 = yfVar instanceof df ? ((df) yfVar).m0(str, sfVar, false, xfVarC) : yfVar.t0(str, sfVar, xfVarC);
        }
        hf.b(xfVarC, yfVarM0);
        return new pf(yfVarM0, z11);
    }

    public static final z1 e(Object obj, Object obj2) {
        z1 z1VarA = (z1) obj;
        z1 z1Var = (z1) obj2;
        if (!z1Var.isEmpty()) {
            if (!z1VarA.f12079a) {
                z1VarA = z1VarA.a();
            }
            z1VarA.d();
            if (!z1Var.isEmpty()) {
                z1VarA.putAll(z1Var);
            }
        }
        return z1VarA;
    }

    public static /* bridge */ r2 f(Object obj) {
        k1 k1Var = (k1) obj;
        r2 r2Var = k1Var.zzc;
        if (r2Var != r2.f11809f) {
            return r2Var;
        }
        r2 r2VarA = r2.a();
        k1Var.zzc = r2VarA;
        return r2VarA;
    }

    public static boolean h(int i11, a60.s sVar, Object obj) throws zzaeh {
        x0 x0Var = (x0) sVar.f912d;
        int i12 = sVar.f909a;
        int i13 = i12 >>> 3;
        int i14 = i12 & 7;
        if (i14 == 0) {
            sVar.w(0);
            ((r2) obj).d(i13 << 3, Long.valueOf(x0Var.r()));
            return true;
        }
        if (i14 == 1) {
            sVar.w(1);
            ((r2) obj).d((i13 << 3) | 1, Long.valueOf(x0Var.t()));
            return true;
        }
        if (i14 == 2) {
            ((r2) obj).d((i13 << 3) | 2, sVar.E());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                if (i11 != 0) {
                    return false;
                }
                c50.w.o("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i14 != 5) {
                c50.w.n();
                return false;
            }
            sVar.w(5);
            ((r2) obj).d(5 | (i13 << 3), Integer.valueOf(x0Var.u()));
            return true;
        }
        r2 r2VarA = r2.a();
        int i15 = i13 << 3;
        int i16 = i11 + 1;
        if (i16 >= 100) {
            c50.w.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (sVar.D() != Integer.MAX_VALUE && h(i16, sVar, r2VarA)) {
        }
        if ((i15 | 4) != sVar.f909a) {
            c50.w.o("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (r2VarA.f11814e) {
            r2VarA.f11814e = false;
        }
        ((r2) obj).d(i15 | 3, r2VarA);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.c2
    public boolean a(Class cls) {
        switch (this.f11451a) {
            case 0:
                return k1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // qz.q
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i11 = aa.f11252a;
    }

    @Override // com.google.android.gms.internal.measurement.c2
    public l2 b(Class cls) {
        switch (this.f11451a) {
            case 0:
                if (k1.class.isAssignableFrom(cls)) {
                    try {
                        return (l2) k1.n(cls.asSubclass(k1.class)).s(3);
                    } catch (Exception e5) {
                        a40.d0.o("Unable to get message info for ".concat(cls.getName()), e5);
                    }
                } else {
                    i4.a.f("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // d10.b
    public Object g(Task task) {
        k1 k1VarD;
        r9 r9Var = (r9) task.getResult();
        ab abVarZ = bb.z();
        String str = r9Var.f11820a;
        abVarZ.b();
        ((bb) abVarZ.f11483b).A(str);
        String str2 = r9Var.f11822c;
        abVarZ.b();
        ((bb) abVarZ.f11483b).C(str2);
        boolean z11 = r9Var.f11825f;
        abVarZ.b();
        ((bb) abVarZ.f11483b).F(z11);
        long j9 = r9Var.f11826g;
        abVarZ.b();
        ((bb) abVarZ.f11483b).G(j9);
        byte[] bArr = r9Var.f11821b;
        if (bArr != null) {
            t0 t0VarJ = u0.j(0, bArr.length, bArr);
            abVarZ.b();
            ((bb) abVarZ.f11483b).B(t0VarJ);
        }
        for (q9 q9Var : r9Var.f11823d) {
            for (u9 u9Var : q9Var.f11787b) {
                int i11 = u9Var.f11931g;
                String str3 = u9Var.f11925a;
                if (i11 == 1) {
                    cb cbVarZ = db.z();
                    cbVarZ.i(str3);
                    if (i11 != 1) {
                        i4.a.f("Not a long type");
                        return null;
                    }
                    long j11 = u9Var.f11926b;
                    cbVarZ.b();
                    ((db) cbVarZ.f11483b).C(j11);
                    k1VarD = cbVarZ.d();
                } else if (i11 == 2) {
                    cb cbVarZ2 = db.z();
                    cbVarZ2.i(str3);
                    if (i11 != 2) {
                        i4.a.f("Not a boolean type");
                        return null;
                    }
                    boolean z12 = u9Var.f11927c;
                    cbVarZ2.b();
                    ((db) cbVarZ2.f11483b).D(z12);
                    k1VarD = cbVarZ2.d();
                } else if (i11 == 3) {
                    cb cbVarZ3 = db.z();
                    cbVarZ3.i(str3);
                    if (i11 != 3) {
                        i4.a.f("Not a double type");
                        return null;
                    }
                    double d3 = u9Var.f11928d;
                    cbVarZ3.b();
                    ((db) cbVarZ3.f11483b).E(d3);
                    k1VarD = cbVarZ3.d();
                } else if (i11 == 4) {
                    cb cbVarZ4 = db.z();
                    cbVarZ4.i(str3);
                    if (i11 != 4) {
                        i4.a.f("Not a String type");
                        return null;
                    }
                    String str4 = u9Var.f11929e;
                    com.google.android.gms.common.internal.i0.h(str4);
                    cbVarZ4.b();
                    ((db) cbVarZ4.f11483b).F(str4);
                    k1VarD = cbVarZ4.d();
                } else {
                    if (i11 != 5) {
                        i4.a.f(e0.f.h(i11, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i11).length() + 24)));
                        return null;
                    }
                    cb cbVarZ5 = db.z();
                    cbVarZ5.i(str3);
                    if (i11 != 5) {
                        i4.a.f("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = u9Var.f11930f;
                    com.google.android.gms.common.internal.i0.h(bArr2);
                    t0 t0VarJ2 = u0.j(0, bArr2.length, bArr2);
                    cbVarZ5.b();
                    ((db) cbVarZ5.f11483b).G(t0VarJ2);
                    k1VarD = cbVarZ5.d();
                }
                abVarZ.b();
                ((bb) abVarZ.f11483b).D((db) k1VarD);
            }
            String[] strArr = q9Var.f11788c;
            if (strArr != null) {
                for (String str5 : strArr) {
                    abVarZ.b();
                    ((bb) abVarZ.f11483b).E(str5);
                }
            }
        }
        return (bb) abVarZ.d();
    }

    @Override // j30.l
    public Object get() {
        switch (this.f11451a) {
            case 12:
                Object obj = oa.f11698j;
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(qa.f11790a);
                return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof o30.x0 ? (o30.x0) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new o30.x0(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                boolean z11 = false;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i11 = runningAppProcessInfo.importance;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 17);
                    sb2.append("Memory state is: ");
                    sb2.append(i11);
                    Log.i("PhenotypeProcessReaper", sb2.toString());
                    if (runningAppProcessInfo.importance >= 400) {
                        z11 = true;
                    }
                } catch (RuntimeException e5) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e5);
                }
                return new Boolean(z11);
        }
    }
}
