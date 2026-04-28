package cn;

import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8557c;

    public /* synthetic */ l(Object obj, long j9, int i11, int i12) {
        this.f8555a = i12;
        this.f8557c = obj;
        this.f8556b = j9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8555a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(49);
                jf.e.e((ElementMnuV2) this.f8557c, this.f8556b, (m3.n) obj, iF);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(1);
                k3.m.a((i3.u) this.f8557c, this.f8556b, (m3.n) obj, iF2);
                break;
        }
        return Unit.f26487a;
    }
}
