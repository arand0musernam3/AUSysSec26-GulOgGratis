package hp;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
@SourceDebugExtension({"SMAP\nRecipeCurrentStatusResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecipeCurrentStatusResponse.kt\ncom/app/tgtg/feature/recipegenerator/model/RecipeCurrentStatusResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22298b;

    public /* synthetic */ k(int i11, int i12, String str) {
        if (3 != (i11 & 3)) {
            m90.c1.j(i11, 3, i.f22288a.getDescriptor());
            throw null;
        }
        this.f22297a = i12;
        this.f22298b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f22297a == kVar.f22297a && Intrinsics.areEqual(this.f22298b, kVar.f22298b);
    }

    public final int hashCode() {
        return this.f22298b.hashCode() + (Integer.hashCode(this.f22297a) * 31);
    }

    public final String toString() {
        return "RecipeCurrentStatusResponse(maxNumberOfRecipes=" + this.f22297a + ", userStatus=" + this.f22298b + ")";
    }
}
