package xq;

import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.Button;
import androidx.fragment.app.o0;
import androidx.recyclerview.widget.y1;
import cj.d0;
import cj.e0;
import com.app.tgtg.R;
import com.app.tgtg.customview.InputFieldView;
import com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragment;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreSignupFragmentWeb;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemsV2Response;
import com.app.tgtg.model.remote.user.response.Co2eSavedResponse;
import f2.l;
import f70.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import le.v;
import m0.m1;
import m3.b1;
import mv.r0;
import oo.s;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.c2;
import s0.g0;
import s0.o2;
import tg.g;
import u3.d;
import u6.f;
import uq.e;
import v80.b0;
import v80.f0;
import vm.p;
import xj.k;
import yi.r;
import ym.o;
import ym.u;
import z1.b4;
import z1.h2;
import z1.j1;
import z1.k1;
import z1.k3;
import z1.l3;
import z1.n;
import z1.n0;
import z1.q;
import z1.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44488c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f44486a = i11;
        this.f44487b = obj;
        this.f44488c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y1 layoutManager;
        String strK;
        int i11 = this.f44486a;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.f44488c;
        Object obj3 = this.f44487b;
        switch (i11) {
            case 0:
                l lVar = (l) obj;
                lVar.getClass();
                l.q(lVar, null, new d(new s(15, (Co2eSavedResponse) obj3, (e) obj2), true, 1538428977), 3);
                break;
            case 1:
                g0 g0Var = (g0) obj2;
                m1 m1Var = (m1) obj;
                m1Var.getClass();
                Object obj4 = ((HashMap) obj3).get(m1Var);
                if (obj4 == null) {
                    i4.a.f("Required value was null.");
                } else {
                    y0.c cVar = (y0.c) obj4;
                    o2 o2VarO = m1Var.o(g0Var, cVar.f44538a, cVar.f44539b);
                    o2VarO.getClass();
                }
                break;
            case 2:
                r rVar = (r) obj3;
                String str2 = (String) obj;
                str2.getClass();
                e0 e0VarU = rVar.u();
                f0.B(androidx.lifecycle.m1.d(e0VarU), null, null, new d0(e0VarU, str2, true, null), 3);
                ((b1) obj2).setValue(Boolean.FALSE);
                rVar.u().V = rVar.u().l.f45488a.getValue() != null;
                break;
            case 3:
                List list = (List) obj;
                list.getClass();
                f0.B((b0) obj3, null, null, new rf.c((r) obj2, list, objArr == true ? 1 : 0, 25), 3);
                break;
            case 4:
                k kVar = (k) obj3;
                List list2 = (List) obj2;
                BasicItem basicItem = (BasicItem) obj;
                basicItem.getClass();
                kVar.e(dv.d.DISMISS_CARD, basicItem, null, list2.indexOf(basicItem), list2.size());
                f0.B(androidx.lifecycle.m1.d(kVar), null, null, new g(kVar, basicItem, objArr2 == true ? 1 : 0, 11), 3);
                break;
            case 5:
                List list3 = (List) obj3;
                l lVar2 = (l) obj;
                lVar2.getClass();
                l.q(lVar2, null, yl.a.f46139a, 3);
                l.q(lVar2, null, yl.a.f46140b, 3);
                lVar2.r(list3.size(), null, new p(list3, 2), new d(new lk.b((b1) obj2, list3, 4), true, 802480018));
                break;
            case 6:
                u uVar = (u) obj3;
                c2 c2Var = (c2) obj2;
                ((View) obj).getClass();
                if (uVar.f46246u) {
                    uVar.u();
                } else {
                    ManufacturerItemsV2Response manufacturerItemsV2Response = uVar.f46243r;
                    if (manufacturerItemsV2Response != null) {
                        uVar.f46245t = false;
                        uVar.r().f46267p = "";
                        if (uVar.f46236j == null) {
                            uVar.t();
                        }
                        o oVar = uVar.f46236j;
                        if (oVar != null) {
                            ArrayList arrayList = oVar.f46203c;
                            arrayList.getClass();
                            arrayList.clear();
                            oVar.notifyDataSetChanged();
                        }
                        uVar.r().d();
                        uVar.s(manufacturerItemsV2Response);
                        Parcelable parcelable = uVar.f46244s;
                        if (parcelable != null && (layoutManager = c2Var.C.getLayoutManager()) != null) {
                            layoutManager.onRestoreInstanceState(parcelable);
                        }
                    } else {
                        uVar.f46238m = 0L;
                        uVar.r().d();
                        uVar.B();
                    }
                }
                break;
            case 7:
                n nVar = (n) obj3;
                q qVar = (q) obj2;
                long j9 = ((n0) obj).f46612a;
                long jG = nVar.h1() ? h4.b.g(-1.0f, j9) : h4.b.g(1.0f, j9);
                qVar.a(nVar.I.f(Float.intBitsToFloat((int) (nVar.J == h2.Vertical ? jG & 4294967295L : jG >> 32))), 0.0f);
                break;
            case 8:
                ((o3.e) ((f) obj3).f40820a).j((x) obj2);
                break;
            case 9:
                z1.b0 b0Var = (z1.b0) obj3;
                k1 k1Var = (k1) obj2;
                long j11 = ((n0) obj).f46612a;
                long jG2 = k1Var.N ? h4.b.g(-1.0f, j11) : h4.b.g(1.0f, j11);
                h2 h2Var = k1Var.J;
                v vVar = j1.f46557a;
                b0Var.f46410a.f46431a.invoke(Float.valueOf(Float.intBitsToFloat((int) (h2Var == h2.Vertical ? jG2 & 4294967295L : jG2 >> 32))));
                break;
            case 10:
                k3 k3Var = (k3) obj3;
                l3 l3Var = (l3) obj2;
                n0 n0Var = (n0) obj;
                float f11 = n0Var.f46613b ? -1.0f : 1.0f;
                long j12 = n0Var.f46612a;
                k3Var.a(1, h4.b.g(f11, l3Var.f46587d == h2.Horizontal ? h4.b.a(0.0f, 1, j12) : h4.b.a(0.0f, 2, j12)));
                break;
            case 11:
                b4 b4Var = (b4) obj3;
                ((Long) obj).getClass();
                float f12 = b4Var.f46427e;
                b4Var.f46427e = 0.0f;
                ((Function1) obj2).invoke(Float.valueOf(f12));
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                ((xo.a) obj2).f44477e.invoke(new z5.f(((z5.c) obj3).O((int) (((z5.l) obj).f47286a & 4294967295L))));
                break;
            case 22:
                RecommendStoreFragment recommendStoreFragment = (RecommendStoreFragment) obj3;
                pg.a aVar = (pg.a) obj2;
                ((View) obj).getClass();
                o0 activity = recommendStoreFragment.getActivity();
                if (activity != null && activity.getCurrentFocus() != null) {
                    Object systemService = activity.getSystemService("input_method");
                    systemService.getClass();
                    View currentFocus = activity.getCurrentFocus();
                    currentFocus.getClass();
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
                pg.a aVar2 = recommendStoreFragment.f9446m;
                aVar2.getClass();
                if (recommendStoreFragment.u().f48068g.length() <= 0 || !r0.s(recommendStoreFragment.u().f48068g)) {
                    if (recommendStoreFragment.u().f48070i.length() > 0 && recommendStoreFragment.u().f48069h.length() > 0) {
                        if (r0.w("+" + recommendStoreFragment.u().f48070i + recommendStoreFragment.u().f48069h)) {
                            InputFieldView inputFieldView = (InputFieldView) aVar2.f34764f;
                            String string = recommendStoreFragment.getString(R.string.profile_edit_phone_error_invalid_number);
                            string.getClass();
                            inputFieldView.k(string);
                        }
                    }
                    String strM = r8.k.m(recommendStoreFragment.getString(R.string.recommend_store_name), " = ", recommendStoreFragment.u().f48067f);
                    String strK2 = recommendStoreFragment.u().f48068g.length() > 0 ? j4.s.k(", ", recommendStoreFragment.getString(R.string.recommend_store_email), " = ", recommendStoreFragment.u().f48068g) : "";
                    String strD = (recommendStoreFragment.u().f48070i.length() <= 0 || recommendStoreFragment.u().f48069h.length() <= 0) ? "" : org.bouncycastle.jcajce.provider.asymmetric.a.d(", ", recommendStoreFragment.getString(R.string.recommend_store_phone_number), " = +", recommendStoreFragment.u().f48070i, recommendStoreFragment.u().f48069h);
                    strK = recommendStoreFragment.u().f48071j.length() > 0 ? j4.s.k(", ", recommendStoreFragment.getString(R.string.recommend_store_postal_code), " = ", recommendStoreFragment.u().f48071j) : "";
                    zs.d dVarU = recommendStoreFragment.u();
                    wr.b bVar = wr.b.STORE_SUGGESTION;
                    String string2 = recommendStoreFragment.getString(bVar.d().intValue());
                    string2.getClass();
                    dVarU.f48066e.i(new qt.a(Boolean.TRUE));
                    f0.B(androidx.lifecycle.m1.d(dVarU), null, null, new os.c(strM + strK2 + strD + strK, string2, bVar, dVarU, (x70.c) null, 24), 3);
                } else {
                    InputFieldView inputFieldView2 = (InputFieldView) aVar2.f34762d;
                    String string3 = recommendStoreFragment.getString(R.string.profil_edit_email_error_valid_email);
                    string3.getClass();
                    inputFieldView2.k(string3);
                }
                ((Button) aVar.f34761c).setEnabled(false);
                break;
            default:
                WebView webView = (WebView) obj3;
                StoreSignupFragmentWeb storeSignupFragmentWeb = (StoreSignupFragmentWeb) obj2;
                xs.c cVar2 = (xs.c) obj;
                cVar2.getClass();
                String str3 = cVar2.f44494a;
                if (str3 != null) {
                    i iVar = (i) storeSignupFragmentWeb.p().f48098a.a("ORIGIN");
                    if (iVar == null) {
                        iVar = i.UNKNOWN;
                    }
                    int i12 = zs.q.$EnumSwitchMapping$0[iVar.ordinal()];
                    if (i12 == 1) {
                        str = "profile_page";
                    } else if (i12 == 2) {
                        str = "manage_account";
                    }
                    if (str != null) {
                        int iF = StringsKt.F(str3, '#', 0, false, 6);
                        String strSubstring = iF >= 0 ? str3.substring(0, iF) : str3;
                        strK = iF >= 0 ? str3.substring(iF) : "";
                        if (!StringsKt.z(strSubstring, "utm_campaign=", false)) {
                            str3 = strSubstring + (StringsKt.A(strSubstring, '?') ? '&' : '?') + "utm_campaign=" + str + strK;
                        }
                    }
                    webView.loadUrl(str3);
                }
                break;
        }
        return Unit.f26487a;
    }
}
