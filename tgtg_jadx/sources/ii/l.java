package ii;

import a3.u1;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.s1;
import c5.a1;
import c5.m2;
import c5.v0;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.ItemState;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderChanges;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.UpdateNotificationType;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import d40.t1;
import g3.f8;
import g3.i2;
import g3.j4;
import g3.r9;
import g3.s0;
import g3.y0;
import g3.y9;
import g3.z9;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import m3.b1;
import m3.d3;
import m3.w1;
import mv.p0;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import v1.l1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f23950a = new u3.d(new i9.q(10), false, -1109213716);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f23951b = new u3.d(new m(0), false, -1874388636);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23952c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23953d = 0;

    public static final void a(b4.t tVar, CharityItem charityItem, Function1 function1, m3.n nVar, int i11) {
        charityItem.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-595801192);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11 | (sVar.h(charityItem) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.t tVarA = b4.a.a(d2.c.A(tVar, 16, 8), m2.f7291a, new bn.c0(6, function1, charityItem));
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            s0.b(d2.m2.d(tVar, 1.0f), null, s0.p(lv.s.J, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(-1732990560, sVar, new u1(10, tVar, charityItem)), sVar, 196608, 18);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(tVar, charityItem, function1, i11, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(b4.t tVar, final g9.f0 f0Var, final h hVar, final Integer num, m0 m0Var, String str, Function1 function1, j0 j0Var, m3.n nVar, final int i11, final int i12) {
        int i13;
        String str2;
        int i14;
        Function1 function12;
        int i15;
        h hVar2;
        m3.s sVar;
        b4.t tVar2;
        final m0 m0Var2;
        final j0 j0Var2;
        final String str3;
        final Function1 function13;
        char c3;
        int i16;
        final m0 m0Var3;
        List listH;
        m0 m0Var4;
        Function1 function14;
        String str4;
        v1.u uVar;
        f0Var.getClass();
        hVar.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1747237493);
        int i17 = i11 | 6 | (sVar2.h(f0Var) ? 32 : 16) | (sVar2.f(num) ? NewHope.SENDB_BYTES : 1024);
        int i18 = i12 & 16;
        if (i18 != 0) {
            i13 = i17 | 24576;
        } else {
            i13 = i17 | (sVar2.d(m0Var == null ? -1 : m0Var.ordinal()) ? 16384 : 8192);
        }
        int i19 = i12 & 32;
        if (i19 != 0) {
            i14 = i13 | 196608;
            str2 = str;
        } else {
            str2 = str;
            i14 = i13 | (sVar2.f(str2) ? 131072 : 65536);
        }
        int i21 = i12 & 64;
        if (i21 != 0) {
            i15 = i14 | 1572864;
            function12 = function1;
        } else {
            function12 = function1;
            i15 = i14 | (sVar2.h(function12) ? 1048576 : 524288);
        }
        int i22 = i15 | 4194304;
        if (sVar2.R(i22 & 1, (4793491 & i22) != 4793490)) {
            sVar2.W();
            int i23 = i11 & 1;
            m3.f fVar = m3.m.f29332a;
            if (i23 == 0 || sVar2.z()) {
                m0 m0Var5 = i18 != 0 ? null : m0Var;
                if (i19 != 0) {
                    str2 = null;
                }
                if (i21 != 0) {
                    Object objM = sVar2.M();
                    if (objM == fVar) {
                        objM = new hb0.q(23);
                        sVar2.k0(objM);
                    }
                    function12 = (Function1) objM;
                }
                s1 s1VarA = z8.a.a(sVar2);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c3 = 1;
                i16 = i22 & (-29360129);
                m0Var3 = m0Var5;
                j0Var2 = (j0) t1.K(Reflection.getOrCreateKotlinClass(j0.class), s1VarA, o30.e0.r(s1VarA, sVar2), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar2);
                tVar2 = b4.q.f5711a;
            } else {
                sVar2.U();
                i16 = i22 & (-29360129);
                tVar2 = tVar;
                m0Var3 = m0Var;
                j0Var2 = j0Var;
                c3 = 1;
            }
            final String str5 = str2;
            final Function1 function15 = function12;
            sVar2.r();
            b1 b1VarN = m3.i.n(j0Var2.f23931m, sVar2, 0);
            if (((Boolean) m3.i.n(j0Var2.f23937s, sVar2, 0).getValue()).booleanValue()) {
                w1 w1VarS = sVar2.s();
                if (w1VarS != null) {
                    final b4.t tVar3 = tVar2;
                    final int i24 = 0;
                    w1VarS.f29476d = new Function2(tVar3, f0Var, hVar, num, m0Var3, str5, function15, j0Var2, i11, i12, i24) { // from class: ii.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f23869a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b4.t f23870b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ g9.f0 f23871c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ h f23872d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ Integer f23873e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ m0 f23874f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ String f23875g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ Function1 f23876h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ j0 f23877i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ int f23878j;

                        {
                            this.f23869a = i24;
                            this.f23878j = i12;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f23869a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iF = m3.i.F(385);
                                    l.b(this.f23870b, this.f23871c, this.f23872d, this.f23873e, this.f23874f, this.f23875g, this.f23876h, this.f23877i, (m3.n) obj, iF, this.f23878j);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iF2 = m3.i.F(385);
                                    l.b(this.f23870b, this.f23871c, this.f23872d, this.f23873e, this.f23874f, this.f23875g, this.f23876h, this.f23877i, (m3.n) obj, iF2, this.f23878j);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    return;
                }
                return;
            }
            List list = (List) b1VarN.getValue();
            if (list == null || list.isEmpty()) {
                h[] hVarArr = new h[2];
                hVarArr[0] = e.INSTANCE;
                hVarArr[c3] = g.INSTANCE;
                listH = kotlin.collections.d0.h(hVarArr);
            } else {
                h[] hVarArr2 = new h[3];
                hVarArr2[0] = e.INSTANCE;
                hVarArr2[c3] = f.INSTANCE;
                hVarArr2[2] = g.INSTANCE;
                listH = kotlin.collections.d0.h(hVarArr2);
            }
            List list2 = listH;
            l1 l1Var = v1.p.f41813a;
            boolean zF = sVar2.f(l1Var);
            Object objM2 = sVar2.M();
            if (zF || objM2 == fVar) {
                objM2 = new v1.u(l1Var);
                sVar2.k0(objM2);
            }
            v1.u uVar2 = (v1.u) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM3);
            }
            v80.b0 b0Var = (v80.b0) objM3;
            boolean z11 = ((57344 & i16) == 16384 ? c3 : (char) 0) | ((458752 & i16) == 131072 ? c3 : (char) 0);
            if ((i16 & 3670016) != 1048576) {
                c3 = 0;
            }
            boolean z12 = z11 | c3 | (sVar2.h(b0Var) ? 1 : 0) | (sVar2.f(uVar2) ? 1 : 0);
            Object objM4 = sVar2.M();
            if (z12 != 0 || objM4 == fVar) {
                m0 m0Var6 = m0Var3;
                objM4 = new af.b(m0Var6, function15, str5, uVar2, b0Var, (x70.c) null, 5);
                m0Var4 = m0Var6;
                function14 = function15;
                str4 = str5;
                uVar = uVar2;
                sVar2.k0(objM4);
            } else {
                uVar = uVar2;
                m0Var4 = m0Var3;
                function14 = function15;
                str4 = str5;
            }
            m3.i.g(str4, m0Var4, (Function2) objM4, sVar2);
            m0Var2 = m0Var4;
            String str6 = str4;
            v1.u uVar3 = uVar;
            sVar = sVar2;
            j4.a(f4.g.k(tVar2, 3, null, false, 0L, 0L, 30), cg.l(sVar2, R.color.white), 0L, 0.0f, null, u3.e.e(-211172772, sVar2, new cn.x(4, list2, hVar, f0Var, num)), sVar, 196608);
            if (m0Var2 != null) {
                hVar2 = hVar;
                if (Intrinsics.areEqual(hVar2, e.INSTANCE)) {
                    sVar.a0(1247940629);
                    float f11 = z9.f19906a;
                    int iQ0 = ((z5.c) sVar.j(x1.f7416h)).q0(0);
                    boolean zD = sVar.d(iQ0);
                    Object objM5 = sVar.M();
                    if (zD || objM5 == fVar) {
                        objM5 = new y9(iQ0);
                        sVar.k0(objM5);
                    }
                    v1.n.a((y9) objM5, u3.e.e(1027134929, sVar, new gn.i(14, m0Var2, uVar3)), uVar3, null, false, false, sVar, 1572912);
                    sVar.q(false);
                }
                function13 = function14;
                str3 = str6;
            } else {
                hVar2 = hVar;
            }
            sVar.a0(1248277165);
            sVar.q(false);
            function13 = function14;
            str3 = str6;
        } else {
            hVar2 = hVar;
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
            m0Var2 = m0Var;
            j0Var2 = j0Var;
            str3 = str2;
            function13 = function12;
        }
        w1 w1VarS2 = sVar.s();
        if (w1VarS2 != null) {
            final b4.t tVar4 = tVar2;
            final int i25 = 1;
            final h hVar3 = hVar2;
            w1VarS2.f29476d = new Function2(tVar4, f0Var, hVar3, num, m0Var2, str3, function13, j0Var2, i11, i12, i25) { // from class: ii.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f23869a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b4.t f23870b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g9.f0 f23871c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ h f23872d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Integer f23873e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ m0 f23874f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String f23875g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function1 f23876h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ j0 f23877i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ int f23878j;

                {
                    this.f23869a = i25;
                    this.f23878j = i12;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f23869a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iF = m3.i.F(385);
                            l.b(this.f23870b, this.f23871c, this.f23872d, this.f23873e, this.f23874f, this.f23875g, this.f23876h, this.f23877i, (m3.n) obj, iF, this.f23878j);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iF2 = m3.i.F(385);
                            l.b(this.f23870b, this.f23871c, this.f23872d, this.f23873e, this.f23874f, this.f23875g, this.f23876h, this.f23877i, (m3.n) obj, iF2, this.f23878j);
                            break;
                    }
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void c(ArrayList arrayList, Activity activity, m3.n nVar, int i11) {
        int i12;
        Activity activity2;
        Activity activity3;
        float f11;
        b4.q qVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1638000070);
        int i13 = i11 | (sVar.h(arrayList) ? 4 : 2) | 16;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                activity3 = (Activity) sVar.j(e.k.f15295a);
            } else {
                sVar.U();
                activity3 = activity;
            }
            sVar.r();
            if (arrayList.isEmpty()) {
                activity2 = activity3;
                i12 = 1;
                sVar.a0(1759818792);
                sVar.q(false);
            } else {
                sVar.a0(1758548350);
                String strU = o30.f0.U(sVar, R.string.charity_home_title_cancelled_reservations);
                m5.u0 u0Var = lv.v.f28275o;
                long j9 = lv.s.C;
                float f12 = 16;
                b4.q qVar2 = b4.q.f5711a;
                float f13 = f12;
                activity2 = activity3;
                b4.q qVar3 = qVar2;
                i12 = 1;
                r9.d(strU, d2.c.C(qVar2, f12, 24, f12, 8), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                sVar = sVar;
                int i14 = 0;
                for (Object obj : arrayList) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.d0.n();
                        throw null;
                    }
                    OrderChanges orderChanges = (OrderChanges) obj;
                    boolean zH = sVar.h(activity2) | sVar.h(orderChanges);
                    Object objM = sVar.M();
                    if (zH || objM == m3.m.f29332a) {
                        objM = new u(activity2, orderChanges, i12);
                        sVar.k0(objM);
                    }
                    l(orderChanges, (Function0) objM, sVar, 0);
                    if (i14 != arrayList.size() - 1) {
                        sVar.a0(1266440303);
                        f11 = f13;
                        qVar = qVar3;
                        s0.g(d2.c.B(qVar, f11, 0.0f, 2), 1, lv.s.H, sVar, 438, 0);
                        sVar.q(false);
                    } else {
                        f11 = f13;
                        qVar = qVar3;
                        sVar.a0(1266651723);
                        sVar.q(false);
                    }
                    i14 = i15;
                    qVar3 = qVar;
                    f13 = f11;
                }
                sVar.q(false);
            }
        } else {
            i12 = 1;
            sVar.U();
            activity2 = activity;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(arrayList, activity2, i11, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final b4.t r18, final int r19, final java.lang.String r20, java.lang.String r21, final kotlin.jvm.functions.Function0 r22, kotlin.jvm.functions.Function0 r23, boolean r24, m3.n r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ii.l.d(b4.t, int, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, m3.n, int, int):void");
    }

    public static final void e(int i11, int i12, int i13, b4.t tVar, m3.n nVar) {
        int i14;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-53384716);
        if ((i13 & 6) == 0) {
            i14 = i13 | (sVar.f(tVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        int i15 = i14 | (sVar.d(i11) ? 32 : 16) | (sVar.d(i12) ? 256 : 128);
        if (sVar.R(i15 & 1, (i15 & 147) != 146)) {
            d2.y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            long j9 = i4.v.f23315h;
            n4.b bVarZ = x0.z(i11, sVar, (i15 >> 3) & 14);
            b4.q qVar = b4.q.f5711a;
            i2.a(bVarZ, null, d2.m2.m(qVar, 133), j9, sVar, 3512, 0);
            r9.d(o30.f0.U(sVar, i12), d2.c.z(qVar, lv.t.f28255i), lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 432, 12582912, 130040);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new k(tVar, i11, i12, i13, 0);
        }
    }

    public static final void f(LifecycleOwner lifecycleOwner, Function2 function2, m3.n nVar, int i11) {
        function2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1668117222);
        int i12 = i11 | 2 | (sVar.h(function2) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                lifecycleOwner = (LifecycleOwner) sVar.j(w8.g.f43289a);
            } else {
                sVar.U();
            }
            int i13 = i12 & (-15);
            sVar.r();
            boolean zH = sVar.h(lifecycleOwner) | ((i13 & 112) == 32);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new hb0.o(10, lifecycleOwner, function2);
                sVar.k0(objM);
            }
            m3.i.d(lifecycleOwner, (Function1) objM, sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(lifecycleOwner, function2, i11, 15);
        }
    }

    public static final void g(String str, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1190800345);
        int i12 = i11 | (sVar.f(str) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            a1 a1Var = p0.f30209a;
            str.getClass();
            String str2 = YearMonth.parse(str).format(DateTimeFormatter.ofPattern("MMM yyyy", Locale.getDefault()));
            if (str2 != null) {
                sVar.a0(1296899101);
                d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
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
                float f11 = 16;
                r9.d(str2, d2.c.D(qVar, f11, f11, 0.0f, 8, 4), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28277q, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                sVar = sVar;
                sVar.q(true);
                sVar.q(false);
            } else {
                sVar.a0(1297266203);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.h0(str, i11, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ab A[EDGE_INSN: B:191:0x02ab->B:146:0x02ab BREAK  A[LOOP:3: B:137:0x0282->B:145:0x02a8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(b4.t r29, final android.app.Activity r30, final ii.j0 r31, final kotlin.jvm.functions.Function1 r32, final kotlin.jvm.functions.Function0 r33, kotlin.jvm.functions.Function1 r34, final kotlin.jvm.functions.Function0 r35, final kotlin.jvm.functions.Function0 r36, final kotlin.jvm.functions.Function1 r37, m3.n r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ii.l.h(b4.t, android.app.Activity, ii.j0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, m3.n, int):void");
    }

    public static final void i(b4.t tVar, Activity activity, j0 j0Var, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function0 function03, Function1 function13, m3.n nVar, int i11) {
        Activity activity2;
        j0 j0Var2;
        Activity activity3;
        j0 j0Var3;
        int i12;
        function1.getClass();
        function0.getClass();
        function12.getClass();
        function02.getClass();
        function03.getClass();
        function13.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1680639581);
        int i13 = i11 | (sVar.f(tVar) ? 4 : 2) | 144 | (sVar.h(function1) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(function12) ? 131072 : 65536) | (sVar.h(function02) ? 1048576 : 524288) | (sVar.h(function03) ? 8388608 : 4194304);
        if (sVar.R(i13 & 1, (38347923 & i13) != 38347922)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                activity3 = (Activity) sVar.j(e.k.f15295a);
                s1 s1VarA = z8.a.a(sVar);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    j0Var3 = (j0) t1.K(Reflection.getOrCreateKotlinClass(j0.class), s1VarA, o30.e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
                    i12 = i13 & (-1009);
                }
            } else {
                sVar.U();
                i12 = i13 & (-1009);
                activity3 = activity;
                j0Var3 = j0Var;
            }
            sVar.r();
            b1 b1VarN = m3.i.n(j0Var3.f23937s, sVar, 0);
            Boolean bool = Boolean.TRUE;
            boolean zH = sVar.h(j0Var3) | sVar.h(activity3);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            x70.c cVar = null;
            if (zH || objM == fVar) {
                objM = new gf.g(j0Var3, activity3, cVar, 14);
                sVar.k0(objM);
            }
            m3.i.h(bool, (Function2) objM, sVar);
            boolean zH2 = sVar.h(j0Var3);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new y0(j0Var3, 20);
                sVar.k0(objM2);
            }
            f(null, (Function2) objM2, sVar, 0);
            if (((Boolean) b1VarN.getValue()).booleanValue()) {
                j4.s.y(1501044457, 0, sVar, sVar, false);
            } else {
                sVar.a0(1501091391);
                h(tVar, activity3, j0Var3, function1, function0, function12, function02, function03, function13, sVar, i12 & 268435454);
                sVar.q(false);
            }
            activity2 = activity3;
            j0Var2 = j0Var3;
        } else {
            sVar.U();
            activity2 = activity;
            j0Var2 = j0Var;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.u(tVar, activity2, j0Var2, function1, function0, function12, function02, function03, function13, i11);
        }
    }

    public static final void j(ArrayList arrayList, Activity activity, m3.n nVar, int i11) {
        int i12;
        Activity activity2;
        Activity activity3;
        int i13;
        float f11;
        b4.q qVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1738065570);
        int i14 = i11 | (sVar.h(arrayList) ? 4 : 2) | 16;
        if (sVar.R(i14 & 1, (i14 & 19) != 18)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                activity3 = (Activity) sVar.j(e.k.f15295a);
            } else {
                sVar.U();
                activity3 = activity;
            }
            sVar.r();
            if (arrayList.isEmpty()) {
                activity2 = activity3;
                i12 = 0;
                sVar.a0(-1412870432);
                sVar.q(false);
            } else {
                sVar.a0(-1414123576);
                String strU = o30.f0.U(sVar, R.string.charity_home_title_ready_collection);
                m5.u0 u0Var = lv.v.f28275o;
                long j9 = lv.s.C;
                float f12 = 16;
                b4.q qVar2 = b4.q.f5711a;
                float f13 = f12;
                activity2 = activity3;
                b4.q qVar3 = qVar2;
                r9.d(strU, d2.c.C(qVar2, f12, 24, f12, 8), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                sVar = sVar;
                int i15 = 0;
                for (Object obj : arrayList) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        kotlin.collections.d0.n();
                        throw null;
                    }
                    OrderChanges orderChanges = (OrderChanges) obj;
                    boolean zH = sVar.h(activity2) | sVar.h(orderChanges);
                    Object objM = sVar.M();
                    if (zH || objM == m3.m.f29332a) {
                        i13 = 0;
                        objM = new u(activity2, orderChanges, i13);
                        sVar.k0(objM);
                    } else {
                        i13 = 0;
                    }
                    l(orderChanges, (Function0) objM, sVar, i13);
                    if (i15 != arrayList.size() - 1) {
                        sVar.a0(1692609249);
                        f11 = f13;
                        qVar = qVar3;
                        s0.g(d2.c.B(qVar, f11, 0.0f, 2), 1, lv.s.H, sVar, 438, 0);
                        sVar.q(false);
                    } else {
                        f11 = f13;
                        qVar = qVar3;
                        sVar.a0(1692820669);
                        sVar.q(false);
                    }
                    i15 = i16;
                    qVar3 = qVar;
                    f13 = f11;
                }
                i12 = 0;
                sVar.q(false);
            }
        } else {
            i12 = 0;
            sVar.U();
            activity2 = activity;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(arrayList, activity2, i11, i12);
        }
    }

    public static final void k(boolean z11, boolean z12, Function0 function0, Function0 function02, Function0 function03, Function0 function04, m3.n nVar, int i11) {
        int i12;
        float f11;
        int i13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(480971721);
        int i14 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.g(z12) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.h(function02) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function03) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(function04) ? 131072 : 65536);
        if (sVar.R(i14 & 1, (74899 & i14) != 74898)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = s1.b0.a(d2.m2.d(qVar, 1.0f), null, 3);
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
            String strU = o30.f0.U(sVar, R.string.charity_home_recommended_actions);
            m5.u0 u0Var = lv.v.f28272k;
            long j9 = lv.s.C;
            float f12 = lv.t.f28254h;
            float f13 = lv.t.f28253g;
            r9.d(strU, d2.c.D(qVar, f13, f12, 0.0f, f13, 4), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            b4.t tVarR = v1.n.r(d2.m2.d(qVar, 1.0f), v1.n.q(sVar), false);
            if (!z11 || !z12) {
                tVarR = qVar;
            }
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarR, sVar);
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
            if (z11) {
                sVar.a0(-857288399);
                f11 = f13;
                int i15 = ((i14 << 6) & 57344) | 6 | ((i14 << 3) & 458752);
                i12 = 458752;
                i13 = 2;
                d(d2.m2.d(d2.c.B(qVar, f11, 0.0f, 2), 1.0f), R.drawable.ic_calendar_collection_days, o30.f0.U(sVar, R.string.charity_home_action_review_collection_days), o30.f0.U(sVar, R.string.charity_home_action_review_collection_days_desc), function0, function03, !z12, sVar, i15, 0);
                sVar.q(false);
            } else {
                i12 = 458752;
                f11 = f13;
                i13 = 2;
                sVar.a0(-856688301);
                sVar.q(false);
            }
            if (z12) {
                sVar.a0(-856607019);
                d(d2.m2.d(d2.c.B(qVar, f11, 0.0f, i13), 1.0f), R.drawable.ic_notification_enable, o30.f0.U(sVar, R.string.charity_home_action_enable_notifications), o30.f0.U(sVar, R.string.charity_home_action_enable_notifications_desc), function02, function04, !z11, sVar, ((i14 << 3) & 57344) | 6 | (i14 & i12), 0);
                sVar.q(false);
            } else {
                sVar.a0(-856010765);
                sVar.q(false);
            }
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f8(z11, z12, function0, function02, function03, function04, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(com.app.tgtg.model.remote.order.OrderChanges r49, kotlin.jvm.functions.Function0 r50, m3.n r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ii.l.l(com.app.tgtg.model.remote.order.OrderChanges, kotlin.jvm.functions.Function0, m3.n, int):void");
    }

    public static final void m(List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-984594740);
        int i12 = (sVar.h(list) ? 4 : 2) | i11 | (sVar.h(arrayList) ? 32 : 16) | (sVar.h(arrayList2) ? 256 : 128) | (sVar.h(arrayList3) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zIsEmpty = list.isEmpty();
            int i13 = 6;
            b4.q qVar = b4.q.f5711a;
            if (zIsEmpty) {
                sVar.a0(-1729479577);
                e(R.drawable.ic_reserved_donations_empty_state, R.string.charity_home_empty_reserved_donations, 6, d2.c.B(qVar, lv.t.f28253g, 0.0f, 2), sVar);
                sVar.q(false);
            } else {
                sVar.a0(-1729983048);
                s0.b(d2.c.A(qVar, lv.t.f28253g, lv.t.f28251e), null, s0.p(lv.s.J, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(1961771929, sVar, new ap.e(arrayList, arrayList2, arrayList3, i13)), sVar, 196614, 18);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(list, arrayList, i11, arrayList2, arrayList3, 15);
        }
    }

    public static final void n(m0 m0Var, Function0 function0, m3.n nVar, int i11) {
        char c3;
        char c7;
        int i12;
        int i13;
        int i14;
        String strJ;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1186979846);
        int i15 = i11 | (sVar.d(m0Var.ordinal()) ? 4 : 2) | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i15 & 1, (i15 & 19) != 18)) {
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar, 0);
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
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarD = d2.m2.d(qVar, 1.0f);
            float f11 = lv.t.f28251e;
            b4.t tVarZ = d2.c.z(v1.n.j(d2.m2.t(d2.c.B(tVarD, f11, 0.0f, 2), 3), lv.s.C, l2.g.b(lv.t.f28252f)), lv.t.f28253g);
            d2.y yVarA2 = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarZ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            b4.t tVarD2 = d2.m2.d(qVar, 1.0f);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            int[] iArr = l0.$EnumSwitchMapping$0;
            int i16 = iArr[m0Var.ordinal()];
            if (i16 != 1) {
                c3 = 2;
                if (i16 != 2) {
                    c7 = 3;
                    if (i16 != 3) {
                        e40.a.f();
                        return;
                    }
                    i12 = R.string.charity_notifications_tooltip_title;
                } else {
                    c7 = 3;
                    i12 = R.string.charity_collection_days_tooltip_title;
                }
            } else {
                c3 = 2;
                c7 = 3;
                i12 = R.string.charity_weekly_tooltip_title;
            }
            String strU = o30.f0.U(sVar, i12);
            m5.u0 u0Var = lv.v.f28275o;
            long j9 = lv.s.J;
            b4.k kVar = b4.d.f5686d;
            d2.u uVar = d2.u.f13938a;
            r9.d(strU, uVar.a(qVar, kVar), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            i2.a(x0.z(R.drawable.ic_close24, sVar, 0), null, b4.a.a(uVar.a(qVar, b4.d.f5688f), m2.f7291a, new bm.f(17, function0)), j9, sVar, 3128, 0);
            sVar.q(true);
            b4.t tVarU = d2.m2.u(d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13), null, 3);
            int i17 = iArr[m0Var.ordinal()];
            if (i17 != 1) {
                i13 = 2;
                if (i17 == 2) {
                    i14 = R.string.charity_manage_tooltip_text;
                } else {
                    if (i17 != 3) {
                        e40.a.f();
                        return;
                    }
                    i14 = R.string.charity_notifications_tooltip_text;
                }
            } else {
                i13 = 2;
                i14 = R.string.charity_weekly_tooltip_text;
            }
            String strU2 = o30.f0.U(sVar, i14);
            sVar.a0(-1963291164);
            StringBuilder sb2 = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            String strU3 = o30.f0.U(sVar, R.string.charity_modify_tooltip_text_directions_account);
            int i18 = iArr[m0Var.ordinal()];
            if (i18 == 1 || i18 == i13) {
                strJ = b3.i.j(-73847294, R.string.charity_modify_tooltip_text_directions_collection_days, sVar, sVar, false);
            } else {
                if (i18 != 3) {
                    throw e0.f.v(sVar, -73849231, false);
                }
                strJ = b3.i.j(-73842297, R.string.charity_notifications_tooltip_text_directions_notifications, sVar, sVar, false);
            }
            int iG = StringsKt.G(strU2, strU3, 0, false, 6);
            int length = strU3.length() + iG;
            int iG2 = StringsKt.G(strU2, strJ, 0, false, 6);
            int length2 = strJ.length() + iG2;
            sb2.append(strU2);
            long j11 = lv.s.f28227g;
            arrayList.add(new m5.d(new m5.l0(j11, 0L, (q5.r) null, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, 65534), iG, length, 8));
            arrayList.add(new m5.d(new m5.l0(j11, 0L, (q5.r) null, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, 65534), iG2, length2, 8));
            String string = sb2.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                arrayList2.add(((m5.d) arrayList.get(i19)).a(sb2.length()));
            }
            m5.h hVar2 = new m5.h(string, arrayList2);
            sVar.q(false);
            r9.e(hVar2, tVarU, j9, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, lv.v.f28274n, sVar, 432, 100663296, 262136);
            sVar.q(true);
            v1.n.d(x0.z(R.drawable.triangle_black, sVar, 0), "Triangle", d2.m2.u(d2.c.D(b3.i.f(b4.d.f5696o, f4.g.i(qVar, 180.0f)), lv.t.f28257k, 0.0f, 0.0f, 0.0f, 14), null, 3), null, null, 0.0f, null, sVar, 56, 120);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(m0Var, function0, i11, 17);
        }
    }

    public static final void o(ArrayList arrayList, Activity activity, m3.n nVar, int i11) {
        int i12;
        Activity activity2;
        Activity activity3;
        float f11;
        b4.q qVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(726438075);
        int i13 = i11 | (sVar.h(arrayList) ? 4 : 2) | 16;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                activity3 = (Activity) sVar.j(e.k.f15295a);
            } else {
                sVar.U();
                activity3 = activity;
            }
            sVar.r();
            if (arrayList.isEmpty()) {
                activity2 = activity3;
                i12 = 2;
                sVar.a0(-1022042073);
                sVar.q(false);
            } else {
                sVar.a0(-1023303866);
                String strU = o30.f0.U(sVar, R.string.charity_home_title_upcoming_collection);
                m5.u0 u0Var = lv.v.f28275o;
                long j9 = lv.s.C;
                float f12 = 16;
                b4.q qVar2 = b4.q.f5711a;
                float f13 = f12;
                activity2 = activity3;
                i12 = 2;
                b4.q qVar3 = qVar2;
                r9.d(strU, d2.c.C(qVar2, f12, 24, f12, 8), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                sVar = sVar;
                int i14 = 0;
                for (Object obj : arrayList) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.d0.n();
                        throw null;
                    }
                    OrderChanges orderChanges = (OrderChanges) obj;
                    boolean zH = sVar.h(activity2) | sVar.h(orderChanges);
                    Object objM = sVar.M();
                    if (zH || objM == m3.m.f29332a) {
                        objM = new u(activity2, orderChanges, i12);
                        sVar.k0(objM);
                    }
                    l(orderChanges, (Function0) objM, sVar, 0);
                    if (i14 != arrayList.size() - 1) {
                        sVar.a0(782227310);
                        f11 = f13;
                        qVar = qVar3;
                        s0.g(d2.c.B(qVar, f11, 0.0f, 2), 1, lv.s.H, sVar, 438, 0);
                        sVar.q(false);
                    } else {
                        f11 = f13;
                        qVar = qVar3;
                        sVar.a0(782438730);
                        sVar.q(false);
                    }
                    i14 = i15;
                    qVar3 = qVar;
                    f13 = f11;
                }
                sVar.q(false);
            }
        } else {
            i12 = 2;
            sVar.U();
            activity2 = activity;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(arrayList, activity2, i11, i12);
        }
    }

    public static final void p(UpdateNotificationType updateNotificationType, m3.n nVar, int i11) {
        int i12;
        String strJ;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1177976233);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(updateNotificationType.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
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
            float f11 = 8;
            d2.p.a(v1.n.j(d2.m2.m(qVar, f11), (updateNotificationType == UpdateNotificationType.CANCELLED_BY_CHARITY || updateNotificationType == UpdateNotificationType.CANCELLED_BY_STORE) ? lv.s.f28231k : lv.s.f28218b0, l2.g.f26790a), sVar, 0);
            b4.t tVarA = d2.c.A(qVar, f11, 2);
            int i13 = k0.$EnumSwitchMapping$0[updateNotificationType.ordinal()];
            if (i13 == 1) {
                strJ = b3.i.j(-1035102103, R.string.charity_home_update_inventory, sVar, sVar, false);
            } else if (i13 == 2) {
                strJ = b3.i.j(-1035098300, R.string.charity_home_update_time, sVar, sVar, false);
            } else if (i13 == 3 || i13 == 4) {
                strJ = b3.i.j(-1035092791, R.string.charity_home_update_cancelled, sVar, sVar, false);
            } else {
                sVar.a0(-2023024196);
                sVar.q(false);
                sa0.a.f38953a.c("Unexpected UpdateNotificationType: " + updateNotificationType, new Object[0]);
                strJ = "";
            }
            r9.d(strJ, tVarA, lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(updateNotificationType, i11, 11);
        }
    }

    public static final boolean q(Order order) {
        order.getClass();
        return order.getState() == OrderState.CANCELLED || order.getState() == OrderState.REFUNDED_OR_CANCELLED;
    }

    public static final String r(BasicItem basicItem, m3.n nVar) {
        String strT;
        basicItem.getClass();
        if (mv.d.j(basicItem) == ItemState.INACTIVE_TODAY || mv.d.l(basicItem).getIntervalStart() == null || mv.d.l(basicItem).getIntervalEnd() == null) {
            m3.s sVar = (m3.s) nVar;
            return b3.i.j(1134012911, R.string.charity_pickup_unavailable, sVar, sVar, false);
        }
        m3.s sVar2 = (m3.s) nVar;
        sVar2.a0(1134116544);
        if (p0.A(mv.d.l(basicItem).getIntervalStart())) {
            sVar2.a0(1560607062);
            strT = o30.f0.T(R.string.charity_pickup_time_today, new Object[]{p0.u((Context) sVar2.j(v0.f7390b), mv.d.l(basicItem))}, sVar2);
            sVar2.q(false);
        } else if (p0.C(mv.d.l(basicItem).getIntervalStart())) {
            sVar2.a0(1560614905);
            strT = o30.f0.T(R.string.charity_pickup_time_tomorrow, new Object[]{p0.u((Context) sVar2.j(v0.f7390b), mv.d.l(basicItem))}, sVar2);
            sVar2.q(false);
        } else {
            sVar2.a0(1560621875);
            d3 d3Var = v0.f7390b;
            strT = o30.f0.T(R.string.charity_pickup_time_date, new Object[]{p0.e((Context) sVar2.j(d3Var), mv.d.l(basicItem).getIntervalStart()), p0.u((Context) sVar2.j(d3Var), mv.d.l(basicItem))}, sVar2);
            sVar2.q(false);
        }
        sVar2.q(false);
        return strT;
    }
}
