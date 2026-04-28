package k9;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.adyen.checkout.components.core.Address;
import g9.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26196g;

    @Override // g9.z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof h) && super.equals(obj) && Intrinsics.areEqual(this.f26196g, ((h) obj).f26196g);
    }

    @Override // g9.z
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f26196g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // g9.z
    public final void j(Context context, AttributeSet attributeSet) {
        context.getClass();
        attributeSet.getClass();
        super.j(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, j.f26200b);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f26196g = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // g9.z
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" class=");
        String str = this.f26196g;
        if (str == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }
}
