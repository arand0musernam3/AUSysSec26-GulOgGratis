package xi;

import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AllergensInfo f44350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicItem f44351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f44352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f44353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44354f;

    public /* synthetic */ a(AllergensInfo allergensInfo, BasicItem basicItem, boolean z11, Function1 function1, int i11, int i12) {
        this.f44349a = i12;
        this.f44350b = allergensInfo;
        this.f44351c = basicItem;
        this.f44352d = z11;
        this.f44353e = function1;
        this.f44354f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44349a) {
            case 0:
                ((Integer) obj2).intValue();
                d.b(this.f44350b, this.f44351c, this.f44352d, this.f44353e, (n) obj, i.F(this.f44354f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                d.h(this.f44350b, this.f44351c, this.f44352d, this.f44353e, (n) obj, i.F(this.f44354f | 1));
                break;
        }
        return Unit.f26487a;
    }
}
