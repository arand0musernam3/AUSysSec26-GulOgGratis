package bn;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6538d;

    public /* synthetic */ y(String str, int i11, int i12, long j9) {
        this.f6535a = i12;
        this.f6536b = str;
        this.f6537c = j9;
        this.f6538d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6535a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                lx.u.r(this.f6536b, this.f6537c, nVar, m3.i.F(this.f6538d | 1));
                break;
            default:
                lx.u.t(this.f6536b, this.f6537c, nVar, m3.i.F(this.f6538d | 1));
                break;
        }
        return Unit.f26487a;
    }
}
