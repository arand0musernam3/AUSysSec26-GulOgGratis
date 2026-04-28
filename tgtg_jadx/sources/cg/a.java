package cg;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new ax.n0(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f7917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f7918c;

    public a(int i11, Integer num, Function0 function0) {
        this.f7916a = i11;
        this.f7917b = num;
        this.f7918c = function0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f7916a);
        Integer num = this.f7917b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            b3.i.w(parcel, 1, num);
        }
        parcel.writeSerializable((Serializable) this.f7918c);
    }
}
