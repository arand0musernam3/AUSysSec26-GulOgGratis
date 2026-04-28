package y9;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.view.View;
import b4.t;
import bg.y0;
import c5.d2;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.ItemCardType;
import com.app.tgtg.model.remote.item.ItemCardTypeEnum;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.response.FilterDiet;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.user.response.charity.CharityDaySchedule;
import com.app.tgtg.model.remote.user.response.charity.CharityDayScheduleStore;
import com.app.tgtg.model.remote.user.response.charity.CharityPlanCollectorType;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.PantrySelectionChipKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.x;
import d2.z1;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import i2.w;
import i4.r0;
import java.io.File;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import m0.i1;
import m3.b1;
import m3.h1;
import m3.s;
import m3.w1;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s0.u0;
import v80.b0;
import y80.a2;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w implements o5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f45767a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f45768b = 0;

    public static String A(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            i4.a.f("Invalid input received");
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            sb2.append(str.charAt(i11));
            if (str2.length() > i11) {
                sb2.append(str2.charAt(i11));
            }
        }
        return sb2.toString();
    }

    public static final g9.i0 B(Function1 function1) {
        g9.j0 j0Var = new g9.j0();
        function1.invoke(j0Var);
        boolean z11 = j0Var.f20155b;
        g9.h0 h0Var = j0Var.f20154a;
        h0Var.f20124a = z11;
        h0Var.f20125b = j0Var.f20156c;
        KClass kClass = j0Var.f20160g;
        if (kClass != null) {
            boolean z12 = j0Var.f20158e;
            boolean z13 = j0Var.f20159f;
            h0Var.f20127d = kClass;
            h0Var.f20126c = -1;
            h0Var.f20129f = z12;
            h0Var.f20130g = z13;
        } else {
            Object obj = j0Var.f20161h;
            if (obj != null) {
                boolean z14 = j0Var.f20158e;
                boolean z15 = j0Var.f20159f;
                h0Var.f20128e = obj;
                h0Var.f20126c = m9.d.b(ba0.g.I(Reflection.getOrCreateKotlinClass(obj.getClass())));
                h0Var.f20129f = z14;
                h0Var.f20130g = z15;
            } else {
                int i11 = j0Var.f20157d;
                boolean z16 = j0Var.f20158e;
                boolean z17 = j0Var.f20159f;
                h0Var.f20126c = i11;
                h0Var.f20129f = z16;
                h0Var.f20130g = z17;
            }
        }
        KClass kClass2 = h0Var.f20127d;
        if (kClass2 != null) {
            g9.i0 i0Var = new g9.i0(h0Var.f20124a, h0Var.f20125b, m9.d.b(ba0.g.I(kClass2)), h0Var.f20129f, h0Var.f20130g, h0Var.f20131h, h0Var.f20132i, -1, -1);
            i0Var.f20147j = kClass2;
            return i0Var;
        }
        Object obj2 = h0Var.f20128e;
        boolean z18 = h0Var.f20124a;
        boolean z19 = h0Var.f20125b;
        if (obj2 == null) {
            return new g9.i0(z18, z19, h0Var.f20126c, h0Var.f20129f, h0Var.f20130g, h0Var.f20131h, h0Var.f20132i, -1, -1);
        }
        g9.i0 i0Var2 = new g9.i0(z18, z19, m9.d.b(ba0.g.I(Reflection.getOrCreateKotlinClass(obj2.getClass()))), h0Var.f20129f, h0Var.f20130g, h0Var.f20131h, h0Var.f20132i, -1, -1);
        i0Var2.f20148k = obj2;
        return i0Var2;
    }

    public static ab.l D(String str) {
        String strGroup;
        if (str == null || StringsKt.H(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i11 = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i12 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i13 = Integer.parseInt(strGroup3);
        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
        strGroup4.getClass();
        return new ab.l(i11, i12, i13, strGroup4);
    }

    public static final String G(ArrayList arrayList) {
        return CollectionsKt.U(arrayList, null, null, null, wb.b.f43382a, 31);
    }

    public static final LinkedHashMap H(u0 u0Var) {
        Object objD;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (s0.g gVar : u0Var.c()) {
            Object obj = gVar.f38331c;
            CaptureRequest.Key key = obj instanceof CaptureRequest.Key ? (CaptureRequest.Key) obj : null;
            if (key != null && (objD = u0Var.d(gVar)) != null) {
                linkedHashMap.put(key, objD);
            }
        }
        return linkedHashMap;
    }

    public static String I(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            length = objArr.length;
            if (i12 >= length) {
                break;
            }
            Object obj = objArr[i12];
            if (obj == null) {
                string = Address.ADDRESS_NULL_PLACEHOLDER;
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e5) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strN = e0.f.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strN), (Throwable) e5);
                    String name2 = e5.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + strN.length() + 8 + 1);
                    sb2.append("<");
                    sb2.append(strN);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i12] = string;
            i12++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i13 = 0;
        while (true) {
            length2 = objArr.length;
            if (i11 >= length2 || (iIndexOf = str.indexOf("%s", i13)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i13, iIndexOf);
            sb3.append(objArr[i11]);
            i11++;
            i13 = iIndexOf + 2;
        }
        sb3.append((CharSequence) str, i13, str.length());
        if (i11 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i11]);
            for (int i14 = i11 + 1; i14 < objArr.length; i14++) {
                sb3.append(", ");
                sb3.append(objArr[i14]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static final void a(b4.t tVar, BasicItem basicItem, boolean z11, boolean z12, m3.n nVar, int i11) {
        int i12;
        b4.t tVar2;
        String itemCardText;
        basicItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1247516514);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(basicItem) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(z12) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            ItemCardType itemCardType = basicItem.getItemCardType();
            ItemCardTypeEnum itemCardType2 = itemCardType != null ? itemCardType.getItemCardType() : null;
            int i13 = itemCardType2 == null ? -1 : fg.b.$EnumSwitchMapping$0[itemCardType2.ordinal()];
            if (i13 == 1) {
                tVar2 = tVar;
                sVar.a0(-412204006);
                if (z11) {
                    sVar.a0(-412162032);
                    ItemCardType itemCardType3 = basicItem.getItemCardType();
                    itemCardText = itemCardType3 != null ? itemCardType3.getItemCardText() : null;
                    b(R.drawable.featured_seasonal_and_gifts, (i12 & 14) | MLKEMEngine.KyberPolyBytes, tVar2, "Special Reward Icon", itemCardText == null ? "" : itemCardText, sVar);
                    sVar.q(false);
                } else {
                    sVar.a0(-411866044);
                    sVar.q(false);
                }
                sVar.q(false);
            } else if (i13 == 2) {
                tVar2 = tVar;
                sVar.a0(-411804912);
                ItemCardType itemCardType4 = basicItem.getItemCardType();
                itemCardText = itemCardType4 != null ? itemCardType4.getItemCardText() : null;
                b(R.drawable.dynamic_pricing_outlined, (i12 & 14) | MLKEMEngine.KyberPolyBytes, tVar2, "Dynamic Price Icon", itemCardText == null ? "" : itemCardText, sVar);
                sVar.q(false);
            } else if (i13 == 3) {
                tVar2 = tVar;
                sVar.a0(-411481179);
                int i14 = z12 ? R.drawable.ic_flash : R.drawable.ic_flash_yellow;
                ItemCardType itemCardType5 = basicItem.getItemCardType();
                itemCardText = itemCardType5 != null ? itemCardType5.getItemCardText() : null;
                b(i14, (i12 & 14) | MLKEMEngine.KyberPolyBytes, tVar2, "Flash Sales Icon", itemCardText == null ? "" : itemCardText, sVar);
                sVar.q(false);
            } else if (i13 != 4) {
                sVar.a0(-410784702);
                sVar.q(false);
                tVar2 = tVar;
            } else {
                sVar.a0(-411059207);
                ItemCardType itemCardType6 = basicItem.getItemCardType();
                itemCardText = itemCardType6 != null ? itemCardType6.getItemCardText() : null;
                tVar2 = tVar;
                b(R.drawable.itemcard_icon_edenred, (i12 & 14) | MLKEMEngine.KyberPolyBytes, tVar2, "Edenred Icon", itemCardText == null ? "" : itemCardText, sVar);
                sVar.q(false);
            }
        } else {
            tVar2 = tVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.a(tVar2, basicItem, z11, z12, i11);
        }
    }

    public static final void b(int i11, int i12, b4.t tVar, String str, String str2, m3.n nVar) {
        int i13;
        String str3;
        String str4;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(441754154);
        if ((i12 & 6) == 0) {
            i13 = (sVar.f(tVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            str3 = str;
            i13 |= sVar.f(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i12 & 3072) == 0) {
            str4 = str2;
            i13 |= sVar.f(str4) ? NewHope.SENDB_BYTES : 1024;
        } else {
            str4 = str2;
        }
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVar, sVar);
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
            int i14 = i13 >> 3;
            v1.n.d(x0.z(i11, sVar, i14 & 14), str3, d2.c.D(b4.q.f5711a, 0.0f, 0.0f, lv.t.f28249c, 0.0f, 11), null, null, 0.0f, null, sVar, 392 | (i14 & 112), 120);
            r9.d(str4, null, lv.s.D, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar, ((i13 >> 9) & 14) | MLKEMEngine.KyberPolyBytes, 12607872, 110586);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(tVar, i11, str, str2, i12, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v23, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r11v33, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r11v35, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r11v36, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r30v0, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    public static final void c(b4.t tVar, final pi.m mVar, final Function0 function0, z1 z1Var, Function0 function02, m3.n nVar, int i11) {
        int i12;
        ?? r11;
        List list;
        Object obj;
        ?? r82;
        v80.b0 b0Var;
        ?? r112;
        int i13;
        ?? r113;
        ?? r83;
        mVar.getClass();
        function0.getClass();
        z1Var.getClass();
        function02.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(972274404);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(mVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(z1Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateKtxConstants.DAY_MONTH_PATTERN, Locale.getDefault());
            a2 a2Var = mVar.f35406i;
            a2 a2Var2 = mVar.f35408k;
            final int iIntValue = ((Number) m3.i.n(a2Var, sVar, 0).getValue()).intValue();
            Date date = (Date) CollectionsKt.O((List) m3.i.n(a2Var2, sVar, 0).getValue());
            Date date2 = (Date) CollectionsKt.W((List) m3.i.n(a2Var2, sVar, 0).getValue());
            List list2 = (List) m3.i.n(a2Var2, sVar, 0).getValue();
            int iIntValue2 = ((Number) m3.i.n(mVar.f35409m, sVar, 0).getValue()).intValue();
            final pi.q qVar = (pi.q) m3.i.n(mVar.f35411o, sVar, 0).getValue();
            Object objM = sVar.M();
            Object obj2 = m3.m.f29332a;
            if (objM == obj2) {
                objM = m3.i.w(null);
                sVar.k0(objM);
            }
            final b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == obj2) {
                objM2 = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM2);
            }
            v80.b0 b0Var2 = (v80.b0) objM2;
            Iterator it = list2.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                } else if (mv.p0.z((Date) it.next(), mVar.f35403f)) {
                    break;
                } else {
                    i14++;
                }
            }
            int i15 = i14;
            boolean zH = sVar.h(list2);
            Object objM3 = sVar.M();
            int i16 = 5;
            if (zH || objM3 == obj2) {
                objM3 = new cw.a(list2, i16);
                sVar.k0(objM3);
            }
            i2.b bVarB = i2.g0.b(i15, (Function0) objM3, sVar, 0);
            Object objM4 = sVar.M();
            if (objM4 == obj2) {
                objM4 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM4);
            }
            final b1 b1Var2 = (b1) objM4;
            boolean zF = sVar.f(bVarB) | sVar.h(mVar);
            Object objM5 = sVar.M();
            if (zF || objM5 == obj2) {
                objM5 = new mn.g(bVarB, mVar, null, 15);
                sVar.k0(objM5);
            }
            m3.i.h(bVarB, (Function2) objM5, sVar);
            boolean zH2 = sVar.h(mVar);
            Object objM6 = sVar.M();
            if (zH2 || objM6 == obj2) {
                objM6 = new lk.a(mVar, 29);
                sVar.k0(objM6);
            }
            ii.l.f(null, (Function2) objM6, sVar, 0);
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar.a0(-1947120515);
                CharityDayScheduleStore charityDayScheduleStore = (CharityDayScheduleStore) b1Var.getValue();
                if (charityDayScheduleStore == null) {
                    sVar.a0(-231193820);
                    r83 = 0;
                    sVar.q(false);
                    list = list2;
                    obj = obj2;
                    r113 = sVar;
                    b0Var = b0Var2;
                } else {
                    sVar.a0(-231193819);
                    String str = simpleDateFormat.format(Long.valueOf(mv.p0.h(charityDayScheduleStore.getStartTime()))) + ", " + mv.p0.f(mv.p0.F(charityDayScheduleStore.getStartTime())) + " - " + mv.p0.f(mv.p0.F(charityDayScheduleStore.getEndTime()));
                    w6 w6VarF = v3.f(6, 2, null, sVar);
                    String logo = charityDayScheduleStore.getLogo();
                    String name = charityDayScheduleStore.getName();
                    String address = charityDayScheduleStore.getAddress();
                    String storeBranch = charityDayScheduleStore.getStoreBranch();
                    boolean z11 = charityDayScheduleStore.getCollectorType() == CharityPlanCollectorType.PRIMARY;
                    boolean zH3 = sVar.h(mVar) | sVar.f(charityDayScheduleStore);
                    Object objM7 = sVar.M();
                    if (zH3 || objM7 == obj2) {
                        objM7 = new m90.z(22, mVar, charityDayScheduleStore);
                        sVar.k0(objM7);
                    }
                    Function0 function03 = (Function0) objM7;
                    Object objM8 = sVar.M();
                    if (objM8 == obj2) {
                        i13 = 0;
                        objM8 = new pi.b(b1Var2, i13);
                        sVar.k0(objM8);
                    } else {
                        i13 = 0;
                    }
                    Function0 function04 = (Function0) objM8;
                    list = list2;
                    b0Var = b0Var2;
                    ?? r84 = i13;
                    obj = obj2;
                    z20.b.b(w6VarF, logo, name, storeBranch, address, str, z11, function03, function04, sVar, 100663296);
                    ?? r114 = sVar;
                    r114.q(r84);
                    r83 = r84;
                    r113 = r114;
                }
                r113.q(r83);
                r82 = r83;
                r112 = r113;
            } else {
                list = list2;
                obj = obj2;
                r82 = 0;
                m3.s sVar2 = sVar;
                b0Var = b0Var2;
                sVar2.a0(-229810754);
                sVar2.q(false);
                r112 = sVar2;
            }
            long j9 = lv.s.J;
            r0 r0Var = i4.g0.f23254b;
            b4.t tVarC = m2.c(m2.d(d2.c.D(d2.c.E(v1.n.j(tVar, j9, r0Var)), 0.0f, 32, 0.0f, z1Var.a(), 5), 1.0f), 1.0f);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            List list3 = list;
            d2.y yVarA = d2.w.a(dVar, iVar, r112, r82);
            Object obj3 = obj;
            int iHashCode = Long.hashCode(r112.T);
            u3.i iVarL = r112.l();
            b4.t tVarC2 = b4.a.c(tVarC, r112);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            r112.e0();
            if (r112.S) {
                r112.k(hVar);
            } else {
                r112.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, r112);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, r112);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(r112, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(r112, dVar2);
            final v80.b0 b0Var3 = b0Var;
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC2, gVar4, r112);
            float f11 = 16;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarB = d2.c.B(qVar2, 0.0f, f11, 1);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(r112.T);
            u3.i iVarL2 = r112.l();
            b4.t tVarC3 = b4.a.c(tVarB, r112);
            r112.e0();
            if (r112.S) {
                r112.k(hVar);
            } else {
                r112.n0();
            }
            m3.i.C(u0VarD, gVar, r112);
            m3.i.C(iVarL2, gVar2, r112);
            w.a0.y(iHashCode2, r112, gVar3, r112, dVar2);
            m3.i.C(tVarC3, gVar4, r112);
            ?? r302 = r112;
            r9.d(o30.f0.U(r112, R.string.charity_plan_title), d2.c.B(m2.d(qVar2, 1.0f), 56, 0.0f, 2), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28272k, r302, 432, 12582912, 130040);
            v1.n.d(x0.z(R.drawable.ic_info, r302, 0), "InfoIcon", b4.a.a(d2.u.f13938a.a(d2.c.D(qVar2, 0.0f, 0.0f, f11, 0.0f, 11), b4.d.f5688f), c5.m2.f7291a, new bn.c0(10, function02, mVar)), null, null, 0.0f, new i4.o(lv.s.D, 5), r302, 1572920, 56);
            r302.q(true);
            b4.t tVarC4 = m2.c(m2.d(v1.n.j(qVar2, j9, r0Var), 1.0f), 1.0f);
            d2.y yVarA2 = d2.w.a(dVar, iVar, r302, 0);
            int iHashCode3 = Long.hashCode(r302.T);
            u3.i iVarL3 = r302.l();
            b4.t tVarC5 = b4.a.c(tVarC4, r302);
            r302.e0();
            if (r302.S) {
                r302.k(hVar);
            } else {
                r302.n0();
            }
            m3.i.C(yVarA2, gVar, r302);
            m3.i.C(iVarL3, gVar2, r302);
            w.a0.y(iHashCode3, r302, gVar3, r302, dVar2);
            m3.i.C(tVarC5, gVar4, r302);
            b4.t tVarJ = d2.j(d2.c.B(qVar2, 0.0f, f11, 1), "CharityPlanWeekSelector");
            String str2 = simpleDateFormat.format(Long.valueOf(date.getTime()));
            str2.getClass();
            String str3 = simpleDateFormat.format(Long.valueOf(date2.getTime()));
            str3.getClass();
            boolean zH4 = r302.h(b0Var3) | r302.f(bVarB) | r302.h(mVar);
            Object objM9 = r302.M();
            if (zH4 || objM9 == obj3) {
                objM9 = new pi.c(b0Var3, bVarB, mVar);
                r302.k0(objM9);
            }
            Function0 function05 = (Function0) objM9;
            boolean zH5 = r302.h(mVar) | r302.h(b0Var3) | r302.f(bVarB);
            Object objM10 = r302.M();
            if (zH5 || objM10 == obj3) {
                objM10 = new pi.c(mVar, b0Var3, bVarB, 1);
                r302.k0(objM10);
            }
            Function0 function06 = (Function0) objM10;
            boolean zH6 = r302.h(mVar) | r302.h(b0Var3) | r302.f(bVarB);
            Object objM11 = r302.M();
            if (zH6 || objM11 == obj3) {
                objM11 = new pi.c(mVar, b0Var3, bVarB, 2);
                r302.k0(objM11);
            }
            b0.a0.a(tVarJ, str2, str3, function05, function06, (Function0) objM11, r302, 6);
            b4.t tVarJ2 = d2.j(d2.c.D(qVar2, 0.0f, 24, 0.0f, 0.0f, 13), "CharityPlanDaySelector");
            Date date3 = mVar.f35403f;
            boolean zH7 = r302.h(mVar) | r302.h(b0Var3) | r302.f(bVarB);
            Object objM12 = r302.M();
            if (zH7 || objM12 == obj3) {
                objM12 = new m2.h0(mVar, b0Var3, bVarB, 7);
                r302.k0(objM12);
            }
            w0.e.a(tVarJ2, list3, date3, iIntValue2, (Function1) objM12, r302, 6);
            s0.g(d2.j(d2.c.D(qVar2, 0.0f, f11, 0.0f, 0.0f, 13), "HorizontalDivider1"), 0.0f, lv.s.H, r302, 390, 2);
            v0.n.f(bVarB, null, null, null, 0.0f, null, null, false, null, null, null, u3.e.e(-79088175, r302, new i80.o() { // from class: pi.d
                @Override // i80.o
                public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                    int iIntValue3 = ((Integer) obj5).intValue();
                    m3.n nVar2 = (m3.n) obj6;
                    ((Integer) obj7).getClass();
                    ((w) obj4).getClass();
                    q qVar3 = qVar;
                    boolean z12 = qVar3 instanceof o;
                    b4.q qVar4 = b4.q.f5711a;
                    if (z12) {
                        s sVar3 = (s) nVar2;
                        sVar3.a0(1821321855);
                        u00.d.e(d2.j(qVar4, "CharityPlanDayLoading"), sVar3, 6);
                        sVar3.q(false);
                    } else if (qVar3 instanceof p) {
                        s sVar4 = (s) nVar2;
                        sVar4.a0(1821660995);
                        t tVarJ3 = d2.j(m2.c(m2.d(qVar4, 1.0f), 1.0f), "CharityPlanDaySuccess");
                        CharityDaySchedule charityDaySchedule = (CharityDaySchedule) ((p) qVar3).f35416a.get(iIntValue3);
                        b0 b0Var4 = b0Var3;
                        boolean zH8 = sVar4.h(b0Var4);
                        m mVar2 = mVar;
                        boolean zH9 = zH8 | sVar4.h(mVar2);
                        int i17 = iIntValue;
                        boolean zD = zH9 | sVar4.d(i17);
                        Object objM13 = sVar4.M();
                        if (zD || objM13 == m3.m.f29332a) {
                            x xVar = new x(b0Var4, mVar2, i17, b1Var, b1Var2, 5);
                            sVar4.k0(xVar);
                            objM13 = xVar;
                        }
                        a.a(tVarJ3, charityDaySchedule, function0, (Function1) objM13, sVar4, 6);
                        sVar4.q(false);
                    } else {
                        if (!(qVar3 instanceof n)) {
                            throw e0.f.v((s) nVar2, 1305678751, false);
                        }
                        s sVar5 = (s) nVar2;
                        sVar5.a0(1824219983);
                        sVar5.q(false);
                    }
                    return Unit.f26487a;
                }
            }), r302, 0, 16382);
            ?? r115 = r302;
            r115.q(true);
            r115.q(true);
            r11 = r115;
        } else {
            m3.s sVar3 = sVar;
            sVar3.U();
            r11 = sVar3;
        }
        w1 w1VarS = r11.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(tVar, mVar, function0, z1Var, function02, i11);
        }
    }

    public static final void e(List list, Set set, Function1 function1, b4.t tVar, m3.n nVar, int i11) {
        b4.t tVar2;
        list.getClass();
        set.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1946462454);
        int i12 = 256;
        int i13 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(set) ? 32 : 16) | (sVar.h(function1) ? 256 : 128) | 3072;
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            b4.i iVar = b4.d.f5694m;
            d2.b bVar = d2.i.f13801a;
            int i14 = 48;
            d2.y yVarA = d2.w.a(d2.i.g(mVar.l), iVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
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
            sVar.a0(-269883758);
            for (List<FilterDiet> list2 : CollectionsKt.H(list, 2)) {
                d2.b bVar2 = d2.i.f13801a;
                i2 i2VarA = h2.a(d2.i.g(mVar.l), b4.d.f5693k, sVar, i14);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                b4.t tVarC2 = b4.a.c(qVar, sVar);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar2);
                } else {
                    sVar.n0();
                }
                m3.i.C(i2VarA, b5.i.f5843f, sVar);
                m3.i.C(iVarL2, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode2), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC2, b5.i.f5841d, sVar);
                sVar.a0(758998270);
                for (FilterDiet filterDiet : list2) {
                    String name = filterDiet.getName();
                    boolean zF = ((i13 & 896) == i12) | sVar.f(filterDiet);
                    Object objM = sVar.M();
                    if (zF || objM == m3.m.f29332a) {
                        objM = new i2.e(10, function1, filterDiet);
                        sVar.k0(objM);
                    }
                    PantrySelectionChipKt.PantrySelectionChip(name, (Function0) objM, null, filterDiet.getName(), ChipVariant.TextOnly, set.contains(filterDiet.getId()), false, false, null, null, sVar, 24576, 964);
                    i13 = i13;
                    qVar = qVar;
                    mVar = mVar;
                    i12 = i12;
                    i14 = i14;
                }
                sVar.q(false);
                sVar.q(true);
                i13 = i13;
            }
            sVar.q(false);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new jj.a(list, set, function1, tVar2, i11, 1);
        }
    }

    public static final void g(List list, m3.n nVar, int i11) {
        list.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(757931119);
        int i12 = (sVar.h(list) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            b4.t tVarA = d2.c.A(m2.t(m2.d(v1.n.j(v1.n.k(b4.q.f5711a, 1, lv.s.H, l2.g.b(12)), lv.s.J, i4.g0.f23254b), 1.0f), 3), lv.t.f28253g, lv.t.f28252f);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
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
            sVar.a0(1850244935);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cg.j.d((cg.u) it.next(), sVar, 0);
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.m(list, i11, 8);
        }
    }

    public static n90.u h(Function1 function1) {
        n90.b bVar = n90.c.f30748d;
        bVar.getClass();
        n90.h hVar = new n90.h();
        n90.j jVar = bVar.f30749a;
        hVar.f30764a = jVar.f30771a;
        hVar.f30765b = jVar.f30774d;
        hVar.f30766c = jVar.f30772b;
        hVar.f30767d = jVar.f30773c;
        String str = jVar.f30775e;
        String str2 = jVar.f30776f;
        n90.a aVar = jVar.f30778h;
        boolean z11 = jVar.f30777g;
        hVar.f30768e = bVar.f30750b;
        function1.invoke(hVar);
        if (!Intrinsics.areEqual(str, "    ")) {
            i4.a.f("Indent should not be specified when default printing mode is used");
            return null;
        }
        n90.j jVar2 = new n90.j(hVar.f30764a, hVar.f30766c, hVar.f30767d, hVar.f30765b, str, str2, z11, aVar);
        i2.x xVar = hVar.f30768e;
        xVar.getClass();
        n90.u uVar = new n90.u(jVar2, xVar);
        if (!Intrinsics.areEqual(xVar, p90.d.f34621a)) {
            boolean z12 = jVar2.f30778h != n90.a.NONE;
            for (Map.Entry entry : ((Map) xVar.f22928b).entrySet()) {
                KClass kClass = (KClass) entry.getKey();
                p90.c cVar = (p90.c) entry.getValue();
                if (cVar instanceof p90.a) {
                    kClass.getClass();
                    ((p90.a) cVar).f34620a.getClass();
                } else {
                    if (!(cVar instanceof p90.b)) {
                        e40.a.f();
                        return null;
                    }
                    kClass.getClass();
                }
            }
            for (Map.Entry entry2 : ((Map) xVar.f22929c).entrySet()) {
                KClass kClass2 = (KClass) entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    KClass kClass3 = (KClass) entry3.getKey();
                    KSerializer kSerializer = (KSerializer) entry3.getValue();
                    kClass2.getClass();
                    kClass3.getClass();
                    kSerializer.getClass();
                    p30.b kind = kSerializer.getDescriptor().getKind();
                    if ((kind instanceof k90.c) || Intrinsics.areEqual(kind, k90.h.f26238j)) {
                        i1.l("Serializer for ", kClass3.getSimpleName(), " can't be registered as a subclass for polymorphic serialization because its kind ", kind, " is not concrete. To work with multiple hierarchies, register it as a base class.");
                        return null;
                    }
                    if (z12 && (Intrinsics.areEqual(kind, k90.j.f26241k) || Intrinsics.areEqual(kind, k90.j.l) || (kind instanceof k90.d) || (kind instanceof k90.i))) {
                        i1.l("Serializer for ", kClass3.getSimpleName(), " of kind ", kind, " cannot be serialized polymorphically with class discriminator.");
                        return null;
                    }
                }
            }
            for (Map.Entry entry4 : ((Map) xVar.f22930d).entrySet()) {
                KClass kClass4 = (KClass) entry4.getKey();
                Function1 function12 = (Function1) entry4.getValue();
                kClass4.getClass();
                function12.getClass();
                ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function12, 1)).getClass();
            }
            for (Map.Entry entry5 : ((Map) xVar.f22932f).entrySet()) {
                KClass kClass5 = (KClass) entry5.getKey();
                Function1 function13 = (Function1) entry5.getValue();
                kClass5.getClass();
                function13.getClass();
                ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function13, 1)).getClass();
            }
        }
        return uVar;
    }

    public static final void i(b4.t tVar, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        Function0 function03;
        b4.t tVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1527785450);
        int i12 = i11 | 6 | (sVar.h(function02) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.t tVarR = v1.n.r(m2.f13850c, v1.n.q(sVar), true);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarR, sVar);
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
            cg.j.s("", null, 0L, lv.s.J, null, null, kotlin.collections.c0.c(new cg.a(R.drawable.system_icon_close_neutral_80, Integer.valueOf(R.string.login_charity_accessibility_close), function02)), null, sVar, 3078, 182);
            tVar2 = b4.q.f5711a;
            b4.t tVarT = m2.t(m2.d(tVar2, 1.0f), 3);
            float f11 = lv.t.f28253g;
            r9.d(o30.f0.U(sVar, R.string.login_charity_contact_title), d2.c.B(tVarT, f11, 0.0f, 2), lv.s.f28215a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28264c, sVar, 432, 12582912, 131064);
            r9.d(o30.f0.U(sVar, R.string.login_charity_contact_text), d2.c.D(d2.c.B(m2.t(m2.d(tVar2, 1.0f), 3), f11, 0.0f, 2), 0.0f, lv.t.f28254h, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 432, 12582912, 131064);
            sVar = sVar;
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f, true), sVar);
            b4.t tVarD = d2.c.D(d2.c.B(m2.d(tVar2, 1.0f), f11, 0.0f, 2), 0.0f, lv.t.f28256j, 0.0f, 0.0f, 13);
            String strU = o30.f0.U(sVar, R.string.login_charity_contact_get_more_info);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                function03 = function0;
                objM = new ar.d(21, function03);
                sVar.k0(objM);
            } else {
                function03 = function0;
            }
            v0.n.l(tVarD, strU, null, null, null, false, false, null, null, (Function0) objM, sVar, 6, 508);
            sVar.q(true);
        } else {
            function03 = function0;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dm.f(tVar2, function03, function02, i11, 0);
        }
    }

    public static final void j(Order order, DiscoverBucket discoverBucket, Function0 function0, Function1 function1, b4.t tVar, m3.n nVar, int i11) {
        m3.s sVar;
        b4.t tVar2;
        Integer overallRating;
        function0.getClass();
        function1.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(2081820407);
        int i12 = i11 | (sVar2.h(order) ? 4 : 2) | (sVar2.h(discoverBucket) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function1) ? NewHope.SENDB_BYTES : 1024) | 24576;
        int iIntValue = 0;
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                if (order != null && (overallRating = order.getOverallRating()) != null) {
                    iIntValue = overallRating.intValue();
                }
                objM = w.a0.s(iIntValue, sVar2);
            }
            b4.q qVar = b4.q.f5711a;
            sVar = sVar2;
            s0.b(d2.c.A(m2.d(qVar, 1.0f), lv.t.f28253g, lv.t.f28254h), l2.g.b(16), s0.p(lv.s.J, sVar2, 6), s0.q(5, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(-63581591, sVar2, new bn.v(function0, order, discoverBucket, (h1) objM, function1, 4)), sVar, 196608, 16);
            tVar2 = qVar;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(order, discoverBucket, function0, function1, tVar2, i11, 9);
        }
    }

    public static final void k(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            i4.a.i(i11 != i12 ? r8.k.g(i11, i12, "Both size ", " and step ", " must be greater than zero.") : r8.k.h(i11, "size ", " must be greater than zero."));
        }
    }

    public static final double l(int i11, int i12, int i13, int i14, ad.g gVar) {
        double d3 = ((double) i13) / ((double) i11);
        double d11 = ((double) i14) / ((double) i12);
        int i15 = qc.h.$EnumSwitchMapping$0[gVar.ordinal()];
        if (i15 == 1) {
            return Math.max(d3, d11);
        }
        if (i15 == 2) {
            return Math.min(d3, d11);
        }
        e40.a.f();
        return 0.0d;
    }

    public static final s0.g m(CaptureRequest.Key key) {
        key.getClass();
        return new s0.g("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public static final File p(Context context, String str) {
        context.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static long q(int i11, int i12, int i13, int i14) {
        int i15 = 262142;
        int iMin = Math.min(i13, 262142);
        int iMin2 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i14, 262142);
        int i16 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i16 >= 8191) {
            if (i16 < 32767) {
                i15 = 65534;
            } else if (i16 < 65535) {
                i15 = 32766;
            } else {
                if (i16 >= 262143) {
                    z5.b.l(i16);
                    qc.y.m();
                    return 0L;
                }
                i15 = 8190;
            }
        }
        return z5.b.a(Math.min(i15, i11), i12 != Integer.MAX_VALUE ? Math.min(i15, i12) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long r(int i11, int i12, int i13, int i14) {
        int i15 = 262142;
        int iMin = Math.min(i11, 262142);
        int iMin2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i12, 262142);
        int i16 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i16 >= 8191) {
            if (i16 < 32767) {
                i15 = 65534;
            } else if (i16 < 65535) {
                i15 = 32766;
            } else {
                if (i16 >= 262143) {
                    z5.b.l(i16);
                    qc.y.m();
                    return 0L;
                }
                i15 = 8190;
            }
        }
        return z5.b.a(iMin, iMin2, Math.min(i15, i13), i14 != Integer.MAX_VALUE ? Math.min(i15, i14) : Integer.MAX_VALUE);
    }

    public static final ea.f s(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            ea.f fVar = tag instanceof ea.f ? (ea.f) tag : null;
            if (fVar != null) {
                return fVar;
            }
            Object objS = dx.f.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static final KClass u(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        KClass kClassY = y(clsAnnotationType);
        kClassY.getClass();
        return kClassY;
    }

    public static final Class v(KClass kClass) {
        kClass.getClass();
        Class<?> jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        jClass.getClass();
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class w(KClass kClass) {
        kClass.getClass();
        Class<?> jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (!jClass.isPrimitive()) {
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class x(KClass kClass) {
        kClass.getClass();
        Class<?> jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (jClass.isPrimitive()) {
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final KClass y(Class cls) {
        cls.getClass();
        return Reflection.getOrCreateKotlinClass(cls);
    }

    public static boolean z() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return kotlin.text.y.k(Build.DEVICE, "m55xq", true);
    }

    public abstract int C(int i11);

    public abstract w E(KClass kClass, Object obj);

    public abstract int F(int i11);

    @Override // o5.d
    public int d(int i11) {
        int iC = C(i11);
        if (iC == -1 || C(iC) == -1) {
            return -1;
        }
        return iC;
    }

    @Override // o5.d
    public int f(int i11) {
        int iF = F(i11);
        if (iF == -1 || F(iF) == -1) {
            return -1;
        }
        return iF;
    }

    @Override // o5.d
    public int n(int i11) {
        return F(i11);
    }

    @Override // o5.d
    public int o(int i11) {
        return C(i11);
    }

    public abstract Object t(KClass kClass);
}
