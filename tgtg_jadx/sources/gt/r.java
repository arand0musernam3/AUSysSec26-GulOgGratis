package gt;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f20885b;

    public /* synthetic */ r(w wVar, int i11) {
        this.f20884a = i11;
        this.f20885b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20884a) {
            case 0:
                return w.o(this.f20885b, (ha.a) obj);
            case 1:
                return w.n(this.f20885b, (ha.a) obj);
            default:
                return w.m(this.f20885b, (ha.a) obj);
        }
    }
}
