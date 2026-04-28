package gt;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f20861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f20862c;

    public /* synthetic */ l(n nVar, List list, int i11) {
        this.f20860a = i11;
        this.f20861b = nVar;
        this.f20862c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ha.a aVar = (ha.a) obj;
        switch (this.f20860a) {
            case 0:
                aVar.getClass();
                this.f20861b.f20866c.d(aVar, this.f20862c);
                break;
            default:
                aVar.getClass();
                this.f20861b.f20865b.u(aVar, this.f20862c);
                break;
        }
        return Unit.f26487a;
    }
}
