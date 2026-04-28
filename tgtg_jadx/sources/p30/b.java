package p30;

import a3.t0;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.view.ViewCompat;
import androidx.credentials.internal.FrameworkClassParsingException;
import ax.a0;
import ax.c0;
import ax.h0;
import b4.q;
import b4.t;
import b5.j;
import b5.l1;
import b5.r1;
import b5.s1;
import bx.r;
import bx.u;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.OrderType;
import com.google.common.util.concurrent.ListenableFuture;
import d2.h2;
import d2.i2;
import d2.m2;
import f2.e0;
import g3.a2;
import g3.r9;
import g3.w2;
import i4.g0;
import ib.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import jb.p;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.y;
import lv.v;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o00.q1;
import o30.f0;
import o30.m0;
import on.l;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tx.n0;
import v80.b0;
import v80.b1;
import x5.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f34205b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f34206c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f34207d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f34208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34209f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f34210g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f34211h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f34212i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34213a;

    public /* synthetic */ b(int i11) {
        this.f34213a = i11;
    }

    public static final void A(Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            w.d().a(p.f24916a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = p.f24917b;
            int iA = w0.a(strArr.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            for (Map.Entry entry : x0.h(linkedHashMap, new Pair(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        w.d().g(p.f24916a, "Over-writing contents of " + file2);
                    }
                    w.d().a(p.f24916a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q90.g B(q90.t r24) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p30.b.B(q90.t):q90.g");
    }

    public static final JSONObject C(String str) {
        File fileT = t();
        if (fileT != null && str != null) {
            try {
                return new JSONObject(n0.F(new FileInputStream(new File(fileT, str))));
            } catch (Exception unused) {
                p(str);
            }
        }
        return null;
    }

    public static final void D(String str, JSONArray jSONArray, c0 c0Var) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectN = n0.n();
            if (jSONObjectN != null) {
                Iterator<String> itKeys = jSONObjectN.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectN.get(next));
                }
            }
            String str2 = h0.f4915j;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            qb.e.z(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{a0.b()}, 1)), jSONObject, c0Var).d();
        } catch (JSONException unused) {
        }
    }

    public static final void E(View view, boolean z11) {
        view.getClass();
        view.setVisibility(z11 ? 0 : 8);
    }

    public static final void F(String str, String str2) {
        File fileT = t();
        if (fileT == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileT, str));
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static final b1 G(q1 q1Var) {
        q1Var.getClass();
        try {
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(Integer.MAX_VALUE));
            scheduledExecutorServiceUnconfigurableScheduledExecutorService.getClass();
            return new b1(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
        } catch (IllegalArgumentException e5) {
            if (q1Var != q1.zzc) {
                throw e5;
            }
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService2 = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(Integer.MAX_VALUE));
            scheduledExecutorServiceUnconfigurableScheduledExecutorService2.getClass();
            return new b1(scheduledExecutorServiceUnconfigurableScheduledExecutorService2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r67, java.util.List r68, yn.g r69, kotlin.jvm.functions.Function0 r70, kotlin.jvm.functions.Function0 r71, kotlin.jvm.functions.Function0 r72, m3.n r73, int r74) {
        /*
            Method dump skipped, instruction units count: 2931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p30.b.a(int, java.util.List, yn.g, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, m3.n, int):void");
    }

    public static final boolean b(m3.b1 b1Var) {
        return ((Boolean) b1Var.getValue()).booleanValue();
    }

    public static final void c(m3.b1 b1Var, boolean z11) {
        b1Var.setValue(Boolean.valueOf(z11));
    }

    public static final void d(t tVar, jd.f fVar, String str, List list, String str2, boolean z11, n nVar, int i11) {
        int i12;
        fVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(1509334340);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(tVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(fVar) : sVar.h(fVar) ? 32 : 16;
        }
        int i13 = i12 | (sVar.f(str) ? 256 : 128) | (sVar.h(list) ? NewHope.SENDB_BYTES : 1024) | (sVar.f(str2) ? 16384 : 8192) | (sVar.g(z11) ? 131072 : 65536);
        if (sVar.R(i13 & 1, (74899 & i13) != 74898)) {
            f2.c0 c0VarA = e0.a(0, 0, 0, 3, sVar);
            t tVarR = d2.c.r(v1.n.j(tVar, lv.s.J, g0.f23254b).then(m2.f13850c));
            b4.i iVar = b4.d.f5695n;
            d2.b bVar = d2.i.f13801a;
            d2.g gVarG = d2.i.g(lv.t.f28251e);
            boolean zH = ((i13 & 112) == 32 || ((i13 & 64) != 0 && sVar.h(fVar))) | ((i13 & 896) == 256) | ((57344 & i13) == 16384) | sVar.h(list) | ((i13 & 458752) == 131072);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                w2 w2Var = new w2(str, list, str2, fVar, z11, 4);
                sVar.k0(w2Var);
                objM = w2Var;
            }
            ox.h.c(tVarR, c0VarA, null, gVarG, iVar, null, false, null, (Function1) objM, sVar, 221184, 460);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g3.e0(tVar, fVar, str, list, str2, z11, i11);
        }
    }

    public static final void e(List list, b0 b0Var, Function1 function1, Function1 function12, n nVar, int i11) {
        int i12;
        List list2;
        b0 b0Var2;
        Function1 function13;
        Function1 function14;
        b0Var.getClass();
        function1.getClass();
        function12.getClass();
        s sVar = (s) nVar;
        sVar.c0(1912700278);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(b0Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function1) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function12) ? 2048 : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zH = sVar.h(list) | ((i12 & 896) == 256) | sVar.h(b0Var) | ((i12 & 7168) == 2048);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                list2 = list;
                b0Var2 = b0Var;
                function13 = function1;
                function14 = function12;
                co.n nVar2 = new co.n(list2, function13, b0Var2, function14, (x70.c) null);
                sVar.k0(nVar2);
                objM = nVar2;
            } else {
                list2 = list;
                b0Var2 = b0Var;
                function13 = function1;
                function14 = function12;
            }
            m3.i.h(list2, (Function2) objM, sVar);
        } else {
            list2 = list;
            b0Var2 = b0Var;
            function13 = function1;
            function14 = function12;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(list2, b0Var2, i11, function13, function14, 6);
        }
    }

    public static final r8.b f(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return new r8.b(new float[]{f11, f12, f13, f14, f15, f16, f17, f18});
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x039b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(b4.t r37, f2.c0 r38, final d2.z1 r39, final boolean r40, final boolean r41, final z1.l1 r42, final boolean r43, final v1.o1 r44, b4.e r45, d2.h r46, b4.j r47, d2.f r48, final kotlin.jvm.functions.Function1 r49, m3.n r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instruction units count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p30.b.g(b4.t, f2.c0, d2.z1, boolean, boolean, z1.l1, boolean, v1.o1, b4.e, d2.h, b4.j, d2.f, kotlin.jvm.functions.Function1, m3.n, int, int, int):void");
    }

    public static final void h(Function0 function0, n nVar, int i11) {
        int i12;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(860642784);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(function0) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = lv.t.f28253g;
            q qVar = q.f5711a;
            t tVarD = m2.d(d2.c.D(qVar, f11, f11, f11, 0.0f, 8), 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            j.R.getClass();
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
            t tVarD2 = m2.d(d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13), 1.0f);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(f0.U(sVar, R.string.profile_page_orders_card_header), b3.i.e(1.0f, tVarD2, true), lv.s.C, 0L, null, 0L, null, new k(5), 0L, 0, false, 0, 0, null, v.l, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            r9.d(f0.U(sVar, R.string.profile_page_orders_card_cta), b4.a.a(m2.v(d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13), 3), c5.m2.f7291a, new l(18, function0)), lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, new k(5), 0L, 0, false, 0, 0, null, v.f28283w, sVar, 805306752, 12582912, 129528);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a2(i11, 8, function0);
        }
    }

    public static void i(int i11, View view) {
        view.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + i11);
    }

    public static void j(bx.t tVar, String str, String str2, Bundle bundle, bx.s sVar) {
        tVar.getClass();
        str.getClass();
        str2.getClass();
        int i11 = r.$EnumSwitchMapping$0[v(tVar, str).ordinal()];
        if (i11 == 1) {
            bundle.putCharSequence(str, str2);
            return;
        }
        if (i11 == 2) {
            sVar.a(tVar, str, str2);
        } else {
            if (i11 != 3) {
                return;
            }
            sVar.a(tVar, str, str2);
            bundle.putCharSequence(str, str2);
        }
    }

    public static Pair k(bx.t tVar, String str, String str2, Bundle bundle, bx.s sVar) {
        tVar.getClass();
        str.getClass();
        int i11 = r.$EnumSwitchMapping$0[v(tVar, str).ordinal()];
        if (i11 == 1) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence(str, str2);
        } else if (i11 == 2) {
            if (sVar == null) {
                sVar = new bx.s();
            }
            sVar.a(tVar, str, str2);
        } else if (i11 == 3) {
            if (sVar == null) {
                sVar = new bx.s();
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            sVar.a(tVar, str, str2);
            bundle.putCharSequence(str, str2);
        }
        return new Pair(bundle, sVar);
    }

    public static final Object l(ListenableFuture listenableFuture, z70.c cVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return e6.h.h(listenableFuture);
            }
            v80.l lVar = new v80.l(1, y70.f.b(cVar));
            listenableFuture.a(new m0(8, listenableFuture, lVar), e6.m.INSTANCE);
            lVar.v(new androidx.fragment.app.r(listenableFuture, 14));
            Object objS = lVar.s();
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            return objS;
        } catch (ExecutionException e5) {
            Throwable cause = e5.getCause();
            if (cause == null) {
                Intrinsics.throwNpe();
            }
            throw cause;
        }
    }

    public static final Object m(b5.l lVar, Function0 function0, z70.c cVar) {
        Object obj;
        l1 l1Var;
        if (!lVar.getNode().isAttached()) {
            return Unit.f26487a;
        }
        if (!lVar.getNode().isAttached()) {
            y4.a.b("visitAncestors called on an unattached node");
        }
        b4.s parent$ui = lVar.getNode().getParent$ui();
        b5.m0 m0VarG = b5.m.g(lVar);
        loop0: while (true) {
            obj = null;
            if (m0VarG == null) {
                break;
            }
            if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 524288) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 524288) != 0) {
                        b4.s sVarB = parent$ui;
                        o3.e eVar = null;
                        while (sVarB != null) {
                            if (sVarB instanceof g5.a) {
                                obj = sVarB;
                                break loop0;
                            }
                            if ((sVarB.getKindSet$ui() & 524288) != 0 && (sVarB instanceof b5.n)) {
                                int i11 = 0;
                                for (b4.s child$ui = ((b5.n) sVarB).f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
                                    if ((child$ui.getKindSet$ui() & 524288) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            sVarB = child$ui;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new o3.e(new b4.s[16], 0);
                                            }
                                            if (sVarB != null) {
                                                eVar.b(sVarB);
                                                sVarB = null;
                                            }
                                            eVar.b(child$ui);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            sVarB = b5.m.b(eVar);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            m0VarG = m0VarG.w();
            parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
        }
        g5.a aVar = (g5.a) obj;
        if (aVar == null) {
            return Unit.f26487a;
        }
        s1 s1VarF = b5.m.f(lVar);
        Object objS = aVar.S(s1VarF, new r1(9, function0, s1VarF), cVar);
        return objS == y70.a.COROUTINE_SUSPENDED ? objS : Unit.f26487a;
    }

    public static final int n(ha.c cVar, String str) {
        cVar.getClass();
        int columnCount = cVar.getColumnCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= columnCount) {
                i12 = -1;
                break;
            }
            if (Intrinsics.areEqual(str, cVar.getColumnName(i12))) {
                break;
            }
            i12++;
        }
        if (i12 >= 0) {
            return i12;
        }
        String strG = e0.f.g('`', "`", str);
        int columnCount2 = cVar.getColumnCount();
        while (true) {
            if (i11 >= columnCount2) {
                i11 = -1;
                break;
            }
            if (Intrinsics.areEqual(strG, cVar.getColumnName(i11))) {
                break;
            }
            i11++;
        }
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    public static n7.c o(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != -1678407252) {
                if (iHashCode != -543568185) {
                    if (iHashCode == -95037569 && str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            string.getClass();
                            return new n7.h(bundle, string);
                        } catch (Exception unused) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                } else if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return new n7.d(bundle);
                }
            } else if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                try {
                    String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    string2.getClass();
                    new Bundle().putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                    n7.d dVar = new n7.d();
                    if (string2.length() != 0) {
                        try {
                            new JSONObject(string2);
                            return dVar;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new FrameworkClassParsingException();
                }
            }
            throw new FrameworkClassParsingException();
        } catch (FrameworkClassParsingException unused4) {
            n7.d dVar2 = new n7.d();
            if (str.length() > 0) {
                return dVar2;
            }
            i4.a.f("type should not be empty");
            return null;
        }
    }

    public static final void p(String str) {
        File fileT = t();
        if (fileT == null || str == null) {
            return;
        }
        new File(fileT, str).delete();
    }

    public static boolean q(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        WeakHashMap weakHashMap = ViewCompat.f2731a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = androidx.core.view.b.f2772d;
        androidx.core.view.b bVar = (androidx.core.view.b) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (bVar == null) {
            bVar = new androidx.core.view.b();
            bVar.f2773a = null;
            bVar.f2774b = null;
            bVar.f2775c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, bVar);
        }
        WeakReference weakReference2 = bVar.f2775c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        bVar.f2775c = new WeakReference(keyEvent);
        if (bVar.f2774b == null) {
            bVar.f2774b = new SparseArray();
        }
        SparseArray sparseArray = bVar.f2774b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            androidx.core.view.b.b(view2, keyEvent);
        }
        return true;
    }

    public static boolean r(h7.n nVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (nVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return nVar.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f34205b) {
                            try {
                                f34206c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f34205b = true;
                        }
                        Method method = f34206c;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (ViewCompat.f(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f34207d) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f34208e = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f34207d = true;
                }
                Field field = f34208e;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (ViewCompat.f(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && ViewCompat.f(view, keyEvent)) || nVar.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final int s(ha.c cVar, String str) {
        cVar.getClass();
        int iN = n(cVar, str);
        if (iN >= 0) {
            return iN;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i11 = 0; i11 < columnCount; i11++) {
            arrayList.add(cVar.getColumnName(i11));
        }
        c50.w.m("Column '", str, "' does not exist. Available columns: [", CollectionsKt.U(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final File t() {
        File file = new File(a0.a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object u(bx.t r2, java.lang.String r3, android.os.Bundle r4, bx.s r5) {
        /*
            r2.getClass()
            r3.getClass()
            r0 = 0
            if (r5 == 0) goto L1f
            java.util.LinkedHashMap r5 = r5.f6751a
            boolean r1 = r5.containsKey(r2)
            if (r1 != 0) goto L12
            goto L1f
        L12:
            java.lang.Object r2 = r5.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r2.get(r3)
            goto L20
        L1f:
            r2 = r0
        L20:
            if (r4 == 0) goto L26
            java.lang.CharSequence r0 = r4.getCharSequence(r3)
        L26:
            if (r2 != 0) goto L29
            return r0
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p30.b.u(bx.t, java.lang.String, android.os.Bundle, bx.s):java.lang.Object");
    }

    public static u v(bx.t tVar, String str) {
        tVar.getClass();
        str.getClass();
        Map map = bx.s.f6750b;
        Pair pair = (Pair) map.get(tVar);
        Set set = pair != null ? (Set) pair.f26485a : null;
        Pair pair2 = (Pair) map.get(tVar);
        Set set2 = pair2 != null ? (Set) pair2.f26486b : null;
        return (set == null || !set.contains(str)) ? (set2 == null || !set2.contains(str)) ? u.CustomData : u.CustomAndOperationalData : u.OperationalData;
    }

    public static final void w(Activity activity, io.a aVar, ActivityResultLauncher activityResultLauncher) {
        Intent intent;
        activity.getClass();
        OrderType orderType = aVar.f24071c;
        Serializable serializable = aVar.f24074f;
        String str = aVar.f24069a;
        int i11 = io.b.$EnumSwitchMapping$0[orderType.ordinal()];
        if (i11 == 1 || i11 == 2) {
            int i12 = ManufacturerOrderActivity.f9167q;
            intent = new Intent(activity, (Class<?>) ManufacturerOrderActivity.class);
            intent.putExtra("ORDER_ID", str != null ? OrderId.m209boximpl(str) : null);
            intent.putExtra("ORIGIN", serializable);
        } else if (i11 == 3 || i11 == 4 || i11 != 5) {
            int i13 = SurpriseBagOrderActivity.f9178y;
            intent = dx.f.u(activity, aVar);
        } else {
            int i14 = CharityOrderActivity.f9162o;
            int i15 = go.w.f20772i;
            Intent intent2 = new Intent(activity, (Class<?>) CharityOrderActivity.class);
            if (str != null) {
                intent2.putExtra("ORDER_ID", OrderId.m209boximpl(OrderId.m209boximpl(str).m217unboximpl()));
                intent2.putExtra("ORDER_TYPE", orderType);
            }
            String str2 = aVar.f24070b;
            if (str2 != null) {
                intent2.putExtra("INVITATION_ID", str2);
            }
            intent2.putExtra("ORIGIN", serializable);
            intent2.putExtra("SHOW_RECOMMENDATIONS_BOTTOM_SHEET", aVar.f24073e);
            intent2.putExtra("AUTO_SHOW_REDEEMER_VIEW", aVar.f24072d);
            intent = intent2;
        }
        if (activityResultLauncher != null) {
            activityResultLauncher.a(intent, null);
        } else {
            activity.startActivityForResult(intent, AppConstants.REQUEST_CODE_ORDER_VIEW, mv.a.b(activity));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean x(q90.p0 r2, q90.g0 r3) {
        /*
            r3.getClass()
            int r0 = r2.f36585d
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L53
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L53
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L53
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L53
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L53
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L53
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L53
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L53
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L53
            switch(r0) {
                case 300: goto L53;
                case 301: goto L53;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L65
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = q90.p0.e(r0, r2)
            if (r0 != 0) goto L53
            q90.g r0 = r2.a()
            int r0 = r0.f36495c
            r1 = -1
            if (r0 != r1) goto L53
            q90.g r0 = r2.a()
            boolean r0 = r0.f36498f
            if (r0 != 0) goto L53
            q90.g r0 = r2.a()
            boolean r0 = r0.f36497e
            if (r0 != 0) goto L53
            goto L65
        L53:
            q90.g r2 = r2.a()
            boolean r2 = r2.f36494b
            if (r2 != 0) goto L65
            q90.g r2 = r3.a()
            boolean r2 = r2.f36494b
            if (r2 != 0) goto L65
            r2 = 1
            return r2
        L65:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p30.b.x(q90.p0, q90.g0):boolean");
    }

    public static final boolean y(StackTraceElement stackTraceElement) {
        stackTraceElement.getClass();
        String className = stackTraceElement.getClassName();
        className.getClass();
        if (y.p(className, "com.facebook", false)) {
            return true;
        }
        String className2 = stackTraceElement.getClassName();
        className2.getClass();
        return y.p(className2, "com.meta", false);
    }

    public static final boolean z(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (y(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    className.getClass();
                    if (!y.p(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = stackTraceElement.getClassName();
                        className2.getClass();
                        if (!y.p(className2, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    methodName.getClass();
                    if (y.p(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        methodName2.getClass();
                        if (y.p(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            methodName3.getClass();
                            if (!y.p(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        switch (this.f34213a) {
            case 13:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f34213a) {
            case 13:
                String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
                simpleName.getClass();
                return simpleName;
            default:
                return super.toString();
        }
    }
}
