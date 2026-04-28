package hp;

import com.app.tgtg.model.remote.RecipeId;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
@SourceDebugExtension({"SMAP\nSaveRecipeResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveRecipeResponse.kt\ncom/app/tgtg/feature/recipegenerator/model/SaveRecipeResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22257b;

    public /* synthetic */ b1(int i11, String str, String str2) {
        if (3 != (i11 & 3)) {
            m90.c1.j(i11, 3, z0.f22338a.getDescriptor());
            throw null;
        }
        this.f22256a = str;
        this.f22257b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return RecipeId.m249equalsimpl0(this.f22256a, b1Var.f22256a) && Intrinsics.areEqual(this.f22257b, b1Var.f22257b);
    }

    public final int hashCode() {
        return this.f22257b.hashCode() + (RecipeId.m250hashCodeimpl(this.f22256a) * 31);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("SaveRecipeResponse(externalId=", RecipeId.m251toStringimpl(this.f22256a), ", status=", this.f22257b, ")");
    }
}
