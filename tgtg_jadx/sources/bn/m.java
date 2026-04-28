package bn;

import android.content.Context;
import android.os.Parcelable;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.ItemMnuV2;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6492f;

    public /* synthetic */ m(int i11, co.c cVar, boolean z11, yn.g gVar, Function0 function0, int i12) {
        this.f6487a = 12;
        this.f6488b = i11;
        this.f6491e = cVar;
        this.f6489c = z11;
        this.f6492f = gVar;
        this.f6490d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6487a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                jb.u.q((BaseItemMnuV2) this.f6491e, this.f6488b, this.f6489c, (LatestInteractionOrigin) this.f6492f, (ym.z) this.f6490d, (m3.n) obj, iF);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(1);
                jb.u.e((ItemMnuV2) this.f6491e, this.f6488b, this.f6489c, (ym.y) this.f6492f, (ym.z) this.f6490d, (m3.n) obj, iF2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                cp.a.k(m3.i.F(this.f6488b | 1), (b4.t) this.f6491e, (String) this.f6492f, (Function0) this.f6490d, (m3.n) obj, this.f6489c);
                break;
            case 3:
                ((Integer) obj2).getClass();
                bx.o.a((go.a) this.f6491e, (Function0) this.f6492f, (Function0) this.f6490d, this.f6489c, (m3.n) obj, m3.i.F(this.f6488b | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                bx.o.u((go.a) this.f6491e, (Context) this.f6492f, (List) this.f6490d, this.f6489c, (m3.n) obj, m3.i.F(this.f6488b | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                o30.e0.j((b4.t) this.f6491e, (jl.c) this.f6492f, this.f6489c, (Function2) this.f6490d, (m3.n) obj, m3.i.F(this.f6488b | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                bx.o.F((b4.t) this.f6491e, this.f6489c, (float[]) this.f6492f, (Function1) this.f6490d, (m3.n) obj, m3.i.F(this.f6488b | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ni.g.b((b4.t) this.f6491e, (Function0) this.f6492f, (Function0) this.f6490d, this.f6489c, (m3.n) obj, m3.i.F(this.f6488b | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                oo.a.S((String) this.f6491e, (String) this.f6492f, this.f6489c, (Function1) this.f6490d, (m3.n) obj, m3.i.F(this.f6488b | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                vi.c.q((b4.t) this.f6491e, this.f6489c, (ItemType) this.f6492f, (Function0) this.f6490d, (m3.n) obj, m3.i.F(this.f6488b | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                vi.c.l((cj.q) this.f6491e, (PaymentMethods) this.f6492f, this.f6489c, (PaymentType) this.f6490d, (m3.n) obj, m3.i.F(this.f6488b | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                wi.a.a((jg.c) this.f6491e, (UserAddress) this.f6492f, this.f6489c, (Function0) this.f6490d, (m3.n) obj, m3.i.F(this.f6488b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iF3 = m3.i.F(1);
                o30.f0.a(this.f6488b, (co.c) this.f6491e, this.f6489c, (yn.g) this.f6492f, (Function0) this.f6490d, (m3.n) obj, iF3);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ m(Parcelable parcelable, int i11, boolean z11, Object obj, ym.z zVar, int i12, int i13) {
        this.f6487a = i13;
        this.f6491e = parcelable;
        this.f6488b = i11;
        this.f6489c = z11;
        this.f6492f = obj;
        this.f6490d = zVar;
    }

    public /* synthetic */ m(b4.t tVar, boolean z11, Serializable serializable, u70.f fVar, int i11, int i12) {
        this.f6487a = i12;
        this.f6491e = tVar;
        this.f6489c = z11;
        this.f6492f = serializable;
        this.f6490d = fVar;
        this.f6488b = i11;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, boolean z11, int i11, int i12) {
        this.f6487a = i12;
        this.f6491e = obj;
        this.f6492f = obj2;
        this.f6490d = obj3;
        this.f6489c = z11;
        this.f6488b = i11;
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z11, Object obj3, int i11, int i12) {
        this.f6487a = i12;
        this.f6491e = obj;
        this.f6492f = obj2;
        this.f6489c = z11;
        this.f6490d = obj3;
        this.f6488b = i11;
    }
}
