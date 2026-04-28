package rs;

import b0.z;
import b4.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38222f;

    public /* synthetic */ p(t tVar, int i11, android.support.v4.media.session.a aVar, int i12, int i13) {
        this.f38217a = 2;
        this.f38220d = tVar;
        this.f38218b = i11;
        this.f38221e = aVar;
        this.f38219c = i12;
        this.f38222f = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38217a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                k.m(this.f38218b, this.f38219c, (String) this.f38220d, (Function0) this.f38221e, (m3.n) obj, iF, this.f38222f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(1);
                k.n(this.f38218b, this.f38219c, (String) this.f38220d, (Function0) this.f38221e, (m3.n) obj, iF2, this.f38222f);
                break;
            default:
                ((Integer) obj2).getClass();
                z.b((t) this.f38220d, this.f38218b, (android.support.v4.media.session.a) this.f38221e, (m3.n) obj, m3.i.F(this.f38219c | 1), this.f38222f);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ p(int i11, int i12, String str, Function0 function0, int i13, int i14, int i15) {
        this.f38217a = i15;
        this.f38218b = i11;
        this.f38219c = i12;
        this.f38220d = str;
        this.f38221e = function0;
        this.f38222f = i14;
    }
}
