package m9;

import g9.q0;
import i2.x;
import java.util.LinkedHashMap;
import kotlin.collections.c0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends na0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final KSerializer f29747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f29748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f29749h = p90.d.f34621a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f29750i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29751j = -1;

    public j(KSerializer kSerializer, LinkedHashMap linkedHashMap) {
        this.f29747f = kSerializer;
        this.f29748g = linkedHashMap;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final x a() {
        return this.f29749h;
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void f() {
        x0(null);
    }

    @Override // na0.a
    public final void m0(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        this.f29751j = i11;
    }

    @Override // na0.a
    public final void n0(Object obj) {
        obj.getClass();
        x0(obj);
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final Encoder v(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (d.f(serialDescriptor)) {
            this.f29751j = 0;
        }
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void w(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        x0(obj);
    }

    public final void x0(Object obj) {
        String strF = this.f29747f.getDescriptor().f(this.f29751j);
        q0 q0Var = (q0) this.f29748g.get(strF);
        if (q0Var != null) {
            this.f29750i.put(strF, q0Var instanceof g9.e ? ((g9.e) q0Var).i(obj) : c0.c(q0Var.f(obj)));
        } else {
            e40.a.g(a0.p("Cannot find NavType for argument ", strF, ". Please provide NavType through typeMap."));
        }
    }
}
