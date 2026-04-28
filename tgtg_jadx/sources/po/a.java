package po;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f35572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f35573d;

    public /* synthetic */ a(String str, Function1 function1, int i11, int i12) {
        this.f35570a = i12;
        this.f35571b = str;
        this.f35572c = function1;
        this.f35573d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f35570a;
        n nVar = (n) obj;
        ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                c.g(this.f35571b, this.f35572c, nVar, i.F(this.f35573d | 1));
                break;
            default:
                xi.d.f(this.f35571b, this.f35572c, nVar, i.F(this.f35573d | 1));
                break;
        }
        return Unit.f26487a;
    }
}
