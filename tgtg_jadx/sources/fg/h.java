package fg;

import b0.a0;
import b4.t;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17697a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f17698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f17701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f17702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f17704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u70.f f17705i;

    public /* synthetic */ h(t tVar, BasicItem basicItem, boolean z11, boolean z12, long j9, Function0 function0, Function1 function1, int i11, int i12) {
        this.f17698b = tVar;
        this.f17704h = basicItem;
        this.f17699c = z11;
        this.f17701e = z12;
        this.f17700d = j9;
        this.f17702f = function0;
        this.f17705i = function1;
        this.f17703g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17697a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                a0.c(this.f17698b, (BasicItem) this.f17704h, this.f17699c, this.f17701e, this.f17700d, this.f17702f, (Function1) this.f17705i, (m3.n) obj, iF, this.f17703g);
                break;
            default:
                ((Integer) obj2).getClass();
                f0.h(this.f17698b, (ArrayList) this.f17704h, this.f17699c, (i80.n) this.f17705i, this.f17700d, this.f17701e, this.f17702f, (m3.n) obj, m3.i.F(this.f17703g | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h(t tVar, ArrayList arrayList, boolean z11, i80.n nVar, long j9, boolean z12, Function0 function0, int i11) {
        this.f17698b = tVar;
        this.f17704h = arrayList;
        this.f17699c = z11;
        this.f17705i = nVar;
        this.f17700d = j9;
        this.f17701e = z12;
        this.f17702f = function0;
        this.f17703g = i11;
    }
}
