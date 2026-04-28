package e;

import android.os.Parcelable;
import com.app.tgtg.model.remote.item.AverageItemRating;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.Price;
import d2.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lx.u;
import nn.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15304d;

    public /* synthetic */ p(Parcelable parcelable, boolean z11, int i11, int i12) {
        this.f15301a = i12;
        this.f15304d = parcelable;
        this.f15302b = z11;
        this.f15303c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15301a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(this.f15303c | 1);
                u.k(this.f15302b, (Function2) this.f15304d, (m3.n) obj, iF);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(this.f15303c | 1);
                bx.k.c(this.f15302b, (Function1) this.f15304d, (m3.n) obj, iF2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int iF3 = m3.i.F(this.f15303c | 1);
                q.c(this.f15302b, (z1) this.f15304d, (m3.n) obj, iF3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iF4 = m3.i.F(this.f15303c | 1);
                rk.e.d((AverageItemRating) this.f15304d, this.f15302b, (m3.n) obj, iF4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iF5 = m3.i.F(this.f15303c | 1);
                vi.c.g(this.f15302b, (Price) this.f15304d, (m3.n) obj, iF5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF6 = m3.i.F(this.f15303c | 1);
                vi.c.j((PaymentMethods) this.f15304d, this.f15302b, (m3.n) obj, iF6);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ p(boolean z11, Object obj, int i11, int i12) {
        this.f15301a = i12;
        this.f15302b = z11;
        this.f15304d = obj;
        this.f15303c = i11;
    }
}
