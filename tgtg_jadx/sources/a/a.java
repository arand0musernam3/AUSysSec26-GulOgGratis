package a;

import a3.m3;
import aa.l0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.EdgeEffect;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.lifecycle.c1;
import b0.z;
import b4.t;
import bn.p;
import c5.d2;
import c5.v0;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.DailyReminder;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.FilteredStore;
import com.app.tgtg.model.remote.voucher.VoucherState;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse;
import com.app.tgtg.model.remote.widgets.response.FavouriteWidgetItem;
import com.google.android.gms.internal.measurement.cg;
import com.google.firebase.components.DependencyCycleException;
import com.tgtg.componentlibrary.component.avatar.model.AvatarSize;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarImageKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.c;
import d2.g0;
import d2.h2;
import d2.i2;
import d2.k2;
import d2.m2;
import d2.u;
import d2.w;
import d2.w0;
import d2.y;
import e0.f;
import g3.q7;
import g3.q9;
import g3.r9;
import g3.s0;
import g9.f0;
import g9.t0;
import i4.x0;
import i9.q;
import j4.d;
import j5.r;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import lv.v;
import m3.b1;
import m3.d3;
import m3.h1;
import m3.k1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import mv.p0;
import o30.e0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONObject;
import r8.k;
import s1.r0;
import u3.e;
import u30.b;
import u30.g;
import u30.h;
import u30.i;
import u30.o;
import v80.b0;
import w.a0;
import x60.l;
import y3.j;
import z4.c0;
import z4.u0;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13a = 0;

    public static void A(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i11 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (g gVar : (Set) it2.next()) {
                        for (i iVar : gVar.f40687a.f40672c) {
                            if (iVar.f40694c == 0) {
                                Set<g> set = (Set) map.get(new h(iVar.f40692a, iVar.f40693b == 2));
                                if (set != null) {
                                    for (g gVar2 : set) {
                                        gVar.f40688b.add(gVar2);
                                        gVar2.f40689c.add(gVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<g> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (g gVar3 : hashSet) {
                    if (gVar3.f40689c.isEmpty()) {
                        hashSet2.add(gVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    g gVar4 = (g) hashSet2.iterator().next();
                    hashSet2.remove(gVar4);
                    i11++;
                    for (g gVar5 : gVar4.f40688b) {
                        gVar5.f40689c.remove(gVar4);
                        if (gVar5.f40689c.isEmpty()) {
                            hashSet2.add(gVar5);
                        }
                    }
                }
                if (i11 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (g gVar6 : hashSet) {
                    if (!gVar6.f40689c.isEmpty() && !gVar6.f40688b.isEmpty()) {
                        arrayList2.add(gVar6.f40687a);
                    }
                }
                throw new DependencyCycleException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            b bVar = (b) it.next();
            g gVar7 = new g(bVar);
            for (o oVar : bVar.f40671b) {
                boolean z11 = bVar.f40674e == 0;
                h hVar = new h(oVar, !z11);
                if (!map.containsKey(hVar)) {
                    map.put(hVar, new HashSet());
                }
                Set set2 = (Set) map.get(hVar);
                if (!set2.isEmpty() && z11) {
                    d.m("Multiple components provide ", oVar, ".");
                    return;
                }
                set2.add(gVar7);
            }
        }
    }

    public static float B(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return m7.b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final String C(FavouriteWidgetItem favouriteWidgetItem, Context context) {
        context.getClass();
        PickupInterval pickupInterval = favouriteWidgetItem.getPickupInterval();
        if (pickupInterval == null) {
            return "";
        }
        String intervalStart = pickupInterval.getIntervalStart();
        String string = p0.A(intervalStart) ? context.getString(R.string.fav_widget_collection_time_label_today) : p0.C(intervalStart) ? context.getString(R.string.fav_widget_collection_time_label_tomorrow) : p0.d(context, intervalStart);
        return string == null ? "" : string;
    }

    public static boolean D(int i11) {
        return (i11 & 32768) != 0;
    }

    public static boolean E() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean F(int i11) {
        if (i11 == 15 || i11 == 255) {
            return true;
        }
        if (i11 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i11 != 32783) {
            return i11 == 33023 || i11 == 0;
        }
        int i12 = Build.VERSION.SDK_INT;
        return i12 < 28 || i12 > 29;
    }

    public static float G(EdgeEffect edgeEffect, float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 31) {
            return m7.b.c(edgeEffect, f11, f12);
        }
        edgeEffect.onPull(f11, f12);
        return f11;
    }

    public static final long H(long j9, long j11) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) + ((int) (j11 & 4294967295L)))) & 4294967295L);
    }

    public static final f0 I(t0[] t0VarArr, n nVar) {
        s sVar = (s) nVar;
        Context context = (Context) sVar.j(v0.f7390b);
        Object[] objArrCopyOf = Arrays.copyOf(t0VarArr, t0VarArr.length);
        ub.a aVar = new ub.a(28, new q(0), new q9(context, 26));
        boolean zH = sVar.h(context);
        Object objM = sVar.M();
        if (zH || objM == m.f29332a) {
            objM = new bo.a(context, 7);
            sVar.k0(objM);
        }
        f0 f0Var = (f0) j.e(objArrCopyOf, aVar, (Function0) objM, sVar, 0, 4);
        for (t0 t0Var : t0VarArr) {
            f0Var.f20186b.f27549s.a(t0Var);
        }
        return f0Var;
    }

    public static final long J(long j9) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j9 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static void K(Runnable runnable) {
        if (E()) {
            runnable.run();
        } else {
            pd.g.n("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static boolean L(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                if (bArr[i11] == bArr2[i11]) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean M() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Google")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Google")) {
                return false;
            }
        }
        String str3 = Build.MODEL;
        str3.getClass();
        String upperCase = str3.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return ExtraSupportedSurfaceCombinationsQuirk.f2186c.contains(upperCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean N() {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r2 = 0
            if (r0 != 0) goto L19
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L41
        L19:
            java.lang.String r0 = android.os.Build.MODEL
            r0.getClass()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            r0.getClass()
            java.util.Set r1 = androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.f2187d
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = kotlin.text.y.p(r0, r3, r2)
            if (r3 == 0) goto L2d
            r0 = 1
            return r0
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.N():boolean");
    }

    public static final List O(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.O(list)) : n0.f26529a;
    }

    public static final Map P(Map map) {
        int size = map.size();
        if (size == 0) {
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            return o0Var;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.N(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final Object Q(c1 c1Var, KClass kClass, o0 o0Var) {
        c1Var.getClass();
        kClass.getClass();
        o0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        KSerializer kSerializerI = ba0.g.I(kClass);
        for (g9.g gVar : m9.d.c(kSerializerI, o0Var)) {
            linkedHashMap.put(gVar.f20116a, gVar.f20117b.f20149a);
        }
        return kSerializerI.deserialize(new m9.i(c1Var, linkedHashMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.util.List] */
    public static final void a(BasicVoucher basicVoucher, n nVar, int i11) {
        w1 w1VarS;
        hg.a aVar;
        s sVar = (s) nVar;
        sVar.c0(-1289258234);
        int i12 = (sVar.f(basicVoucher) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            boolean z11 = basicVoucher.getState() == VoucherState.ACTIVE;
            VoucherFilterResponse filterList = basicVoucher.getFilterList();
            ?? arrayList = 0;
            List<FilteredStore> whitelist = filterList != null ? filterList.getWhitelist() : null;
            if (whitelist == null) {
                whitelist = n0.f26529a;
            }
            if (whitelist.isEmpty()) {
                sVar.a0(1600894684);
                sVar.q(false);
                List<ItemType> applicableItemTypes = basicVoucher.getApplicableItemTypes();
                if (applicableItemTypes != null) {
                    arrayList = new ArrayList();
                    for (Object obj : applicableItemTypes) {
                        if (((ItemType) obj).getIconRes() != 0) {
                            arrayList.add(obj);
                        }
                    }
                }
                if (arrayList == 0) {
                    arrayList = n0.f26529a;
                }
                List listH = d0.h(ItemType.MAGIC_BAG, ItemType.MANUFACTURER, ItemType.TABLE_RESERVATION, ItemType.CATERING);
                boolean zIsEmpty = arrayList.isEmpty();
                ?? r22 = arrayList;
                if (zIsEmpty) {
                    r22 = listH;
                }
                if (r22.size() == 1) {
                    sVar.a0(1601252920);
                    b(z11, e.e(1148382161, sVar, new p(12, (ItemType) CollectionsKt.O(r22), mVar, jVar, hVar)), sVar, 48);
                    sVar.q(false);
                    w1VarS = sVar.s();
                    if (w1VarS == null) {
                        return;
                    } else {
                        aVar = new hg.a(basicVoucher, i11, 1);
                    }
                } else {
                    sVar.a0(1601871804);
                    sVar.q(false);
                    Iterator it = r22.iterator();
                    while (it.hasNext()) {
                        c(z11, ((ItemType) it.next()).getIconRes(), sVar, 0);
                        c.f(m2.q(b4.q.f5711a, mVar.f44016m), sVar);
                    }
                }
            } else {
                sVar.a0(1600816843);
                r(whitelist, z11, sVar, 0);
                sVar.q(false);
                w1VarS = sVar.s();
                if (w1VarS == null) {
                    return;
                } else {
                    aVar = new hg.a(basicVoucher, i11, 0);
                }
            }
            w1VarS.f29476d = aVar;
        }
        sVar.U();
        w1VarS = sVar.s();
        if (w1VarS != null) {
            aVar = new hg.a(basicVoucher, i11, 2);
            w1VarS.f29476d = aVar;
        }
    }

    public static final void b(boolean z11, u3.d dVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-303486180);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarB = c.B(v1.n.j(m2.e(b4.q.f5711a, ((l) sVar.j(PantryThemeKt.getLocalPantrySize())).f43993e), z11 ? hVar.f43913e : hVar.A, l2.g.f26790a), ((x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing())).f44017n, 0.0f, 2);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarB, sVar);
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
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            k.w((i12 >> 3) & 14, dVar, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.b(z11, dVar, i11);
        }
    }

    public static final void c(boolean z11, int i11, n nVar, int i12) {
        s sVar = (s) nVar;
        sVar.c0(-533230070);
        int i13 = (sVar.g(z11) ? 4 : 2) | i12 | (sVar.d(i11) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
            PantryAvatarImageKt.PantryAvatarImage(e.e(-584758086, sVar, new hg.c(i11, mVar, hVar, 0)), v1.n.j(m2.m(b4.q.f5711a, lVar.f43993e), z11 ? hVar.f43913e : hVar.A, l2.g.f26790a), "item type", AvatarSize.Small, sVar, 3462, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.d(i11, i12, z11);
        }
    }

    public static final void d(int i11, t tVar, Function0 function0, n nVar, boolean z11) {
        t tVar2;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-422129774);
        int i12 = i11 | 6 | (sVar.g(z11) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        int i13 = 1;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            long j9 = lv.s.C;
            x0 x0Var = new x0(j9);
            float f11 = z11 ? 0.5f : 0.0f;
            b4.q qVar = b4.q.f5711a;
            t tVarE = c.E(m2.c(m2.d(v1.n.i(qVar, x0Var, f11, 2), 1.0f), 1.0f));
            fg.j jVar = new fg.j(z11, function0, i13);
            c5.s sVar2 = c5.m2.f7291a;
            t tVarA = b4.a.a(tVarE, sVar2, jVar);
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
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
            float f12 = 40;
            t tVarB = c.B(qVar, 0.0f, f12, 1);
            u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d("", d2.j(c.B(m2.d(qVar, 1.0f), 56, 0.0f, 2), "ProportionText"), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28272k, sVar, 438, 12582912, 130040);
            float f13 = 8;
            t tVarM = m2.m(c.D(qVar, 0.0f, 0.0f, f13, 0.0f, 11), f12);
            long j11 = lv.s.J;
            t tVarJ = v1.n.j(tVarM, j11, l2.g.f26790a);
            b4.k kVar2 = b4.d.f5688f;
            u uVar = u.f13938a;
            t tVarA2 = uVar.a(tVarJ, kVar2);
            u0 u0VarD3 = d2.p.d(kVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(tVarA2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD3, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            v1.n.d(o00.x0.z(R.drawable.ic_info, sVar, 0), "InfoIcon", uVar.a(qVar, b4.d.f5687e), null, null, 0.0f, new i4.o(lv.s.D, 5), sVar, 1572920, 56);
            sVar.q(true);
            sVar.q(true);
            t tVarB2 = c.B(qVar, 0.0f, 72, 1);
            d2.d dVar2 = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            y yVarA = w.a(dVar2, iVar, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = b4.a.c(tVarB2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            float f14 = 16;
            v1.n.d(o00.x0.z(R.drawable.triangle_black, sVar, 0), "Triangle", m2.u(c.D(new w0(b4.d.f5696o), 0.0f, 0.0f, f14, 0.0f, 11), null, 3), null, null, 0.0f, null, sVar, 56, 120);
            t tVarC5 = c.C(v1.n.j(m2.t(c.B(m2.d(c.w(qVar, 0.0f, -1, 1), 1.0f), f13, 0.0f, 2), 3), j9, l2.g.b(12)), f14, f14, f14, f14);
            y yVarA2 = w.a(dVar2, iVar, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            t tVarC6 = b4.a.c(tVarC5, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            a0.y(iHashCode5, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC6, gVar4, sVar);
            r9.d(o30.f0.U(sVar, R.string.charity_plan_tooltip_title), null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28275o, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            r9.d(o30.f0.U(sVar, R.string.charity_plan_tooltip_message), m2.u(c.D(qVar, 0.0f, f13, 0.0f, 0.0f, 13), null, 3), j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, 432, 12582912, 131064);
            r9.d(o30.f0.U(sVar, R.string.charity_plan_tooltip_got_it), b4.a.a(m2.u(c.D(qVar, 0.0f, f14, 0.0f, 0.0f, 13), null, 3), sVar2, new on.l(4, function0)), lv.s.f28227g, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(v.f28283w, 0L, 0L, null, null, 0L, x5.l.f43854c, 0, 0L, null, null, 16773119), sVar, MLKEMEngine.KyberPolyBytes, 0, 131064);
            sVar = sVar;
            f.D(sVar, true, true, true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pi.h(tVar2, z11, function0, i11, 0);
        }
    }

    public static final void e(t tVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1844223552);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            d2.p.a(m2.m(v1.n.j(tVar, lv.s.f28224e0, l2.g.f26790a), 8), sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bm.b(tVar, i11, 10);
        }
    }

    public static final void f(boolean z11, DailyReminder dailyReminder, Function1 function1, n nVar, int i11) {
        int i12;
        s sVar;
        float f11;
        float f12;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object dVar;
        m3.f fVar;
        float f13;
        float f14;
        DailyReminder dailyReminder2;
        String str8;
        b1 b1Var;
        boolean z12;
        String str9;
        DailyReminder dailyReminder3;
        function1.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1621482410);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.d(R.string.notification_settings_daily_reminder_title) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.d(R.string.notification_settings_daily_reminder_description) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(dailyReminder) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            float f15 = z11 ? 1.0f : 0.5f;
            String strU = o30.f0.U(sVar2, R.string.notification_settings_daily_reminder_weekday_monday);
            String strU2 = o30.f0.U(sVar2, R.string.notification_settings_daily_reminder_weekday_tuesday);
            String strU3 = o30.f0.U(sVar2, R.string.notification_settings_daily_reminder_weekday_wednesday);
            String strU4 = o30.f0.U(sVar2, R.string.notification_settings_daily_reminder_weekday_thursday);
            String strU5 = o30.f0.U(sVar2, R.string.notification_settings_daily_reminder_weekday_friday);
            String strU6 = o30.f0.U(sVar2, R.string.notification_settings_daily_reminder_weekday_saturday);
            String strU7 = o30.f0.U(sVar2, R.string.notification_settings_daily_reminder_weekday_sunday);
            Object objM = sVar2.M();
            m3.f fVar2 = m.f29332a;
            if (objM == fVar2) {
                objM = m3.i.w(dailyReminder);
                sVar2.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar2) {
                if (dailyReminder == null) {
                    str9 = strU4;
                    dailyReminder3 = new DailyReminder(false, false, false, false, false, false, false, 127, (DefaultConstructorMarker) null);
                } else {
                    str9 = strU4;
                    dailyReminder3 = dailyReminder;
                }
                str2 = strU2;
                str3 = strU3;
                f11 = 1.0f;
                str4 = str9;
                str = strU;
                f12 = f15;
                str5 = strU5;
                str6 = strU6;
                str7 = strU7;
                objM2 = m3.i.w(g(strU, strU2, strU3, str9, strU5, strU6, strU7, dailyReminder3));
                sVar2.k0(objM2);
            } else {
                f11 = 1.0f;
                f12 = f15;
                str = strU;
                str2 = strU2;
                str3 = strU3;
                str4 = strU4;
                str5 = strU5;
                str6 = strU6;
                str7 = strU7;
            }
            b1 b1Var3 = (b1) objM2;
            boolean zH = sVar2.h(dailyReminder) | sVar2.f(str) | sVar2.f(str2) | sVar2.f(str3) | sVar2.f(str4) | sVar2.f(str5) | sVar2.f(str6) | sVar2.f(str7);
            Object objM3 = sVar2.M();
            if (zH || objM3 == fVar2) {
                fVar = fVar2;
                String str10 = str;
                f13 = f12;
                f14 = f11;
                dVar = new is.d(dailyReminder, b1Var2, str10, str2, str3, str4, str5, str6, str7, b1Var3, null);
                String str11 = str2;
                dailyReminder2 = dailyReminder;
                str8 = str11;
                b1Var2 = b1Var2;
                str = str10;
                b1Var = b1Var3;
                sVar2.k0(dVar);
            } else {
                String str12 = str2;
                dailyReminder2 = dailyReminder;
                str8 = str12;
                dVar = objM3;
                fVar = fVar2;
                f13 = f12;
                f14 = f11;
                b1Var = b1Var3;
            }
            m3.i.h(dailyReminder2, (Function2) dVar, sVar2);
            b4.q qVar = b4.q.f5711a;
            t tVarD = m2.d(qVar, f14);
            float f16 = lv.t.f28253g;
            String str13 = str8;
            String str14 = str;
            t tVarB = c.B(tVarD, f16, 0.0f, 2);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            String str15 = str3;
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarB, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            b1 b1Var4 = b1Var;
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar2, dVar2);
            String str16 = str4;
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            String strU8 = o30.f0.U(sVar2, R.string.notification_settings_daily_reminder_title);
            m5.u0 u0Var = v.f28272k;
            long j9 = lv.s.C;
            r9.d(strU8, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            c.f(m2.e(qVar, lv.t.f28251e), sVar2);
            r9.d(o30.f0.U(sVar2, R.string.notification_settings_daily_reminder_description), null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            c.f(m2.e(qVar, f16), sVar2);
            DailyReminder dailyReminder4 = (DailyReminder) b1Var2.getValue();
            if (dailyReminder4 == null) {
                sVar2.a0(2061790316);
                sVar2.q(false);
                sVar = sVar2;
                z12 = true;
            } else {
                sVar2.a0(2061790317);
                String str17 = str5;
                t tVarA = f4.g.a(m2.d(qVar, 1.0f), f13);
                String str18 = str6;
                i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar2, 0);
                int iHashCode2 = Long.hashCode(sVar2.T);
                u3.i iVarL2 = sVar2.l();
                t tVarC2 = b4.a.c(tVarA, sVar2);
                sVar2.e0();
                String str19 = str7;
                if (sVar2.S) {
                    sVar2.k(hVar);
                } else {
                    sVar2.n0();
                }
                m3.i.C(i2VarA, gVar, sVar2);
                m3.i.C(iVarL2, gVar2, sVar2);
                a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar2);
                m3.i.C(tVarC2, gVar4, sVar2);
                String strU9 = o30.f0.U(sVar2, R.string.notification_settings_daily_reminder_short_weekday_monday);
                boolean monday = dailyReminder4.getMonday();
                Object objM4 = sVar2.M();
                m3.f fVar3 = fVar;
                if (objM4 == fVar3) {
                    objM4 = new q(12);
                    sVar2.k0(objM4);
                }
                b1 b1Var5 = b1Var2;
                is.c cVar = new is.c(b1Var5, (Function2) objM4, function1, str14, str13, str15, str16, str17, str18, str19, b1Var4);
                int i13 = i12 & 896;
                sVar = sVar2;
                zz.f.d(null, strU9, z11, monday, cVar, sVar, i13);
                k2 k2Var = k2.f13824a;
                z12 = true;
                c.f(k2Var.a(1.0f, qVar, true), sVar);
                String strU10 = o30.f0.U(sVar, R.string.notification_settings_daily_reminder_short_weekday_tuesday);
                boolean tuesday = dailyReminder4.getTuesday();
                Object objM5 = sVar.M();
                if (objM5 == fVar3) {
                    objM5 = new q(13);
                    sVar.k0(objM5);
                }
                zz.f.d(null, strU10, z11, tuesday, new is.c(b1Var5, (Function2) objM5, function1, str14, str13, str15, str16, str17, str18, str19, b1Var4), sVar, i13);
                c.f(k2Var.a(1.0f, qVar, true), sVar);
                String strU11 = o30.f0.U(sVar, R.string.notification_settings_daily_reminder_short_weekday_wednesday);
                boolean wednesday = dailyReminder4.getWednesday();
                Object objM6 = sVar.M();
                if (objM6 == fVar3) {
                    objM6 = new q(14);
                    sVar.k0(objM6);
                }
                zz.f.d(null, strU11, z11, wednesday, new is.c(b1Var5, (Function2) objM6, function1, str14, str13, str15, str16, str17, str18, str19, b1Var4), sVar, i13);
                c.f(k2Var.a(1.0f, qVar, true), sVar);
                String strU12 = o30.f0.U(sVar, R.string.notification_settings_daily_reminder_short_weekday_thursday);
                boolean thursday = dailyReminder4.getThursday();
                Object objM7 = sVar.M();
                if (objM7 == fVar3) {
                    objM7 = new q(15);
                    sVar.k0(objM7);
                }
                zz.f.d(null, strU12, z11, thursday, new is.c(b1Var5, (Function2) objM7, function1, str14, str13, str15, str16, str17, str18, str19, b1Var4), sVar, i13);
                c.f(k2Var.a(1.0f, qVar, true), sVar);
                String strU13 = o30.f0.U(sVar, R.string.notification_settings_daily_reminder_short_weekday_friday);
                boolean friday = dailyReminder4.getFriday();
                Object objM8 = sVar.M();
                if (objM8 == fVar3) {
                    objM8 = new q(16);
                    sVar.k0(objM8);
                }
                zz.f.d(null, strU13, z11, friday, new is.c(b1Var5, (Function2) objM8, function1, str14, str13, str15, str16, str17, str18, str19, b1Var4), sVar, i13);
                c.f(k2Var.a(1.0f, qVar, true), sVar);
                String strU14 = o30.f0.U(sVar, R.string.notification_settings_daily_reminder_short_weekday_saturday);
                boolean saturday = dailyReminder4.getSaturday();
                Object objM9 = sVar.M();
                if (objM9 == fVar3) {
                    objM9 = new q(17);
                    sVar.k0(objM9);
                }
                zz.f.d(null, strU14, z11, saturday, new is.c(b1Var5, (Function2) objM9, function1, str14, str13, str15, str16, str17, str18, str19, b1Var4), sVar, i13);
                c.f(k2Var.a(1.0f, qVar, true), sVar);
                String strU15 = o30.f0.U(sVar, R.string.notification_settings_daily_reminder_short_weekday_sunday);
                boolean sunday = dailyReminder4.getSunday();
                Object objM10 = sVar.M();
                if (objM10 == fVar3) {
                    objM10 = new q(18);
                    sVar.k0(objM10);
                }
                zz.f.d(null, strU15, z11, sunday, new is.c(b1Var5, (Function2) objM10, function1, str14, str13, str15, str16, str17, str18, str19, b1Var4), sVar, i13);
                sVar.q(true);
                c.f(m2.e(qVar, lv.t.f28249c), sVar);
                r9.d(z11 ? (String) b1Var4.getValue() : "", null, lv.s.f28217b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28277q, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar.q(false);
            }
            sVar.q(z12);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(z11, dailyReminder, function1, i11, 5);
        }
    }

    public static final String g(String str, String str2, String str3, String str4, String str5, String str6, String str7, DailyReminder dailyReminder) {
        List listH = d0.h(new Pair(Boolean.valueOf(dailyReminder.getMonday()), str), new Pair(Boolean.valueOf(dailyReminder.getTuesday()), str2), new Pair(Boolean.valueOf(dailyReminder.getWednesday()), str3), new Pair(Boolean.valueOf(dailyReminder.getThursday()), str4), new Pair(Boolean.valueOf(dailyReminder.getFriday()), str5), new Pair(Boolean.valueOf(dailyReminder.getSaturday()), str6), new Pair(Boolean.valueOf(dailyReminder.getSunday()), str7));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (((Boolean) ((Pair) obj).f26485a).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.U(arrayList, ", ", null, null, new im.a(3), 30);
    }

    public static final void h(LoyaltyCardDetails loyaltyCardDetails, Function1 function1, Function0 function0, n nVar, int i11) {
        function1.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1294612522);
        int i12 = (sVar.f(loyaltyCardDetails) ? 4 : 2) | i11 | (sVar.h(function1) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = a0.s(0, sVar);
            }
            h1 h1Var = (h1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = a0.s(0, sVar);
            }
            d3 d3Var = x1.f7416h;
            m3.i.a(b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), e.e(1820830870, sVar, new ap.b(h1Var, (h1) objM2, function1, loyaltyCardDetails, function0, 12)), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(loyaltyCardDetails, function1, function0, i11, 28);
        }
    }

    public static final void i(t tVar, final BasicItem basicItem, Function0 function0, n nVar, final int i11) {
        final t tVar2;
        w1 w1VarS;
        Function2 function2;
        final Function0 function02 = function0;
        basicItem.getClass();
        s sVar = (s) nVar;
        sVar.c0(32699376);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(basicItem) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function02) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            final b4.q qVar = b4.q.f5711a;
            if (function02 == null) {
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    final int i13 = 0;
                    function2 = new Function2() { // from class: fg.e
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = i13;
                            m3.n nVar2 = (m3.n) obj;
                            ((Integer) obj2).getClass();
                            switch (i14) {
                                case 0:
                                    a.a.i(qVar, basicItem, function02, nVar2, m3.i.F(i11 | 1));
                                    break;
                                default:
                                    a.a.i(qVar, basicItem, function02, nVar2, m3.i.F(i11 | 1));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    w1VarS.f29476d = function2;
                }
                return;
            }
            boolean zF = sVar.f(basicItem.getInformation().mo340getItemIdFvU5WIY());
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (zF || objM == fVar) {
                objM = m3.i.w(Boolean.valueOf(basicItem.getFavorite()));
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Boolean boolValueOf = Boolean.valueOf(basicItem.getFavorite());
            boolean zF2 = sVar.f(b1Var) | sVar.h(basicItem);
            Object objM2 = sVar.M();
            if (zF2 || objM2 == fVar) {
                objM2 = new l0(basicItem, b1Var, (x70.c) null, 19);
                sVar.k0(objM2);
            }
            m3.i.h(boolValueOf, (Function2) objM2, sVar);
            boolean zF3 = sVar.f(basicItem.getInformation().mo340getItemIdFvU5WIY());
            Object objM3 = sVar.M();
            if (zF3 || objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var2 = (b1) objM3;
            le.p pVarD = e0.D(new le.q("favorite_animation.json"), sVar, 6);
            boolean zF4 = sVar.f(b1Var);
            Object objM4 = sVar.M();
            if (zF4 || objM4 == fVar) {
                objM4 = new a3.p0(b1Var, 10);
                sVar.k0(objM4);
            }
            basicItem.setOnFavoriteChangedListener((Function1) objM4);
            float fFloatValue = ((Boolean) b1Var2.getValue()).booleanValue() ? ((Number) cg.j((he.k) pVarD.getValue(), ((Boolean) b1Var2.getValue()).booleanValue(), false, 0.0f, 0, sVar, 1020).getValue()).floatValue() : ((Boolean) b1Var.getValue()).booleanValue() ? 1.0f : 0.0f;
            float f11 = 24;
            t tVarM = m2.m(qVar, f11);
            u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarM, sVar);
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
            t tVarJ = f4.g.j(qVar, 3.5f, 3.5f);
            he.k kVar = (he.k) pVarD.getValue();
            boolean zC = sVar.c(fFloatValue);
            Object objM5 = sVar.M();
            if (zC || objM5 == fVar) {
                objM5 = new defpackage.f(fFloatValue);
                sVar.k0(objM5);
            }
            o00.x0.g(kVar, (Function0) objM5, tVarJ, false, false, false, false, null, false, null, null, false, false, null, null, false, sVar, MLKEMEngine.KyberPolyBytes, 0, 131064);
            sVar = sVar;
            function02 = function0;
            d2.p.a(b4.a.a(m2.m(qVar, f11), c5.m2.f7291a, new fg.f(function02, b1Var, b1Var2, 0)), sVar, 0);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            final int i14 = 1;
            function2 = new Function2() { // from class: fg.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = i14;
                    m3.n nVar2 = (m3.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i142) {
                        case 0:
                            a.a.i(tVar2, basicItem, function02, nVar2, m3.i.F(i11 | 1));
                            break;
                        default:
                            a.a.i(tVar2, basicItem, function02, nVar2, m3.i.F(i11 | 1));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
            w1VarS.f29476d = function2;
        }
    }

    public static final void j(ap.n nVar, n nVar2, int i11) {
        s sVar = (s) nVar2;
        sVar.c0(646140979);
        int i12 = (sVar.h(nVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            g0 g0Var = m2.f13850c;
            sVar.a0(-1003410150);
            sVar.a0(212064437);
            sVar.q(false);
            z5.c cVar = (z5.c) sVar.j(x1.f7416h);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = new f6.s(cVar);
                sVar.k0(objM);
            }
            f6.s sVar2 = (f6.s) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new f6.l();
                sVar.k0(objM2);
            }
            f6.l lVar = (f6.l) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var = (b1) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new f6.n(lVar);
                sVar.k0(objM4);
            }
            f6.n nVar3 = (f6.n) objM4;
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                k1 k1Var = new k1(Unit.f26487a, m3.f.f29272d);
                sVar.k0(k1Var);
                objM5 = k1Var;
            }
            b1 b1Var2 = (b1) objM5;
            boolean zH = sVar.h(sVar2) | sVar.d(257);
            Object objM6 = sVar.M();
            if (zH || objM6 == fVar) {
                dp.b bVar = new dp.b(b1Var2, sVar2, nVar3, b1Var, 1);
                sVar.k0(bVar);
                objM6 = bVar;
            }
            u0 u0Var = (u0) objM6;
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = new dp.c(b1Var, nVar3, 1);
                sVar.k0(objM7);
            }
            Function0 function0 = (Function0) objM7;
            boolean zH2 = sVar.h(sVar2);
            Object objM8 = sVar.M();
            if (zH2 || objM8 == fVar) {
                objM8 = new dp.d(sVar2, 1);
                sVar.k0(objM8);
            }
            c0.a(r.c(g0Var, false, (Function1) objM8), e.e(1200550679, sVar, new dp.n(0, b1Var2, lVar, function0, nVar)), u0Var, sVar, 48);
            sVar.q(false);
            boolean zH3 = sVar.h(nVar);
            Object objM9 = sVar.M();
            if (zH3 || objM9 == fVar) {
                objM9 = new ap.h(nVar, 3);
                sVar.k0(objM9);
            }
            jf.e.a(false, (Function0) objM9, sVar, 0, 1);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dp.m(nVar, i11, 0);
        }
    }

    public static final void k(al.h hVar, Function0 function0, t tVar, n nVar, int i11) {
        t tVar2;
        long jL;
        n4.b bVarZ;
        hVar.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-313388062);
        int i12 = i11 | (sVar.d(hVar.ordinal()) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            if (hVar.a() != null) {
                sVar.a0(1115332929);
                jL = cg.l(sVar, hVar.a().intValue());
                sVar.q(false);
            } else {
                sVar.a0(1115400447);
                sVar.q(false);
                jL = i4.v.f23314g;
            }
            Integer numC = hVar.c();
            v1.a0 a0VarB = null;
            if (numC == null) {
                sVar.a0(1115474815);
                sVar.q(false);
                bVarZ = null;
            } else {
                sVar.a0(1115474816);
                bVarZ = o00.x0.z(numC.intValue(), sVar, 0);
                sVar.q(false);
            }
            l2.f fVarA = l2.g.a(50);
            if (hVar == al.h.Google) {
                sVar.a0(1115676750);
                a0VarB = v1.n.b(2, cg.l(sVar, R.color.primary_40));
                sVar.q(false);
            } else {
                sVar.a0(1115762372);
                sVar.q(false);
            }
            v1.a0 a0Var = a0VarB;
            b4.q qVar = b4.q.f5711a;
            q7.c(function0, m2.d(qVar, 1.0f), false, fVarA, jL, 0L, 0.0f, a0Var, null, e.e(744501869, sVar, new kq.c(23, bVarZ, hVar)), sVar, (i12 >> 3) & 14, 740);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(hVar, function0, tVar2, false, i11, 22);
        }
    }

    public static final void l(BasicVoucher basicVoucher, Function0 function0, n nVar, int i11) {
        BasicVoucher basicVoucher2;
        Function0 function02;
        s sVar;
        basicVoucher.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(2026339313);
        int i12 = (sVar2.f(basicVoucher) ? 4 : 2) | i11 | (sVar2.h(function0) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            x60.h hVar = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            x60.k kVar = (x60.k) sVar2.j(PantryThemeKt.getLocalPantryRadius());
            l lVar = (l) sVar2.j(PantryThemeKt.getLocalPantrySize());
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            x60.i iVar = (x60.i) sVar2.j(PantryThemeKt.getLocalPantryShadow());
            boolean zC = sVar2.c(kVar.f43977a) | sVar2.c(lVar.f43994f);
            Object objM = sVar2.M();
            if (zC || objM == m.f29332a) {
                objM = new gg.b(kVar.f43977a, lVar.f43994f);
                sVar2.k0(objM);
            }
            gg.b bVar = (gg.b) objM;
            function02 = function0;
            basicVoucher2 = basicVoucher;
            sVar = sVar2;
            s0.b(androidx.compose.foundation.b.c(f4.g.g(m2.t(m2.d(b4.q.f5711a, 1.0f), 3), bVar, iVar.f43950a), false, null, null, function0, 15), bVar, s0.p(basicVoucher.getState() == VoucherState.ACTIVE ? hVar.H : hVar.B, sVar2, 0), null, null, e.e(-15802689, sVar2, new bn.v(mVar, lVar, basicVoucher, jVar, hVar, 3)), sVar, 196608, 24);
        } else {
            basicVoucher2 = basicVoucher;
            function02 = function0;
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(basicVoucher2, function02, i11, 7);
        }
    }

    public static final void m(List list, Function1 function1, n nVar, int i11) {
        int i12;
        list.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(1685139);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(list) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            t tVarJ = v1.n.j(m2.f13850c, lv.s.f28245z, i4.g0.f23254b);
            float f11 = lv.t.f28256j;
            t tVarD = c.D(tVarJ, 0.0f, f11, 0.0f, 0.0f, 13);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
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
            b4.i iVar = b4.d.f5695n;
            b4.q qVar = b4.q.f5711a;
            t tVarD2 = m2.d(qVar, 1.0f);
            b4.k kVar = b4.d.f5684b;
            u uVar = u.f13938a;
            t tVarA = uVar.a(tVarD2, kVar);
            y yVarA = w.a(d2.i.f13803c, iVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            int i14 = 0;
            r9.d(o30.f0.U(sVar, R.string.landing_sign_in_header_uppercase), c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13), lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, m5.u0.a(v.f28264c, 0L, 0L, null, null, b0.a0.F((float) 0.02d, 8589934592L), null, 0, 0L, null, null, 16777087), sVar, 432, 0, 130040);
            sVar = sVar;
            n4.b bVarZ = o00.x0.z(2131231897, sVar, 0);
            t tVarD3 = c.D(m2.d(qVar, 1.0f), 0.0f, e0.s(sVar, R.dimen.spacing_8), 0.0f, 0.0f, 13);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = a0.g(sVar);
            }
            b2.l lVar = (b2.l) objM;
            int i15 = i13 & 112;
            boolean z11 = i15 == 32;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new defpackage.c(function1, i14);
                sVar.k0(objM2);
            }
            v1.n.d(bVarZ, null, androidx.compose.foundation.b.b(tVarD3, lVar, null, false, null, null, (Function0) objM2, 28), null, z4.l.f47169d, 0.0f, null, sVar, 24632, 104);
            sVar.q(true);
            boolean z12 = i15 == 32;
            Object objM3 = sVar.M();
            if (z12 || objM3 == fVar) {
                objM3 = new defpackage.d(function1, 0);
                sVar.k0(objM3);
            }
            z.e(i13 & 14, c.D(uVar.a(qVar, b4.d.f5690h), 0.0f, 0.0f, 0.0f, lv.t.f28253g, 7), list, (Function1) objM3, sVar);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new defpackage.e(list, function1, i11);
        }
    }

    public static final void n(u3.d dVar, nn.u uVar, nn.c cVar, n nVar, int i11) {
        uVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(-126675066);
        int i12 = i11 | (sVar.f(cVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM);
            }
            b0 b0Var = (b0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var2 = (b1) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = a0.s(0, sVar);
            }
            h1 h1Var = (h1) objM4;
            float fA = uVar.a();
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                fA = 0.0f;
            }
            t1.r rVar = t1.w.f39594b;
            s1.y.d(!((Boolean) b1Var2.getValue()).booleanValue(), null, null, r0.j(t1.c.k(1000, 0, rVar, 2), 12), null, e.e(739967918, sVar, new nn.e(cVar, t1.d.b(((Boolean) b1Var.getValue()).booleanValue() ? 0.0f : 1.0f, t1.c.k(500, 0, rVar, 2), "", null, sVar, 3072, 20), b1Var, h1Var, b0Var, b1Var2, t1.d.b(((Boolean) b1Var.getValue()).booleanValue() ? 0.0f : 24.0f, t1.c.k(500, 0, rVar, 2), "", null, sVar, 3072, 20), t1.d.b(fA, t1.c.k(500, 0, rVar, 2), "", null, sVar, 3072, 20), dVar)), sVar, 196608, 22);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(dVar, uVar, cVar, i11, 8);
        }
    }

    public static final void o(b0 b0Var, b1 b1Var, b1 b1Var2, nn.a aVar) {
        int i11 = nn.g.$EnumSwitchMapping$0[aVar.f31111e.ordinal()];
        if (i11 == 1) {
            b1Var.setValue(Boolean.TRUE);
        } else if (i11 == 2) {
            b1Var2.setValue(Boolean.TRUE);
        } else if (i11 != 3) {
            e40.a.f();
            return;
        }
        v80.f0.B(b0Var, null, null, new h2.b1(aVar, null, 17), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(java.util.List r20, kotlin.jvm.functions.Function1 r21, m3.n r22, int r23) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.p(java.util.List, kotlin.jvm.functions.Function1, m3.n, int):void");
    }

    public static final void q(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(123183297);
        if (sVar.R(i11 & 1, i11 != 0)) {
            s0.g(null, 1, lv.s.f28245z, sVar, 432, 1);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j60.a(i11, 6);
        }
    }

    public static final void r(List list, boolean z11, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-905382119);
        int i12 = (sVar.h(list) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
            int size = list.size() - 3;
            FilteredStore filteredStore = (FilteredStore) CollectionsKt.firstOrNull(list);
            String name = filteredStore != null ? filteredStore.getName() : null;
            b(z11, e.e(-992585088, sVar, new cg.s0(list, size, lVar, 0.3f * lVar.f43995g, mVar, jVar, hVar, name == null ? "" : name, z11, size > 0 ? j4.s.f(size, "+") : "")), sVar, ((i12 >> 3) & 14) | 48);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.b(list, z11, i11, 4);
        }
    }

    public static final void s(String str, String str2, boolean z11, t tVar, n nVar, int i11) {
        boolean z12;
        s sVar = (s) nVar;
        sVar.c0(1880844571);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.f(tVar) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            t tVarM = m2.m(tVar, lVar.f43995g);
            long j9 = z11 ? hVar.I : hVar.G;
            l2.f fVar = l2.g.f26790a;
            t tVarK = v1.n.k(v1.n.j(tVarM, j9, fVar), 1, z11 ? hVar.f43913e : hVar.A, fVar);
            u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarK, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            if (str.length() > 0) {
                sVar.a0(-919240146);
                gd.o.a(str, str2, f4.g.b(m2.m(b4.q.f5711a, lVar.f43995g), fVar), z4.l.f47166a, sVar, (i12 & 14) | 1572864 | (i12 & 112), 0, 1976);
                sVar.q(false);
                z12 = true;
            } else {
                sVar.a0(-918939601);
                String upperCase = kotlin.text.b0.x(1, str2).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                z12 = true;
                r9.d(upperCase, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar, 0, 0, 131066);
                sVar.q(false);
            }
            sVar.q(z12);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.c(str, str2, z11, tVar, i11);
        }
    }

    public static void t() {
        pd.g.n("Not in application's main thread", E());
    }

    public static void u(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    public static final b1 v(b2.k kVar, n nVar, int i11) {
        s sVar = (s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m.f29332a;
        if (objM == fVar) {
            objM = m3.i.w(Boolean.FALSE);
            sVar.k0(objM);
        }
        b1 b1Var = (b1) objM;
        boolean z11 = (((i11 & 14) ^ 6) > 4 && sVar.f(kVar)) || (i11 & 6) == 4;
        Object objM2 = sVar.M();
        if (z11 || objM2 == fVar) {
            objM2 = new b2.g(kVar, b1Var, null, 0);
            sVar.k0(objM2);
        }
        m3.i.h(kVar, (Function2) objM2, sVar);
        return b1Var;
    }

    public static void w(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("k");
                String strOptString2 = jSONObjectOptJSONObject.optString("v");
                strOptString.getClass();
                if (strOptString.length() != 0) {
                    CopyOnWriteArraySet copyOnWriteArraySetA = cx.c.a();
                    next.getClass();
                    List listSplit$default = StringsKt__StringsKt.split$default(strOptString, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
                    strOptString2.getClass();
                    copyOnWriteArraySetA.add(new cx.c(next, listSplit$default, strOptString2));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] x(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            jArr[i11] = iArr[i11];
        }
        return jArr;
    }

    public static void y(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i11);
            }
        }
    }

    public static void z(o8.b bVar, o8.c cVar, int i11) throws IOException {
        byte[] bArr = new byte[8192];
        while (i11 > 0) {
            int iMin = Math.min(i11, 8192);
            int i12 = bVar.read(bArr, 0, iMin);
            if (i12 != iMin) {
                i4.a.k("Failed to copy the given amount of bytes from the inputstream to the output stream.");
                return;
            } else {
                i11 -= i12;
                cVar.write(bArr, 0, i12);
            }
        }
    }
}
