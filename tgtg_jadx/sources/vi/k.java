package vi;

import android.text.SpannableString;
import android.text.style.URLSpan;
import b4.t;
import cj.q;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.w;
import d2.y;
import g3.r9;
import i4.u0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import m3.s;
import m3.w1;
import m5.l0;
import m5.r0;
import o30.f0;
import q5.r;
import w.a0;
import x5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final void a(q qVar, Function1 function1, m3.n nVar, int i11) {
        String strT;
        int iG;
        int length;
        qVar.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1944662292);
        int i12 = (i11 & 6) == 0 ? (sVar.h(qVar) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            t tVarB = d2.c.B(b4.q.f5711a, ((x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing())).f44014j, 0.0f, 2);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarB, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            String strK = qVar.k();
            sVar.a0(1416299147);
            StringBuilder sb2 = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            ItemType itemType = ItemType.MANUFACTURER;
            if (d0.h(itemType, ItemType.CATERING).contains(qVar.g())) {
                sVar.a0(-1893191170);
                int i13 = qVar.g() == itemType ? R.string.mnu_checkout_overview_terms : qVar.f8333b.w() ? R.string.next_day_delivery_checkout_view_terms_and_privacy_policy : R.string.catering_checkout_view_terms_and_privacy_policy;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                SpannableString spannableString = new SpannableString(m0.c.c0(String.format(f0.U(sVar, i13), Arrays.copyOf(new Object[]{strK != null ? a0.p("<a href='", strK, "'>") : null, "</a>"}, 2))));
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                uRLSpanArr.getClass();
                String string = "";
                iG = 0;
                length = 0;
                for (URLSpan uRLSpan : uRLSpanArr) {
                    iG = spannableString.getSpanStart(uRLSpan);
                    length = spannableString.getSpanEnd(uRLSpan);
                    spannableString.removeSpan(uRLSpan);
                    string = spannableString.toString();
                    string.getClass();
                }
                sVar.q(false);
                strT = string;
            } else {
                sVar.a0(-1892115997);
                String strU = f0.U(sVar, R.string.checkout_terms_and_conditions_placeholder);
                strT = f0.T(R.string.checkout_terms_and_conditions, new Object[]{strU}, sVar);
                iG = StringsKt.G(strT, strU, 0, false, 6);
                length = strU.length() + iG;
                sVar.q(false);
            }
            int i14 = iG;
            int i15 = length;
            sb2.append(strT);
            if (strK == null) {
                sVar.a0(-1891647433);
                sVar.q(false);
            } else {
                sVar.a0(-1891647432);
                r0 r0Var = new r0(new l0(((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).Y, 0L, (r) null, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (p) null, (t5.c) null, 0L, x5.l.f43854c, (u0) null, 61438), null, null, null);
                boolean zF = ((i12 & 112) == 32) | sVar.f(strK);
                Object objM = sVar.M();
                if (zF || objM == m3.m.f29332a) {
                    objM = new sl.a(2, strK, function1);
                    sVar.k0(objM);
                }
                arrayList.add(new m5.d(new m5.n(strK, r0Var, (m5.p) objM), i14, i15, 8));
                sVar.q(false);
            }
            String string2 = sb2.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                arrayList2.add(((m5.d) arrayList.get(i16)).a(sb2.length()));
            }
            m5.h hVar2 = new m5.h(string2, arrayList2);
            sVar.q(false);
            r9.e(hVar2, null, ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).K, 0L, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, null, ((x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography())).f43967q, sVar, 0, 0, 261114);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(qVar, function1, i11, 13);
        }
    }
}
