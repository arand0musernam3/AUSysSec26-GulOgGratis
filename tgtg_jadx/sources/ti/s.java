package ti;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import com.app.tgtg.model.remote.user.response.charity.LocalDivergenceDay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.f0;
import w2.z;
import y80.a2;
import y80.g1;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lti/s;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCollectionDaysViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDaysViewModel.kt\ncom/app/tgtg/feature/charity/ui/schedule/CollectionDaysViewModel\n+ 2 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt__SavedStateHandleKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n43#2,3:258\n1915#3:261\n1916#3:263\n1915#3,2:264\n1#4:262\n*S KotlinDebug\n*F\n+ 1 CollectionDaysViewModel.kt\ncom/app/tgtg/feature/charity/ui/schedule/CollectionDaysViewModel\n*L\n52#1:258,3\n186#1:261\n186#1:263\n199#1:264,2\n*E\n"})
public final class s extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f40260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f40261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d8.f f40262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cv.b f40263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f40264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f40265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1 f40266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g1 f40267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f40268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f40269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f40270k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f40271m;

    public s(z zVar, c1 c1Var, d8.f fVar, cv.b bVar) {
        c1Var.getClass();
        fVar.getClass();
        bVar.getClass();
        this.f40260a = zVar;
        this.f40261b = c1Var;
        this.f40262c = fVar;
        this.f40263d = bVar;
        n0 n0Var = n0.f26529a;
        a2 a2VarC = y80.r.c(n0Var);
        this.f40264e = a2VarC;
        this.f40265f = a2VarC;
        m1 m1VarB = y80.r.b(0, 0, null, 7);
        this.f40266g = m1VarB;
        this.f40267h = new g1(m1VarB);
        a2 a2VarC2 = y80.r.c(Boolean.FALSE);
        this.f40268i = a2VarC2;
        this.f40269j = a2VarC2;
        this.f40270k = y80.r.c(n0Var);
        a2 a2VarC3 = y80.r.c(n0Var);
        this.l = a2VarC3;
        this.f40271m = a2VarC3;
        f0.B(androidx.lifecycle.m1.d(this), null, null, new tg.g(this, (x70.c) null, 1), 3);
    }

    public final void a(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocalDivergenceDay localDivergenceDay = (LocalDivergenceDay) it.next();
            if (((List) this.f40271m.getValue()).contains(localDivergenceDay)) {
                a2 a2Var = this.l;
                ArrayList arrayListT0 = CollectionsKt.t0((Collection) a2Var.getValue());
                arrayListT0.remove(localDivergenceDay);
                a2Var.getClass();
                a2Var.k(null, arrayListT0);
            }
        }
    }

    public final void b(Function0 function0) {
        f0.B(androidx.lifecycle.m1.d(this), null, null, new os.c(this, function0, null), 3);
    }
}
