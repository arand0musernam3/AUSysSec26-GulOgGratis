package x2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f43743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f43744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f43745d;

    public /* synthetic */ j(Ref.LongRef longRef, Ref.LongRef longRef2, w wVar, int i11) {
        this.f43742a = i11;
        this.f43743b = longRef;
        this.f43744c = longRef2;
        this.f43745d = wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f43742a) {
            case 0:
                w.g(this.f43743b, this.f43744c, this.f43745d);
                break;
            case 1:
                w.g(this.f43743b, this.f43744c, this.f43745d);
                break;
            case 2:
                w wVar = this.f43745d;
                w.h(this.f43743b, this.f43744c, wVar);
                break;
            default:
                w wVar2 = this.f43745d;
                w.h(this.f43743b, this.f43744c, wVar2);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ j(Ref.LongRef longRef, w wVar, Ref.LongRef longRef2, int i11) {
        this.f43742a = i11;
        this.f43743b = longRef;
        this.f43745d = wVar;
        this.f43744c = longRef2;
    }
}
