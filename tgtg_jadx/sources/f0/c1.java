package f0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.a f16583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.n f16584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f16585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t70.a f16586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a90.d f16587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f16588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f16589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f16590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f16591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y80.g1 f16593k;
    public final u70.t l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public c1(t70.a aVar, h0.n nVar, Context context, PackageManager packageManager, j1 j1Var, t70.a aVar2, j0.h hVar, v80.i1 i1Var) {
        aVar.getClass();
        nVar.getClass();
        packageManager.getClass();
        j1Var.getClass();
        aVar2.getClass();
        hVar.getClass();
        i1Var.getClass();
        this.f16583a = aVar;
        this.f16584b = nVar;
        this.f16585c = j1Var;
        this.f16586d = aVar2;
        a90.d dVarB = v80.f0.b(kotlin.coroutines.e.c(new v80.d2(i1Var), nVar.f20988h).plus(new v80.a0("Camera2DeviceCache")));
        this.f16587e = dVarB;
        this.f16588f = new Object();
        this.f16590h = new LinkedHashMap();
        this.f16591i = new LinkedHashMap();
        int iHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        int i11 = packageManager.hasSystemFeature("android.hardware.camera.front") ? iHasSystemFeature + 1 : iHasSystemFeature;
        this.f16592j = i11;
        Log.d("CXCP", "Camera2DeviceCache: Expected minimum camera count = " + i11);
        hVar.a(j0.e.SCOPE, new d1.e(this, 11));
        y80.i iVarL = y80.r.l(y80.r.f(new d8.c(this, (x70.c) null, 17)));
        y80.x1 x1Var = new y80.x1(0L, LongCompanionObject.MAX_VALUE);
        oz.o oVarJ = y80.r.j(iVarL);
        y80.m1 m1VarA = y80.r.a(1, oVarJ.f33844a, (x80.a) oVarJ.f33846c);
        v80.f0.A(dVarB, (CoroutineContext) oVarJ.f33847d, Intrinsics.areEqual(x1Var, y80.p1.f45551a) ? v80.d0.DEFAULT : v80.d0.UNDISPATCHED, new os.c(x1Var, (y80.i) oVarJ.f33845b, m1VarA, y80.r.f45562c, (x70.c) null));
        this.f16593k = new y80.g1(m1VarA);
        this.l = u70.l.b(new cw.b(this, 11));
    }

    public static final void a(c1 c1Var, x80.u uVar, String str, boolean z11) {
        ArrayList arrayList;
        synchronized (c1Var.f16588f) {
            arrayList = c1Var.f16589g;
        }
        ArrayList arrayListD = null;
        if (z11) {
            if (arrayList == null || arrayList.isEmpty()) {
                Log.i("CXCP", "New camera " + str + " detected");
                arrayListD = c1Var.d();
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((e0.s) it.next()).f15403a, str)) {
                        break;
                    }
                }
                Log.i("CXCP", "New camera " + str + " detected");
                arrayListD = c1Var.d();
            }
        } else {
            if (z11) {
                e40.a.f();
                return;
            }
            if (arrayList == null) {
                Log.i("CXCP", "Unavailable camera " + str + " detected");
                arrayListD = c1Var.d();
                break;
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((e0.s) it2.next()).f15403a, str)) {
                        Log.i("CXCP", "Unavailable camera " + str + " detected");
                        arrayListD = c1Var.d();
                        break;
                    }
                }
            }
        }
        if (arrayListD != null && (arrayListD.size() >= c1Var.f16592j || arrayList == null)) {
            arrayList = arrayListD;
        }
        if (arrayList != null) {
            e(uVar, arrayList);
        }
    }

    public static void e(x80.u uVar, ArrayList arrayList) {
        Log.d("CXCP", "Emitting camera ID list: " + arrayList);
        if (o00.x0.H(uVar, arrayList) instanceof x80.o) {
            Log.e("CXCP", "Failed to send camera ID list: " + arrayList + '!');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, z70.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof f0.z0
            if (r0 == 0) goto L13
            r0 = r12
            f0.z0 r0 = (f0.z0) r0
            int r1 = r0.f17009n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17009n = r1
            goto L18
        L13:
            f0.z0 r0 = new f0.z0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f17009n
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            v80.i0 r11 = r0.f17007k
            java.lang.String r0 = r0.f17006j
            ba0.g.M(r12)
            r2 = r11
            r11 = r0
            goto L78
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L34:
            ba0.g.M(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            r4 = 0
            if (r12 >= r2) goto L3f
            return r4
        L3f:
            java.lang.Object r12 = r10.f16588f
            monitor-enter(r12)
            java.util.LinkedHashMap r2 = r10.f16590h     // Catch: java.lang.Throwable -> L65
            e0.s r5 = new e0.s     // Catch: java.lang.Throwable -> L65
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L65
            if (r6 != 0) goto L67
            a90.d r6 = r10.f16587e     // Catch: java.lang.Throwable -> L65
            h0.n r7 = r10.f16584b     // Catch: java.lang.Throwable -> L65
            v80.x r7 = r7.f20986f     // Catch: java.lang.Throwable -> L65
            aa.l0 r8 = new aa.l0     // Catch: java.lang.Throwable -> L65
            r9 = 17
            r8.<init>(r11, r10, r4, r9)     // Catch: java.lang.Throwable -> L65
            r9 = 2
            v80.j0 r6 = v80.f0.f(r6, r7, r4, r8, r9)     // Catch: java.lang.Throwable -> L65
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L65
            goto L67
        L65:
            r11 = move-exception
            goto La6
        L67:
            r2 = r6
            v80.i0 r2 = (v80.i0) r2     // Catch: java.lang.Throwable -> L65
            monitor-exit(r12)
            r0.f17006j = r11
            r0.f17007k = r2
            r0.f17009n = r3
            java.lang.Object r12 = r2.H(r0)
            if (r12 != r1) goto L78
            return r1
        L78:
            h1.d r12 = (h1.d) r12
            if (r12 != 0) goto La5
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing null CameraDeviceSetupCompat from cache for "
            r1.<init>(r3)
            java.lang.String r3 = e0.s.b(r11)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.Object r0 = r10.f16588f
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r10.f16590h     // Catch: java.lang.Throwable -> La2
            e0.s r3 = new e0.s     // Catch: java.lang.Throwable -> La2
            r3.<init>(r11)     // Catch: java.lang.Throwable -> La2
            r1.remove(r3, r2)     // Catch: java.lang.Throwable -> La2
            monitor-exit(r0)
            return r12
        La2:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        La5:
            return r12
        La6:
            monitor-exit(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c1.b(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r11, z70.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof f0.a1
            if (r0 == 0) goto L13
            r0 = r12
            f0.a1 r0 = (f0.a1) r0
            int r1 = r0.f16563n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16563n = r1
            goto L18
        L13:
            f0.a1 r0 = new f0.a1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16563n
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            v80.i0 r11 = r0.f16561k
            java.lang.String r0 = r0.f16560j
            ba0.g.M(r12)
            r2 = r11
            r11 = r0
            goto L6f
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L34:
            ba0.g.M(r12)
            java.lang.Object r12 = r10.f16588f
            monitor-enter(r12)
            java.util.LinkedHashMap r2 = r10.f16591i     // Catch: java.lang.Throwable -> L5c
            e0.s r4 = new e0.s     // Catch: java.lang.Throwable -> L5c
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L5e
            a90.d r5 = r10.f16587e     // Catch: java.lang.Throwable -> L5c
            h0.n r6 = r10.f16584b     // Catch: java.lang.Throwable -> L5c
            v80.x r6 = r6.f20986f     // Catch: java.lang.Throwable -> L5c
            f0.b1 r7 = new f0.b1     // Catch: java.lang.Throwable -> L5c
            r8 = 0
            r7.<init>(r11, r10, r8)     // Catch: java.lang.Throwable -> L5c
            r9 = 2
            v80.j0 r5 = v80.f0.f(r5, r6, r8, r7, r9)     // Catch: java.lang.Throwable -> L5c
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r11 = move-exception
            goto L9d
        L5e:
            r2 = r5
            v80.i0 r2 = (v80.i0) r2     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r12)
            r0.f16560j = r11
            r0.f16561k = r2
            r0.f16563n = r3
            java.lang.Object r12 = r2.H(r0)
            if (r12 != r1) goto L6f
            return r1
        L6f:
            f0.i1 r12 = (f0.i1) r12
            if (r12 != 0) goto L9c
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing null camera2DeviceSetupWrapper from cache for "
            r1.<init>(r3)
            java.lang.String r3 = e0.s.b(r11)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.Object r0 = r10.f16588f
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r10.f16591i     // Catch: java.lang.Throwable -> L99
            e0.s r3 = new e0.s     // Catch: java.lang.Throwable -> L99
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L99
            r1.remove(r3, r2)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r0)
            return r12
        L99:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        L9c:
            return r12
        L9d:
            monitor-exit(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c1.c(java.lang.String, z70.c):java.lang.Object");
    }

    public final ArrayList d() {
        try {
            String[] cameraIdList = ((CameraManager) this.f16583a.get()).getCameraIdList();
            cameraIdList.getClass();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                str.getClass();
                e0.s.a(str);
                arrayList.add(new e0.s(str));
            }
            if (arrayList.size() < this.f16592j) {
                Log.w("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
                return arrayList;
            }
            synchronized (this.f16588f) {
                this.f16589g = arrayList;
            }
            Log.i("CXCP", "Loaded CameraIdList " + arrayList);
            return arrayList;
        } catch (CameraAccessException e5) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e5);
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", e11);
            return null;
        } catch (NullPointerException e12) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", e12);
            return null;
        }
    }
}
