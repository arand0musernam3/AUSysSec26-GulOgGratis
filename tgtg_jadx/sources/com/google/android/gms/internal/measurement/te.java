package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.Log;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class te implements w2.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f11897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f11900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f11901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f11902j;

    @Override // w2.v
    public int a() {
        return ((a3.j) this.f11895c).a();
    }

    @Override // w2.v
    public long b(long j9) {
        return ((w2.s1) ((a3.j) this.f11894b).f399c).e(j9);
    }

    @Override // w2.v
    public long c(long j9) {
        return ((w2.s1) ((a3.j) this.f11894b).f399c).f(j9);
    }

    public void d(String str, String str2) {
        HashMap map = (HashMap) this.f11899g;
        if (map != null) {
            map.put(str, str2);
        } else {
            com.braze.h2.b("Property \"autoMetadata\" has not been set");
        }
    }

    public wy.h e() {
        String strConcat = ((String) this.f11894b) == null ? " transportName" : "";
        if (((wy.k) this.f11896d) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f11897e) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.f11898f) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f11899g) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new wy.h((String) this.f11894b, (Integer) this.f11895c, (wy.k) this.f11896d, ((Long) this.f11897e).longValue(), ((Long) this.f11898f).longValue(), (HashMap) this.f11899g, (Integer) this.f11900h, (String) this.f11901i, (byte[]) this.f11893a, (byte[]) this.f11902j);
        }
        com.braze.h2.b("Missing required properties:".concat(strConcat));
        return null;
    }

    public LinkedHashSet f(List list) throws InitializationException {
        String strQ;
        u70.t tVar = (u70.t) this.f11900h;
        a0.a aVar = (a0.a) tVar.getValue();
        m0.s sVar = (m0.s) this.f11895c;
        List<String> listR0 = CollectionsKt.r0(list);
        ub.a aVar2 = (ub.a) this.f11896d;
        aVar.getClass();
        listR0.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            j0.b bVarA = aVar.a();
            if (sVar != null) {
                try {
                    strQ = u00.d.q(bVarA, sVar.b());
                } catch (IllegalStateException e5) {
                    if (wd.a.B(3, "CXCP")) {
                        Log.d("CXCP", "Unable to get Metadata for cameraID 0 and/or 1", e5);
                    }
                    strQ = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listR0) {
                    if (!Intrinsics.areEqual(str, strQ)) {
                        a0.a aVar3 = aVar.f15b;
                        e0.s.a(str);
                        s0.g0 g0VarQ = ((s0.i0) new a0.c(aVar3, new a50.c(str, 1), aVar2).f44z.get()).q();
                        g0VarQ.getClass();
                        arrayList2.add(g0VarQ);
                    }
                }
                for (m0.q qVar : sVar.a(arrayList2)) {
                    qVar.getClass();
                    String strD = ((s0.g0) qVar).d();
                    strD.getClass();
                    arrayList.add(strD);
                }
                listR0 = arrayList;
            }
            j0.b bVarA2 = ((a0.a) tVar.getValue()).a();
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : listR0) {
                if (Intrinsics.areEqual(str2, "0") || Intrinsics.areEqual(str2, "1")) {
                    arrayList3.add(str2);
                } else if (pd.g.A(bVarA2, str2)) {
                    arrayList3.add(str2);
                } else if (wd.a.B(3, "CXCP")) {
                    Log.d("CXCP", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e11) {
            if (wd.a.B(6, "CXCP")) {
                Log.e("CXCP", "Error while accessing info about cameras.", e11);
            }
            throw new InitializationException(e11);
        }
    }

    public void g(Function1 function1) {
        a3.j jVar = (a3.j) this.f11894b;
        jVar.f398b++;
        ((o3.e) jVar.f400d).b(function1);
        jVar.i();
    }

    public Set h() {
        synchronized (this.f11901i) {
            if (((AtomicBoolean) this.f11902j).get()) {
                return kotlin.collections.p0.f26531a;
            }
            return new LinkedHashSet((Collection) this.f11893a);
        }
    }

    public s0.i0 i(String str) throws CameraUpdateException {
        str.getClass();
        if (((AtomicBoolean) this.f11902j).get()) {
            throw new CameraUpdateException("CameraFactory has been shut down.");
        }
        a0.a aVar = ((a0.a) ((u70.t) this.f11900h).getValue()).f15b;
        e0.s.a(str);
        return (s0.i0) new a0.c(aVar, new a50.c(str, 1), (ub.a) this.f11896d).f44z.get();
    }

    public void j(List list) {
        list.getClass();
        if (((AtomicBoolean) this.f11902j).get()) {
            return;
        }
        LinkedHashSet linkedHashSetF = f(list);
        synchronized (this.f11901i) {
            try {
                if (((AtomicBoolean) this.f11902j).get()) {
                    return;
                }
                if (Intrinsics.areEqual(this.f11893a, linkedHashSetF)) {
                    return;
                }
                if (wd.a.B(3, "CXCP")) {
                    Log.d("CXCP", "Updated available camera list: " + this.f11893a + " -> " + linkedHashSetF);
                }
                this.f11893a = linkedHashSetF;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023 A[Catch: all -> 0x0017, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:13:0x001b, B:14:0x001d, B:16:0x0023, B:17:0x003f, B:18:0x0044), top: B:25:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.common.util.concurrent.ListenableFuture k(com.google.android.gms.internal.measurement.zc r9, java.util.concurrent.Executor r10) {
        /*
            r8 = this;
            java.lang.Object r1 = r8.f11893a
            monitor-enter(r1)
            java.lang.Object r0 = r8.f11896d     // Catch: java.lang.Throwable -> L17
            com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L1d
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r8.f11896d     // Catch: java.lang.Throwable -> L17 java.util.concurrent.ExecutionException -> L1a
            com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0     // Catch: java.lang.Throwable -> L17 java.util.concurrent.ExecutionException -> L1a
            o30.o0.b(r0)     // Catch: java.lang.Throwable -> L17 java.util.concurrent.ExecutionException -> L1a
            goto L1d
        L17:
            r0 = move-exception
            r9 = r0
            goto L5d
        L1a:
            r0 = 0
            r8.f11896d = r0     // Catch: java.lang.Throwable -> L17
        L1d:
            java.lang.Object r0 = r8.f11896d     // Catch: java.lang.Throwable -> L17
            com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L3f
            java.lang.Object r0 = r8.f11902j     // Catch: java.lang.Throwable -> L17
            k8.d r0 = (k8.d) r0     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.measurement.re r2 = new com.google.android.gms.internal.measurement.re     // Catch: java.lang.Throwable -> L17
            r3 = 0
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.measurement.i5 r2 = com.google.android.gms.internal.measurement.ag.a(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r8.f11898f     // Catch: java.lang.Throwable -> L17
            o30.a1 r3 = (o30.a1) r3     // Catch: java.lang.Throwable -> L17
            com.google.common.util.concurrent.ListenableFuture r0 = r0.y(r2, r3)     // Catch: java.lang.Throwable -> L17
            com.google.common.util.concurrent.ListenableFuture r0 = o30.o0.e(r0)     // Catch: java.lang.Throwable -> L17
            r8.f11896d = r0     // Catch: java.lang.Throwable -> L17
        L3f:
            java.lang.Object r0 = r8.f11896d     // Catch: java.lang.Throwable -> L17
            r4 = r0
            com.google.common.util.concurrent.ListenableFuture r4 = (com.google.common.util.concurrent.ListenableFuture) r4     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r8.f11902j
            k8.d r0 = (k8.d) r0
            com.google.android.gms.internal.measurement.b7 r2 = new com.google.android.gms.internal.measurement.b7
            r7 = 2
            r3 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            com.google.android.gms.internal.measurement.i5 r9 = com.google.android.gms.internal.measurement.ag.a(r2)
            o30.g0 r10 = o30.g0.INSTANCE
            com.google.common.util.concurrent.ListenableFuture r9 = r0.y(r9, r10)
            return r9
        L5d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.te.k(com.google.android.gms.internal.measurement.zc, java.util.concurrent.Executor):com.google.common.util.concurrent.ListenableFuture");
    }

    public n0 l(Uri uri) throws IOException {
        we weVar = (we) this.f11897e;
        String str = (String) this.f11894b;
        wd wdVar = (wd) this.f11899g;
        try {
            try {
                h1 h1Var = (h1) this.f11901i;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5);
                sb2.append("Read ");
                sb2.append(str);
                String string = sb2.toString();
                bg bgVar = bg.zza;
                h1Var.getClass();
                pf pfVarD = h1.d(string, bgVar);
                try {
                    InputStream inputStreamD = gg.d(wdVar.b(uri));
                    try {
                        k1 k1VarA = ((j1) ((h2) weVar.f12009a.s(7))).a(inputStreamD, weVar.f12010b);
                        if (inputStreamD != null) {
                            inputStreamD.close();
                        }
                        pfVarD.close();
                        return k1VarA;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        pfVarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e5) {
                throw h.a(wdVar, uri, e5, str);
            }
        } catch (FileNotFoundException e11) {
            ud udVarB = wdVar.b(uri);
            if (udVarB.f11939a.b(udVarB.f11942d)) {
                throw e11;
            }
            return weVar.f12009a;
        }
    }

    public void m(Uri uri, Object obj) throws IOException {
        String str = (String) this.f11894b;
        wd wdVar = (wd) this.f11899g;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            h1 h1Var = (h1) this.f11901i;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6);
            sb2.append("Write ");
            sb2.append(str);
            String string = sb2.toString();
            bg bgVar = bg.zza;
            h1Var.getClass();
            pf pfVarD = h1.d(string, bgVar);
            try {
                i5 i5Var = new i5(6);
                try {
                    ud udVarB = wdVar.b(uriBuild);
                    ArrayList arrayListA = udVarB.a(udVarB.f11939a.d(udVarB.f11942d));
                    new i5[]{i5Var}[0].d(arrayListA);
                    OutputStream outputStream = (OutputStream) arrayListA.get(0);
                    try {
                        ((n0) obj).b(outputStream);
                        if (((ee) i5Var.f11488c) == null) {
                            throw new zzsk("Cannot sync underlying stream");
                        }
                        ((OutputStream) i5Var.f11487b).flush();
                        ((ee) i5Var.f11488c).f11390a.getFD().sync();
                        outputStream.close();
                        pfVarD.close();
                        ud udVarB2 = wdVar.b(uriBuild);
                        ud udVarB3 = wdVar.b(uri);
                        ke keVar = udVarB2.f11939a;
                        if (keVar != udVarB3.f11939a) {
                            throw new zzsk("Cannot rename file across backends");
                        }
                        keVar.g(udVarB2.f11942d, udVarB3.f11942d);
                    } catch (Throwable th2) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e5) {
                    throw h.a(wdVar, uri, e5, str);
                }
            } finally {
            }
        } catch (IOException e11) {
            ud udVarB4 = wdVar.b(uriBuild);
            if (udVarB4.f11939a.b(udVarB4.f11942d)) {
                try {
                    ud udVarB5 = wdVar.b(uriBuild);
                    udVarB5.f11939a.f(udVarB5.f11942d);
                } catch (IOException e12) {
                    e11.addSuppressed(e12);
                }
            }
            throw e11;
        }
    }
}
