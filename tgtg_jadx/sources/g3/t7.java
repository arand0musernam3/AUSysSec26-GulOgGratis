package g3;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z5.c f19532b;

    public /* synthetic */ t7(z5.c cVar, int i11) {
        this.f19531a = i11;
        this.f19532b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fC0;
        switch (this.f19531a) {
            case 0:
                fC0 = this.f19532b.c0(s7.f19478a);
                break;
            default:
                fC0 = this.f19532b.c0(125);
                break;
        }
        return Float.valueOf(fC0);
    }
}
