package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import zendesk.ui.android.conversations.cell.EndedLabelKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4.t f18718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18722g;

    public /* synthetic */ h2(long j9, b4.t tVar, String str, l2.f fVar, int i11, int i12) {
        this.f18716a = 2;
        this.f18719d = j9;
        this.f18718c = tVar;
        this.f18717b = str;
        this.f18722g = fVar;
        this.f18720e = i11;
        this.f18721f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18716a) {
            case 0:
                ((Integer) obj2).getClass();
                i2.b((p4.f) this.f18722g, this.f18717b, this.f18718c, this.f18719d, (m3.n) obj, m3.i.F(this.f18720e | 1), this.f18721f);
                return Unit.f26487a;
            case 1:
                ((Integer) obj2).getClass();
                i2.a((n4.b) this.f18722g, this.f18717b, this.f18718c, this.f18719d, (m3.n) obj, m3.i.F(this.f18720e | 1), this.f18721f);
                return Unit.f26487a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return EndedLabelKt.EndedLabel_euL9pac$lambda$0(this.f18719d, this.f18718c, this.f18717b, (l2.f) this.f18722g, this.f18720e, this.f18721f, (m3.n) obj, iIntValue);
        }
    }

    public /* synthetic */ h2(Object obj, String str, b4.t tVar, long j9, int i11, int i12, int i13) {
        this.f18716a = i13;
        this.f18722g = obj;
        this.f18717b = str;
        this.f18718c = tVar;
        this.f18719d = j9;
        this.f18720e = i11;
        this.f18721f = i12;
    }
}
