package go;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharityOrderActivity f20721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f20722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f20723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20724e;

    public /* synthetic */ h(CharityOrderActivity charityOrderActivity, a aVar, Function1 function1, int i11, int i12) {
        this.f20720a = i12;
        this.f20721b = charityOrderActivity;
        this.f20722c = aVar;
        this.f20723d = function1;
        this.f20724e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f20720a;
        int i12 = this.f20724e;
        Function1 function1 = this.f20723d;
        a aVar = this.f20722c;
        CharityOrderActivity charityOrderActivity = this.f20721b;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        int i13 = CharityOrderActivity.f9162o;
        switch (i11) {
            case 0:
                charityOrderActivity.I(aVar, function1, nVar, m3.i.F(i12 | 1));
                break;
            default:
                charityOrderActivity.N(aVar, function1, nVar, m3.i.F(i12 | 1));
                break;
        }
        return Unit.f26487a;
    }
}
