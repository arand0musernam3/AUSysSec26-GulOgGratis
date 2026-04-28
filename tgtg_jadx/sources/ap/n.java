package ap;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import ao.r1;
import bp.s;
import bp.t;
import bp.v;
import com.app.tgtg.model.remote.item.Address;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.item.PickupCountry;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderType;
import et.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import y80.a2;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lap/n;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRatingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RatingViewModel.kt\ncom/app/tgtg/feature/rating/RatingViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,566:1\n1#2:567\n1807#3,3:568\n777#3:571\n873#3,2:572\n1586#3:574\n1661#3,3:575\n777#3:578\n873#3,2:579\n1586#3:581\n1661#3,3:582\n777#3:585\n873#3,2:586\n1586#3:588\n1661#3,3:589\n777#3:592\n873#3,2:593\n1586#3:595\n1661#3,3:596\n777#3:599\n873#3,2:600\n1586#3:602\n1661#3,3:603\n1586#3:606\n1661#3,3:607\n1586#3:610\n1661#3,3:611\n1586#3:614\n1661#3,3:615\n1586#3:618\n1661#3,3:619\n1586#3:622\n1661#3,3:623\n*S KotlinDebug\n*F\n+ 1 RatingViewModel.kt\ncom/app/tgtg/feature/rating/RatingViewModel\n*L\n66#1:568,3\n297#1:571\n297#1:572,2\n298#1:574\n298#1:575,3\n304#1:578\n304#1:579,2\n305#1:581\n305#1:582,3\n311#1:585\n311#1:586,2\n312#1:588\n312#1:589,3\n318#1:592\n318#1:593,2\n319#1:595\n319#1:596,3\n325#1:599\n325#1:600,2\n326#1:602\n326#1:603,3\n461#1:606\n461#1:607,3\n473#1:610\n473#1:611,3\n485#1:614\n485#1:615,3\n492#1:618\n492#1:619,3\n504#1:622\n504#1:623,3\n*E\n"})
public final class n extends l1 {
    public final a2 A;
    public final a2 B;
    public final a2 C;
    public final a2 D;
    public final a2 E;
    public final a2 F;
    public boolean G;
    public final a2 H;
    public final h1 I;
    public final a2 J;
    public final h1 K;
    public final a2 L;
    public final a2 M;
    public final a2 N;
    public final h1 O;
    public final a2 P;
    public final h1 Q;
    public String R;
    public List S;
    public String T;
    public List U;
    public String V;
    public List W;
    public String X;
    public List Y;
    public String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f4556a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f4557a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f4558b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public List f4559b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.b f4560c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f4561c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1 f4562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rg.d f4563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fv.b f4564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f4568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h1 f4569k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f4570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f4571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f4572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f4573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2 f4574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h1 f4575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2 f4576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f4577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a2 f4578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h1 f4579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a2 f4580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a2 f4581x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a2 f4582y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a2 f4583z;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(androidx.lifecycle.c1 r5, et.z r6, cv.b r7, ao.r1 r8, rg.d r9) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.n.<init>(androidx.lifecycle.c1, et.z, cv.b, ao.r1, rg.d):void");
    }

    public final Order a() {
        return (Order) this.f4556a.a("ORDER");
    }

    public final List b() {
        if (c()) {
            return n0.f26529a;
        }
        Order orderA = a();
        ItemCategory itemCategory = orderA != null ? orderA.getItemCategory() : null;
        int i11 = itemCategory == null ? -1 : l.$EnumSwitchMapping$1[itemCategory.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? n0.f26529a : t.f6574f : t.f6575g : t.f6573e;
    }

    public final boolean c() {
        Order orderA = a();
        return (orderA != null ? orderA.getOrderType() : null) == OrderType.CATERING;
    }

    public final boolean d() {
        Address address;
        PickupCountry pickupCountry;
        Order orderA = a();
        if (orderA == null) {
            return false;
        }
        StoreLocation pickupLocation = orderA.getPickupLocation();
        return Intrinsics.areEqual((pickupLocation == null || (address = pickupLocation.getAddress()) == null || (pickupCountry = address.getPickupCountry()) == null) ? null : pickupCountry.getIsoCode(), "JP");
    }

    public final void e() {
        a2 a2Var = this.H;
        a2Var.k(null, Integer.valueOf(((Number) a2Var.getValue()).intValue() + 1));
    }

    public final void f() {
        this.H.k(null, Integer.valueOf(((Number) r0.getValue()).intValue() - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.net.Uri r9) {
        /*
            r8 = this;
            r9.getClass()
            fv.b r0 = r8.f4564f
            r1 = 0
            if (r0 == 0) goto L9
            goto Lf
        L9:
            java.lang.String r0 = "prepareFilesForUploadService"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r1
        Lf:
            r0.getClass()
            java.lang.Object r0 = r0.f17968a
            android.content.Context r0 = (android.content.Context) r0
            android.content.ContentResolver r2 = r0.getContentResolver()
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L4d
            java.lang.String r0 = "_size"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L40
            boolean r2 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L43
            r2 = -1
            if (r0 == r2) goto L43
            long r4 = r9.getLong(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L40
            r9.close()
            goto L62
        L40:
            r0 = move-exception
            r1 = r0
            goto L47
        L43:
            r9.close()
            goto L4d
        L47:
            throw r1     // Catch: java.lang.Throwable -> L48
        L48:
            r0 = move-exception
            u00.d.p(r9, r1)
            throw r0
        L4d:
            java.lang.String r9 = r3.getPath()
            if (r9 == 0) goto L61
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            long r4 = r0.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            goto L62
        L61:
            r0 = r1
        L62:
            r4 = 0
            if (r0 == 0) goto L6b
            long r6 = r0.longValue()
            goto L6c
        L6b:
            r6 = r4
        L6c:
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            y80.a2 r0 = r8.L
            if (r9 > 0) goto L78
            cp.c r9 = cp.c.GENERIC
            r0.j(r9)
            return
        L78:
            r4 = 15728640(0xf00000, double:7.7709807E-317)
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 <= 0) goto L85
            cp.c r9 = cp.c.TOO_BIG
            r0.j(r9)
            return
        L85:
            y80.a2 r9 = r8.J
            r9.getClass()
            r9.k(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.n.g(android.net.Uri):void");
    }

    public final void h(List list, String str, v vVar) {
        list.getClass();
        vVar.getClass();
        int i11 = l.$EnumSwitchMapping$0[vVar.ordinal()];
        if (i11 == 1) {
            this.R = str;
            return;
        }
        if (i11 == 2) {
            this.S = list;
            this.T = str;
            list.contains(s.COLLECTION_OTHER);
            return;
        }
        if (i11 == 3) {
            this.U = list;
            this.V = str;
            list.contains(s.QUALITY_OTHER);
        } else if (i11 == 4) {
            this.W = list;
            this.X = str;
            list.contains(s.VARIETY_OTHER);
        } else {
            if (i11 != 5) {
                e40.a.f();
                return;
            }
            this.Y = list;
            this.Z = str;
            list.contains(s.QUANTITY_OTHER);
        }
    }

    public final boolean i(boolean z11) {
        return (((Number) this.f4571n.f45488a.getValue()).intValue() <= 3 || z11 || c()) ? false : true;
    }

    public final boolean j() {
        return !(a() != null ? r0.isEdible() : true);
    }

    public final void k(String str) {
        this.f4560c.d(cv.i.ACTION_CLOSE_RATING, dv.a.RATING_PAGE, str);
    }

    public final void l(boolean z11) {
        Boolean boolValueOf = Boolean.valueOf(z11);
        a2 a2Var = this.A;
        a2Var.getClass();
        a2Var.k(null, boolValueOf);
        if (!z11) {
            a2 a2Var2 = this.E;
            a2Var2.getClass();
            a2Var2.k(null, "");
        }
        e();
    }

    public final void m(int i11, v vVar) {
        vVar.getClass();
        int i12 = l.$EnumSwitchMapping$0[vVar.ordinal()];
        if (i12 == 1) {
            Integer numValueOf = Integer.valueOf(i11);
            a2 a2Var = this.f4570m;
            a2Var.getClass();
            a2Var.k(null, numValueOf);
            return;
        }
        if (i12 == 2) {
            Integer numValueOf2 = Integer.valueOf(i11);
            a2 a2Var2 = this.f4572o;
            a2Var2.getClass();
            a2Var2.k(null, numValueOf2);
            return;
        }
        if (i12 == 3) {
            Integer numValueOf3 = Integer.valueOf(i11);
            a2 a2Var3 = this.f4574q;
            a2Var3.getClass();
            a2Var3.k(null, numValueOf3);
            return;
        }
        if (i12 == 4) {
            Integer numValueOf4 = Integer.valueOf(i11);
            a2 a2Var4 = this.f4576s;
            a2Var4.getClass();
            a2Var4.k(null, numValueOf4);
            return;
        }
        if (i12 != 5) {
            e40.a.f();
            return;
        }
        Integer numValueOf5 = Integer.valueOf(i11);
        a2 a2Var5 = this.f4578u;
        a2Var5.getClass();
        a2Var5.k(null, numValueOf5);
    }
}
