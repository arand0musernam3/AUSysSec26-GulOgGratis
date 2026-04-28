package cg;

import androidx.compose.ui.tooling.PreviewActivity;
import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8139c;

    public /* synthetic */ v0(String str, String str2, int i11) {
        this.f8137a = i11;
        this.f8138b = str;
        this.f8139c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i11 = this.f8137a;
        String str = this.f8139c;
        String str2 = this.f8138b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = sVar.f(str2);
                    String str3 = this.f8139c;
                    boolean zF2 = zF | sVar.f(str3);
                    Object objM = sVar.M();
                    if (zF2 || objM == m3.m.f29332a) {
                        objM = new x0(str2, str3, 0);
                        sVar.k0(objM);
                    }
                    r9.d(str3, j5.r.c(b4.q.f5711a, false, (Function1) objM), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, 0, 12582912, 131068);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                o30.e0.o(str2, str, (m3.n) obj, m3.i.F(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ug.c.d(str2, str, (m3.n) obj, m3.i.F(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                wi.h.f(str2, str, (m3.n) obj, m3.i.F(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                wi.a.d(str2, str, (m3.n) obj, m3.i.F(1));
                break;
            default:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i12 = PreviewActivity.f2256c;
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    b0.a0.D(str2, str, sVar2, new Object[0]);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ v0(String str, String str2, int i11, int i12) {
        this.f8137a = i12;
        this.f8138b = str;
        this.f8139c = str2;
    }
}
