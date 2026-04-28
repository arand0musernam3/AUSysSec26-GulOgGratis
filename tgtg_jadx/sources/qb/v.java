package qb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f36868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ha.a f36869c;

    public /* synthetic */ v(w wVar, ha.a aVar, int i11) {
        this.f36867a = i11;
        this.f36868b = wVar;
        this.f36869c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q1.e eVar = (q1.e) obj;
        switch (this.f36867a) {
            case 0:
                eVar.getClass();
                this.f36868b.a(this.f36869c, eVar);
                break;
            default:
                eVar.getClass();
                this.f36868b.b(this.f36869c, eVar);
                break;
        }
        return Unit.f26487a;
    }
}
