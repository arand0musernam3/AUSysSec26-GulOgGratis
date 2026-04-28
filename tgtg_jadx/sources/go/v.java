package go;

import a3.x1;
import a3.y;
import androidx.lifecycle.c1;
import androidx.lifecycle.m1;
import ao.g3;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.google.android.gms.internal.measurement.cg;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.f0;
import w2.z;
import y80.a2;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgo/v;", "Lho/j;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCharityOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharityOrderViewModel.kt\ncom/app/tgtg/feature/orderview/charity/CharityOrderViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1#2:234\n777#3:235\n873#3,2:236\n1807#3,3:238\n1807#3,3:241\n1586#3:244\n1661#3,3:245\n*S KotlinDebug\n*F\n+ 1 CharityOrderViewModel.kt\ncom/app/tgtg/feature/orderview/charity/CharityOrderViewModel\n*L\n159#1:235\n159#1:236,2\n164#1:238,3\n169#1:241,3\n175#1:244\n175#1:245,3\n*E\n"})
public final class v extends ho.j {
    public final cv.b A;
    public final ko.b B;
    public final h1 C;
    public final a2 D;
    public final h1 E;
    public final y80.d F;
    public final a2 G;
    public final a2 H;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c1 f20770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final z f20771z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c1 c1Var, z zVar, cv.b bVar, ko.b bVar2, et.z zVar2, g3 g3Var, gs.a aVar, gt.j jVar) {
        super(c1Var, zVar2, g3Var, aVar, bVar, jVar, bVar2);
        c1Var.getClass();
        bVar.getClass();
        bVar2.getClass();
        zVar2.getClass();
        g3Var.getClass();
        aVar.getClass();
        this.f20770y = c1Var;
        this.f20771z = zVar;
        this.A = bVar;
        this.B = bVar2;
        x70.c cVar = null;
        this.C = new h1(y80.r.c(null));
        a2 a2VarC = y80.r.c(Boolean.FALSE);
        this.D = a2VarC;
        this.E = new h1(a2VarC);
        this.F = y80.r.w(cg.a(0, null, null, 7));
        a2 a2VarC2 = y80.r.c(OrderState.UNKNOWN);
        this.G = a2VarC2;
        this.H = a2VarC2;
        String strE = e();
        if (strE != null) {
            b(strE);
        }
        if (e() == null) {
            f0.B(m1.d(this), null, null, new y(this, cVar, 11), 3);
        }
    }

    @Override // ho.j
    public final void b(String str) {
        str.getClass();
        f0.B(m1.d(this), null, null, new x1(this, str, null, 28), 3);
    }

    public final void n() {
        Order order = (Order) this.f22215i.f45488a.getValue();
        if (order != null) {
            f0.B(m1.d(this), null, null, new gf.g(this, order, null, 1), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if (o(r4, r0) != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r9, z70.c r10) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go.v.o(java.lang.String, z70.c):java.lang.Object");
    }
}
