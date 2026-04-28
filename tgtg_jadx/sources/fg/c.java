package fg;

import b4.t;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f17675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicItem f17676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f17677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17678e;

    public /* synthetic */ c(t tVar, BasicItem basicItem, float f11, int i11, int i12) {
        this.f17674a = i12;
        this.f17675b = tVar;
        this.f17676c = basicItem;
        this.f17677d = f11;
        this.f17678e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f17674a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                z20.b.c(this.f17675b, this.f17676c, this.f17677d, nVar, m3.i.F(this.f17678e | 1));
                break;
            default:
                h0.g.m(this.f17675b, this.f17676c, this.f17677d, nVar, m3.i.F(this.f17678e | 1));
                break;
        }
        return Unit.f26487a;
    }
}
