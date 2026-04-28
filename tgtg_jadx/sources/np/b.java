package np;

import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.x;
import op.l;
import sp.f;
import v80.f0;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnp/b;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationPickerViewModel.kt\ncom/app/tgtg/feature/stationPicker/StationPickerViewModel\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n78#2:274\n111#2,2:275\n78#2:277\n111#2,2:278\n230#3,3:280\n233#3,2:289\n1807#4,3:283\n832#4:286\n862#4,2:287\n1586#4:291\n1661#4,3:292\n1586#4:295\n1661#4,3:296\n*S KotlinDebug\n*F\n+ 1 StationPickerViewModel.kt\ncom/app/tgtg/feature/stationPicker/StationPickerViewModel\n*L\n72#1:274\n72#1:275,2\n73#1:277\n73#1:278,2\n95#1:280,3\n95#1:289,2\n96#1:283,3\n98#1:286\n98#1:287,2\n234#1:291\n234#1:292,3\n237#1:295\n237#1:296,3\n*E\n"})
public final class b extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f31314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv.b f31315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f31316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f31317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f31318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f31319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f31320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1 f31321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f31322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h1 f31323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f31324k;
    public final h1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f31325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f31326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f31327o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f31328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2 f31329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2 f31330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2 f31331s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f31332t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m3.h1 f31333u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m3.h1 f31334v;

    public b(f fVar, cv.b bVar, x xVar) {
        fVar.getClass();
        bVar.getClass();
        xVar.getClass();
        this.f31314a = fVar;
        this.f31315b = bVar;
        x70.c cVar = null;
        a2 a2VarC = r.c(null);
        this.f31316c = a2VarC;
        this.f31317d = a2VarC;
        a2 a2VarC2 = r.c(Boolean.FALSE);
        this.f31318e = a2VarC2;
        this.f31319f = a2VarC2;
        n0 n0Var = n0.f26529a;
        a2 a2VarC3 = r.c(n0Var);
        this.f31320g = a2VarC3;
        this.f31321h = new h1(a2VarC3);
        a2 a2VarC4 = r.c(null);
        this.f31322i = a2VarC4;
        this.f31323j = new h1(a2VarC4);
        a2 a2VarC5 = r.c(n0Var);
        this.f31324k = a2VarC5;
        this.l = new h1(a2VarC5);
        a2 a2VarC6 = r.c(n0Var);
        this.f31325m = a2VarC6;
        this.f31326n = new h1(a2VarC6);
        a2 a2VarC7 = r.c(n0Var);
        this.f31327o = a2VarC7;
        this.f31328p = new h1(a2VarC7);
        a2 a2VarC8 = r.c("");
        this.f31329q = a2VarC8;
        this.f31330r = a2VarC8;
        a2 a2VarC9 = r.c(n0Var);
        this.f31331s = a2VarC9;
        this.f31332t = new h1(a2VarC9);
        this.f31333u = new m3.h1(0);
        this.f31334v = new m3.h1(1);
        if (xVar.b()) {
            f0.B(m1.d(this), null, null, new a(this, cVar, 1), 3);
        }
        f0.B(m1.d(this), null, null, new a(this, cVar, 2), 3);
    }

    public static final void a(b bVar) {
        a2 a2Var = bVar.f31318e;
        Boolean bool = Boolean.TRUE;
        a2Var.getClass();
        a2Var.k(null, bool);
    }

    public static boolean b() {
        mv.b bVar = mv.b.f30149d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            bVar = null;
        }
        String string = StringsKt.e0(StringsKt.Y(bVar.a(), '-')).toString();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        if (lowerCase.length() == 0) {
            return false;
        }
        return !lowerCase.equalsIgnoreCase("en");
    }

    public final void c(l lVar) {
        a2 a2Var;
        Object value;
        ArrayList arrayList;
        lVar.getClass();
        long j9 = lVar.f32909b;
        do {
            a2Var = this.f31327o;
            value = a2Var.getValue();
            List list = (List) value;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((l) it.next()).f32909b == j9) {
                        arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (((l) obj).f32909b != j9) {
                                arrayList.add(obj);
                            }
                        }
                    }
                }
                arrayList = CollectionsKt.d0(list, c0.c(lVar));
            } else {
                arrayList = CollectionsKt.d0(list, c0.c(lVar));
            }
        } while (!a2Var.g(value, arrayList));
    }
}
