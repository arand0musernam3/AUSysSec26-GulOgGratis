package hp;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.RecipeId;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class g {

    @NotNull
    public static final f Companion = new f();
    public static final u70.j[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f22281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f22282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f22284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f22285k;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        l = new u70.j[]{null, null, null, null, null, null, u70.l.a(mVar, new h60.b(16)), u70.l.a(mVar, new h60.b(17)), null, null, null};
    }

    public g(int i11, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, String str7, String str8, boolean z11) {
        if ((i11 & 1) == 0) {
            this.f22275a = null;
        } else {
            this.f22275a = str;
        }
        if ((i11 & 2) == 0) {
            this.f22276b = "";
        } else {
            this.f22276b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f22277c = null;
        } else {
            this.f22277c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f22278d = null;
        } else {
            this.f22278d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f22279e = null;
        } else {
            this.f22279e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f22280f = null;
        } else {
            this.f22280f = str6;
        }
        if ((i11 & 64) == 0) {
            this.f22281g = kotlin.collections.n0.f26529a;
        } else {
            this.f22281g = list;
        }
        if ((i11 & 128) == 0) {
            this.f22282h = kotlin.collections.n0.f26529a;
        } else {
            this.f22282h = list2;
        }
        if ((i11 & 256) == 0) {
            this.f22283i = null;
        } else {
            this.f22283i = str7;
        }
        if ((i11 & 512) == 0) {
            this.f22284j = null;
        } else {
            this.f22284j = str8;
        }
        if ((i11 & 1024) == 0) {
            this.f22285k = false;
        } else {
            this.f22285k = z11;
        }
    }

    public static g a(g gVar, String str, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            str = gVar.f22275a;
        }
        String str2 = gVar.f22276b;
        String str3 = gVar.f22277c;
        String str4 = gVar.f22278d;
        String str5 = gVar.f22279e;
        String str6 = gVar.f22280f;
        List list = gVar.f22281g;
        List list2 = gVar.f22282h;
        String str7 = gVar.f22283i;
        String str8 = gVar.f22284j;
        gVar.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        return new g(str, str2, str3, str4, str5, str6, list, list2, str7, str8, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
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
            boolean r1 = r5 instanceof hp.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hp.g r5 = (hp.g) r5
            java.lang.String r1 = r5.f22275a
            java.lang.String r3 = r4.f22275a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.app.tgtg.model.remote.RecipeId.m249equalsimpl0(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f22276b
            java.lang.String r3 = r5.f22276b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f22277c
            java.lang.String r3 = r5.f22277c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f22278d
            java.lang.String r3 = r5.f22278d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.f22279e
            java.lang.String r3 = r5.f22279e
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.f22280f
            java.lang.String r3 = r5.f22280f
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.util.List r1 = r4.f22281g
            java.util.List r3 = r5.f22281g
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.util.List r1 = r4.f22282h
            java.util.List r3 = r5.f22282h
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.String r1 = r4.f22283i
            java.lang.String r3 = r5.f22283i
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L7a
            return r2
        L7a:
            java.lang.String r1 = r4.f22284j
            java.lang.String r3 = r5.f22284j
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L85
            return r2
        L85:
            boolean r1 = r4.f22285k
            boolean r5 = r5.f22285k
            if (r1 == r5) goto L8c
            return r2
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f22275a;
        int iB = w2.l1.b((str == null ? 0 : RecipeId.m250hashCodeimpl(str)) * 31, 31, this.f22276b);
        String str2 = this.f22277c;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f22278d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22279e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f22280f;
        int iC = e0.f.c(this.f22282h, e0.f.c(this.f22281g, (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31);
        String str6 = this.f22283i;
        int iHashCode4 = (iC + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f22284j;
        return Boolean.hashCode(this.f22285k) + ((iHashCode4 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f22275a;
        StringBuilder sbT = e0.f.t("Recipe(externalId=", str == null ? Address.ADDRESS_NULL_PLACEHOLDER : RecipeId.m251toStringimpl(str), ", name=", this.f22276b, ", description=");
        j4.s.A(sbT, this.f22277c, ", prep=", this.f22278d, ", cook=");
        j4.s.A(sbT, this.f22279e, ", portions=", this.f22280f, ", ingredients=");
        sbT.append(this.f22281g);
        sbT.append(", steps=");
        sbT.append(this.f22282h);
        sbT.append(", conclusion=");
        j4.s.A(sbT, this.f22283i, ", total=", this.f22284j, ", isRecipeSaved=");
        return j4.s.o(sbT, this.f22285k, ")");
    }

    public g(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, String str7, String str8, boolean z11) {
        this.f22275a = str;
        this.f22276b = str2;
        this.f22277c = str3;
        this.f22278d = str4;
        this.f22279e = str5;
        this.f22280f = str6;
        this.f22281g = list;
        this.f22282h = list2;
        this.f22283i = str7;
        this.f22284j = str8;
        this.f22285k = z11;
    }
}
