package g3;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19234a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f19235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f19236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f19238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x5.l f19239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x5.k f19240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f19241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f19243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f19244k;
    public final /* synthetic */ int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f19245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m5.u0 f19246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f19248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f19249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CharSequence f19250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f19251s;

    public /* synthetic */ o9(String str, b4.t tVar, long j9, long j11, q5.r rVar, long j12, x5.l lVar, x5.k kVar, long j13, int i11, boolean z11, int i12, int i13, Function1 function1, m5.u0 u0Var, int i14, int i15, int i16) {
        this.f19250r = str;
        this.f19235b = tVar;
        this.f19236c = j9;
        this.f19237d = j11;
        this.f19251s = rVar;
        this.f19238e = j12;
        this.f19239f = lVar;
        this.f19240g = kVar;
        this.f19241h = j13;
        this.f19242i = i11;
        this.f19243j = z11;
        this.f19244k = i12;
        this.l = i13;
        this.f19245m = function1;
        this.f19246n = u0Var;
        this.f19247o = i14;
        this.f19248p = i15;
        this.f19249q = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19234a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(this.f19247o | 1);
                int iF2 = m3.i.F(this.f19248p);
                r9.e((m5.h) this.f19250r, this.f19235b, this.f19236c, this.f19237d, this.f19238e, this.f19239f, this.f19240g, this.f19241h, this.f19242i, this.f19243j, this.f19244k, this.l, (Map) this.f19251s, this.f19245m, this.f19246n, (m3.n) obj, iF, iF2, this.f19249q);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF3 = m3.i.F(this.f19247o | 1);
                int iF4 = m3.i.F(this.f19248p);
                r9.d((String) this.f19250r, this.f19235b, this.f19236c, this.f19237d, (q5.r) this.f19251s, this.f19238e, this.f19239f, this.f19240g, this.f19241h, this.f19242i, this.f19243j, this.f19244k, this.l, this.f19245m, this.f19246n, (m3.n) obj, iF3, iF4, this.f19249q);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ o9(m5.h hVar, b4.t tVar, long j9, long j11, long j12, x5.l lVar, x5.k kVar, long j13, int i11, boolean z11, int i12, int i13, Map map, Function1 function1, m5.u0 u0Var, int i14, int i15, int i16) {
        this.f19250r = hVar;
        this.f19235b = tVar;
        this.f19236c = j9;
        this.f19237d = j11;
        this.f19238e = j12;
        this.f19239f = lVar;
        this.f19240g = kVar;
        this.f19241h = j13;
        this.f19242i = i11;
        this.f19243j = z11;
        this.f19244k = i12;
        this.l = i13;
        this.f19251s = map;
        this.f19245m = function1;
        this.f19246n = u0Var;
        this.f19247o = i14;
        this.f19248p = i15;
        this.f19249q = i16;
    }
}
