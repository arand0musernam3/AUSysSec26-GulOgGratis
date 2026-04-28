package rs;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ss.w;
import ss.x;
import ts.b0;
import ts.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t5.a f38207b;

    public /* synthetic */ l(int i11, t5.a aVar) {
        this.f38206a = i11;
        this.f38207b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38206a) {
            case 0:
                w wVar = (w) this.f38207b.f39791b;
                wVar.f39256d.i(ts.o.f40458a);
                break;
            case 1:
                ((x) this.f38207b.f39792c).f39268a.a(new b0());
                break;
            case 2:
                this.f38207b.B();
                break;
            case 3:
                this.f38207b.B();
                break;
            case 4:
                w wVar2 = (w) this.f38207b.f39791b;
                wVar2.f39256d.i(new v(false));
                break;
            case 5:
                w wVar3 = (w) this.f38207b.f39791b;
                wVar3.f39256d.i(new v(true));
                break;
            default:
                this.f38207b.B();
                break;
        }
        return Unit.f26487a;
    }
}
