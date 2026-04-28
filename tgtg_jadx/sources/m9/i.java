package m9;

import androidx.lifecycle.c1;
import androidx.lifecycle.n1;
import i2.x;
import java.util.LinkedHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends m0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k8.d f29743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f29746g;

    public i(c1 c1Var, LinkedHashMap linkedHashMap) {
        c1Var.getClass();
        this.f29744e = -1;
        this.f29745f = "";
        this.f29746g = p90.d.f34621a;
        this.f29743d = new k8.d(c1Var, linkedHashMap);
    }

    @Override // m0.c
    public final Object Z() {
        return s0();
    }

    @Override // kotlinx.serialization.encoding.Decoder, l90.a
    public final x a() {
        return this.f29746g;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object h(i90.b bVar) {
        bVar.getClass();
        return s0();
    }

    public final Object s0() {
        Object objU = this.f29743d.u(this.f29745f);
        if (objU != null) {
            return objU;
        }
        org.bouncycastle.jce.provider.a.s(this.f29745f, "Unexpected null value for non-nullable argument ");
        return null;
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final boolean v() {
        return this.f29743d.u(this.f29745f) != null;
    }

    @Override // l90.a
    public final int w(SerialDescriptor serialDescriptor) {
        String strF;
        n1 n1Var;
        serialDescriptor.getClass();
        int i11 = this.f29744e;
        do {
            i11++;
            if (i11 >= serialDescriptor.e()) {
                return -1;
            }
            strF = serialDescriptor.f(i11);
            k8.d dVar = this.f29743d;
            dVar.getClass();
            strF.getClass();
            c1 c1Var = (c1) dVar.f26134b;
            c1Var.getClass();
            n1Var = c1Var.f3420b;
            n1Var.getClass();
        } while (!((LinkedHashMap) n1Var.f3499a).containsKey(strF));
        this.f29744e = i11;
        this.f29745f = strF;
        return i11;
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final Decoder x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (d.f(serialDescriptor)) {
            this.f29745f = serialDescriptor.f(0);
            this.f29744e = 0;
        }
        return this;
    }
}
