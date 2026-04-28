package ig;

import com.tgtg.componentlibrary.component.pageheader.DemoPantryPageHeaderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23836c;

    public /* synthetic */ c(int i11, String str, int i12) {
        this.f23834a = 2;
        this.f23836c = i11;
        this.f23835b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f23834a) {
            case 0:
                num.intValue();
                b.d(this.f23835b, nVar, i.F(this.f23836c | 1));
                break;
            case 1:
                num.intValue();
                b.d(this.f23835b, nVar, i.F(this.f23836c | 1));
                break;
            case 2:
                num.getClass();
                oo.a.P(this.f23836c, this.f23835b, nVar, i.F(1));
                break;
            default:
                num.intValue();
                DemoPantryPageHeaderKt.b(this.f23835b, nVar, i.F(this.f23836c | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(String str, int i11, int i12) {
        this.f23834a = i12;
        this.f23835b = str;
        this.f23836c = i11;
    }
}
