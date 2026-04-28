package h2;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f21146b;

    public /* synthetic */ j1(k1 k1Var, int i11) {
        this.f21145a = i11;
        this.f21146b = k1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f21145a) {
            case 0:
                return Float.valueOf(this.f21146b.f21150p.b());
            case 1:
                return Float.valueOf(this.f21146b.f21150p.d());
            default:
                k1 k1Var = this.f21146b;
                return Float.valueOf(k1Var.f21150p.a() - k1Var.f21150p.c());
        }
    }
}
