package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.R;
import com.app.tgtg.feature.webview.ui.WebViewActivity;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f37122a = new n();

    @NotNull
    public static final Parcelable.Creator<n> CREATOR = new oa.i(17);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(WebViewActivity.class, jb.u.x(new Pair("DESTINATION", ct.a.BLOG), new Pair("TITLE", Integer.valueOf(R.string.webview_blog_title))), false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return "blog";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n);
    }

    public final int hashCode() {
        return 2084291051;
    }

    public final String toString() {
        return "BlogDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
