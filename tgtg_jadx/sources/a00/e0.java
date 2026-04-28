package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends rz.a {

    @NonNull
    public static final Parcelable.Creator<e0> CREATOR = new g0(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f99a;

    public e0(ArrayList arrayList) {
        this.f99a = arrayList;
    }

    public final JSONArray d() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f99a;
            if (list != null) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    f0 f0Var = (f0) list.get(i11);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) f0Var.f103c);
                    jSONArray2.put((int) f0Var.f102b);
                    jSONArray2.put((int) f0Var.f103c);
                    jSONArray.put(i11, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e5) {
            a40.d0.o("Error encoding UvmEntries to JSON object", e5);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        List list = ((e0) obj).f99a;
        List list2 = this.f99a;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.f99a;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.f0(parcel, 1, this.f99a);
        lx.u.i0(iH0, parcel);
    }
}
