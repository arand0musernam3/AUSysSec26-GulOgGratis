package hg;

import i3.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f22049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22050d;

    public /* synthetic */ f(boolean z11, Function0 function0, int i11, int i12) {
        this.f22047a = i12;
        this.f22048b = z11;
        this.f22049c = function0;
        this.f22050d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f22047a) {
            case 0:
                num.intValue();
                i.e(this.f22048b, this.f22049c, nVar, m3.i.F(this.f22050d | 1));
                break;
            case 1:
                num.getClass();
                r.a(this.f22048b, this.f22049c, nVar, m3.i.F(this.f22050d | 1));
                break;
            default:
                num.getClass();
                oo.a.y(this.f22048b, this.f22049c, nVar, m3.i.F(this.f22050d | 1));
                break;
        }
        return Unit.f26487a;
    }
}
