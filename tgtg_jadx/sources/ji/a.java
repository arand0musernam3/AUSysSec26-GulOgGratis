package ji;

import b4.q;
import c5.d2;
import com.app.tgtg.R;
import d2.v0;
import g3.r9;
import i80.n;
import java.util.ArrayList;
import kotlin.Unit;
import lv.t;
import lv.v;
import m3.s;
import m5.u0;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f25267b;

    public /* synthetic */ a(int i11, ArrayList arrayList) {
        this.f25266a = i11;
        this.f25267b = arrayList;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f25266a;
        ArrayList<String> arrayList = this.f25267b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((v0) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (String str : arrayList) {
                        i.a(d2.j(q.f5711a, str), str, sVar, 0);
                    }
                } else {
                    sVar.U();
                }
                break;
            case 1:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar2 = (s) nVar2;
                if (!sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar2.U();
                } else if (arrayList.isEmpty()) {
                    sVar2.a0(-2071787971);
                    sVar2.q(false);
                } else {
                    sVar2.a0(-2072173177);
                    String strU = f0.U(sVar2, R.string.charity_collection_days_not_available_title);
                    u0 u0Var = v.f28277q;
                    long j9 = lv.s.C;
                    float f11 = t.f28253g;
                    r9.d(strU, d2.c.D(q.f5711a, f11, f11, f11, 0.0f, 8), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 131064);
                    sVar2.q(false);
                }
                break;
            default:
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar3 = (s) nVar3;
                if (!sVar3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    sVar3.U();
                } else if (arrayList.isEmpty()) {
                    sVar3.a0(1393524380);
                    sVar3.q(false);
                } else {
                    sVar3.a0(1393143018);
                    String strU2 = f0.U(sVar3, R.string.charity_collection_days_available_title);
                    u0 u0Var2 = v.f28277q;
                    long j11 = lv.s.C;
                    float f12 = t.f28253g;
                    r9.d(strU2, d2.c.D(q.f5711a, f12, t.f28255i, f12, 0.0f, 8), j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar3, 432, 12582912, 131064);
                    sVar3.q(false);
                }
                break;
        }
        return Unit.f26487a;
    }
}
