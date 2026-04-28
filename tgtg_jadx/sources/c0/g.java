package c0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import e0.v;
import f0.t0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.g1;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import s0.b1;
import s0.i1;
import s0.i2;
import s0.o2;
import s0.q2;
import s0.u0;
import v70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0.g f6802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f6803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f6804c;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        f6802a = new s0.g("camera2.streamSpec.streamUseCase", cls, null);
        i iVar = new i();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            q2 q2Var = q2.PREVIEW;
            q2 q2Var2 = q2.METERING_REPEATING;
            q2 q2Var3 = q2.IMAGE_ANALYSIS;
            iVar.put(4L, y.W(new q2[]{q2Var, q2Var2, q2Var3}));
            iVar.put(1L, y.W(new q2[]{q2Var, q2Var2, q2Var3}));
            iVar.put(2L, g1.b(q2.IMAGE_CAPTURE));
            iVar.put(3L, g1.b(q2.VIDEO_CAPTURE));
        }
        f6803b = iVar.b();
        i iVar2 = new i();
        if (i11 >= 33) {
            q2 q2Var4 = q2.PREVIEW;
            q2 q2Var5 = q2.IMAGE_CAPTURE;
            q2 q2Var6 = q2.VIDEO_CAPTURE;
            iVar2.put(4L, y.W(new q2[]{q2Var4, q2Var5, q2Var6}));
            iVar2.put(3L, y.W(new q2[]{q2Var4, q2Var6}));
        }
        f6804c = iVar2.b();
    }

    public static boolean a(v vVar, List list) {
        vVar.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            key.getClass();
            long[] jArr = (long[]) ((t0) vVar).c(key);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j9 : jArr) {
                    hashSet.add(Long.valueOf(j9));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains(Long.valueOf(((i2) it.next()).f38350c.a()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static b0.b b(u0 u0Var, Long l) {
        s0.g gVar = f6802a;
        if (u0Var.g(gVar) && Intrinsics.areEqual(u0Var.d(gVar), l)) {
            return null;
        }
        i1 i1VarS = i1.s(u0Var);
        i1VarS.v(gVar, l);
        return new b0.b(i1VarS);
    }

    public static boolean c(q2 q2Var, long j9, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (q2Var != q2.STREAM_SHARING) {
            Long lValueOf = Long.valueOf(j9);
            i iVar = f6803b;
            if (!iVar.containsKey(lValueOf)) {
                return false;
            }
            Object obj = iVar.get(Long.valueOf(j9));
            obj.getClass();
            return ((Set) obj).contains(q2Var);
        }
        Long lValueOf2 = Long.valueOf(j9);
        i iVar2 = f6804c;
        if (!iVar2.containsKey(lValueOf2)) {
            return false;
        }
        Object obj2 = iVar2.get(Long.valueOf(j9));
        obj2.getClass();
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((q2) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(v vVar) {
        vVar.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        key.getClass();
        long[] jArr = (long[]) ((t0) vVar).c(key);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    public static boolean e(u0 u0Var, q2 q2Var) {
        Object objI = u0Var.i(o2.S0, Boolean.FALSE);
        objI.getClass();
        if (((Boolean) objI).booleanValue()) {
            return false;
        }
        s0.g gVar = b1.f38285b;
        if (!u0Var.g(gVar)) {
            return false;
        }
        Object objD = u0Var.d(gVar);
        objD.getClass();
        return f.$EnumSwitchMapping$0[q2Var.ordinal()] == 1 && ((Number) objD).intValue() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(e0.v r14, java.util.ArrayList r15, java.util.LinkedHashMap r16, java.util.LinkedHashMap r17) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.g.f(e0.v, java.util.ArrayList, java.util.LinkedHashMap, java.util.LinkedHashMap):boolean");
    }
}
