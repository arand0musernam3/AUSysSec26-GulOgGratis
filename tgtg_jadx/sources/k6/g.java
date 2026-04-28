package k6;

import f6.t;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class g extends b implements l6.e {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f26047k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final l f26048l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final ArrayList f26049m0;

    public g(t tVar, l lVar) {
        super(tVar);
        this.f26049m0 = new ArrayList();
        this.f26047k0 = tVar;
        this.f26048l0 = lVar;
    }

    @Override // k6.b, k6.h
    public final n6.g b() {
        return s();
    }

    public final void q(Object... objArr) {
        Collections.addAll(this.f26049m0, objArr);
    }

    public final void r() {
        super.apply();
    }

    public n6.m s() {
        return null;
    }

    @Override // k6.b, k6.h
    public void apply() {
    }
}
