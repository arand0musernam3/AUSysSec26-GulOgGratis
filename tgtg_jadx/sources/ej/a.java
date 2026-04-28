package ej;

import gj.k;
import gj.n;
import gj.p;
import gj.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jj.c f16042b;

    public /* synthetic */ a(jj.c cVar, int i11) {
        this.f16041a = i11;
        this.f16042b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16041a) {
            case 0:
                w wVar = this.f16042b.f25290a;
                wVar.f20523c.i(p.f20509a);
                break;
            case 1:
                w wVar2 = this.f16042b.f25290a;
                wVar2.f20523c.i(k.f20503a);
                break;
            default:
                w wVar3 = this.f16042b.f25290a;
                wVar3.f20523c.i(n.f20506a);
                break;
        }
        return Unit.f26487a;
    }
}
