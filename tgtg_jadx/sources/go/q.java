package go;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20750a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f20751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f20752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f20753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f20754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f20755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f20756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f20757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f20758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f20759j;

    public /* synthetic */ q(a aVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z11, List list, boolean z12, int i11) {
        this.f20751b = aVar;
        this.f20752c = function0;
        this.f20753d = function02;
        this.f20754e = function03;
        this.f20755f = function04;
        this.f20756g = z11;
        this.f20757h = list;
        this.f20758i = z12;
        this.f20759j = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20750a) {
            case 0:
                ((Integer) obj2).getClass();
                bx.o.c(this.f20751b, this.f20752c, this.f20753d, this.f20754e, this.f20755f, this.f20756g, this.f20757h, this.f20758i, (m3.n) obj, m3.i.F(this.f20759j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                bx.o.d(this.f20751b, this.f20752c, this.f20753d, this.f20754e, this.f20755f, this.f20756g, this.f20757h, this.f20758i, (m3.n) obj, iF, this.f20759j);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ q(a aVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z11, List list, boolean z12, int i11, int i12) {
        this.f20751b = aVar;
        this.f20752c = function0;
        this.f20753d = function02;
        this.f20754e = function03;
        this.f20755f = function04;
        this.f20756g = z11;
        this.f20757h = list;
        this.f20758i = z12;
        this.f20759j = i12;
    }
}
