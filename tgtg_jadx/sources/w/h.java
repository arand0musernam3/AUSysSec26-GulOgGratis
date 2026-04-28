package w;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import b0.m1;
import e0.r1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import s0.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements s0.g0, r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.n f42683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a50.c f42684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f42685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.b f42686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.i f42687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u70.t f42688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u70.t f42689g;

    public h(b0.n nVar, a50.c cVar, o oVar, d dVar, b0.j jVar, m1 m1Var, y.b bVar, y0 y0Var, x.i iVar, c0.e eVar, ub.a aVar) {
        String str;
        nVar.getClass();
        cVar.getClass();
        oVar.getClass();
        dVar.getClass();
        jVar.getClass();
        m1Var.getClass();
        bVar.getClass();
        y0Var.getClass();
        iVar.getClass();
        eVar.getClass();
        aVar.getClass();
        this.f42683a = nVar;
        this.f42684b = cVar;
        this.f42685c = oVar;
        this.f42686d = bVar;
        this.f42687e = iVar;
        e0.v vVar = nVar.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        f0.t0 t0Var = (f0.t0) vVar;
        t0Var.getClass();
        Object objC = t0Var.c(key);
        Integer num = (Integer) (objC != null ? objC : -1);
        if (num.intValue() == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (num.intValue() == 4) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else if (num.intValue() == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (num.intValue() == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (num.intValue() == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else {
            str = "Unknown value: " + num;
        }
        if (wd.a.B(4, "CXCP")) {
            Log.i("CXCP", "Device Level: ".concat(str));
        }
        final int i11 = 0;
        u70.l.b(new Function0(this) { // from class: w.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f42680b;

            {
                this.f42680b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        b0.n nVar2 = this.f42680b.f42683a;
                        Set set = (Set) ((f0.t0) nVar2.f5321b).f16911h.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            String str2 = ((e0.s) it.next()).f15403a;
                            a50.c cVar2 = new a50.c(str2, 1);
                            f0.t0 t0Var2 = (f0.t0) nVar2.f5321b;
                            t0Var2.getClass();
                            if (!((Set) t0Var2.f16911h.getValue()).contains(new e0.s(str2))) {
                                throw new IllegalStateException((((Object) e0.s.b(str2)) + " is not a valid physical camera on " + t0Var2).toString());
                            }
                            linkedHashSet.add(new g0(new b0.n(cVar2, t0Var2.f16906c.d(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        e0.u uVar = e0.v.f15412i0;
                        e0.v vVar2 = this.f42680b.f42683a.f5321b;
                        uVar.getClass();
                        return Boolean.valueOf(e0.u.c(vVar2));
                    default:
                        b0.n nVar3 = this.f42680b.f42683a;
                        nVar3.getClass();
                        d0.b bVar2 = new d0.b();
                        Object obj = nVar3.f5320a.f822b;
                        return bVar2;
                }
            }
        });
        final int i12 = 1;
        this.f42688f = u70.l.b(new Function0(this) { // from class: w.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f42680b;

            {
                this.f42680b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        b0.n nVar2 = this.f42680b.f42683a;
                        Set set = (Set) ((f0.t0) nVar2.f5321b).f16911h.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            String str2 = ((e0.s) it.next()).f15403a;
                            a50.c cVar2 = new a50.c(str2, 1);
                            f0.t0 t0Var2 = (f0.t0) nVar2.f5321b;
                            t0Var2.getClass();
                            if (!((Set) t0Var2.f16911h.getValue()).contains(new e0.s(str2))) {
                                throw new IllegalStateException((((Object) e0.s.b(str2)) + " is not a valid physical camera on " + t0Var2).toString());
                            }
                            linkedHashSet.add(new g0(new b0.n(cVar2, t0Var2.f16906c.d(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        e0.u uVar = e0.v.f15412i0;
                        e0.v vVar2 = this.f42680b.f42683a.f5321b;
                        uVar.getClass();
                        return Boolean.valueOf(e0.u.c(vVar2));
                    default:
                        b0.n nVar3 = this.f42680b.f42683a;
                        nVar3.getClass();
                        d0.b bVar2 = new d0.b();
                        Object obj = nVar3.f5320a.f822b;
                        return bVar2;
                }
            }
        });
        final int i13 = 2;
        this.f42689g = u70.l.b(new Function0(this) { // from class: w.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f42680b;

            {
                this.f42680b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        b0.n nVar2 = this.f42680b.f42683a;
                        Set set = (Set) ((f0.t0) nVar2.f5321b).f16911h.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            String str2 = ((e0.s) it.next()).f15403a;
                            a50.c cVar2 = new a50.c(str2, 1);
                            f0.t0 t0Var2 = (f0.t0) nVar2.f5321b;
                            t0Var2.getClass();
                            if (!((Set) t0Var2.f16911h.getValue()).contains(new e0.s(str2))) {
                                throw new IllegalStateException((((Object) e0.s.b(str2)) + " is not a valid physical camera on " + t0Var2).toString());
                            }
                            linkedHashSet.add(new g0(new b0.n(cVar2, t0Var2.f16906c.d(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        e0.u uVar = e0.v.f15412i0;
                        e0.v vVar2 = this.f42680b.f42683a.f5321b;
                        uVar.getClass();
                        return Boolean.valueOf(e0.u.c(vVar2));
                    default:
                        b0.n nVar3 = this.f42680b.f42683a;
                        nVar3.getClass();
                        d0.b bVar2 = new d0.b();
                        Object obj = nVar3.f5320a.f822b;
                        return bVar2;
                }
            }
        });
    }

    @Override // s0.g0
    public final Set a() {
        return ((x.b) a70.a.c(this.f42683a.f5321b).f26718b).a();
    }

    @Override // m0.q
    public final int b() {
        return n(0);
    }

    @Override // s0.g0
    public final boolean c() {
        e0.v vVar = this.f42683a.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((f0.t0) vVar).c(key);
        return iArr != null && kotlin.collections.y.t(iArr, 1);
    }

    @Override // s0.g0
    public final String d() {
        return (String) this.f42684b.f822b;
    }

    @Override // s0.g0
    public final Rect i() {
        e0.v vVar = this.f42683a.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Rect rect = (Rect) ((f0.t0) vVar).c(key);
        if (Intrinsics.areEqual("robolectric", Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // m0.q
    public final androidx.lifecycle.k0 j() {
        return this.f42685c.f42730c;
    }

    @Override // m0.q
    public final int k() {
        e0.v vVar = this.f42683a.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object objC = ((f0.t0) vVar).c(key);
        objC.getClass();
        int iIntValue = ((Number) objC).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        int i11 = 1;
        if (iIntValue != 1) {
            i11 = 2;
            if (iIntValue != 2) {
                if (!wd.a.B(5, "CXCP")) {
                    return -1;
                }
                Log.w("CXCP", "Unrecognized lens facing: " + iIntValue + '!');
                return -1;
            }
        }
        return i11;
    }

    @Override // m0.q
    public final String l() {
        return ((Boolean) this.f42688f.getValue()).booleanValue() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // s0.g0
    public final List m(int i11) {
        List listT;
        Size[] sizeArrA = this.f42687e.a(i11);
        return (sizeArrA == null || (listT = kotlin.collections.y.T(sizeArrA)) == null) ? kotlin.collections.n0.f26529a : listT;
    }

    @Override // m0.q
    public final int n(int i11) {
        e0.v vVar = this.f42683a.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object objC = ((f0.t0) vVar).c(key);
        objC.getClass();
        return z20.b.p(z20.b.D(i11), ((Number) objC).intValue(), 1 == k());
    }

    @Override // s0.g0
    public final Object o() {
        Object objT = ((f0.t0) this.f42683a.f5321b).t(Reflection.getOrCreateKotlinClass(CameraCharacteristics.class));
        objT.getClass();
        return (CameraCharacteristics) objT;
    }

    @Override // m0.q
    public final boolean q() {
        return u00.d.E(this.f42683a);
    }

    @Override // s0.g0
    public final s0.r1 s() {
        return this.f42686d.a();
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        if (r8.k.D(kClass, d0.b.class, kClass)) {
            d0.b bVar = (d0.b) this.f42689g.getValue();
            bVar.getClass();
            return bVar;
        }
        boolean zAreEqual = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(b0.n.class));
        b0.n nVar = this.f42683a;
        if (zAreEqual) {
            nVar.getClass();
            return nVar;
        }
        if (!Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(e0.v.class))) {
            return ((f0.t0) nVar.f5321b).t(kClass);
        }
        e0.v vVar = nVar.f5321b;
        vVar.getClass();
        return vVar;
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.f42684b + ".cameraId>";
    }

    @Override // s0.g0
    public final List v(int i11) {
        List listT;
        Size[] sizeArrB = this.f42687e.b(i11);
        return (sizeArrB == null || (listT = kotlin.collections.y.T(sizeArrB)) == null) ? kotlin.collections.n0.f26529a : listT;
    }

    @Override // s0.g0
    public final Set x() {
        Set setV;
        e0.v vVar = this.f42683a.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((f0.t0) vVar).c(key);
        return (iArr == null || (setV = kotlin.collections.y.V(iArr)) == null) ? kotlin.collections.p0.f26531a : setV;
    }

    @Override // s0.g0
    public final Set y() {
        Set setW;
        Integer[] numArrK = this.f42687e.f43616d.k();
        return (numArrK == null || (setW = kotlin.collections.y.W(numArrK)) == null) ? kotlin.collections.p0.f26531a : setW;
    }

    @Override // s0.g0
    public final boolean z() {
        e0.u uVar = e0.v.f15412i0;
        e0.v vVar = this.f42683a.f5321b;
        uVar.getClass();
        return e0.u.b(vVar);
    }
}
