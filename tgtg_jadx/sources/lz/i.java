package lz;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import androidx.camera.core.impl.utils.InterruptedRuntimeException;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import com.app.tgtg.MainApplication;
import com.braze.models.BrazeGeofence;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.common.util.concurrent.ListenableFuture;
import ed.l;
import ed.m;
import h7.e1;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.i0;
import kotlin.collections.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import m0.i1;
import m0.v;
import m90.z0;
import o.w;
import org.json.JSONException;
import org.json.JSONObject;
import qz.q;
import s0.m0;
import s0.s1;
import s0.u0;
import w2.z;
import z5.o;
import z5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class i implements s1, d10.e, d10.d, d10.c, e20.j, m, q, x0.c, w, e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i f28444c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f28446b;

    public i(int i11) {
        this.f28445a = i11;
        switch (i11) {
            case 4:
                this.f28446b = new Bundle();
                break;
            case 8:
                this.f28446b = new CountDownLatch(1);
                break;
            case 10:
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                this.f28446b = o0Var;
                break;
            case 16:
                this.f28446b = e90.d.a();
                break;
            case 22:
                this.f28446b = new LinkedHashMap();
                break;
            case 24:
                this.f28446b = null;
                break;
            default:
                this.f28446b = (LargeJpegImageQuirk) z0.a.f46383a.b(LargeJpegImageQuirk.class);
                break;
        }
    }

    public static synchronized i H(Context context) {
        i iVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (i.class) {
            iVar = f28444c;
            if (iVar == null) {
                iVar = new i(applicationContext, 0);
                f28444c = iVar;
            }
        }
        return iVar;
        return iVar;
    }

    public void A(float f11) {
        ((Parcel) this.f28446b).writeFloat(f11);
    }

    public void B(long j9) {
        long jB = o.b(j9);
        byte b8 = 0;
        if (!p.a(jB, 0L)) {
            if (p.a(jB, 4294967296L)) {
                b8 = 1;
            } else if (p.a(jB, 8589934592L)) {
                b8 = 2;
            }
        }
        z(b8);
        if (p.a(o.b(j9), 0L)) {
            return;
        }
        A(o.c(j9));
    }

    public ag.i C() {
        return new ag.i(new l8.m((MainApplication) this.f28446b, false), new qb.e(), new r40.d(), new n20.f(22), new qb.e(), new n20.f(23));
    }

    public int D(byte[] bArr) {
        int i11;
        byte b8;
        if (((LargeJpegImageQuirk) this.f28446b) == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.f2223a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.b() || bArr.length > 10000000)) {
            return bArr.length;
        }
        int i12 = 2;
        while (true) {
            if (i12 + 4 <= bArr.length && (b8 = bArr[i12]) == -1) {
                int i13 = i12 + 2;
                int i14 = ((bArr[i13] & 255) << 8) | (bArr[i12 + 3] & 255);
                if (b8 == -1 && bArr[i12 + 1] == -38) {
                    while (true) {
                        i11 = i13 + 2;
                        if (i11 <= bArr.length) {
                            if (bArr[i13] == -1 && bArr[i13 + 1] == -39) {
                                break;
                            }
                            i13++;
                        } else {
                            break;
                        }
                    }
                } else {
                    i12 += i14 + 2;
                }
            } else {
                break;
            }
        }
        i11 = -1;
        return i11 != -1 ? i11 : bArr.length;
    }

    public void E(String str, Object obj) {
        Object[] objArr;
        str.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f28446b;
        if (obj == null) {
            obj = null;
        } else {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj.getClass());
            if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String[].class))) {
                int i11 = 0;
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = ib.i.f23739a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i11 < length) {
                        objArr[i11] = Boolean.valueOf(zArr[i11]);
                        i11++;
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = ib.i.f23739a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i11 < length2) {
                        objArr[i11] = Byte.valueOf(bArr[i11]);
                        i11++;
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = ib.i.f23739a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i11 < length3) {
                        objArr[i11] = Integer.valueOf(iArr[i11]);
                        i11++;
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = ib.i.f23739a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i11 < length4) {
                        objArr[i11] = Long.valueOf(jArr[i11]);
                        i11++;
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = ib.i.f23739a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i11 < length5) {
                        objArr[i11] = Float.valueOf(fArr[i11]);
                        i11++;
                    }
                } else {
                    if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(double[].class))) {
                        i1.k("Key ", str, " has invalid type ", orCreateKotlinClass);
                        return;
                    }
                    double[] dArr = (double[]) obj;
                    String str7 = ib.i.f23739a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i11 < length6) {
                        objArr[i11] = Double.valueOf(dArr[i11]);
                        i11++;
                    }
                }
                obj = objArr;
            }
        }
        linkedHashMap.put(str, obj);
    }

    public void F(HashMap map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            E((String) entry.getKey(), entry.getValue());
        }
    }

    public JSONObject G() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f28446b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(a40.g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e5) {
                        e = e5;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        a40.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    a40.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            a40.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            a40.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public synchronized void I() {
        b bVar = (b) this.f28446b;
        ReentrantLock reentrantLock = bVar.f28432a;
        reentrantLock.lock();
        try {
            bVar.f28433b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        f00.c cVar = (f00.c) this.f28446b;
        f00.b bVar = new f00.b((d10.g) obj2);
        f00.j jVar = (f00.j) ((f00.d) obj).getService();
        String str = cVar.f17031a;
        Parcel parcelA = jVar.a();
        int i11 = f00.g.f17037a;
        parcelA.writeStrongBinder(bVar);
        parcelA.writeString(str);
        jVar.b(2, parcelA);
    }

    @Override // ed.m
    public boolean e() {
        boolean z11;
        l lVar = l.f15930a;
        ed.o oVar = (ed.o) this.f28446b;
        synchronized (lVar) {
            try {
                int i11 = l.f15932c;
                l.f15932c = i11 + 1;
                if (i11 >= 30 || SystemClock.uptimeMillis() > l.f15933d + ((long) BrazeGeofence.DEFAULT_NOTIFICATION_RESPONSIVENESS_MS)) {
                    l.f15932c = 0;
                    l.f15933d = SystemClock.uptimeMillis();
                    String[] list = l.f15931b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    int length = list.length;
                    boolean z12 = length < 800;
                    l.f15934e = z12;
                    if (!z12 && oVar != null && oVar.getLevel() <= 5) {
                        oVar.log("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                    }
                }
                z11 = l.f15934e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // s0.s1
    public u0 getConfig() {
        return (u0) this.f28446b;
    }

    @Override // o.w
    public void h(o.l lVar, boolean z11) {
        k.w wVar;
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) this.f28446b;
        o.l lVarK = lVar.k();
        int i11 = 0;
        boolean z12 = lVarK != lVar;
        if (z12) {
            lVar = lVarK;
        }
        k.w[] wVarArr = aVar.L;
        int length = wVarArr != null ? wVarArr.length : 0;
        while (true) {
            if (i11 < length) {
                wVar = wVarArr[i11];
                if (wVar != null && wVar.f25597h == lVar) {
                    break;
                } else {
                    i11++;
                }
            } else {
                wVar = null;
                break;
            }
        }
        if (wVar != null) {
            if (!z12) {
                aVar.Q(wVar, z11);
            } else {
                aVar.O(wVar.f25590a, wVar, lVarK);
                aVar.Q(wVar, true);
            }
        }
    }

    @Override // d10.c
    public void onCanceled() {
        ((CountDownLatch) this.f28446b).countDown();
    }

    @Override // x0.c
    public void onFailure(Throwable th2) throws Throwable {
        ListenableFuture listenableFuture;
        i1.d dVar = (i1.d) this.f28446b;
        d1.e eVar = new d1.e(dVar, 22);
        if (a.a.E()) {
            eVar.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            pd.g.n("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new mr.h(29, eVar, countDownLatch)));
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e5) {
                throw new InterruptedRuntimeException(e5);
            }
        }
        m0.w wVar = dVar.f22764d;
        if (wVar != null) {
            wVar.getClass();
            m0 m0Var = wVar.f28628n;
            m0Var.getClass();
            i0.v(m0Var.f38398n, new z0(dVar, 25));
            m0.w wVar2 = dVar.f22764d;
            wVar2.getClass();
            synchronized (wVar2.f28617b) {
                try {
                    wVar2.f28620e.removeCallbacksAndMessages("retry_token");
                    int iOrdinal = wVar2.f28630p.ordinal();
                    if (iOrdinal == 0) {
                        wVar2.f28630p = v.SHUTDOWN;
                        listenableFuture = x0.i.f43629c;
                    } else {
                        if (iOrdinal == 1) {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                        if (iOrdinal == 2 || iOrdinal == 3) {
                            wVar2.f28630p = v.SHUTDOWN;
                            m0.w.a(wVar2.f28632r);
                            wVar2.f28631q = ox.h.A(new e.b(wVar2, 27));
                        }
                        listenableFuture = wVar2.f28631q;
                    }
                } finally {
                }
            }
        } else {
            listenableFuture = x0.i.f43629c;
        }
        listenableFuture.getClass();
        synchronized (dVar.f22761a) {
            dVar.f22762b = null;
            dVar.f22763c = listenableFuture;
            dVar.f22767g.clear();
            dVar.f22768h.clear();
        }
        dVar.e(null, null);
    }

    @Override // d10.e
    public void onSuccess(Object obj) {
        switch (this.f28445a) {
            case 8:
                ((CountDownLatch) this.f28446b).countDown();
                break;
            default:
                break;
        }
    }

    @Override // ed.m
    public boolean s(ad.h hVar) {
        a.a aVar = hVar.f1227a;
        if ((aVar instanceof ad.a ? ((ad.a) aVar).f1221b : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        a.a aVar2 = hVar.f1228b;
        return (aVar2 instanceof ad.a ? ((ad.a) aVar2).f1221b : Integer.MAX_VALUE) > 100;
    }

    @Override // o.w
    public boolean v(o.l lVar) {
        Window.Callback callback;
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) this.f28446b;
        if (lVar != lVar.k() || !aVar.F || (callback = aVar.l.getCallback()) == null || aVar.Q) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, z70.c r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof ao.s1
            if (r0 == 0) goto L13
            r0 = r9
            ao.s1 r0 = (ao.s1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.s1 r0 = new ao.s1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f4448j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r9)
            u70.q r9 = (u70.q) r9
            java.lang.Object r5 = r9.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r9)
            java.lang.Object r9 = r4.f28446b
            kt.g r9 = (kt.g) r9
            com.app.tgtg.model.remote.manufacturer.request.FindAddressMatchRequest r2 = new com.app.tgtg.model.remote.manufacturer.request.FindAddressMatchRequest
            r2.<init>(r6, r7, r8, r5)
            r0.l = r3
            java.lang.Object r5 = r9.a(r2, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.i.x(int, java.lang.String, java.lang.String, java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.t1
            if (r0 == 0) goto L13
            r0 = r6
            ao.t1 r0 = (ao.t1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.t1 r0 = new ao.t1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4456j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.Object r6 = r4.f28446b
            kt.g r6 = (kt.g) r6
            com.app.tgtg.model.remote.manufacturer.request.MatchAddressRequest r2 = new com.app.tgtg.model.remote.manufacturer.request.MatchAddressRequest
            r2.<init>(r5)
            r0.l = r3
            java.lang.Object r5 = r6.b(r2, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.i.y(java.lang.String, z70.c):java.lang.Object");
    }

    public void z(byte b8) {
        ((Parcel) this.f28446b).writeByte(b8);
    }

    public /* synthetic */ i(Object obj, int i11) {
        this.f28445a = i11;
        this.f28446b = obj;
    }

    public i(Context context, int i11) {
        String strE;
        this.f28445a = i11;
        switch (i11) {
            case 9:
                i30.g gVar = new i30.g(context, 0);
                this.f28446b = i30.e.b(new a50.c(i30.e.b(new z(gVar, i30.e.b(d30.i.f14027b), new d30.b(gVar))), 14));
                break;
            default:
                b bVarA = b.a(context);
                this.f28446b = bVarA;
                bVarA.b();
                String strE2 = bVarA.e("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strE2) && (strE = bVarA.e(b.f("googleSignInOptions", strE2))) != null) {
                    try {
                        GoogleSignInOptions.d(strE);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                break;
        }
    }

    public i(kt.g gVar) {
        this.f28445a = 3;
        gVar.getClass();
        this.f28446b = gVar;
    }

    public /* synthetic */ i(int i11, boolean z11) {
        this.f28445a = i11;
    }

    public i(g40.b bVar) {
        this.f28445a = 20;
        this.f28446b = new File((File) bVar.f20002c, "com.crashlytics.settings.json");
    }

    public i(u0 u0Var) {
        this.f28445a = 7;
        u0Var.getClass();
        this.f28446b = u0Var;
    }

    public i(boolean z11) {
        this.f28445a = 17;
        this.f28446b = new AtomicBoolean(z11);
    }

    @Override // d10.d
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f28446b).countDown();
    }
}
