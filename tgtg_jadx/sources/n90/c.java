package n90;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f30748d = new b(new j(0), p90.d.f34621a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f30749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.x f30750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o90.h f30751c = new o90.h();

    public c(j jVar, i2.x xVar) {
        this.f30749a = jVar;
        this.f30750b = xVar;
    }

    public final Object a(i90.b bVar, n nVar) {
        Decoder mVar;
        bVar.getClass();
        nVar.getClass();
        String str = null;
        if (nVar instanceof b0) {
            mVar = new o90.o(this, (b0) nVar, str, 12);
        } else if (nVar instanceof e) {
            mVar = new o90.p(this, (e) nVar);
        } else {
            if (!(nVar instanceof v) && !Intrinsics.areEqual(nVar, y.INSTANCE)) {
                e40.a.f();
                return null;
            }
            mVar = new o90.m(this, (g0) nVar, null);
        }
        return mVar.h(bVar);
    }

    public final Object b(i90.b bVar, String str) {
        bVar.getClass();
        str.getClass();
        i0.w wVar = new i0.w(str);
        Object objH = new o90.w(this, o90.b0.OBJ, wVar, bVar.getDescriptor(), null).h(bVar);
        if (wVar.l() == 10) {
            return objH;
        }
        i0.w.t(wVar, "Expected EOF after parsing, but had " + str.charAt(wVar.f22745b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String c(KSerializer kSerializer, Object obj) {
        char[] cArr;
        kSerializer.getClass();
        androidx.constraintlayout.widget.z zVar = new androidx.constraintlayout.widget.z(8, (byte) 0);
        o90.d dVar = o90.d.f32161c;
        synchronized (dVar) {
            kotlin.collections.t tVar = dVar.f32162a;
            cArr = null;
            char[] cArr2 = (char[]) (tVar.isEmpty() ? null : tVar.removeLast());
            if (cArr2 != null) {
                dVar.f32163b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        zVar.f2543c = cArr;
        try {
            o90.b0 b0Var = o90.b0.OBJ;
            s[] sVarArr = new s[o90.b0.a().size()];
            b0Var.getClass();
            new o90.y(new c40.i(zVar), this, b0Var, sVarArr).w(kSerializer, obj);
            return zVar.toString();
        } finally {
            zVar.m();
        }
    }
}
