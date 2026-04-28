package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s5 implements c2, qz.l, qz.q, o30.a0, OnCompleteListener, j30.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile s5 f11840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f11841d = new h1(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kg f11842e = new kg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11844b;

    public s5(int i11) {
        this.f11843a = i11;
        switch (i11) {
            case 1:
                int i12 = p0.f11740a;
                this.f11844b = new s5(new c2[]{h1.f11445b, f11841d}, 4);
                break;
            case 5:
                this.f11844b = new HashMap();
                break;
            case 14:
                this.f11844b = new ConcurrentHashMap();
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f11844b = new AtomicInteger();
                break;
            default:
                this.f11844b = new CopyOnWriteArrayList();
                break;
        }
    }

    public static void d(String str, jg jgVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(jgVar.f11530b / 1000000)));
        sb2.append(": logging error [");
        qg qgVar = jgVar.f11532d;
        if (qgVar == null) {
            com.braze.h2.b("cannot request log site information prior to postProcess()");
            return;
        }
        fa.d(1, qgVar, sb2);
        sb2.append("]: ");
        sb2.append(str);
        System.err.println(sb2);
        System.err.flush();
    }

    @Override // com.google.android.gms.internal.measurement.c2
    public boolean a(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (((c2[]) this.f11844b)[i11].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        int i11 = this.f11843a;
        Object obj3 = this.f11844b;
        d10.g gVar = (d10.g) obj2;
        ca caVar = (ca) obj;
        switch (i11) {
            case 7:
                int i12 = aa.f11252a;
                y9 y9Var = new y9(gVar);
                ba baVar = (ba) caVar.getService();
                byte[] bArrA = ((za) obj3).a();
                Parcel parcelL = baVar.L();
                o5.c(parcelL, y9Var);
                parcelL.writeByteArray(bArrA);
                baVar.M(31, parcelL);
                break;
            default:
                ba baVar2 = (ba) caVar.getService();
                y9 y9Var2 = new y9((aa) obj3, gVar);
                Parcel parcelL2 = baVar2.L();
                o5.c(parcelL2, y9Var2);
                baVar2.M(27, parcelL2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.c2
    public l2 b(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            c2 c2Var = ((c2[]) this.f11844b)[i11];
            if (c2Var.a(cls)) {
                return c2Var.b(cls);
            }
        }
        com.braze.h2.a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public bc c(String str, boolean z11) {
        return new bc(str, (rc) this.f11844b, z11);
    }

    @Override // o30.a0
    public ListenableFuture call() {
        switch (this.f11843a) {
            case 9:
                Callable callable = (Callable) this.f11844b;
                o30.g0 g0Var = o30.g0.INSTANCE;
                o30.d1 d1Var = new o30.d1(callable);
                g0Var.execute(d1Var);
                return d1Var;
            default:
                return (o30.j) this.f11844b;
        }
    }

    public void e(int i11, Object obj, m2 m2Var) {
        b1 b1Var = (b1) this.f11844b;
        n0 n0Var = (n0) obj;
        b1Var.d(i11, 2);
        b1Var.r(n0Var.c(m2Var));
        m2Var.i(n0Var, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[Catch: all -> 0x009b, TryCatch #1 {all -> 0x009b, blocks: (B:30:0x007d, B:32:0x0081, B:34:0x0085, B:39:0x0092, B:44:0x009d, B:45:0x00a9), top: B:59:0x007d }] */
    @Override // qz.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.lang.Object r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.measurement.bd r13 = (com.google.android.gms.internal.measurement.bd) r13
            java.lang.Object r0 = r12.f11844b     // Catch: com.google.android.gms.internal.measurement.zzaeh -> Lbe
            byte[] r0 = (byte[]) r0     // Catch: com.google.android.gms.internal.measurement.zzaeh -> Lbe
            com.google.android.gms.internal.measurement.c1 r1 = com.google.android.gms.internal.measurement.c1.f11297a     // Catch: com.google.android.gms.internal.measurement.zzaeh -> Lbe
            int r1 = com.google.android.gms.internal.measurement.p0.f11740a     // Catch: com.google.android.gms.internal.measurement.zzaeh -> Lbe
            com.google.android.gms.internal.measurement.c1 r1 = com.google.android.gms.internal.measurement.c1.f11298b     // Catch: com.google.android.gms.internal.measurement.zzaeh -> Lbe
            com.google.android.gms.internal.measurement.sc r0 = com.google.android.gms.internal.measurement.sc.u(r0, r1)     // Catch: com.google.android.gms.internal.measurement.zzaeh -> Lbe
            com.google.android.gms.internal.measurement.cd r1 = r13.f11289b
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f11316f
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L1a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lbd
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.measurement.nc r4 = (com.google.android.gms.internal.measurement.nc) r4
            java.util.List r5 = r0.t()
            r4.getClass()
            com.google.android.gms.internal.measurement.s5 r4 = com.google.android.gms.internal.measurement.qc.f11791i
            r4.getClass()
            r6 = 1
            if (r5 == 0) goto Lb0
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L3d
            goto Lb0
        L3d:
            java.util.Iterator r5 = r5.iterator()
            r7 = r2
        L42:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto Lb1
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r4.f11844b
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9
            java.lang.Object r8 = r9.get(r8)
            com.google.android.gms.internal.measurement.jc r8 = (com.google.android.gms.internal.measurement.jc) r8
            if (r8 == 0) goto L42
            com.google.android.gms.internal.measurement.qc r8 = r8.f11519a
            boolean r9 = r8.f11797e
            if (r9 != 0) goto L62
            r8 = r6
            goto Lae
        L62:
            ae.c r9 = r8.f11793a
            if (r9 == 0) goto Laa
            boolean r10 = r9.f1242a
            r11 = 3
            if (r10 != 0) goto L7c
            java.lang.Object r9 = r9.f1246e
            androidx.recyclerview.widget.r1 r9 = (androidx.recyclerview.widget.r1) r9
            int r9 = r9.f3900a
            if (r9 != r11) goto L74
            goto L7c
        L74:
            com.google.android.gms.internal.measurement.jd r9 = r8.f11800h
            boolean r9 = r9.b()
            if (r9 == 0) goto Laa
        L7c:
            monitor-enter(r8)
            ae.c r9 = r8.f11793a     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto La9
            boolean r10 = r9.f1242a     // Catch: java.lang.Throwable -> L9b
            if (r10 != 0) goto L9d
            java.lang.Object r9 = r9.f1246e     // Catch: java.lang.Throwable -> L9b
            androidx.recyclerview.widget.r1 r9 = (androidx.recyclerview.widget.r1) r9     // Catch: java.lang.Throwable -> L9b
            int r9 = r9.f3900a     // Catch: java.lang.Throwable -> L9b
            if (r9 != r11) goto L8f
            r9 = r6
            goto L90
        L8f:
            r9 = r2
        L90:
            if (r9 != 0) goto L9d
            com.google.android.gms.internal.measurement.jd r9 = r8.f11800h     // Catch: java.lang.Throwable -> L9b
            boolean r9 = r9.b()     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto La9
            goto L9d
        L9b:
            r13 = move-exception
            goto Lac
        L9d:
            r9 = 0
            r8.f11793a = r9     // Catch: java.lang.Throwable -> L9b
            com.google.android.gms.internal.measurement.s5 r9 = r8.f11799g     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r9 = r9.f11844b     // Catch: java.lang.Throwable -> L9b
            java.util.concurrent.atomic.AtomicInteger r9 = (java.util.concurrent.atomic.AtomicInteger) r9     // Catch: java.lang.Throwable -> L9b
            r9.incrementAndGet()     // Catch: java.lang.Throwable -> L9b
        La9:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9b
        Laa:
            r8 = r2
            goto Lae
        Lac:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9b
            throw r13
        Lae:
            r7 = r7 | r8
            goto L42
        Lb0:
            r7 = r2
        Lb1:
            if (r7 == 0) goto L1a
            if (r3 != 0) goto L1a
            com.google.android.gms.internal.measurement.gd r3 = r13.f11288a
            r3.a()
            r3 = r6
            goto L1a
        Lbd:
            return
        Lbe:
            r13.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s5.g(java.lang.Object):void");
    }

    @Override // j30.l
    public Object get() {
        int i11 = this.f11843a;
        Object obj = this.f11844b;
        switch (i11) {
            case 11:
                Object obj2 = oa.f11698j;
                return new wd((ArrayList) obj);
            default:
                od odVar = (od) obj;
                o30.x0 x0Var = (o30.x0) odVar.f11716c.get();
                x0Var.getClass();
                fb fbVar = (fb) odVar.f11715b.get();
                fbVar.getClass();
                aa aaVar = fbVar.f11415a;
                qz.t tVarBuilder = qz.u.builder();
                tVarBuilder.f37388a = new s5(aaVar, 8);
                tVarBuilder.f37390c = new pz.d[]{h.f11443c};
                tVarBuilder.f37389b = false;
                o30.a aVarB = fb.b(aaVar.doRead(tVarBuilder.a()));
                b3 b3Var = b3.f11274e;
                int i12 = o30.c.l;
                o30.b bVar = new o30.b(aVarB, zzmk.class, b3Var);
                aVarB.a(bVar, wd.a.E(x0Var, bVar));
                oc ocVar = new oc(odVar, 2);
                int i13 = o30.v.f31928k;
                o30.u uVar = new o30.u(bVar, ocVar);
                bVar.a(uVar, wd.a.E(x0Var, uVar));
                uVar.a(new xc(uVar, 4), x0Var);
                return uVar;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ga gaVar = (ga) this.f11844b;
        if (task.l()) {
            gaVar.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            gaVar.m(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception != null) {
            gaVar.n(exception);
        } else {
            qc.y.e();
        }
    }

    public /* synthetic */ s5(Object obj, int i11) {
        this.f11843a = i11;
        this.f11844b = obj;
    }

    public s5(b1 b1Var) {
        this.f11843a = 3;
        this.f11844b = b1Var;
        b1Var.f11269a = this;
    }

    public s5(y9 y9Var, byte[] bArr) {
        this.f11843a = 6;
        this.f11844b = bArr;
    }
}
