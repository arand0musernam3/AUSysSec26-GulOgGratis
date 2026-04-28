package cg;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.R;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new ax.n0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f8131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8132g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u(int i11, String str, String str2, String str3, String str4, Function0 function0, int i12) {
        this((i12 & 1) != 0 ? R.drawable.ic_invite_friends_invite : i11, str, str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? new e(1) : function0, (boolean) ((i12 & 64) != 0 ? 0 : 1));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f8126a);
        parcel.writeString(this.f8127b);
        parcel.writeString(this.f8128c);
        parcel.writeString(this.f8129d);
        parcel.writeString(this.f8130e);
        parcel.writeSerializable((Serializable) this.f8131f);
        parcel.writeInt(this.f8132g ? 1 : 0);
    }

    public u(int i11, String str, String str2, String str3, String str4, Function0 function0, boolean z11) {
        str.getClass();
        str2.getClass();
        function0.getClass();
        this.f8126a = i11;
        this.f8127b = str;
        this.f8128c = str2;
        this.f8129d = str3;
        this.f8130e = str4;
        this.f8131f = function0;
        this.f8132g = z11;
    }
}
