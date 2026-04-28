package cn;

import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8554e;

    public /* synthetic */ k(ElementMnuV2 elementMnuV2, long j9, ym.y yVar, int i11) {
        this.f8550a = 0;
        this.f8553d = elementMnuV2;
        this.f8551b = j9;
        this.f8554e = yVar;
        this.f8552c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8550a) {
            case 0:
                ((Integer) obj2).getClass();
                jf.e.f((ElementMnuV2) this.f8553d, this.f8551b, (ym.y) this.f8554e, (m3.n) obj, m3.i.F(this.f8552c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ba0.g.d((b4.t) this.f8553d, (BasicItem) this.f8554e, this.f8551b, (m3.n) obj, m3.i.F(this.f8552c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                jb.u.t(m3.i.F(this.f8552c | 1), this.f8551b, (b4.t) this.f8553d, (String) this.f8554e, (m3.n) obj);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ k(b4.t tVar, Object obj, long j9, int i11, int i12) {
        this.f8550a = i12;
        this.f8553d = tVar;
        this.f8554e = obj;
        this.f8551b = j9;
        this.f8552c = i11;
    }
}
