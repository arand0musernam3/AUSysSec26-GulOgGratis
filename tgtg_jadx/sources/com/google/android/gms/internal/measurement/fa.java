package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f11410a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f11411b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11412c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile sa f11413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile sa f11414e;

    public static int A(m2 m2Var, int i11, byte[] bArr, int i12, int i13, t1 t1Var, q0 q0Var) throws zzaeh {
        k1 k1VarA = m2Var.a();
        m2 m2Var2 = m2Var;
        byte[] bArr2 = bArr;
        int i14 = i13;
        q0 q0Var2 = q0Var;
        int iT = t(k1VarA, m2Var2, bArr2, i12, i14, q0Var2);
        m2Var2.f(k1VarA);
        q0Var2.f11774d = k1VarA;
        t1Var.add(k1VarA);
        while (iT < i14) {
            q0 q0Var3 = q0Var2;
            int i15 = i14;
            int iA = a(bArr2, iT, q0Var3);
            if (i11 != q0Var3.f11772b) {
                break;
            }
            byte[] bArr3 = bArr2;
            m2 m2Var3 = m2Var2;
            k1 k1VarA2 = m2Var3.a();
            iT = t(k1VarA2, m2Var3, bArr3, iA, i15, q0Var3);
            m2Var2 = m2Var3;
            bArr2 = bArr3;
            i14 = i15;
            q0Var2 = q0Var3;
            m2Var2.f(k1VarA2);
            q0Var2.f11774d = k1VarA2;
            t1Var.add(k1VarA2);
        }
        return iT;
    }

    public static int B(int i11, byte[] bArr, int i12, int i13, r2 r2Var, q0 q0Var) throws zzaeh {
        if ((i11 >>> 3) == 0) {
            c50.w.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int iG = g(bArr, i12, q0Var);
            r2Var.d(i11, Long.valueOf(q0Var.f11771a));
            return iG;
        }
        if (i14 == 1) {
            r2Var.d(i11, Long.valueOf(l(i12, bArr)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int iA = a(bArr, i12, q0Var);
            int i15 = q0Var.f11772b;
            if (i15 < 0) {
                c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i15 > bArr.length - iA) {
                c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i15 == 0) {
                r2Var.d(i11, u0.f11915b);
            } else {
                r2Var.d(i11, u0.j(iA, i15, bArr));
            }
            return iA + i15;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                r2Var.d(i11, Integer.valueOf(i(i12, bArr)));
                return i12 + 4;
            }
            c50.w.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i16 = (i11 & (-8)) | 4;
        r2 r2VarA = r2.a();
        int i17 = q0Var.f11773c + 1;
        q0Var.f11773c = i17;
        if (i17 >= 100) {
            c50.w.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i18 = 0;
        while (true) {
            if (i12 >= i13) {
                break;
            }
            int iA2 = a(bArr, i12, q0Var);
            int i19 = q0Var.f11772b;
            if (i19 == i16) {
                i18 = i19;
                i12 = iA2;
                break;
            }
            i12 = B(i19, bArr, iA2, i13, r2VarA, q0Var);
            i18 = i19;
        }
        q0Var.f11773c--;
        if (i12 > i13 || i18 != i16) {
            c50.w.o("Failed to parse the message.");
            return 0;
        }
        r2Var.d(i11, r2VarA);
        return i12;
    }

    public static int C(int i11, byte[] bArr, int i12, int i13, q0 q0Var) throws zzaeh {
        if ((i11 >>> 3) == 0) {
            c50.w.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return g(bArr, i12, q0Var);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return a(bArr, i12, q0Var) + q0Var.f11772b;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            c50.w.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = a(bArr, i12, q0Var);
            i16 = q0Var.f11772b;
            if (i16 == i15) {
                break;
            }
            i12 = C(i16, bArr, i12, i13, q0Var);
        }
        if (i12 <= i13 && i16 == i15) {
            return i12;
        }
        c50.w.o("Failed to parse the message.");
        return 0;
    }

    public static int a(byte[] bArr, int i11, q0 q0Var) {
        int i12 = i11 + 1;
        byte b8 = bArr[i11];
        if (b8 < 0) {
            return e(b8, bArr, i12, q0Var);
        }
        q0Var.f11772b = b8;
        return i12;
    }

    public static final File b(Uri uri) throws zzsi {
        if (!uri.getScheme().equals("file")) {
            throw new zzsi("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new zzsi("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new zzsi("Did not expect uri to have authority");
    }

    public static void c(String str, List list, int i11) {
        if (list.size() == i11) {
            return;
        }
        c50.w.h(i11, str, " operation requires ", list.size());
    }

    public static /* synthetic */ boolean d(int i11, qg qgVar, StringBuilder sb2) {
        if (i11 - 1 != 0 || qgVar == qg.f11804a) {
            return false;
        }
        sb2.append(qgVar.a());
        sb2.append('.');
        sb2.append(qgVar.b());
        sb2.append(':');
        sb2.append(qgVar.c());
        return true;
    }

    public static int e(int i11, byte[] bArr, int i12, q0 q0Var) {
        byte b8 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b8 >= 0) {
            q0Var.f11772b = i14 | (b8 << 7);
            return i13;
        }
        int i15 = i14 | ((b8 & ByteCompanionObject.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            q0Var.f11772b = i15 | (b11 << 14);
            return i16;
        }
        int i17 = i15 | ((b11 & ByteCompanionObject.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            q0Var.f11772b = i17 | (b12 << 21);
            return i18;
        }
        int i19 = i17 | ((b12 & ByteCompanionObject.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b13 = bArr[i18];
        if (b13 >= 0) {
            q0Var.f11772b = i19 | (b13 << 28);
            return i21;
        }
        int i22 = i19 | ((b13 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                q0Var.f11772b = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    public static void f(String str, List list, int i11) {
        if (list.size() >= i11) {
            return;
        }
        c50.w.h(i11, str, " operation requires at least ", list.size());
    }

    public static int g(byte[] bArr, int i11, q0 q0Var) {
        long j9 = bArr[i11];
        int i12 = i11 + 1;
        if (j9 >= 0) {
            q0Var.f11771a = j9;
            return i12;
        }
        int i13 = i11 + 2;
        byte b8 = bArr[i12];
        long j11 = (j9 & 127) | (((long) (b8 & ByteCompanionObject.MAX_VALUE)) << 7);
        int i14 = 7;
        while (b8 < 0) {
            int i15 = i13 + 1;
            byte b11 = bArr[i13];
            i14 += 7;
            j11 |= ((long) (b11 & ByteCompanionObject.MAX_VALUE)) << i14;
            b8 = b11;
            i13 = i15;
        }
        q0Var.f11771a = j11;
        return i13;
    }

    public static void h(int i11, String str, ArrayList arrayList) {
        if (arrayList.size() <= i11) {
            return;
        }
        c50.w.h(i11, str, " operation requires at most ", arrayList.size());
    }

    public static int i(int i11, byte[] bArr) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public static o30.j j(Context context, Callable callable, Executor executor) {
        s5 s5Var = new s5(callable, 9);
        if (s(context)) {
            o30.d1 d1Var = new o30.d1();
            d1Var.f31868i = new o30.c1(d1Var, s5Var);
            executor.execute(d1Var);
            return d1Var;
        }
        o30.b1 b1Var = new o30.b1();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        da daVar = new da(atomicBoolean, context, b1Var, s5Var, executor);
        context.registerReceiver(daVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!s(context) || !atomicBoolean.compareAndSet(false, true)) {
            b1Var.a(new ea(b1Var, atomicBoolean, context, daVar, 0), o30.g0.INSTANCE);
            return b1Var;
        }
        try {
            context.unregisterReceiver(daVar);
        } catch (IllegalArgumentException e5) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e5);
        }
        o30.d1 d1Var2 = new o30.d1();
        d1Var2.f31868i = new o30.c1(d1Var2, s5Var);
        executor.execute(d1Var2);
        b1Var.o(d1Var2);
        return b1Var;
    }

    public static boolean k(c5 c5Var) {
        if (c5Var == null) {
            return false;
        }
        Double dH = c5Var.h();
        return !dH.isNaN() && dH.doubleValue() >= 0.0d && dH.equals(Double.valueOf(Math.floor(dH.doubleValue())));
    }

    public static long l(int i11, byte[] bArr) {
        return (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    public static l5 m(String str) {
        l5 l5VarA = null;
        if (str != null && !str.isEmpty()) {
            l5VarA = l5.a(Integer.parseInt(str));
        }
        if (l5VarA != null) {
            return l5VarA;
        }
        i4.a.f(e0.f.k("Unsupported commandId ", str));
        return null;
    }

    public static int n(byte[] bArr, int i11, q0 q0Var) throws zzaeh {
        int iA = a(bArr, i11, q0Var);
        int i12 = q0Var.f11772b;
        if (i12 < 0) {
            c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i12 == 0) {
            q0Var.f11774d = "";
            return iA;
        }
        q0Var.f11774d = y2.d(iA, i12, bArr);
        return iA + i12;
    }

    public static boolean o(c5 c5Var, c5 c5Var2) {
        if (!c5Var.getClass().equals(c5Var2.getClass())) {
            return false;
        }
        if ((c5Var instanceof g5) || (c5Var instanceof a5)) {
            return true;
        }
        if (!(c5Var instanceof i3)) {
            return c5Var instanceof f5 ? c5Var.e().equals(c5Var2.e()) : c5Var instanceof b2 ? c5Var.d().equals(c5Var2.d()) : c5Var == c5Var2;
        }
        if (Double.isNaN(c5Var.h().doubleValue()) || Double.isNaN(c5Var2.h().doubleValue())) {
            return false;
        }
        return c5Var.h().equals(c5Var2.h());
    }

    public static int p(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3) || d3 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d3 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d3))) % 4.294967296E9d);
    }

    public static int q(byte[] bArr, int i11, q0 q0Var) throws zzaeh {
        int iA = a(bArr, i11, q0Var);
        int i12 = q0Var.f11772b;
        if (i12 < 0) {
            c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i12 > bArr.length - iA) {
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i12 == 0) {
            q0Var.f11774d = u0.f11915b;
            return iA;
        }
        q0Var.f11774d = u0.j(iA, i12, bArr);
        return iA + i12;
    }

    public static double r(double d3) {
        if (Double.isNaN(d3)) {
            return 0.0d;
        }
        if (Double.isInfinite(d3) || d3 == 0.0d || d3 == 0.0d) {
            return d3;
        }
        return ((double) (d3 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(android.content.Context r7) {
        /*
            boolean r0 = com.google.android.gms.internal.measurement.fa.f11411b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<com.google.android.gms.internal.measurement.fa> r0 = com.google.android.gms.internal.measurement.fa.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.measurement.fa.f11411b     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L54
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L4a
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.fa.f11410a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.fa.f11410a = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.fa.f11410a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L2b
            r5 = r1
            goto L4e
        L2b:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r6 != 0) goto L3b
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r7 != 0) goto L4a
        L3b:
            r5 = r1
            goto L4a
        L3d:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.fa.f11410a = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L4a:
            if (r5 == 0) goto L4e
            com.google.android.gms.internal.measurement.fa.f11410a = r4     // Catch: java.lang.Throwable -> Lf
        L4e:
            if (r5 == 0) goto L52
            com.google.android.gms.internal.measurement.fa.f11411b = r1     // Catch: java.lang.Throwable -> Lf
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.fa.s(android.content.Context):boolean");
    }

    public static int t(Object obj, m2 m2Var, byte[] bArr, int i11, int i12, q0 q0Var) throws zzaeh {
        int iE = i11 + 1;
        int i13 = bArr[i11];
        if (i13 < 0) {
            iE = e(i13, bArr, iE, q0Var);
            i13 = q0Var.f11772b;
        }
        int i14 = iE;
        if (i13 < 0 || i13 > i12 - i14) {
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i15 = q0Var.f11773c + 1;
        q0Var.f11773c = i15;
        if (i15 >= 100) {
            c50.w.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i16 = i14 + i13;
        m2Var.h(obj, bArr, i14, i16, q0Var);
        q0Var.f11773c--;
        q0Var.f11774d = obj;
        return i16;
    }

    public static Object u(c5 c5Var) {
        if (c5.f11303a0.equals(c5Var)) {
            return null;
        }
        if (c5.U.equals(c5Var)) {
            return "";
        }
        if (c5Var instanceof z4) {
            return w((z4) c5Var);
        }
        if (!(c5Var instanceof n1)) {
            return !c5Var.h().isNaN() ? c5Var.h() : c5Var.e();
        }
        ArrayList arrayList = new ArrayList();
        n1 n1Var = (n1) c5Var;
        int i11 = 0;
        while (i11 < n1Var.p()) {
            if (i11 >= n1Var.p()) {
                qc.y.h(e0.f.h(i11, "Out of bounds index: ", new StringBuilder(String.valueOf(i11).length() + 21)));
                return null;
            }
            int i12 = i11 + 1;
            Object objU = u(n1Var.q(i11));
            if (objU != null) {
                arrayList.add(objU);
            }
            i11 = i12;
        }
        return arrayList;
    }

    public static int v(Object obj, m2 m2Var, byte[] bArr, int i11, int i12, int i13, q0 q0Var) throws zzaeh {
        e2 e2Var = (e2) m2Var;
        int i14 = q0Var.f11773c + 1;
        q0Var.f11773c = i14;
        if (i14 >= 100) {
            c50.w.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iY = e2Var.y(obj, bArr, i11, i12, i13, q0Var);
        q0Var.f11773c--;
        q0Var.f11774d = obj;
        return iY;
    }

    public static HashMap w(z4 z4Var) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(z4Var.f12081a.keySet())) {
            Object objU = u(z4Var.b(str));
            if (objU != null) {
                map.put(str, objU);
            }
        }
        return map;
    }

    public static int x(int i11, byte[] bArr, int i12, int i13, t1 t1Var, q0 q0Var) {
        l1 l1Var = (l1) t1Var;
        int iA = a(bArr, i12, q0Var);
        l1Var.e(q0Var.f11772b);
        while (iA < i13) {
            int iA2 = a(bArr, iA, q0Var);
            if (i11 != q0Var.f11772b) {
                break;
            }
            iA = a(bArr, iA2, q0Var);
            l1Var.e(q0Var.f11772b);
        }
        return iA;
    }

    public static void y(b7 b7Var) {
        int iP = p(b7Var.h("runtime.counter").h().doubleValue() + 1.0d);
        if (iP <= 1000000) {
            b7Var.f("runtime.counter", new i3(Double.valueOf(iP)));
        } else {
            com.braze.h2.b("Instructions allowed exceeded");
        }
    }

    public static int z(byte[] bArr, int i11, t1 t1Var, q0 q0Var) throws zzaeh {
        l1 l1Var = (l1) t1Var;
        int iA = a(bArr, i11, q0Var);
        int i12 = q0Var.f11772b + iA;
        while (iA < i12) {
            iA = a(bArr, iA, q0Var);
            l1Var.e(q0Var.f11772b);
        }
        if (iA == i12) {
            return iA;
        }
        c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }
}
