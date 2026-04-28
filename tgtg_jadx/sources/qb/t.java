package qb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f36861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f36862c;

    public /* synthetic */ t(w wVar, o oVar, int i11) {
        this.f36860a = i11;
        this.f36861b = wVar;
        this.f36862c = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ha.a aVar = (ha.a) obj;
        switch (this.f36860a) {
            case 0:
                aVar.getClass();
                this.f36861b.f36871b.v(aVar, this.f36862c);
                break;
            default:
                aVar.getClass();
                this.f36861b.f36872c.c(aVar, this.f36862c);
                break;
        }
        return Unit.f26487a;
    }
}
