package hp;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.RecipeId;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class i1 {

    @NotNull
    public static final h1 Companion = new h1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22294b;

    public /* synthetic */ i1(int i11, g gVar, String str) {
        if ((i11 & 1) == 0) {
            this.f22293a = null;
        } else {
            this.f22293a = gVar;
        }
        if ((i11 & 2) == 0) {
            this.f22294b = null;
        } else {
            this.f22294b = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
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
            boolean r1 = r5 instanceof hp.i1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hp.i1 r5 = (hp.i1) r5
            hp.g r1 = r4.f22293a
            hp.g r3 = r5.f22293a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r5 = r5.f22294b
            java.lang.String r1 = r4.f22294b
            if (r1 != 0) goto L23
            if (r5 != 0) goto L21
            r5 = r0
            goto L2a
        L21:
            r5 = r2
            goto L2a
        L23:
            if (r5 != 0) goto L26
            goto L21
        L26:
            boolean r5 = com.app.tgtg.model.remote.RecipeId.m249equalsimpl0(r1, r5)
        L2a:
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.i1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        g gVar = this.f22293a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        String str = this.f22294b;
        return iHashCode + (str != null ? RecipeId.m250hashCodeimpl(str) : 0);
    }

    public final String toString() {
        String str = this.f22294b;
        return "ShareRecipeRequest(recipe=" + this.f22293a + ", externalRecipeId=" + (str == null ? Address.ADDRESS_NULL_PLACEHOLDER : RecipeId.m251toStringimpl(str)) + ")";
    }

    public i1(g gVar, String str) {
        this.f22293a = gVar;
        this.f22294b = str;
    }
}
