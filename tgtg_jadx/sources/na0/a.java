package na0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.lifecycle.s1;
import b0.f3;
import b4.q;
import b4.t;
import b5.g;
import b5.h;
import c5.x1;
import c60.d;
import cn.x;
import com.app.tgtg.R;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.CategoryCard;
import com.app.tgtg.model.remote.item.response.HighlightedItemMnuV2;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.manufacturer.response.GetRecommendedManufacturerItemsResponse;
import com.app.tgtg.model.remote.payment.Price;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.common.util.concurrent.ListenableFuture;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w0;
import d2.y;
import d40.t1;
import defpackage.j;
import f2.c0;
import f2.e0;
import g3.r9;
import g3.s0;
import g3.s5;
import g3.u7;
import g3.v3;
import g3.w6;
import gd.o;
import i4.g0;
import i4.r0;
import i80.n;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import l90.b;
import lv.v;
import m3.b1;
import m3.d3;
import m3.f;
import m3.i;
import m3.i1;
import m3.m;
import m3.s;
import m3.v1;
import m3.w1;
import m5.l0;
import m5.q0;
import m5.r;
import m90.g1;
import n3.m0;
import o00.h0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.b0;
import t1.w;
import u3.e;
import um.u;
import w.a0;
import x5.k;
import x70.c;
import y80.a2;
import ym.z;
import z4.l;
import z4.u0;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Encoder, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f30792a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30793b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30794c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30795d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f30796e = 0;

    public a() {
        new ConcurrentHashMap();
    }

    public static final void E(BasketItem basketItem, BasketManager basketManager, int i11, u uVar, Map map, n nVar, m3.n nVar2, int i12) {
        b1 b1Var;
        i1 i1Var;
        int i13;
        Integer num;
        basketManager.getClass();
        s sVar = (s) nVar2;
        sVar.c0(-1025276437);
        int i14 = i12 | (sVar.h(basketItem) ? 4 : 2) | (sVar.h(basketManager) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.f(uVar) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(map) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(nVar) ? 131072 : 65536);
        if (sVar.R(i14 & 1, (74899 & i14) != 74898)) {
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (objM == fVar) {
                objM = i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            int quantity = (map == null || (num = (Integer) map.get(ItemId.m197boximpl(ItemId.m198constructorimpl(basketItem.getItemId())))) == null) ? basketItem.getQuantity() : num.intValue();
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new i1(1000L);
                sVar.k0(objM2);
            }
            i1 i1Var2 = (i1) objM2;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar.a0(1797569154);
                Long lValueOf = Long.valueOf(i1Var2.h());
                boolean zH = sVar.h(basketItem) | ((i14 & 458752) == 131072) | sVar.d(quantity);
                Object objM3 = sVar.M();
                if (zH || objM3 == fVar) {
                    b1Var = b1Var2;
                    i1Var = i1Var2;
                    int i15 = quantity;
                    j jVar = new j(b1Var, nVar, basketItem, i15, i1Var, (c) null);
                    i13 = i15;
                    sVar.k0(jVar);
                    objM3 = jVar;
                } else {
                    b1Var = b1Var2;
                    i1Var = i1Var2;
                    i13 = quantity;
                }
                i.h(lValueOf, (Function2) objM3, sVar);
                sVar.q(false);
            } else {
                b1Var = b1Var2;
                i1Var = i1Var2;
                i13 = quantity;
                sVar.a0(1797773847);
                sVar.q(false);
            }
            d3 d3Var = x1.f7416h;
            i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, e.e(-21276373, sVar, new d(i11, i13, basketManager, basketItem, nVar, b1Var, i1Var, uVar)), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(basketItem, basketManager, i11, uVar, map, nVar, i12);
        }
    }

    public static final void F(BasketItem basketItem, b1 b1Var, t tVar, m3.n nVar, int i11) {
        basketItem.getClass();
        b1Var.getClass();
        tVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(-588656521);
        int i12 = i11 | (sVar.h(basketItem) ? 4 : 2) | (sVar.f(tVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            t tVarA = b0.a(q.f5711a, t1.c.k(300, 0, w.f39594b, 2), 2);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(u0VarD, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-1662266395);
                sVar.q(false);
            } else {
                sVar.a0(-1662570381);
                Picture coverPicture = basketItem.getCoverPicture();
                o.c(coverPicture != null ? coverPicture.getCurrentUrl() : null, null, tVar, x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar, 0), null, null, l.f47166a, 0.0f, null, sVar, (i12 & 896) | 4144, 6, 31728);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(basketItem, b1Var, tVar, i11, 9);
        }
    }

    public static final void G(BasketItem basketItem, t tVar, m3.n nVar, int i11) {
        basketItem.getClass();
        tVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(-2125618784);
        int i12 = i11 | (sVar.h(basketItem) ? 4 : 2) | (sVar.f(tVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            y yVarA = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            g gVar = b5.i.f5843f;
            i.C(yVarA, gVar, sVar);
            g gVar2 = b5.i.f5842e;
            i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar3 = b5.i.f5844g;
            i.v(sVar, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            i.z(sVar, dVar2);
            g gVar4 = b5.i.f5841d;
            i.C(tVarC, gVar4, sVar);
            String itemName = basketItem.getItemName();
            m5.u0 u0Var = v.f28275o;
            long j9 = lv.s.C;
            r9.d(itemName, null, j9, 0L, null, 0L, null, new k(5), 0L, 2, false, 2, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 109562);
            float f11 = lv.t.f28249c;
            q qVar = q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            String itemSubtitle = basketItem.getItemSubtitle();
            m5.u0 u0Var2 = v.f28276p;
            long j11 = lv.s.D;
            r9.d(itemSubtitle, null, j11, 0L, null, 0L, null, new k(5), 0L, 2, false, 2, 0, null, u0Var2, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 109562);
            d2.c.f(m2.m(qVar, f11), sVar);
            w0 w0Var = new w0(iVar);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(w0Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(i2VarA, gVar, sVar);
            i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            i.C(tVarC2, gVar4, sVar);
            String strI = mv.d.i(basketItem.getItemValue(), 1);
            l0 l0Var = u0Var2.f29655a;
            r9.d(strI, null, j11, 0L, null, 0L, null, new k(5), 0L, 0, false, 0, 0, null, new m5.u0(0L, l0Var.f29576b, l0Var.f29577c, l0Var.f29580f, 0L, 0, 0, 0L, 16773081), sVar, MLKEMEngine.KyberPolyBytes, 0, 130042);
            d2.c.f(m2.m(qVar, lv.t.f28251e), sVar);
            r9.d(mv.d.i(basketItem.getSubtotalPrice(), 1), null, j9, 0L, null, 0L, null, new k(5), 0L, 0, false, 0, 0, null, v.f28277q, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rk.a0(basketItem, tVar, i11, 14);
        }
    }

    public static final void H(final BasketResponse basketResponse, final List list, n1 n1Var, final BasketManager basketManager, int i11, final u uVar, final z zVar, m3.n nVar, int i12) {
        int i13;
        final int i14;
        s sVar;
        b1 b1VarN;
        f fVar;
        final b1 b1Var;
        basketResponse.getClass();
        list.getClass();
        basketManager.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1908404496);
        if ((i12 & 6) == 0) {
            i13 = (sVar2.h(basketResponse) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar2.h(list) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar2.f(n1Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar2.h(basketManager) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 = i11;
            i13 |= sVar2.d(i14) ? 16384 : 8192;
        } else {
            i14 = i11;
        }
        if ((196608 & i12) == 0) {
            i13 |= (i12 & 262144) == 0 ? sVar2.f(uVar) : sVar2.h(uVar) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= (i12 & 2097152) == 0 ? sVar2.f(zVar) : sVar2.h(zVar) ? 1048576 : 524288;
        }
        int i15 = i13;
        boolean z11 = true;
        if (sVar2.R(i15 & 1, (i15 & 599187) != 599186)) {
            Object objM = sVar2.M();
            f fVar2 = m.f29332a;
            if (objM == fVar2) {
                objM = new i1(MessageLogView.NEW_MESSAGE_VIEW_DELAY);
                sVar2.k0(objM);
            }
            final i1 i1Var = (i1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar2) {
                objM2 = i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            c0 c0VarA = e0.a(0, 0, 0, 3, sVar2);
            a2 a2VarD = zVar.d();
            c cVar = null;
            if (a2VarD == null) {
                sVar2.a0(-795730815);
                sVar2.q(false);
                b1VarN = null;
            } else {
                sVar2.a0(-25668736);
                b1VarN = i.n(a2VarD, sVar2, 0);
                sVar2.q(false);
            }
            Map map = b1VarN != null ? (Map) b1VarN.getValue() : null;
            int i16 = i15 & 458752;
            boolean zH = ((i15 & 3670016) == 1048576 || ((i15 & 2097152) != 0 && sVar2.h(zVar))) | ((i15 & 57344) == 16384) | sVar2.h(list) | sVar2.h(basketManager) | (i16 == 131072 || ((i15 & 262144) != 0 && sVar2.h(uVar))) | sVar2.h(map) | sVar2.h(basketResponse);
            Object objM3 = sVar2.M();
            if (zH || objM3 == fVar2) {
                final Map map2 = map;
                fVar = fVar2;
                b1Var = b1Var2;
                Function1 function1 = new Function1() { // from class: vm.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        f2.l lVar = (f2.l) obj;
                        lVar.getClass();
                        final List list2 = list;
                        int size = list2.size();
                        f3 f3Var = new f3(list2, 5);
                        final BasketManager basketManager2 = basketManager;
                        final int i17 = i14;
                        final u uVar2 = uVar;
                        final z zVar2 = zVar;
                        final Map map3 = map2;
                        final BasketResponse basketResponse2 = basketResponse;
                        final b1 b1Var3 = b1Var;
                        final i1 i1Var2 = i1Var;
                        f2.l.s(lVar, size, f3Var, new u3.d(new i80.o() { // from class: vm.e
                            @Override // i80.o
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                z zVar3;
                                int iIntValue = ((Integer) obj3).intValue();
                                m3.n nVar2 = (m3.n) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((f2.d) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= ((s) nVar2).d(iIntValue) ? 32 : 16;
                                }
                                s sVar3 = (s) nVar2;
                                if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    List list3 = list2;
                                    um.d dVar = (um.d) list3.get(iIntValue);
                                    boolean z12 = dVar instanceof um.a;
                                    BasketManager basketManager3 = basketManager2;
                                    u uVar3 = uVar2;
                                    z zVar4 = zVar2;
                                    m3.f fVar3 = m3.m.f29332a;
                                    if (z12) {
                                        sVar3.a0(1900627349);
                                        Object obj6 = list3.get(iIntValue);
                                        obj6.getClass();
                                        BasketItem basketItem = ((um.a) obj6).f41387a;
                                        boolean zH2 = sVar3.h(basketManager3) | sVar3.h(zVar4);
                                        Object objM4 = sVar3.M();
                                        if (zH2 || objM4 == fVar3) {
                                            x xVar = new x(27, basketManager3, zVar4, b1Var3, i1Var2);
                                            zVar3 = zVar4;
                                            sVar3.k0(xVar);
                                            objM4 = xVar;
                                        } else {
                                            zVar3 = zVar4;
                                        }
                                        jf.e.c(basketItem, basketManager3, i17, uVar3, zVar3, map3, (i80.n) objM4, sVar3, 0);
                                        sVar3.q(false);
                                    } else {
                                        boolean z13 = dVar instanceof um.e;
                                        BasketResponse basketResponse3 = basketResponse2;
                                        if (z13) {
                                            sVar3.a0(1901528488);
                                            jb.u.b(basketResponse3, sVar3, 0);
                                            sVar3.q(false);
                                        } else if (dVar instanceof um.b) {
                                            sVar3.a0(1901659711);
                                            Object obj7 = list3.get(iIntValue);
                                            obj7.getClass();
                                            nx.d.j(((um.b) obj7).f41389a, basketManager3, uVar3, sVar3, 0);
                                            sVar3.q(false);
                                        } else if (dVar instanceof um.c) {
                                            sVar3.a0(1902030006);
                                            d2.c.f(m2.m(b4.q.f5711a, lv.t.f28253g), sVar3);
                                            wi.a.k(lv.s.G, 1, sVar3, 54, 0);
                                            Object obj8 = list3.get(iIntValue);
                                            obj8.getClass();
                                            GetRecommendedManufacturerItemsResponse getRecommendedManufacturerItemsResponse = ((um.c) obj8).f41391a;
                                            Object obj9 = list3.get(iIntValue);
                                            obj9.getClass();
                                            int i18 = ((um.c) obj9).f41392b;
                                            String strU = f0.U(sVar3, R.string.mnu_basket_screen_section_title_recommended);
                                            Object obj10 = list3.get(iIntValue);
                                            obj10.getClass();
                                            nx.d.h(getRecommendedManufacturerItemsResponse, i18, strU, null, uVar3, zVar4, sVar3, 0);
                                            sVar3.q(false);
                                        } else if (dVar instanceof um.f) {
                                            sVar3.a0(1902811640);
                                            boolean zH3 = sVar3.h(uVar3);
                                            Object objM5 = sVar3.M();
                                            if (zH3 || objM5 == fVar3) {
                                                objM5 = new f(uVar3, 0);
                                                sVar3.k0(objM5);
                                            }
                                            h0.j(basketResponse3, (Function0) objM5, sVar3, 0);
                                            sVar3.q(false);
                                        } else {
                                            sVar3.a0(1903002352);
                                            sVar3.q(false);
                                        }
                                    }
                                } else {
                                    sVar3.U();
                                }
                                return Unit.f26487a;
                            }
                        }, true, 2097736722), 4);
                        return Unit.f26487a;
                    }
                };
                sVar2.k0(function1);
                objM3 = function1;
            } else {
                fVar = fVar2;
                b1Var = b1Var2;
            }
            f fVar3 = fVar;
            ox.h.c(n1Var, c0VarA, null, null, null, null, false, null, (Function1) objM3, sVar2, (i15 >> 6) & 14, 508);
            sVar = sVar2;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-793035116);
                Long lValueOf = Long.valueOf(i1Var.h());
                boolean zH2 = sVar.h(basketManager);
                if (i16 != 131072 && ((i15 & 262144) == 0 || !sVar.h(uVar))) {
                    z11 = false;
                }
                boolean z12 = zH2 | z11;
                Object objM4 = sVar.M();
                if (z12 || objM4 == fVar3) {
                    tg.g gVar = new tg.g(basketManager, uVar, i1Var, cVar, 6);
                    sVar.k0(gVar);
                    objM4 = gVar;
                }
                i.h(lValueOf, (Function2) objM4, sVar);
                sVar.q(false);
            } else {
                sVar.a0(-792760270);
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d(basketResponse, list, n1Var, basketManager, i11, uVar, zVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void I(t tVar, CategoryCard categoryCard, m3.n nVar, int i11) {
        int i12;
        s sVar;
        g gVar;
        g gVar2;
        g gVar3;
        b5.d dVar;
        g gVar4;
        q qVar;
        h hVar;
        ?? r12;
        s sVar2;
        s sVar3 = (s) nVar;
        sVar3.c0(1741571885);
        int i13 = i11 | (sVar3.f(tVar) ? 4 : 2) | (sVar3.h(categoryCard) ? 32 : 16);
        if (sVar3.R(i13 & 1, (i13 & 19) != 18)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar3, 0);
            int iHashCode = Long.hashCode(sVar3.T);
            u3.i iVarL = sVar3.l();
            t tVarC = b4.a.c(tVar, sVar3);
            b5.j.R.getClass();
            h hVar2 = b5.i.f5839b;
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(hVar2);
            } else {
                sVar3.n0();
            }
            g gVar5 = b5.i.f5843f;
            i.C(i2VarA, gVar5, sVar3);
            g gVar6 = b5.i.f5842e;
            i.C(iVarL, gVar6, sVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar7 = b5.i.f5844g;
            i.v(sVar3, numValueOf, gVar7);
            b5.d dVar2 = b5.i.f5845h;
            i.z(sVar3, dVar2);
            g gVar8 = b5.i.f5841d;
            i.C(tVarC, gVar8, sVar3);
            Picture categoryImage = categoryCard.getCategoryImage();
            Unit unit = null;
            String currentUrl = categoryImage != null ? categoryImage.getCurrentUrl() : null;
            q qVar2 = q.f5711a;
            if (currentUrl == null) {
                sVar3.a0(-316774587);
                sVar3.q(false);
                gVar2 = gVar6;
                dVar = dVar2;
                gVar4 = gVar7;
                r12 = 0;
                hVar = hVar2;
                gVar = gVar5;
                gVar3 = gVar8;
                qVar = qVar2;
            } else {
                sVar3.a0(-316774586);
                float f11 = 34;
                gVar = gVar5;
                gVar2 = gVar6;
                gVar3 = gVar8;
                dVar = dVar2;
                gVar4 = gVar7;
                qVar = qVar2;
                hVar = hVar2;
                r12 = 0;
                o.c(currentUrl, null, m2.q(m2.e(qVar2, f11), f11), x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar3, 0), null, null, l.f47166a, 0.0f, new i4.o(lv.s.f28219c, 5), sVar3, 805310896, 390, 27120);
                sVar3.q(false);
                unit = Unit.f26487a;
            }
            if (unit == null) {
                sVar3.a0(-316281097);
                float f12 = 38;
                g3.i2.a(x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar3, r12), null, m2.q(m2.e(qVar, f12), f12), lv.s.f28217b, sVar3, 3512, 0);
                sVar3.q(r12);
            } else {
                sVar3.a0(-980050526);
                sVar3.q(r12);
            }
            d2.c.f(m2.q(qVar, lv.t.f28251e), sVar3);
            t tVarB = d2.c.B(qVar, 0.0f, lv.t.f28248b, 1);
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar3, r12);
            int iHashCode2 = Long.hashCode(sVar3.T);
            u3.i iVarL2 = sVar3.l();
            t tVarC2 = b4.a.c(tVarB, sVar3);
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(hVar);
            } else {
                sVar3.n0();
            }
            i.C(yVarA, gVar, sVar3);
            i.C(iVarL2, gVar2, sVar3);
            a0.y(iHashCode2, sVar3, gVar4, sVar3, dVar);
            i.C(tVarC2, gVar3, sVar3);
            i12 = 1;
            r9.d(String.valueOf(categoryCard.getTitle()), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28277q, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            s sVar4 = sVar3;
            d2.c.f(m2.e(qVar, (float) r12), sVar4);
            String body = categoryCard.getBody();
            if (body == null) {
                sVar4.a0(-586026599);
                sVar4.q(r12);
                sVar2 = sVar4;
            } else {
                sVar4.a0(-586026598);
                r9.d(body, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28276p, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                s sVar5 = sVar4;
                sVar5.q(r12);
                sVar2 = sVar5;
            }
            sVar2.q(true);
            sVar2.q(true);
            sVar = sVar2;
        } else {
            i12 = 1;
            sVar3.U();
            sVar = sVar3;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.s(tVar, categoryCard, i11, i12);
        }
    }

    public static final void J(String str, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1579096755);
        int i12 = i11 | (sVar.f(str) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            if (str == null) {
                sVar.a0(-94431446);
                sVar.q(false);
            } else {
                sVar.a0(-94431445);
                t tVarA = d2.c.A(q.f5711a, mVar.f44008d, mVar.f44016m);
                y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                t tVarC = b4.a.c(tVarA, sVar);
                b5.j.R.getClass();
                h hVar2 = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar2);
                } else {
                    sVar.n0();
                }
                i.C(yVarA, b5.i.f5843f, sVar);
                i.C(iVarL, b5.i.f5842e, sVar);
                i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                i.z(sVar, b5.i.f5845h);
                i.C(tVarC, b5.i.f5841d, sVar);
                r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 0, 0, 131066);
                sVar = sVar;
                sVar.q(true);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.h0(str, i11, 0);
        }
    }

    public static final void K(HighlightedItemMnuV2 highlightedItemMnuV2, String str, String str2, String str3, ym.y yVar, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1103319841);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(highlightedItemMnuV2) ? 4 : 2) | i11;
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
            i12 |= sVar.f(str3) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= (32768 & i11) == 0 ? sVar.f(yVar) : sVar.h(yVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            boolean z11 = highlightedItemMnuV2.getItem().getAvailableStock() > 0;
            float f11 = lv.t.f28253g;
            t tVarC = d2.c.C(q.f5711a, f11, lv.t.f28248b, f11, lv.t.f28250d);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(u0VarD, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC2, b5.i.f5841d, sVar);
            d3 d3Var = x1.f7416h;
            i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, e.e(-906687077, sVar, new cn.w(z11, yVar, highlightedItemMnuV2, str3, str2, str)), sVar, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(highlightedItemMnuV2, str, str2, str3, yVar, i11, 1);
        }
    }

    public static final void L(HighlightedItemMnuV2 highlightedItemMnuV2, String str, ym.y yVar, m3.n nVar, int i11) {
        HighlightedItemMnuV2 highlightedItemMnuV22;
        String str2;
        ym.y yVar2;
        s sVar = (s) nVar;
        sVar.c0(-794919039);
        int i12 = (sVar.h(highlightedItemMnuV2) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16) | (sVar.f(yVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Price itemPrice = highlightedItemMnuV2.getItem().getItemPrice();
            String strI = itemPrice != null ? mv.d.i(itemPrice, 1) : null;
            Price itemValue = highlightedItemMnuV2.getItem().getItemValue();
            str2 = str;
            yVar2 = yVar;
            String str3 = strI;
            highlightedItemMnuV22 = highlightedItemMnuV2;
            K(highlightedItemMnuV22, str2, str3, itemValue != null ? mv.d.i(itemValue, 1) : null, yVar2, sVar, (i12 & 126) | ((i12 << 6) & 57344));
        } else {
            highlightedItemMnuV22 = highlightedItemMnuV2;
            str2 = str;
            yVar2 = yVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.e(highlightedItemMnuV22, str2, yVar2, i11);
        }
    }

    public static final void M(u7 u7Var, m3.n nVar, int i11) {
        long j9;
        u7Var.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1133511862);
        int i12 = (sVar.h(u7Var) ? 4 : 2) | i11;
        int i13 = 20;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            int i14 = vm.i.$EnumSwitchMapping$1[u7Var.a().ordinal()];
            if (i14 == 1) {
                j9 = lv.s.X;
            } else if (i14 == 2) {
                j9 = lv.s.l;
            } else {
                if (i14 != 3) {
                    e40.a.f();
                    return;
                }
                j9 = lv.s.X;
            }
            t tVarA = d2.c.A(v1.n.j(m2.f13850c, j9, g0.f23254b), lv.t.f28252f, lv.t.f28251e);
            i2 i2VarA = h2.a(d2.i.f13807g, b4.d.f5693k, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(i2VarA, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar);
            q qVar = q.f5711a;
            d2.c.f(qVar, sVar);
            g3.i2.a(x0.z(R.drawable.ic_trash_can_regular_1, sVar, 0), "Archive", m2.m(qVar, 20), lv.s.J, sVar, 3512, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.m(u7Var, i11, i13);
        }
    }

    public static final void N(w6 w6Var, yk.h hVar, tg.i iVar, np.b bVar, Function0 function0, Function0 function02, String str, m3.n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        iVar.getClass();
        bVar.getClass();
        str.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1069998196);
        int i12 = (sVar2.f(str) ? 1048576 : 524288) | i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(hVar) ? 32 : 16) | (sVar2.h(iVar) ? 256 : 128) | (sVar2.h(bVar) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function0) ? 16384 : 8192) | (sVar2.h(function02) ? 131072 : 65536);
        if (sVar2.R(i12 & 1, (599187 & i12) != 599186)) {
            Unit unit = Unit.f26487a;
            boolean zH = sVar2.h(hVar);
            Object objM = sVar2.M();
            f fVar = m.f29332a;
            if (zH || objM == fVar) {
                objM = new yk.b(hVar, null, 1);
                sVar2.k0(objM);
            }
            i.h(unit, (Function2) objM, sVar2);
            t tVarR = d2.c.r(q.f5711a);
            long j9 = lv.s.J;
            boolean z11 = (57344 & i12) == 16384;
            Object objM2 = sVar2.M();
            if (z11 || objM2 == fVar) {
                objM2 = new yk.d(0, function0);
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            v3.a((Function0) objM2, tVarR, w6Var, 0.0f, false, null, j9, 0L, 0.0f, 0L, null, null, null, e.e(-1218388782, sVar2, new co.e(hVar, iVar, bVar, function0, function02, str)), sVar, ((i12 << 6) & 896) | 1572864, 3078, 7096);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new jh.a(w6Var, hVar, iVar, bVar, function0, function02, str, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v47, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v55 */
    public static final void O(um.t tVar, u uVar, z zVar, m3.n nVar, int i11) {
        um.t tVar2;
        int i12;
        um.t tVar3;
        BasketManager basketManager;
        int i13;
        ?? r22;
        Unit unit;
        List<BasketItem> basketItems;
        s sVar = (s) nVar;
        sVar.c0(911576519);
        int i14 = i11 | 2 | (sVar.f(uVar) ? 32 : 16) | (sVar.f(zVar) ? 256 : 128);
        if (sVar.R(i14 & 1, (i14 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                s1 s1VarA = z8.a.a(sVar);
                if (s1VarA == null) {
                    com.braze.h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i12 = i14 & (-15);
                    tVar3 = (um.t) t1.K(Reflection.getOrCreateKotlinClass(um.t.class), s1VarA, o30.e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
                }
            } else {
                sVar.U();
                i12 = i14 & (-15);
                tVar3 = tVar;
            }
            sVar.r();
            BasketResponse basketResponse = (BasketResponse) i.n(tVar3.f41440q, sVar, 0).getValue();
            BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) i.n(tVar3.f41442s, sVar, 0).getValue();
            GetRecommendedManufacturerItemsResponse getRecommendedManufacturerItemsResponse = (GetRecommendedManufacturerItemsResponse) i.n(tVar3.f41444u, sVar, 0).getValue();
            boolean zBooleanValue = ((Boolean) i.n(tVar3.f41436m, sVar, 0).getValue()).booleanValue();
            GenericErrors genericErrors = (GenericErrors) i.n(tVar3.f41438o, sVar, 0).getValue();
            BasketManager basketManager2 = tVar3.f41434j;
            int manufacturerBasketItemsLimit = tVar3.f41428d.n().getManufacturerBasketItemsLimit();
            boolean zBooleanValue2 = ((Boolean) i.n(tVar3.f41448y, sVar, 0).getValue()).booleanValue();
            um.g gVar = (um.g) i.n(tVar3.A, sVar, 0).getValue();
            d2.g0 g0Var = m2.f13850c;
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(g0Var, sVar);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(u0VarD, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar);
            if (genericErrors == null) {
                sVar.a0(-2137323377);
                sVar.q(false);
                basketManager = basketManager2;
                unit = null;
                i13 = manufacturerBasketItemsLimit;
                r22 = 0;
            } else {
                sVar.a0(-2137323376);
                int i15 = i12 & 112;
                boolean z11 = i15 == 32;
                Object objM = sVar.M();
                Object obj = m.f29332a;
                if (z11 || objM == obj) {
                    objM = new vm.f(uVar, 1);
                    sVar.k0(objM);
                }
                Function0 function0 = (Function0) objM;
                boolean z12 = i15 == 32;
                Object objM2 = sVar.M();
                if (z12 || objM2 == obj) {
                    objM2 = new vm.f(uVar, 2);
                    sVar.k0(objM2);
                }
                basketManager = basketManager2;
                i13 = manufacturerBasketItemsLimit;
                cg.o.a(genericErrors, function0, (Function0) objM2, sVar, 0, 0);
                r22 = 0;
                sVar.q(false);
                unit = Unit.f26487a;
            }
            if (unit == null) {
                sVar.a0(-2137078135);
                if (zBooleanValue) {
                    j4.s.y(-901121624, r22, sVar, sVar, r22);
                } else {
                    sVar.a0(-901079340);
                    sVar.q(r22);
                }
                ArrayList arrayList = new ArrayList();
                if (basketResponse != null && (basketItems = basketResponse.getBasketItems()) != null) {
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(basketItems, 10));
                    for (BasketItem basketItem : basketItems) {
                        arrayList2.add(new um.a(basketItem, basketItem.getItemId()));
                    }
                    arrayList.addAll(arrayList2);
                    arrayList.add(new um.e());
                }
                if (baseItemMnuV2 != null) {
                    if (arrayList.isEmpty()) {
                        arrayList.add(new um.b(baseItemMnuV2, baseItemMnuV2.m393getItemIdFvU5WIY()));
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((um.d) it.next()).a(), baseItemMnuV2.m393getItemIdFvU5WIY())) {
                                break;
                            }
                        }
                        arrayList.add(new um.b(baseItemMnuV2, baseItemMnuV2.m393getItemIdFvU5WIY()));
                    }
                }
                if (getRecommendedManufacturerItemsResponse != null) {
                    arrayList.add(new um.c(getRecommendedManufacturerItemsResponse, i13));
                }
                if (basketResponse != null) {
                    arrayList.add(new um.f());
                }
                P(new vm.b(basketResponse, CollectionsKt.r0(arrayList), basketManager, i13), uVar, zVar, zBooleanValue2, gVar, sVar, i12 & 1008);
                sVar.q(false);
            } else {
                sVar.a0(1455076139);
                sVar.q(r22);
            }
            sVar.q(true);
            tVar2 = tVar3;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(tVar2, uVar, zVar, i11, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r14v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r6v10, types: [m3.n] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r9v9, types: [m3.n, m3.s] */
    public static final void P(vm.b bVar, u uVar, z zVar, boolean z11, um.g gVar, m3.n nVar, int i11) {
        int i12;
        ?? r92;
        int i13;
        f fVar;
        boolean z12;
        int i14;
        boolean z13;
        BasketResponse basketResponse;
        u uVar2;
        s sVar;
        boolean z14;
        s sVar2;
        ?? r14;
        ?? r93;
        ?? r94;
        s sVar3 = (s) nVar;
        sVar3.c0(-2138966995);
        if ((i11 & 6) == 0) {
            i12 = (sVar3.h(bVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar3.f(uVar) : sVar3.h(uVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar3.f(zVar) : sVar3.h(zVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar3.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar3.d(gVar == null ? -1 : gVar.ordinal()) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar3.R(i12 & 1, (i12 & 9363) != 9362)) {
            Object objM = sVar3.M();
            f fVar2 = m.f29332a;
            if (objM == fVar2) {
                objM = new t1.w1(23);
                sVar3.k0(objM);
            }
            w6 w6VarF = v3.f(54, 0, (Function1) objM, sVar3);
            long j9 = lv.s.J;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarT = d2.c.t(v1.n.j(qVar, j9, r0Var).then(m2.f13850c));
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar3, 48);
            int iHashCode = Long.hashCode(sVar3.T);
            u3.i iVarL = sVar3.l();
            t tVarC = b4.a.c(tVarT, sVar3);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(hVar);
            } else {
                sVar3.n0();
            }
            i.C(yVarA, b5.i.f5843f, sVar3);
            i.C(iVarL, b5.i.f5842e, sVar3);
            i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar3, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar3);
            String strU = f0.U(sVar3, R.string.mnu_basket_screen_title);
            int i15 = i12 & 112;
            boolean z15 = i15 == 32 || ((i12 & 64) != 0 && sVar3.h(uVar));
            Object objM2 = sVar3.M();
            int i16 = 3;
            if (z15 || objM2 == fVar2) {
                objM2 = new vm.f(uVar, i16);
                sVar3.k0(objM2);
            }
            cg.j.s(strU, null, 0L, 0L, (Function0) objM2, null, null, null, sVar3, 0, 238);
            BasketResponse basketResponse2 = bVar.f42422a;
            if (basketResponse2 == null) {
                sVar3.a0(826113310);
                sVar3.q(false);
                r94 = sVar3;
                z13 = true;
            } else {
                sVar3.a0(826113311);
                if (basketResponse2.getBasketItems().isEmpty()) {
                    sVar3.a0(-86138269);
                    sVar3.q(false);
                    uVar.p();
                    basketResponse = basketResponse2;
                    i13 = i15;
                    r14 = 0;
                    fVar = fVar2;
                    r93 = sVar3;
                    z13 = true;
                    uVar2 = uVar;
                    i14 = i12;
                } else {
                    sVar3.a0(-85999513);
                    BasketManager basketManager = bVar.f42424c;
                    if (basketManager == null) {
                        sVar3.a0(-85999514);
                        sVar3.q(false);
                        basketResponse = basketResponse2;
                        i13 = i15;
                        z14 = false;
                        fVar = fVar2;
                        sVar2 = sVar3;
                        z13 = true;
                        uVar2 = uVar;
                        i14 = i12;
                    } else {
                        sVar3.a0(-85999513);
                        List list = bVar.f42423b;
                        if (list == null) {
                            sVar3.a0(-2037400747);
                            sVar3.q(false);
                            basketResponse = basketResponse2;
                            i13 = i15;
                            z12 = false;
                            fVar = fVar2;
                            sVar = sVar3;
                            z13 = true;
                            uVar2 = uVar;
                            i14 = i12;
                        } else {
                            sVar3.a0(-2037400746);
                            d2.c.f(m2.m(qVar, lv.t.f28251e), sVar3);
                            if (!(((double) 1.0f) > 0.0d)) {
                                e2.a.a("invalid weight; must be greater than zero");
                            }
                            int i17 = i12;
                            i13 = i15;
                            fVar = fVar2;
                            s sVar4 = sVar3;
                            z12 = false;
                            i14 = i17;
                            z13 = true;
                            H(basketResponse2, list, new n1(1.0f, true), basketManager, bVar.f42425d, uVar, zVar, sVar4, (i17 << 12) & 4128768);
                            basketResponse = basketResponse2;
                            uVar2 = uVar;
                            sVar4.q(false);
                            sVar = sVar4;
                        }
                        h0.a(uVar2, basketResponse, z11, sVar, (i14 >> 3) & 910);
                        sVar.q(z12);
                        sVar2 = sVar;
                        z14 = z12;
                    }
                    sVar2.q(z14);
                    r93 = sVar2;
                    r14 = z14;
                }
                if (gVar == null) {
                    r93.a0(-85203217);
                    r93.q(r14);
                } else {
                    r93.a0(-85203216);
                    int i18 = vm.i.$EnumSwitchMapping$0[gVar.ordinal()];
                    if (i18 == z13) {
                        r93.a0(-1800142909);
                        m0.c.M(basketResponse, w6VarF, bVar.f42424c, uVar2, r93, (i14 << 6) & 7168);
                        r93.q(r14);
                    } else if (i18 == 2) {
                        f fVar3 = fVar;
                        r93.a0(-1799950740);
                        ?? r12 = (i13 == 32 || ((i14 & 64) != 0 && r93.h(uVar2))) ? z13 : r14;
                        Object objM3 = r93.M();
                        if (r12 != 0 || objM3 == fVar3) {
                            objM3 = new vm.f(uVar2, 4);
                            r93.k0(objM3);
                        }
                        h0.d((Function0) objM3, r93, r14);
                        r93.q(r14);
                    } else {
                        if (i18 != 3) {
                            throw e0.f.v(r93, 1188855330, r14);
                        }
                        r93.a0(-1799768150);
                        ?? r122 = (i13 == 32 || ((i14 & 64) != 0 && r93.h(uVar2))) ? z13 : r14;
                        Object objM4 = r93.M();
                        if (r122 != 0 || objM4 == fVar) {
                            objM4 = new vm.f(uVar2, 5);
                            r93.k0(objM4);
                        }
                        h0.b((Function0) objM4, r93, r14);
                        r93.q(r14);
                    }
                    r93.q(r14);
                }
                r93.q(r14);
                r94 = r93;
            }
            r94.q(z13);
            r92 = r94;
        } else {
            sVar3.U();
            r92 = sVar3;
        }
        w1 w1VarS = r92.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new eg.b(bVar, uVar, zVar, z11, gVar, i11);
        }
    }

    public static final void Q(CategoryCard categoryCard, ym.y yVar, m3.n nVar, int i11) {
        categoryCard.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1929479444);
        int i12 = (sVar.h(categoryCard) ? 4 : 2) | i11 | (sVar.f(yVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m.f29332a) {
                objM = a0.g(sVar);
            }
            b2.l lVar = (b2.l) objM;
            t tVarD = d2.c.D(q.f5711a, lv.t.f28251e, 0.0f, 0.0f, 0.0f, 14);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(u0VarD, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar);
            d3 d3Var = x1.f7416h;
            i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, e.e(-1010321562, sVar, new an.d(lVar, yVar, categoryCard)), sVar, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.q(categoryCard, yVar, i11, 1);
        }
    }

    public static final h4.c R(long j9, long j11) {
        return new h4.c(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public static final h4.c S(long j9, long j11) {
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        return new h4.c(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i12));
    }

    public static final void T(m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-2050902360);
        if (sVar.R(i11 & 1, i11 != 0)) {
            float f11 = 8;
            s0.o(null, f11, lv.s.K, sVar, 432, 1);
            b4.j jVar = b4.d.f5693k;
            long j9 = lv.s.f28220c0;
            l2.f fVar = l2.g.f26790a;
            q qVar = q.f5711a;
            t tVarJ = v1.n.j(qVar, j9, fVar);
            i2 i2VarA = h2.a(d2.i.f13801a, jVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(i2VarA, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar);
            p.a(v1.n.j(m2.m(d2.c.z(qVar, 6), f11), lv.s.f28218b0, fVar), sVar, 0);
            r9.d(f0.U(sVar, R.string.charity_order_updated_clue), d2.c.D(qVar, 0.0f, 0.0f, f11, 0.0f, 11), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28276p, sVar, 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g60.a(i11, 18);
        }
    }

    public static final Exception U(o7.a aVar, String str, Exception exc) {
        if (exc instanceof CreatePublicKeyCredentialDomException) {
            return new CreatePublicKeyCredentialDomException(aVar, str);
        }
        if (exc instanceof GetPublicKeyCredentialDomException) {
            return new GetPublicKeyCredentialDomException(aVar, str);
        }
        throw new FrameworkClassParsingException();
    }

    public static String V(int i11, int i12, String str) {
        if (i11 < 0) {
            return nx.d.A("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return nx.d.A("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        i4.a.f(j4.s.f(i12, "negative size: "));
        return null;
    }

    public static Object W(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void X(String str, Object obj, boolean z11) {
        if (z11) {
            return;
        }
        i4.a.f(nx.d.A(str, obj));
    }

    public static void Y(boolean z11) {
        if (z11) {
            return;
        }
        i4.a.h();
    }

    public static void Z(int i11, int i12) {
        String strA;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                strA = nx.d.A("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else {
                if (i12 < 0) {
                    i4.a.f(j4.s.f(i12, "negative size: "));
                    return;
                }
                strA = nx.d.A("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void a0(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture != null) {
            return;
        }
        c50.w.l(nx.d.A(str, obj));
    }

    public static void b0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        c50.w.l(str);
    }

    public static void c0(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            org.bouncycastle.jce.provider.a.v(V(i11, i12, "index"));
        }
    }

    public static void d0(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? V(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? V(i12, i13, "end index") : nx.d.A("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    public static void e0(String str, boolean z11) {
        if (z11) {
            return;
        }
        com.braze.h2.b(str);
    }

    public static s0.p f0(s0.p... pVarArr) {
        List listAsList = Arrays.asList(pVarArr);
        return listAsList.isEmpty() ? new s0.q() : listAsList.size() == 1 ? (s0.p) listAsList.get(0) : new g1.g(listAsList);
    }

    public static final q5.j g0(Context context) {
        return new q5.j(new ky.b(context, 3), new q5.a(Build.VERSION.SDK_INT >= 31 ? q5.s.f36050a.a(context) : 0));
    }

    public static final void l0(PopupWindow popupWindow) {
        View rootView = popupWindow.getContentView().getRootView();
        Object systemService = popupWindow.getContentView().getContext().getSystemService("window");
        systemService.getClass();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        layoutParams.getClass();
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        layoutParams2.flags |= 2;
        layoutParams2.dimAmount = 0.5f;
        ((WindowManager) systemService).updateViewLayout(rootView, layoutParams2);
    }

    public static final boolean o0(String str, Map map, boolean z11) {
        Object obj = map.get(str);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return bool != null ? bool.booleanValue() : z11;
    }

    public static final long p0(q0 q0Var, int i11, boolean z11, boolean z12) {
        r rVar = q0Var.f29618b;
        long j9 = q0Var.f29619c;
        int iD = rVar.d(i11);
        if (iD >= rVar.f29628f) {
            return 9205357640488583168L;
        }
        return (((long) Float.floatToRawIntBits(n80.p.b(q0Var.e(i11, q0Var.a(((!z11 || z12) && (z11 || !z12)) ? Math.max(i11 + (-1), 0) : i11) == q0Var.j(i11)), 0.0f, (int) (j9 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(n80.p.b(rVar.b(iD), 0.0f, (int) (j9 & 4294967295L)))) & 4294967295L);
    }

    public static int q0(Set set) {
        Iterator it = set.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i11 = ~(~(i11 + (next != null ? next.hashCode() : 0)));
        }
        return i11;
    }

    public static boolean r0(byte b8) {
        return b8 > -65;
    }

    public static HashSet s0(int i11) {
        int iCeil;
        if (i11 < 3) {
            ex.i.m(i11, "expectedSize");
            iCeil = i11 + 1;
        } else {
            iCeil = i11 < 1073741824 ? (int) Math.ceil(((double) i11) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    public static final void t0(m0 m0Var, int i11, Object obj) {
        m0Var.l[(m0Var.f30477m - m0Var.f30473h[m0Var.f30474i - 1].f30470b) + i11] = obj;
    }

    public static final void u0(m0 m0Var, int i11, Object obj, int i12, Object obj2) {
        int i13 = m0Var.f30477m - m0Var.f30473h[m0Var.f30474i - 1].f30470b;
        Object[] objArr = m0Var.l;
        objArr[i11 + i13] = obj;
        objArr[i13 + i12] = obj2;
    }

    public static final void v0(m0 m0Var, Object obj, Object obj2, Object obj3) {
        int i11 = m0Var.f30477m - m0Var.f30473h[m0Var.f30474i - 1].f30470b;
        Object[] objArr = m0Var.l;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        objArr[i11 + 2] = obj3;
    }

    public static void w0(Status status, Object obj, d10.g gVar) {
        if (status.d()) {
            gVar.b(obj);
        } else {
            gVar.a(i0.l(status));
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void A(long j9) {
        n0(Long.valueOf(j9));
    }

    @Override // l90.b
    public void B(SerialDescriptor serialDescriptor, int i11, long j9) {
        serialDescriptor.getClass();
        m0(serialDescriptor, i11);
        A(j9);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void D(String str) {
        str.getClass();
        n0(str);
    }

    @Override // l90.b
    public void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public b c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // l90.b
    public void d(g1 g1Var, int i11, byte b8) {
        g1Var.getClass();
        m0(g1Var, i11);
        j(b8);
    }

    @Override // l90.b
    public void e(g1 g1Var, int i11, char c3) {
        g1Var.getClass();
        m0(g1Var, i11);
        o(c3);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void f() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void g(double d3) {
        n0(Double.valueOf(d3));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void h(short s7) {
        n0(Short.valueOf(s7));
    }

    public abstract Typeface h0(Context context, w6.d dVar, Resources resources, int i11);

    @Override // l90.b
    public void i(SerialDescriptor serialDescriptor, int i11, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        m0(serialDescriptor, i11);
        w(kSerializer, obj);
    }

    public abstract Typeface i0(Context context, e7.i[] iVarArr, int i11);

    @Override // kotlinx.serialization.encoding.Encoder
    public void j(byte b8) {
        n0(Byte.valueOf(b8));
    }

    public Typeface j0(Context context, List list, int i11) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void k(boolean z11) {
        n0(Boolean.valueOf(z11));
    }

    public abstract Typeface k0(Context context, Resources resources, int i11, String str);

    @Override // l90.b
    public void l(g1 g1Var, int i11, short s7) {
        g1Var.getClass();
        m0(g1Var, i11);
        h(s7);
    }

    @Override // l90.b
    public void m(int i11, int i12, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        m0(serialDescriptor, i11);
        u(i12);
    }

    public void m0(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void n(float f11) {
        n0(Float.valueOf(f11));
    }

    public void n0(Object obj) {
        obj.getClass();
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(obj.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void o(char c3) {
        n0(Character.valueOf(c3));
    }

    @Override // l90.b
    public void p(SerialDescriptor serialDescriptor, int i11, boolean z11) {
        serialDescriptor.getClass();
        m0(serialDescriptor, i11);
        k(z11);
    }

    @Override // l90.b
    public void q(SerialDescriptor serialDescriptor, int i11, String str) {
        serialDescriptor.getClass();
        str.getClass();
        m0(serialDescriptor, i11);
        D(str);
    }

    @Override // l90.b
    public void r(SerialDescriptor serialDescriptor, int i11, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        m0(serialDescriptor, i11);
        if (kSerializer.getDescriptor().c()) {
            w(kSerializer, obj);
        } else if (obj == null) {
            f();
        } else {
            w(kSerializer, obj);
        }
    }

    @Override // l90.b
    public Encoder s(g1 g1Var, int i11) {
        g1Var.getClass();
        m0(g1Var, i11);
        return v(g1Var.h(i11));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void t(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        n0(Integer.valueOf(i11));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void u(int i11) {
        n0(Integer.valueOf(i11));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder v(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // l90.b
    public void y(g1 g1Var, int i11, float f11) {
        g1Var.getClass();
        m0(g1Var, i11);
        n(f11);
    }

    @Override // l90.b
    public void z(SerialDescriptor serialDescriptor, int i11, double d3) {
        serialDescriptor.getClass();
        m0(serialDescriptor, i11);
        g(d3);
    }
}
