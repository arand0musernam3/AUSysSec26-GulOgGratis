package gn;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f20627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f20628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f20629d;

    public /* synthetic */ l(List list, Function1 function1, Function1 function12, int i11, int i12) {
        this.f20626a = i12;
        this.f20627b = list;
        this.f20628c = function1;
        this.f20629d = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f20626a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.h(this.f20627b, this.f20628c, this.f20629d, nVar, m3.i.F(1));
                break;
            case 1:
                pm.a.g(this.f20627b, this.f20628c, this.f20629d, nVar, m3.i.F(1));
                break;
            default:
                b0.a0.d(this.f20627b, this.f20628c, this.f20629d, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
