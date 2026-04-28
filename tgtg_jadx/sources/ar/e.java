package ar;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import pd.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4748a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4752e;

    public /* synthetic */ e(int i11, int i12, String str, boolean z11) {
        this.f4749b = str;
        this.f4750c = z11;
        this.f4751d = i11;
        this.f4752e = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4748a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = i.F(1);
                a.a(this.f4751d, this.f4752e, this.f4749b, this.f4750c, (n) obj, iF);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF2 = i.F(this.f4751d | 1);
                g.e(this.f4749b, this.f4750c, (n) obj, iF2, this.f4752e);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ e(boolean z11, String str, int i11, int i12, int i13) {
        this.f4751d = i11;
        this.f4752e = i12;
        this.f4749b = str;
        this.f4750c = z11;
    }
}
