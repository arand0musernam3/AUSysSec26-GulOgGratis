package b0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import y00.i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f5272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a50.c f5273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.b f5274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w.s0 f5275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z.j f5276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0.v f5277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0.z f5278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w2.z f5279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i4 f5280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DynamicRangeProfiles f5281k;

    public l(j jVar, x0 x0Var, a50.c cVar, y.b bVar, w.s0 s0Var, z.j jVar2, e0.v vVar, m0.z zVar, w2.z zVar2) {
        ky.o oVarC;
        jVar.getClass();
        x0Var.getClass();
        cVar.getClass();
        bVar.getClass();
        s0Var.getClass();
        this.f5271a = jVar;
        this.f5272b = x0Var;
        this.f5273c = cVar;
        this.f5274d = bVar;
        this.f5275e = s0Var;
        this.f5276f = jVar2;
        this.f5277g = vVar;
        this.f5278h = zVar;
        this.f5279i = zVar2;
        this.f5280j = new i4(3);
        int i11 = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfilesB = null;
        if (i11 >= 33 && vVar != null && (oVarC = a70.a.c(vVar)) != null) {
            if (i11 < 33) {
                e40.a.g(r8.k.h(i11, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", " (requires API 33)"));
                throw null;
            }
            dynamicRangeProfilesB = ((x.b) oVarC.f26718b).b();
        }
        this.f5281k = dynamicRangeProfilesB;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b0.k a(int r37, s0.z1 r38, boolean r39, w.e0 r40, java.lang.Integer r41, java.util.Map r42, java.util.Map r43) {
        /*
            Method dump skipped, instruction units count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l.a(int, s0.z1, boolean, w.e0, java.lang.Integer, java.util.Map, java.util.Map):b0.k");
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) e0.s.b((String) this.f5273c.f822b)) + '>';
    }
}
