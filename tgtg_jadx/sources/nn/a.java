package nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new jz.l(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv.q f31109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f31110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f31111e;

    public a(String str, String str2, lv.q qVar, Function0 function0, b bVar) {
        str.getClass();
        qVar.getClass();
        function0.getClass();
        bVar.getClass();
        this.f31107a = str;
        this.f31108b = str2;
        this.f31109c = qVar;
        this.f31110d = function0;
        this.f31111e = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f31107a);
        parcel.writeString(this.f31108b);
        parcel.writeString(this.f31109c.name());
        parcel.writeSerializable((Serializable) this.f31110d);
        parcel.writeString(this.f31111e.name());
    }
}
