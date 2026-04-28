package k9;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import g9.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z implements g9.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26179g;

    @Override // g9.z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof b) && super.equals(obj) && Intrinsics.areEqual(this.f26179g, ((b) obj).f26179g);
    }

    @Override // g9.z
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f26179g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // g9.z
    public final void j(Context context, AttributeSet attributeSet) {
        context.getClass();
        attributeSet.getClass();
        super.j(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, j.f26199a);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f26179g = string;
        }
        typedArrayObtainAttributes.recycle();
    }
}
