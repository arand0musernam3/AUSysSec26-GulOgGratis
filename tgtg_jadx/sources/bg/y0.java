package bg;

import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6257f;

    public /* synthetic */ y0(Object obj, int i11, Object obj2, Object obj3, int i12, int i13) {
        this.f6252a = i13;
        this.f6253b = obj;
        this.f6255d = i11;
        this.f6257f = obj2;
        this.f6254c = obj3;
        this.f6256e = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6252a) {
            case 0:
                ((Integer) obj2).getClass();
                m.d((b4.t) this.f6253b, (List) this.f6257f, (Function1) this.f6254c, (m3.n) obj, m3.i.F(this.f6255d | 1), this.f6256e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                m.e((ItemTagInfo) this.f6257f, (b4.t) this.f6253b, (Function1) this.f6254c, (m3.n) obj, m3.i.F(this.f6255d | 1), this.f6256e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                c6.l.b((i80.n) this.f6257f, (b4.t) this.f6253b, (Function1) this.f6254c, (m3.n) obj, m3.i.F(this.f6255d | 1), this.f6256e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                cg.o.a((GenericErrors) this.f6253b, (Function0) this.f6257f, (Function0) this.f6254c, (m3.n) obj, m3.i.F(this.f6255d | 1), this.f6256e);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(this.f6256e | 1);
                y9.w.b(this.f6255d, iF, (b4.t) this.f6253b, (String) this.f6257f, (String) this.f6254c, (m3.n) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                h2.q.b(this.f6253b, this.f6255d, (h2.v0) this.f6257f, (u3.d) this.f6254c, (m3.n) obj, m3.i.F(this.f6256e | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ y0(Object obj, b4.t tVar, Function1 function1, int i11, int i12, int i13) {
        this.f6252a = i13;
        this.f6257f = obj;
        this.f6253b = tVar;
        this.f6254c = function1;
        this.f6255d = i11;
        this.f6256e = i12;
    }

    public /* synthetic */ y0(Object obj, Object obj2, u70.f fVar, int i11, int i12, int i13) {
        this.f6252a = i13;
        this.f6253b = obj;
        this.f6257f = obj2;
        this.f6254c = fVar;
        this.f6255d = i11;
        this.f6256e = i12;
    }
}
