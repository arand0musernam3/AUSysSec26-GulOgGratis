package jz;

import a00.q;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends rz.a {

    @NonNull
    public static final Parcelable.Creator<j> CREATOR = new l(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f25490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f25493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f25494i;

    public j(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, q qVar) {
        i0.h(str);
        this.f25486a = str;
        this.f25487b = str2;
        this.f25488c = str3;
        this.f25489d = str4;
        this.f25490e = uri;
        this.f25491f = str5;
        this.f25492g = str6;
        this.f25493h = str7;
        this.f25494i = qVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i0.k(this.f25486a, jVar.f25486a) && i0.k(this.f25487b, jVar.f25487b) && i0.k(this.f25488c, jVar.f25488c) && i0.k(this.f25489d, jVar.f25489d) && i0.k(this.f25490e, jVar.f25490e) && i0.k(this.f25491f, jVar.f25491f) && i0.k(this.f25492g, jVar.f25492g) && i0.k(this.f25493h, jVar.f25493h) && i0.k(this.f25494i, jVar.f25494i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25486a, this.f25487b, this.f25488c, this.f25489d, this.f25490e, this.f25491f, this.f25492g, this.f25493h, this.f25494i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f25486a, parcel, 1);
        u.b0(this.f25487b, parcel, 2);
        u.b0(this.f25488c, parcel, 3);
        u.b0(this.f25489d, parcel, 4);
        u.a0(parcel, 5, this.f25490e, i11);
        u.b0(this.f25491f, parcel, 6);
        u.b0(this.f25492g, parcel, 7);
        u.b0(this.f25493h, parcel, 8);
        u.a0(parcel, 9, this.f25494i, i11);
        u.i0(iH0, parcel);
    }
}
