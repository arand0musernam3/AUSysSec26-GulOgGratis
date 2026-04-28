package ji;

import android.graphics.ColorMatrixColorFilter;
import b4.q;
import b4.t;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.user.response.charity.Product;
import com.app.tgtg.model.remote.user.response.charity.ProductChangelog;
import com.app.tgtg.model.remote.user.response.charity.ProductStatus;
import d2.m2;
import d2.z;
import gd.o;
import i4.g0;
import i4.x;
import i80.n;
import kotlin.Unit;
import m3.s;
import o00.x0;
import z4.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Product f25269b;

    public /* synthetic */ b(Product product, int i11) {
        this.f25268a = i11;
        this.f25269b = product;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f25268a;
        q qVar = q.f5711a;
        Product product = this.f25269b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    t tVarM = m2.m(qVar, 50);
                    String logo = product.getLogo();
                    n4.b bVarZ = x0.z(R.drawable.charity_product, sVar, 0);
                    n4.b bVarZ2 = x0.z(R.drawable.charity_product, sVar, 0);
                    n4.b bVarZ3 = x0.z(R.drawable.charity_product, sVar, 0);
                    float[] fArrL = g0.l();
                    ProductChangelog changelog = product.getChangelog();
                    g0.x((changelog != null ? changelog.getStatus() : null) == ProductStatus.REMOVED ? 0.0f : 1.0f, fArrL);
                    x xVar = new x(new ColorMatrixColorFilter(fArrL));
                    xVar.f23331b = fArrL;
                    o.c(logo, "ProductIcon", tVarM, bVarZ2, bVarZ3, bVarZ, l.f47167b, 0.0f, xVar, sVar, 299440, 6, 27584);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    o.c(product.getLogo(), "ProductIcon", m2.m(qVar, 50), x0.z(R.drawable.charity_product, sVar2, 0), x0.z(R.drawable.charity_product, sVar2, 0), x0.z(R.drawable.charity_product, sVar2, 0), l.f47167b, 0.0f, null, sVar2, 299440, 6, 31680);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
