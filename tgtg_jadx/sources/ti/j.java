package ti;

import c5.m2;
import com.app.tgtg.R;
import d2.n0;
import d2.v0;
import g3.r9;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import m3.c3;
import m5.k0;
import m5.u0;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f40231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f40232c;

    public /* synthetic */ j(s sVar, c3 c3Var, int i11) {
        this.f40230a = i11;
        this.f40231b = sVar;
        this.f40232c = c3Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f40230a;
        c3 c3Var = this.f40232c;
        s sVar = this.f40231b;
        int i12 = 1;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strU = f0.U(sVar2, R.string.charity_collection_days_week_days_title);
                    u0 u0Var = lv.v.f28275o;
                    long j9 = lv.s.C;
                    float f11 = lv.t.f28253g;
                    b4.q qVar = b4.q.f5711a;
                    r9.d(strU, d2.c.B(qVar, f11, 0.0f, 2), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 131064);
                    String strU2 = f0.U(sVar2, R.string.charity_collection_days_week_days_description);
                    u0 u0Var2 = lv.v.f28276p;
                    float f12 = lv.t.f28251e;
                    r9.d(strU2, d2.c.A(qVar, f11, f12), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar2, 432, 12582912, 131064);
                    d2.b bVar = d2.i.f13801a;
                    n0.a(d2.c.A(qVar, f11, f11), d2.i.h(lv.t.f28252f, b4.d.f5694m), null, null, 0, 0, u3.e.e(-1951873262, sVar2, new j(sVar, c3Var, i12)), sVar2, 1572918, 60);
                    r9.d(f0.U(sVar2, R.string.charity_collection_days_custom_title), d2.c.D(qVar, f11, lv.t.f28255i, f11, 0.0f, 8), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 131064);
                    r9.d(f0.U(sVar2, R.string.charity_collection_days_custom_description), d2.c.A(qVar, f11, f12), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar2, 432, 12582912, 131064);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            default:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((v0) obj).getClass();
                m3.s sVar3 = (m3.s) nVar2;
                if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    int i13 = 0;
                    for (Object obj4 : CollectionsKt.r0(r.f40259a)) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            d0.n();
                            throw null;
                        }
                        b4.t tVarA = b4.a.a(b4.q.f5711a, m2.f7291a, new q(sVar, i13));
                        String displayName = ((DayOfWeek) obj4).getDisplayName(TextStyle.FULL, Locale.getDefault());
                        displayName.getClass();
                        String strC = k0.c(displayName, t5.d.f39798a.k().b());
                        List list = (List) c3Var.getValue();
                        ArrayList arrayList = new ArrayList(e0.o(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((DayOfWeek) it.next()).getValue()));
                        }
                        t.a(tVarA, strC, arrayList.contains(Integer.valueOf(i14)), sVar3, 0);
                        i13 = i14;
                    }
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
        }
    }
}
