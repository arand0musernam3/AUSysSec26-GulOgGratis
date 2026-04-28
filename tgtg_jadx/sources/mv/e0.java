package mv;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import v80.d2;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements v80.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a90.d f30175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f30176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f30177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f30178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qb.e f30179e;

    public e0() {
        d2 d2VarD = v80.f0.d();
        c90.f fVar = v80.p0.f42144a;
        this.f30175a = new a90.d(kotlin.coroutines.e.c(d2VarD, a90.p.f1044a));
        this.f30176b = new ConcurrentHashMap();
        this.f30177c = new ConcurrentHashMap();
        this.f30178d = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(mv.e0 r6, android.view.View r7, mv.f0 r8, z70.c r9) {
        /*
            java.util.ArrayList r0 = r6.f30178d
            boolean r1 = r9 instanceof mv.c0
            if (r1 == 0) goto L15
            r1 = r9
            mv.c0 r1 = (mv.c0) r1
            int r2 = r1.f30161n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f30161n = r2
            goto L1a
        L15:
            mv.c0 r1 = new mv.c0
            r1.<init>(r6, r9)
        L1a:
            java.lang.Object r6 = r1.l
            y70.a r9 = y70.a.COROUTINE_SUSPENDED
            int r2 = r1.f30161n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2e
            mv.f0 r8 = r1.f30159k
            android.view.View r7 = r1.f30158j
            ba0.g.M(r6)
            goto L74
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            ba0.g.M(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto La1
            boolean r6 = mv.d.a(r7)
            if (r6 == 0) goto La1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r0.add(r6)
            r1.f30158j = r7
            r1.f30159k = r8
            r1.f30161n = r4
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.Object r6 = v80.f0.o(r4, r1)
            if (r6 != r9) goto L74
            return r9
        L74:
            boolean r6 = mv.d.a(r7)
            if (r6 == 0) goto L8f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r0.remove(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L8f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r0.remove(r6)
        La1:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.e0.a(mv.e0, android.view.View, mv.f0, z70.c):java.lang.Object");
    }

    public static cv.e c(e0 e0Var, dn.n nVar, cv.g gVar, String str, int i11, int i12) {
        e0Var.getClass();
        nVar.getClass();
        gVar.getClass();
        String strW = p0.w();
        String strQ = p0.q();
        String strM198constructorimpl = ItemId.m198constructorimpl(nVar.f15030a);
        Integer num = nVar.f15031b;
        return new cv.e("", strW, strQ, strM198constructorimpl, gVar, num != null ? num.intValue() : 0, str, Integer.valueOf(i11), Integer.valueOf(i12), nVar.f15032c, null, null, AnalyticsProcessor.CHANNEL_NAME, "26.4.1", null, nVar.f15033d, null);
    }

    public static cv.e d(e0 e0Var, BasicItem basicItem, cv.g gVar, String str, int i11, int i12, String str2, int i13) {
        String str3 = (i13 & 4) != 0 ? null : str;
        int i14 = (i13 & 8) != 0 ? 0 : i11;
        int i15 = (i13 & 16) == 0 ? i12 : 0;
        String str4 = (i13 & 32) != 0 ? null : str2;
        e0Var.getClass();
        basicItem.getClass();
        gVar.getClass();
        return new cv.e("", p0.w(), p0.q(), basicItem.getInformation().mo340getItemIdFvU5WIY(), gVar, basicItem.getItemsAvailable(), str3, Integer.valueOf(i14), Integer.valueOf(i15), basicItem.getInformation().getCoverPicture().getPictureId(), basicItem.getInformation().getLogoPicture().getPictureId(), str4, AnalyticsProcessor.CHANNEL_NAME, "26.4.1", d.m(basicItem).m370getStoreId7QsYvu8(), basicItem.getItemType(), d.m(basicItem).getStoreNameAndBranch());
    }

    public static void e(e0 e0Var, ArrayList arrayList, LinearLayoutManager linearLayoutManager, cv.g gVar, String str, int i11, Function1 function1, int i12) {
        String str2 = (i12 & 8) != 0 ? null : str;
        int i13 = (i12 & 16) != 0 ? 0 : i11;
        e0Var.getClass();
        arrayList.getClass();
        linearLayoutManager.getClass();
        gVar.getClass();
        v80.f0.B(e0Var, null, null, new d0(linearLayoutManager, arrayList, e0Var, gVar, i13, str2, function1, null), 3);
    }

    public final void b(View view, f0 f0Var, Function1 function1) {
        f0Var.getClass();
        v80.f0.B(this, null, null, new af.b(view, this, f0Var, function1, (x70.c) null), 3);
    }

    @Override // v80.b0
    public final CoroutineContext getCoroutineContext() {
        return this.f30175a.f1015a;
    }
}
