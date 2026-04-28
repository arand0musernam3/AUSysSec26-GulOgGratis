package gt;

import com.app.tgtg.model.remote.brief.BriefOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f20840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BriefOrder f20841c;

    public /* synthetic */ d(j jVar, BriefOrder briefOrder, int i11) {
        this.f20839a = i11;
        this.f20840b = jVar;
        this.f20841c = briefOrder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ha.a aVar = (ha.a) obj;
        switch (this.f20839a) {
            case 0:
                aVar.getClass();
                this.f20840b.f20853c.v(aVar, this.f20841c);
                break;
            default:
                aVar.getClass();
                this.f20840b.f20854d.c(aVar, this.f20841c);
                break;
        }
        return Unit.f26487a;
    }
}
