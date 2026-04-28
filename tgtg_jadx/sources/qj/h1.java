package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.recipegenerator.RecipeGeneratorActivity;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f37099a = new h1();

    @NotNull
    public static final Parcelable.Creator<h1> CREATOR = new f1(1);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(RecipeGeneratorActivity.class, jb.u.x(new Pair("ORIGIN", f70.i.DEEP_LINK), new Pair("OPEN_SAVED_RECIPES", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return "recipe-generate";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h1);
    }

    public final int hashCode() {
        return -397240824;
    }

    public final String toString() {
        return "RecipeGeneratorDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
