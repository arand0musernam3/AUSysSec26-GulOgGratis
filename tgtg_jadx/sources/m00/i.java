package m00;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends rz.a {

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new jz.l(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f28668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f28669f;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, m00.r] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public i(int i11, String str, String str2, String str3, ArrayList arrayList, i iVar) {
        str.getClass();
        if (iVar != null && iVar.f28669f != null) {
            i4.a.f("Failed requirement.");
            throw null;
        }
        this.f28664a = i11;
        this.f28665b = str;
        this.f28666c = str2;
        this.f28667d = str3 == null ? iVar != null ? iVar.f28667d : null : str3;
        if (arrayList == 0) {
            arrayList = iVar != null ? iVar.f28668e : 0;
            if (arrayList == 0) {
                o oVar = q.f28692b;
                arrayList = r.f28693e;
                arrayList.getClass();
            }
        }
        o oVar2 = q.f28692b;
        Object[] array = arrayList.toArray();
        int length = array.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (array[i12] == null) {
                c50.w.l(e0.f.h(i12, "at index ", new StringBuilder(String.valueOf(i12).length() + 9)));
                throw null;
            }
        }
        r rVar = length == 0 ? r.f28693e : new r(array, length);
        rVar.getClass();
        this.f28668e = rVar;
        this.f28669f = iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f28664a == iVar.f28664a && Intrinsics.areEqual(this.f28665b, iVar.f28665b) && Intrinsics.areEqual(this.f28666c, iVar.f28666c) && Intrinsics.areEqual(this.f28667d, iVar.f28667d) && Intrinsics.areEqual(this.f28669f, iVar.f28669f) && Intrinsics.areEqual(this.f28668e, iVar.f28668e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f28664a), this.f28665b, this.f28666c, this.f28667d, this.f28669f});
    }

    public final String toString() {
        String str = this.f28665b;
        int length = str.length() + 18;
        String str2 = this.f28666c;
        StringBuilder sb2 = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb2.append(this.f28664a);
        sb2.append(ExpiryDateInput.SEPARATOR);
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (y.p(str2, str, false)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.f28667d;
        if (str3 != null) {
            sb2.append(ExpiryDateInput.SEPARATOR);
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f28664a);
        lx.u.b0(this.f28665b, parcel, 3);
        lx.u.b0(this.f28666c, parcel, 4);
        lx.u.b0(this.f28667d, parcel, 6);
        lx.u.a0(parcel, 7, this.f28669f, i11);
        lx.u.f0(parcel, 8, this.f28668e);
        lx.u.i0(iH0, parcel);
    }
}
