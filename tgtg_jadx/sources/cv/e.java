package cv;

import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.item.response.ItemType;
import j4.s;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f13440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f13443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f13444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f13445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f13446k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f13447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f13449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ItemType f13450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f13451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13452r;

    public e(String str, String str2, String str3, String str4, g gVar, int i11, String str5, Integer num, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, ItemType itemType, String str12) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        gVar.getClass();
        this.f13436a = str;
        this.f13437b = str2;
        this.f13438c = str3;
        this.f13439d = str4;
        this.f13440e = gVar;
        this.f13441f = i11;
        this.f13442g = str5;
        this.f13443h = num;
        this.f13444i = num2;
        this.f13445j = str6;
        this.f13446k = str7;
        this.l = str8;
        this.f13447m = str9;
        this.f13448n = str10;
        this.f13449o = str11;
        this.f13450p = itemType;
        this.f13451q = str12;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof cv.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cv.e r5 = (cv.e) r5
            java.lang.String r1 = r4.f13436a
            java.lang.String r3 = r5.f13436a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f13437b
            java.lang.String r3 = r5.f13437b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f13438c
            java.lang.String r3 = r5.f13438c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f13439d
            java.lang.String r3 = r5.f13439d
            boolean r1 = com.app.tgtg.model.remote.ItemId.m201equalsimpl0(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            cv.g r1 = r4.f13440e
            cv.g r3 = r5.f13440e
            if (r1 == r3) goto L3f
            return r2
        L3f:
            int r1 = r4.f13441f
            int r3 = r5.f13441f
            if (r1 == r3) goto L46
            return r2
        L46:
            java.lang.String r1 = r4.f13442g
            java.lang.String r3 = r5.f13442g
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            java.lang.Integer r1 = r4.f13443h
            java.lang.Integer r3 = r5.f13443h
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            java.lang.Integer r1 = r4.f13444i
            java.lang.Integer r3 = r5.f13444i
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L67
            return r2
        L67:
            java.lang.String r1 = r4.f13445j
            java.lang.String r3 = r5.f13445j
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L72
            return r2
        L72:
            java.lang.String r1 = r4.f13446k
            java.lang.String r3 = r5.f13446k
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L7d
            return r2
        L7d:
            java.lang.String r1 = r4.l
            java.lang.String r3 = r5.l
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L88
            return r2
        L88:
            java.lang.String r1 = r4.f13447m
            java.lang.String r3 = r5.f13447m
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L93
            return r2
        L93:
            java.lang.String r1 = r4.f13448n
            java.lang.String r3 = r5.f13448n
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L9e
            return r2
        L9e:
            java.lang.String r1 = r4.f13449o
            java.lang.String r3 = r5.f13449o
            if (r1 != 0) goto Laa
            if (r3 != 0) goto La8
            r1 = r0
            goto Lb1
        La8:
            r1 = r2
            goto Lb1
        Laa:
            if (r3 != 0) goto Lad
            goto La8
        Lad:
            boolean r1 = com.app.tgtg.model.remote.StoreId.m273equalsimpl0(r1, r3)
        Lb1:
            if (r1 != 0) goto Lb4
            return r2
        Lb4:
            com.app.tgtg.model.remote.item.response.ItemType r1 = r4.f13450p
            com.app.tgtg.model.remote.item.response.ItemType r3 = r5.f13450p
            if (r1 == r3) goto Lbb
            return r2
        Lbb:
            java.lang.String r1 = r4.f13451q
            java.lang.String r5 = r5.f13451q
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto Lc6
            return r2
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB = k.b(this.f13441f, (this.f13440e.hashCode() + ((ItemId.m202hashCodeimpl(this.f13439d) + l1.b(l1.b(this.f13436a.hashCode() * 31, 31, this.f13437b), 31, this.f13438c)) * 31)) * 31, 31);
        String str = this.f13442g;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f13443h;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f13444i;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f13445j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13446k;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f13447m;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f13448n;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f13449o;
        int iM274hashCodeimpl = (iHashCode8 + (str7 == null ? 0 : StoreId.m274hashCodeimpl(str7))) * 31;
        ItemType itemType = this.f13450p;
        int iHashCode9 = (iM274hashCodeimpl + (itemType == null ? 0 : itemType.hashCode())) * 31;
        String str8 = this.f13451q;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        long j9 = this.f13452r;
        String str = this.f13451q;
        g gVar = this.f13440e;
        String str2 = this.f13436a;
        Integer num = this.f13443h;
        Integer num2 = this.f13444i;
        String str3 = this.f13439d;
        String str4 = this.f13442g;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j9);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(" (");
        sb2.append(gVar);
        sb2.append("), ");
        sb2.append(str2);
        sb2.append(", ");
        s.z(sb2, num, ", ", num2, ", ");
        return e0.f.n(sb2, str3, ", ", str4);
    }
}
