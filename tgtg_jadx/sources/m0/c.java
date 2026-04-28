package m0;

import a3.l2;
import a3.l3;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.lifecycle.LifecycleOwner;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.ItemTag;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.GroupHeaderMnuV2;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.ModularFeedAction;
import com.app.tgtg.model.remote.manufacturer.request.ActionType;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.manufacturer.response.BasketWarningMessage;
import com.app.tgtg.model.remote.manufacturer.response.Brand;
import com.app.tgtg.model.remote.manufacturer.response.CateringProperties;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.payment.Price;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.j5;
import g3.r9;
import g3.s5;
import g3.v3;
import g3.w3;
import g3.w6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m3.d3;
import m3.q2;
import m3.v1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Decoder, l90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28474a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28475b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f28476c = 0;

    public static final void E(BaseItemMnuV2 baseItemMnuV2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1759448341);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        if (!sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.U();
        } else if (baseItemMnuV2.getItemType() == ItemType.CATERING) {
            sVar.a0(-55245368);
            CateringProperties cateringProperties = baseItemMnuV2.getCateringProperties();
            String estimatedDelivery = (cateringProperties != null ? cateringProperties.getEstimatedDelivery() : null) != null ? baseItemMnuV2.getCateringProperties().getEstimatedDelivery() : "";
            d2.c.f(m2.e(b4.q.f5711a, lv.t.f28248b), sVar);
            r9.d(android.support.v4.media.session.a.o((Context) sVar.j(c5.v0.f7390b), estimatedDelivery), null, lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
            sVar = sVar;
            sVar.q(false);
        } else {
            sVar.a0(-54687027);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.g(baseItemMnuV2, i11, 7);
        }
    }

    public static final void F(GroupHeaderMnuV2 groupHeaderMnuV2, m3.n nVar, int i11) {
        float f11;
        boolean z11;
        b4.q qVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(517984872);
        int i12 = i11 | (sVar.f(groupHeaderMnuV2) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            float f12 = lv.t.f28253g;
            float f13 = lv.t.f28251e;
            float f14 = lv.t.f28249c;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarC = d2.c.C(qVar2, f12, f13, f12, f14);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            String text = groupHeaderMnuV2.getText();
            if (text == null) {
                sVar.a0(1113432689);
                sVar.q(false);
                z11 = false;
                f11 = f13;
                qVar = qVar2;
            } else {
                sVar.a0(1113432690);
                f11 = f13;
                z11 = false;
                qVar = qVar2;
                r9.d(text, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 0, 0, 131066);
                sVar = sVar;
                sVar.q(false);
            }
            String subtext = groupHeaderMnuV2.getSubtext();
            if (subtext == null) {
                sVar.a0(1113631957);
                sVar.q(z11);
            } else {
                r8.k.t(f11, 1113631958, qVar, sVar, sVar);
                m3.s sVar2 = sVar;
                r9.d(subtext, null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar = sVar2;
                sVar.q(z11);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.f(groupHeaderMnuV2, i11);
        }
    }

    public static final q5.l G(q5.a0... a0VarArr) {
        List listAsList = Arrays.asList(a0VarArr);
        listAsList.getClass();
        return new q5.l(listAsList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.List] */
    public static final void H(BaseItemMnuV2 baseItemMnuV2, m3.n nVar, int i11) {
        Brand brand;
        Picture brandLogo;
        CateringProperties cateringProperties;
        Picture storeLogo;
        ?? arrayList;
        b4.k kVar = b4.d.f5683a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-690122090);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = lv.t.f28249c;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(qVar, f11);
            z4.u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            b4.t tVarA = f4.g.a(f4.g.b(m2.d(m2.e(qVar, 160), 1.0f), l2.g.b(8)), o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f);
            Picture coverPicture = baseItemMnuV2.getCoverPicture();
            String currentUrl = null;
            String currentUrl2 = coverPicture != null ? coverPicture.getCurrentUrl() : null;
            z4.c1 c1Var = z4.l.f47166a;
            gd.o.a(currentUrl2, null, tVarA, c1Var, sVar, 1572912, 0, 1976);
            List<ItemTagInfo> tags = baseItemMnuV2.getTags();
            d2.u uVar = d2.u.f13938a;
            if (tags == null || tags.isEmpty()) {
                sVar.a0(-1141270362);
                sVar.q(false);
            } else {
                sVar.a0(-1141754706);
                List<ItemTagInfo> tags2 = baseItemMnuV2.getTags();
                if (tags2 == null || !tags2.isEmpty()) {
                    Iterator it = tags2.iterator();
                    while (it.hasNext()) {
                        if (((ItemTagInfo) it.next()).getId() == ItemTag.FREE_DELIVERY) {
                            List<ItemTagInfo> tags3 = baseItemMnuV2.getTags();
                            arrayList = new ArrayList();
                            for (Object obj : tags3) {
                                if (((ItemTagInfo) obj).getId() != ItemTag.FREE_DELIVERY) {
                                    arrayList.add(obj);
                                }
                            }
                            b4.t tVarD = b4.a.d(uVar.a(qVar, kVar), 1.0f);
                            float f12 = lv.t.f28251e;
                            bg.m.d(d2.c.v(tVarD, f12, f12), arrayList, null, sVar, 0, 4);
                            sVar = sVar;
                            sVar.q(false);
                        }
                    }
                    arrayList = baseItemMnuV2.getTags();
                    b4.t tVarD2 = b4.a.d(uVar.a(qVar, kVar), 1.0f);
                    float f122 = lv.t.f28251e;
                    bg.m.d(d2.c.v(tVarD2, f122, f122), arrayList, null, sVar, 0, 4);
                    sVar = sVar;
                    sVar.q(false);
                } else {
                    arrayList = baseItemMnuV2.getTags();
                    b4.t tVarD22 = b4.a.d(uVar.a(qVar, kVar), 1.0f);
                    float f1222 = lv.t.f28251e;
                    bg.m.d(d2.c.v(tVarD22, f1222, f1222), arrayList, null, sVar, 0, 4);
                    sVar = sVar;
                    sVar.q(false);
                }
            }
            int i13 = bn.g0.$EnumSwitchMapping$0[baseItemMnuV2.getItemType().ordinal()];
            if (i13 == 1) {
                ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV2.getManufacturerItemProperties();
                if (manufacturerItemProperties != null && (brand = manufacturerItemProperties.getBrand()) != null && (brandLogo = brand.getBrandLogo()) != null) {
                    currentUrl = brandLogo.getCurrentUrl();
                }
            } else if (i13 == 2 && (cateringProperties = baseItemMnuV2.getCateringProperties()) != null && (storeLogo = cateringProperties.getStoreLogo()) != null) {
                currentUrl = storeLogo.getCurrentUrl();
            }
            String str = currentUrl;
            if (str == null) {
                sVar.a0(-1140976762);
                sVar.q(false);
            } else {
                sVar.a0(-1140976761);
                b4.t tVarM = m2.m(qVar, 37);
                float f13 = lv.t.f28251e;
                b4.t tVarA2 = uVar.a(d2.c.v(tVarM, f13, -f13), b4.d.f5689g);
                l2.f fVar = l2.g.f26790a;
                gd.o.a(str, null, f4.g.a(v1.n.k(f4.g.b(tVarA2, fVar), 1, lv.s.I, fVar), o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f), c1Var, sVar, 1572912, 0, 1976);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.g(baseItemMnuV2, i11, 6);
        }
    }

    public static final void I(BaseItemMnuV2 baseItemMnuV2, String str, String str2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1295999461);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = lv.t.f28251e;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarB = d2.c.B(qVar, f11, 0.0f, 2);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
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
            int i13 = i12 & 14;
            E(baseItemMnuV2, sVar, i13);
            R(baseItemMnuV2, str, sVar, i12 & 126);
            Q(baseItemMnuV2, str2, sVar, ((i12 >> 3) & 112) | i13);
            d2.c.f(m2.e(qVar, lv.t.f28249c), sVar);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(baseItemMnuV2, str, str2, i11, 3);
        }
    }

    public static final void J(String str, String str2, ModularFeedAction modularFeedAction, long j9, long j11, ym.y yVar, m3.n nVar, int i11) {
        int i12;
        String str3;
        String str4;
        i4.r0 r0Var;
        boolean z11;
        float f11;
        long j12 = j9;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-477834444);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(modularFeedAction) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.e(j12) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.e(j11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= (262144 & i11) == 0 ? sVar.f(yVar) : sVar.h(yVar) ? 131072 : 65536;
        }
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            i4.r0 r0Var2 = i4.g0.f23254b;
            b4.q qVar = b4.q.f5711a;
            if (str == null && str2 == null && modularFeedAction == null) {
                sVar.a0(-1643068210);
                sVar.q(false);
                str3 = str2;
                r0Var = r0Var2;
                f11 = 1.0f;
                str4 = str;
            } else {
                sVar.a0(-1643985004);
                b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), j12, r0Var2);
                float f12 = lv.t.f28251e;
                float f13 = lv.t.f28248b;
                float f14 = lv.t.f28253g;
                b4.t tVarC = d2.c.C(tVarJ, f14, f12, f14, f13);
                d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                b4.t tVarC2 = b4.a.c(tVarC, sVar);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar.e0();
                int i13 = i12;
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                b5.g gVar = b5.i.f5843f;
                m3.i.C(yVarA, gVar, sVar);
                b5.g gVar2 = b5.i.f5842e;
                m3.i.C(iVarL, gVar2, sVar);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b5.g gVar3 = b5.i.f5844g;
                m3.i.v(sVar, numValueOf, gVar3);
                b5.d dVar = b5.i.f5845h;
                m3.i.z(sVar, dVar);
                b5.g gVar4 = b5.i.f5841d;
                m3.i.C(tVarC2, gVar4, sVar);
                r0Var = r0Var2;
                i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                b4.t tVarC3 = b4.a.c(qVar, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(i2VarA, gVar, sVar);
                m3.i.C(iVarL2, gVar2, sVar);
                w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                m3.i.C(tVarC3, gVar4, sVar);
                if (str == null) {
                    sVar.a0(-1772782828);
                    sVar.q(false);
                    str4 = str;
                } else {
                    sVar.a0(-1772782827);
                    str4 = str;
                    lx.u.t(str4, j11, sVar, (i13 >> 9) & 112);
                    sVar.q(false);
                }
                b4.t tVarQ = m2.q(qVar, lv.t.f28249c);
                if (!(((double) 1.0f) > 0.0d)) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                d2.c.f(tVarQ.then(new n1(1.0f, true)), sVar);
                ModularFeedAction modularFeedAction2 = null;
                if (modularFeedAction != null) {
                    if (modularFeedAction.getActionType() == ActionType.QUERY) {
                        modularFeedAction2 = modularFeedAction;
                    }
                }
                if (modularFeedAction2 == null) {
                    sVar.a0(-1772462319);
                    z11 = false;
                    sVar.q(false);
                } else {
                    z11 = false;
                    sVar.a0(-1772462318);
                    lx.u.m(modularFeedAction2.getActionData(), yVar, sVar, (i13 >> 12) & 112);
                    sVar.q(false);
                }
                sVar.q(true);
                if (str2 == null) {
                    sVar.a0(553802333);
                    sVar.q(z11);
                    str3 = str2;
                } else {
                    sVar.a0(553802334);
                    str3 = str2;
                    lx.u.r(str3, j11, sVar, (i13 >> 9) & 112);
                    sVar.q(z11);
                }
                sVar.q(true);
                sVar.q(z11);
                f11 = 1.0f;
            }
            b4.t tVarD = m2.d(qVar, f11);
            j12 = j9;
            d2.c.f(m2.e(v1.n.j(tVarD, j12, r0Var), lv.t.f28248b), sVar);
        } else {
            str3 = str2;
            str4 = str;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.f0(str4, str3, modularFeedAction, j12, j11, yVar, i11);
        }
    }

    public static final void K(yk.h hVar, tg.i iVar, np.b bVar, Function0 function0, Function0 function02, String str, m3.n nVar, int i11) {
        m3.s sVar;
        iVar.getClass();
        bVar.getClass();
        str.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(289266948);
        int i12 = i11 | (sVar2.h(hVar) ? 4 : 2) | (sVar2.h(iVar) ? 32 : 16) | (sVar2.h(bVar) ? 256 : 128) | (sVar2.h(function0) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.f(str) ? 131072 : 65536);
        if (sVar2.R(i12 & 1, (74899 & i12) != 74898)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(yk.j.SELECT_AREA);
                sVar2.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            vg.a aVar = (vg.a) m3.i.n(iVar.f40168g, sVar2, 0).getValue();
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            m3.b1 b1Var2 = (m3.b1) objM2;
            Unit unit = Unit.f26487a;
            boolean zH = sVar2.h(hVar);
            Object objM3 = sVar2.M();
            if (zH || objM3 == fVar) {
                objM3 = new yk.b(hVar, null, 0);
                sVar2.k0(objM3);
            }
            m3.i.h(unit, (Function2) objM3, sVar2);
            d2.g0 g0Var = m2.f13850c;
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(g0Var, sVar2);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            Object value = b1Var.getValue();
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                objM4 = new yj.m(1);
                sVar2.k0(objM4);
            }
            sVar = sVar2;
            s1.i.a(value, null, (Function1) objM4, null, "LocationPickerSheetTransition", null, u3.e.e(1345368735, sVar2, new ep.e(iVar, hVar, function0, str, function02, bVar, aVar, b1Var, b1Var2)), sVar, 1597824, 42);
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.z(hVar, iVar, bVar, function0, function02, str, i11);
        }
    }

    public static final void L(b4.t tVar, Integer num, Integer num2, boolean z11, m3.n nVar, int i11) {
        t1.b bVar;
        t1.b bVar2;
        b4.q qVar;
        boolean z12;
        boolean z13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1493637340);
        int i12 = i11 | (sVar.f(num) ? 32 : 16) | (sVar.f(num2) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            Context context = (Context) sVar.j(c5.v0.f7390b);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = t1.c.a(0.0f);
                sVar.k0(objM2);
            }
            t1.b bVar3 = (t1.b) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = t1.c.a(-10.0f);
                sVar.k0(objM3);
            }
            t1.b bVar4 = (t1.b) objM3;
            Boolean boolValueOf = Boolean.valueOf(z11);
            boolean zH = sVar.h(bVar3) | sVar.h(bVar4);
            Object objM4 = sVar.M();
            if (zH || objM4 == fVar) {
                bVar = bVar3;
                bVar2 = bVar4;
                objM4 = new ep.a0(z11, b1Var, bVar, bVar2, (x70.c) null, 1);
                sVar.k0(objM4);
            } else {
                bVar = bVar3;
                bVar2 = bVar4;
            }
            m3.i.h(boolValueOf, (Function2) objM4, sVar);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(1089802095);
                b4.t tVarD = m2.d(tVar, 1.0f);
                float f11 = lv.t.f28253g;
                float f12 = 8;
                b4.t tVarJ = v1.n.j(f4.g.k(d2.c.w(f4.g.a(d2.c.z(tVarD, f11), ((Number) bVar.d()).floatValue()), 0.0f, ((Number) bVar2.d()).floatValue(), 1), 4, l2.g.b(f12), false, i4.v.b(0.4f, lv.s.C), 0L, 20), lv.s.J, l2.g.b(f12));
                z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                b4.t tVarC = b4.a.c(tVarJ, sVar);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                b5.g gVar = b5.i.f5843f;
                m3.i.C(u0VarD, gVar, sVar);
                b5.g gVar2 = b5.i.f5842e;
                m3.i.C(iVarL, gVar2, sVar);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b5.g gVar3 = b5.i.f5844g;
                m3.i.v(sVar, numValueOf, gVar3);
                b5.d dVar = b5.i.f5845h;
                m3.i.z(sVar, dVar);
                b5.g gVar4 = b5.i.f5841d;
                m3.i.C(tVarC, gVar4, sVar);
                b4.q qVar2 = b4.q.f5711a;
                b4.t tVarZ = d2.c.z(m2.d(qVar2, 1.0f), f11);
                i2 i2VarA = h2.a(d2.i.f13805e, b4.d.f5692j, sVar, 6);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                b4.t tVarC2 = b4.a.c(tVarZ, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(i2VarA, gVar, sVar);
                m3.i.C(iVarL2, gVar2, sVar);
                w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                m3.i.C(tVarC2, gVar4, sVar);
                if (num2 == null) {
                    sVar.a0(-816746533);
                    z12 = false;
                    sVar.q(false);
                    qVar = qVar2;
                } else {
                    sVar.a0(-816746532);
                    qVar = qVar2;
                    v1.n.d(o00.x0.z(num2.intValue(), sVar, 0), null, m2.m(qVar2, 24), null, null, 0.0f, null, sVar, 440, 120);
                    z12 = false;
                    sVar.q(false);
                }
                if (num == null) {
                    sVar.a0(-816482041);
                    sVar.q(z12);
                    z13 = true;
                } else {
                    sVar.a0(-816482040);
                    String string = context.getString(num.intValue());
                    string.getClass();
                    z13 = true;
                    r9.d(string, d2.c.D(qVar, lv.t.f28251e, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.l, sVar, 48, 12582912, 131068);
                    sVar = sVar;
                    sVar.q(z12);
                }
                e0.f.D(sVar, z13, z13, z12);
            } else {
                sVar.a0(1091054278);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.c(tVar, num, num2, z11, i11);
        }
    }

    public static final void M(BasketResponse basketResponse, w6 w6Var, BasketManager basketManager, um.u uVar, m3.n nVar, int i11) {
        m3.s sVar;
        basketResponse.getClass();
        w6Var.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1327028496);
        int i12 = (i11 & 6) == 0 ? (sVar2.h(basketResponse) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(w6Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.h(basketManager) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= (i11 & 4096) == 0 ? sVar2.f(uVar) : sVar2.h(uVar) ? NewHope.SENDB_BYTES : 1024;
        }
        int i13 = i12;
        if (sVar2.R(i13 & 1, (i13 & 1171) != 1170)) {
            char c3 = 3;
            f2.c0 c0VarA = f2.e0.a(0, 0, 0, 3, sVar2);
            List<BasketItem> basketItems = basketResponse.getBasketItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : basketItems) {
                BasketItem basketItem = (BasketItem) obj;
                char c7 = c3;
                if (basketItem.getWarnings().contains(BasketWarningMessage.SOLD_OUT) || basketItem.getWarnings().contains(BasketWarningMessage.OVER_LIMIT)) {
                    arrayList.add(obj);
                }
                c3 = c7;
            }
            long j9 = lv.s.J;
            w3 w3Var = new w3(false, 2);
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                objM = new uu.a(9);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            v3.a((Function0) objM, null, w6Var, 0.0f, false, null, j9, 0L, 0.0f, 0L, null, null, w3Var, u3.e.e(-1896878478, sVar2, new cn.x(26, c0VarA, arrayList, basketManager, uVar)), sVar, ((i13 << 3) & 896) | 1572870, 3462, 3002);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.t0(basketResponse, w6Var, i11, basketManager, uVar, 23);
        }
    }

    public static final void N(BaseItemMnuV2 baseItemMnuV2, String str, String str2, ym.y yVar, m3.n nVar, int i11) {
        int i12;
        baseItemMnuV2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(513027538);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(str2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= (i11 & 4096) == 0 ? sVar.f(yVar) : sVar.h(yVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            float f11 = lv.t.f28249c;
            b4.t tVarC = d2.c.C(b4.q.f5711a, f11, f11, f11, lv.t.f28252f);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            d3 d3Var = x1.f7416h;
            m3.i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, u3.e.e(-1283263208, sVar, new bn.p(yVar, baseItemMnuV2, str, str2)), sVar, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.t0(baseItemMnuV2, str, i11, str2, yVar, 1);
        }
    }

    public static final void O(BaseItemMnuV2 baseItemMnuV2, ym.y yVar, m3.n nVar, int i11) {
        int i12;
        BaseItemMnuV2 baseItemMnuV22;
        ym.y yVar2;
        baseItemMnuV2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(985588146);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(yVar) : sVar.h(yVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Price itemPrice = baseItemMnuV2.getItemPrice();
            String strI = itemPrice != null ? mv.d.i(itemPrice, 1) : null;
            Price itemValue = baseItemMnuV2.getItemValue();
            yVar2 = yVar;
            String str = strI;
            baseItemMnuV22 = baseItemMnuV2;
            N(baseItemMnuV22, str, itemValue != null ? mv.d.i(itemValue, 1) : null, yVar2, sVar, (i12 & 14) | ((i12 << 6) & 7168));
        } else {
            baseItemMnuV22 = baseItemMnuV2;
            yVar2 = yVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(baseItemMnuV22, yVar2, i11, 1);
        }
    }

    public static final void P(int i11, b4.t tVar, Order order, Function0 function0, m3.n nVar) {
        int i12;
        tVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-33135943);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(order) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(tVar) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.t tVarD = d2.c.D(tVar, 0.0f, 0.0f, 0.0f, 24, 7);
            boolean z11 = (i12 & 14) == 4;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new j5(7, function0);
                sVar.k0(objM);
            }
            b4.t tVarC = androidx.compose.foundation.b.c(tVarD, false, null, null, (Function0) objM, 15);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC2, gVar4, sVar);
            l2.f fVar = l2.g.f26790a;
            b4.q qVar = b4.q.f5711a;
            gd.o.c(order != null ? order.getItemOrStoreLogoUrl() : null, null, m2.m(f4.g.b(qVar, fVar), 48), null, o00.x0.z((order == null || !order.isDonation()) ? R.drawable.gfx_tgtg_logo_green : 2131231127, sVar, 0), null, null, 0.0f, null, sVar, 32816, 0, 32744);
            b4.t tVarD2 = d2.c.D(qVar, 8, 0.0f, 0.0f, 0.0f, 14);
            d2.y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5694m, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            String storeName = order != null ? order.getStoreName() : null;
            String str = storeName == null ? "" : storeName;
            m5.u0 u0Var = lv.v.f28272k;
            long j9 = lv.s.C;
            r9.d(str, m2.d(qVar, 1.0f), j9, 0L, null, 0L, null, new x5.k(5), 0L, 2, false, 1, 0, null, u0Var, sVar, 432, 12607872, 109560);
            String itemName = order != null ? order.getItemName() : null;
            r9.d(itemName == null ? "" : itemName, m2.d(qVar, 1.0f), j9, 0L, null, 0L, null, new x5.k(5), 0L, 2, false, 1, 0, null, lv.v.f28274n, sVar, 432, 12607872, 109560);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(function0, order, tVar, i11, 10);
        }
    }

    public static final void Q(BaseItemMnuV2 baseItemMnuV2, String str, m3.n nVar, int i11) {
        float f11;
        boolean z11;
        b4.q qVar;
        String str2 = str;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1309887528);
        int i12 = i11 | (sVar.h(baseItemMnuV2) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str2) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar2, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            String strY = o30.e0.y(baseItemMnuV2);
            if (strY == null) {
                sVar.a0(372379235);
                sVar.q(false);
                f11 = 1.0f;
                z11 = false;
                qVar = qVar2;
            } else {
                sVar.a0(372379236);
                b4.t tVarA = f4.g.a(qVar2, o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                f11 = 1.0f;
                z11 = false;
                qVar = qVar2;
                r9.d(strY, b3.i.e(1.0f, tVarA, true), lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
                sVar = sVar;
                sVar.q(false);
            }
            if (str == null) {
                sVar.a0(372779879);
                sVar.q(z11);
                str2 = str;
            } else {
                sVar.a0(372779880);
                d2.c.f(m2.q(qVar, lv.t.f28251e), sVar);
                m3.s sVar2 = sVar;
                str2 = str;
                r9.d(str2, f4.g.a(qVar, o30.e0.A(baseItemMnuV2) ? f11 : 0.4f), lv.s.E, 0L, null, 0L, x5.l.f43855d, null, 0L, 0, false, 1, 0, null, lv.v.f28276p, sVar2, 805306752, 12607488, 114168);
                sVar = sVar2;
                sVar.q(z11);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.e0(baseItemMnuV2, str2, i11, 0);
        }
    }

    public static final void R(BaseItemMnuV2 baseItemMnuV2, String str, m3.n nVar, int i11) {
        String str2 = str;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1986453748);
        int i12 = i11 | (sVar.h(baseItemMnuV2) ? 4 : 2) | (sVar.f(str2) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            String strW = o30.e0.w(baseItemMnuV2);
            sVar.a0(-212057620);
            b4.t tVarA = f4.g.a(qVar, o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarE = b3.i.e(1.0f, tVarA, true);
            long j9 = lv.s.C;
            r9.d(strW, tVarE, j9, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28272k, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
            sVar = sVar;
            sVar.q(false);
            if (str == null) {
                sVar.a0(-211650715);
                sVar.q(false);
                str2 = str;
            } else {
                sVar.a0(-211650714);
                d2.c.f(m2.q(qVar, lv.t.f28251e), sVar);
                b4.t tVarA2 = f4.g.a(qVar, o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f);
                if (!o30.e0.A(baseItemMnuV2)) {
                    j9 = lv.s.E;
                }
                str2 = str;
                r9.d(str2, tVarA2, j9, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, lv.v.l, sVar, 0, 12607488, 114680);
                sVar = sVar;
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.t(baseItemMnuV2, str2, i11, 1);
        }
    }

    public static final void S(BasketItem basketItem, m3.n nVar, int i11) {
        BasketItem basketItem2;
        boolean z11;
        String strG;
        basketItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1942843090);
        int i12 = i11 | (sVar.h(basketItem) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            boolean zContains = basketItem.getWarnings().contains(BasketWarningMessage.SOLD_OUT);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            d2.c.f(m2.m(qVar, lv.t.f28253g), sVar);
            b4.k kVar = b4.d.f5687e;
            b4.t tVarB = f4.g.b(qVar, l2.g.b(16));
            long j9 = zContains ? lv.s.I : lv.s.f28233n;
            i4.r0 r0Var = i4.g0.f23254b;
            b4.t tVarA = d2.c.A(v1.n.j(tVarB, j9, r0Var), lv.t.f28252f, lv.t.f28249c);
            z4.u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            if (zContains) {
                z11 = false;
                strG = b3.i.j(153735601, R.string.store_item_label_sold_out, sVar, sVar, false);
            } else {
                z11 = false;
                sVar.a0(153841249);
                strG = o30.f0.G(R.plurals.mnu_basket_screen_only_x_available, basketItem.getMaxAvailableQuantity(), new Object[]{Integer.valueOf(basketItem.getMaxAvailableQuantity())}, sVar);
                sVar.q(false);
            }
            r9.d(strG, null, zContains ? lv.s.D : lv.s.f28231k, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28273m, sVar, 0, 12607872, 110586);
            sVar = sVar;
            sVar.q(true);
            d2.c.f(m2.m(qVar, lv.t.f28251e), sVar);
            b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.J, r0Var);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarJ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            int i13 = i12 & 14;
            basketItem2 = basketItem;
            na0.a.G(basketItem2, new n1(1.0f, true), sVar, i13);
            na0.a.F(basketItem2, b1Var, f4.g.b(m2.e(m2.q(qVar, 62), 32), l2.g.b(4)), sVar, i13 | 48);
            sVar.q(true);
            sVar.q(true);
        } else {
            basketItem2 = basketItem;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.m(basketItem2, i11, 19);
        }
    }

    public static void T(int i11, Object[] objArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                c50.w.l(j4.s.f(i12, "at index "));
                return;
            }
        }
    }

    public static final long U(int i11, int i12, ud.h hVar, ud.g gVar, ud.h hVar2) {
        int i13;
        int i14;
        if (!Intrinsics.areEqual(hVar, ud.h.f41059c)) {
            i11 = p0(hVar.f41060a, gVar);
            i12 = p0(hVar.f41061b, gVar);
        }
        ud.c cVar = hVar2.f41060a;
        ud.c cVar2 = hVar2.f41061b;
        if ((cVar instanceof ud.a) && i11 != Integer.MIN_VALUE && i11 != Integer.MAX_VALUE && i11 > (i14 = ((ud.a) cVar).f41055a)) {
            i11 = i14;
        }
        if ((cVar2 instanceof ud.a) && i12 != Integer.MIN_VALUE && i12 != Integer.MAX_VALUE && i12 > (i13 = ((ud.a) cVar2).f41055a)) {
            i12 = i13;
        }
        return (((long) i12) & 4294967295L) | (((long) i11) << 32);
    }

    public static final double V(int i11, int i12, int i13, int i14, ud.g gVar, ud.h hVar) {
        double dMax;
        double d3 = i11;
        double d11 = ((double) i13) / d3;
        double d12 = i12;
        double d13 = ((double) i14) / d12;
        int i15 = id.j.$EnumSwitchMapping$0[gVar.ordinal()];
        if (i15 == 1) {
            dMax = Math.max(d11, d13);
        } else {
            if (i15 != 2) {
                e40.a.f();
                return 0.0d;
            }
            dMax = Math.min(d11, d13);
        }
        ud.c cVar = hVar.f41060a;
        if (cVar instanceof ud.a) {
            double d14 = ((double) ((ud.a) cVar).f41055a) / d3;
            if (dMax > d14) {
                dMax = d14;
            }
        }
        ud.c cVar2 = hVar.f41061b;
        if (cVar2 instanceof ud.a) {
            double d15 = ((double) ((ud.a) cVar2).f41055a) / d12;
            if (dMax > d15) {
                return d15;
            }
        }
        return dMax;
    }

    public static float[] W(float[] fArr, int i11) {
        if (i11 < 0) {
            i4.a.h();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i11, length);
        float[] fArr2 = new float[i11];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static CreateCredentialException X(String str, String str2) {
        Exception excU;
        str.getClass();
        try {
            CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException = new CreatePublicKeyCredentialDomException(new o7.a(26), null);
            if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excU = na0.a.U(new o7.a(0), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excU = na0.a.U(new o7.a(1), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excU = na0.a.U(new o7.a(2), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excU = na0.a.U(new o7.a(3), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excU = na0.a.U(new o7.a(4), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excU = na0.a.U(new o7.a(5), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excU = na0.a.U(new o7.a(6), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excU = na0.a.U(new o7.a(7), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excU = na0.a.U(new o7.a(8), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excU = na0.a.U(new o7.a(9), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excU = na0.a.U(new o7.a(10), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excU = na0.a.U(new o7.a(11), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excU = na0.a.U(new o7.a(12), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excU = na0.a.U(new o7.a(13), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excU = na0.a.U(new o7.a(14), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excU = na0.a.U(new o7.a(15), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excU = na0.a.U(new o7.a(16), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excU = na0.a.U(new o7.a(17), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excU = na0.a.U(new o7.a(18), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excU = na0.a.U(new o7.a(19), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excU = na0.a.U(new o7.a(20), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excU = na0.a.U(new o7.a(21), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excU = na0.a.U(new o7.a(22), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excU = na0.a.U(new o7.a(23), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excU = na0.a.U(new o7.a(24), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excU = na0.a.U(new o7.a(25), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excU = na0.a.U(new o7.a(26), str2, createPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excU = na0.a.U(new o7.a(27), str2, createPublicKeyCredentialDomException);
            } else {
                if (!Intrinsics.areEqual(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                excU = na0.a.U(new o7.a(28), str2, createPublicKeyCredentialDomException);
            }
            return (CreateCredentialException) excU;
        } catch (FrameworkClassParsingException unused) {
            return new CreateCredentialCustomException(str2, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x6.e[] Y(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.c.Y(java.lang.String):x6.e[]");
    }

    public static rz.b a0(byte[] bArr, Parcelable.Creator creator) {
        com.google.android.gms.common.internal.i0.h(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        rz.b bVar = (rz.b) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return bVar;
    }

    public static String b0(androidx.datastore.preferences.protobuf.f fVar) {
        StringBuilder sb2 = new StringBuilder(fVar.size());
        for (int i11 = 0; i11 < fVar.size(); i11++) {
            byte b8 = fVar.b(i11);
            if (b8 == 34) {
                sb2.append("\\\"");
            } else if (b8 == 39) {
                sb2.append("\\'");
            } else if (b8 != 92) {
                switch (b8) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append(CodeBlockHandler.NEWLINE_REGEX);
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b8 < 32 || b8 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b8 >>> 6) & 3) + 48));
                            sb2.append((char) (((b8 >>> 3) & 7) + 48));
                            sb2.append((char) ((b8 & 7) + 48));
                        } else {
                            sb2.append((char) b8);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final Spanned c0(String str) {
        if (str == null) {
            return new SpannableString("");
        }
        Spanned spannedFromHtml = Html.fromHtml(str.toString(), 0);
        spannedFromHtml.getClass();
        return spannedFromHtml;
    }

    public static e0.a d0(int i11) {
        Object next;
        Iterator it = e0.a.f15305b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((e0.a) next).f15306a == i11) {
                break;
            }
        }
        return (e0.a) next;
    }

    public static final boolean e0(l3 l3Var, boolean z11) {
        z4.z zVarC;
        m2.e1 e1Var = l3Var.f451d;
        if (e1Var == null || (zVarC = e1Var.c()) == null) {
            return false;
        }
        return l2.a(l3Var.l(z11), l2.c(zVarC));
    }

    public static final void f0(androidx.lifecycle.k0 k0Var, LifecycleOwner lifecycleOwner, Function1 function1) {
        k0Var.getClass();
        lifecycleOwner.getClass();
        k0Var.e(lifecycleOwner, new al.i(function1, 4));
    }

    public static pe.a g0(ue.e eVar, he.k kVar) {
        return new pe.a(te.q.a(eVar, kVar, 1.0f, te.f.f40072b, false), 0);
    }

    public static pe.b h0(ue.d dVar, he.k kVar, boolean z11) {
        return new pe.b(te.q.a(dVar, kVar, z11 ? ve.k.c() : 1.0f, te.f.f40073c, false), 1);
    }

    public static pe.a i0(ue.e eVar, he.k kVar, int i11) {
        e10.t tVar = new e10.t();
        tVar.f15548a = i11;
        ArrayList arrayListA = te.q.a(eVar, kVar, 1.0f, tVar, false);
        for (int i12 = 0; i12 < arrayListA.size(); i12++) {
            we.a aVar = (we.a) arrayListA.get(i12);
            qe.c cVar = (qe.c) aVar.f43388b;
            qe.c cVar2 = (qe.c) aVar.f43389c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f36955a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f36955a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f11 = Float.NaN;
                    int i13 = 0;
                    for (int i14 = 0; i14 < length2; i14++) {
                        float f12 = fArr3[i14];
                        if (f12 != f11) {
                            fArr3[i13] = f12;
                            i13++;
                            f11 = fArr3[i14];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i13);
                    aVar = new we.a(cVar.b(fArrCopyOfRange), cVar2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i12, aVar);
        }
        return new pe.a(arrayListA, 1);
    }

    public static pe.a j0(ue.d dVar, he.k kVar) {
        return new pe.a(te.q.a(dVar, kVar, 1.0f, te.f.f40074d, false), 2);
    }

    public static pe.a k0(ue.e eVar, he.k kVar) {
        return new pe.a(te.q.a(eVar, kVar, ve.k.c(), te.f.f40076f, true), 3);
    }

    public static final void l0(q2 q2Var, m3.c cVar, int i11) {
        while (true) {
            int i12 = q2Var.f29402v;
            if (i11 > i12 && i11 < q2Var.f29401u) {
                return;
            }
            if (i12 == 0 && i11 == 0) {
                return;
            }
            q2Var.O();
            if (q2Var.y(q2Var.f29402v)) {
                cVar.j();
            }
            q2Var.j();
        }
    }

    public static int m0(int i11, byte[] bArr) {
        int i12 = ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        u70.y yVar = u70.z.f40865b;
        return i12;
    }

    public static int n0(int i11, int i12) {
        u70.y yVar = u70.z.f40865b;
        return Integer.rotateLeft(i11 + (i12 * (-2048144777)), 13) * (-1640531535);
    }

    public static boolean o0(String str) {
        return str == null || str.isEmpty();
    }

    public static int p0(ud.c cVar, ud.g gVar) {
        if (cVar instanceof ud.a) {
            return ((ud.a) cVar).f41055a;
        }
        int i11 = id.j.$EnumSwitchMapping$0[gVar.ordinal()];
        if (i11 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i11 == 2) {
            return Integer.MAX_VALUE;
        }
        e40.a.f();
        return 0;
    }

    public static final String q0(float f11) {
        if (Float.isNaN(f11)) {
            return "NaN";
        }
        if (Float.isInfinite(f11)) {
            return f11 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f12 = f11 * fPow;
        int i11 = (int) f12;
        if (f12 - i11 >= 0.5f) {
            i11++;
        }
        float f13 = i11 / fPow;
        return iMax > 0 ? String.valueOf(f13) : String.valueOf((int) f13);
    }

    public static final String r0(Context context, int i11, int i12, String str) {
        context.getClass();
        str.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = context.getString(i11);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{org.bouncycastle.jcajce.provider.asymmetric.a.d("<a href='", str, "'>", context.getString(i12), "</a>")}, 1));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte A() {
        Object objZ = Z();
        objZ.getClass();
        return ((Byte) objZ).byteValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short B() {
        Object objZ = Z();
        objZ.getClass();
        return ((Short) objZ).shortValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float C() {
        Object objZ = Z();
        objZ.getClass();
        return ((Float) objZ).floatValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double D() {
        Object objZ = Z();
        objZ.getClass();
        return ((Double) objZ).doubleValue();
    }

    public Object Z() {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // l90.a
    public void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public l90.a c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // l90.a
    public char d(m90.g1 g1Var, int i11) {
        g1Var.getClass();
        return i();
    }

    @Override // l90.a
    public short e(m90.g1 g1Var, int i11) {
        g1Var.getClass();
        return B();
    }

    @Override // l90.a
    public byte f(m90.g1 g1Var, int i11) {
        g1Var.getClass();
        return A();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean g() {
        Object objZ = Z();
        objZ.getClass();
        return ((Boolean) objZ).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char i() {
        Object objZ = Z();
        objZ.getClass();
        return ((Character) objZ).charValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int j(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        Object objZ = Z();
        objZ.getClass();
        return ((Integer) objZ).intValue();
    }

    @Override // l90.a
    public long k(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return s();
    }

    @Override // l90.a
    public float l(m90.g1 g1Var, int i11) {
        g1Var.getClass();
        return C();
    }

    @Override // l90.a
    public Object m(SerialDescriptor serialDescriptor, int i11, i90.b bVar, Object obj) {
        serialDescriptor.getClass();
        bVar.getClass();
        if (bVar.getDescriptor().c() || v()) {
            return h(bVar);
        }
        return null;
    }

    @Override // l90.a
    public Object n(SerialDescriptor serialDescriptor, int i11, i90.b bVar, Object obj) {
        serialDescriptor.getClass();
        bVar.getClass();
        return h(bVar);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int p() {
        Object objZ = Z();
        objZ.getClass();
        return ((Integer) objZ).intValue();
    }

    @Override // l90.a
    public int q(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return p();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String r() {
        Object objZ = Z();
        objZ.getClass();
        return (String) objZ;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long s() {
        Object objZ = Z();
        objZ.getClass();
        return ((Long) objZ).longValue();
    }

    @Override // l90.a
    public boolean t(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return g();
    }

    @Override // l90.a
    public String u(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return r();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean v() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // l90.a
    public double y(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return D();
    }

    @Override // l90.a
    public Decoder z(m90.g1 g1Var, int i11) {
        g1Var.getClass();
        return x(g1Var.h(i11));
    }
}
