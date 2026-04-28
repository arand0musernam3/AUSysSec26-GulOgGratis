package g9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f20095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f20096h;

    public static String n(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        return kotlin.text.y.n(str, "${applicationId}", packageName, false);
    }

    @Override // g9.z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a) && super.equals(obj)) {
            Intent intent = this.f20095g;
            if ((intent != null ? intent.filterEquals(((a) obj).f20095g) : ((a) obj).f20095g == null) && Intrinsics.areEqual(this.f20096h, ((a) obj).f20096h)) {
                return true;
            }
        }
        return false;
    }

    @Override // g9.z
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.f20095g;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f20096h;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // g9.z
    public final void j(Context context, AttributeSet attributeSet) {
        context.getClass();
        attributeSet.getClass();
        super.j(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, v0.f20245a);
        typedArrayObtainAttributes.getClass();
        String strN = n(context, typedArrayObtainAttributes.getString(4));
        if (this.f20095g == null) {
            this.f20095g = new Intent();
        }
        Intent intent = this.f20095g;
        intent.getClass();
        intent.setPackage(strN);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f20095g == null) {
                this.f20095g = new Intent();
            }
            Intent intent2 = this.f20095g;
            intent2.getClass();
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.f20095g == null) {
            this.f20095g = new Intent();
        }
        Intent intent3 = this.f20095g;
        intent3.getClass();
        intent3.setAction(string2);
        String strN2 = n(context, typedArrayObtainAttributes.getString(2));
        if (strN2 != null) {
            Uri uri = Uri.parse(strN2);
            if (this.f20095g == null) {
                this.f20095g = new Intent();
            }
            Intent intent4 = this.f20095g;
            intent4.getClass();
            intent4.setData(uri);
        }
        this.f20096h = n(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // g9.z
    public final String toString() {
        Intent intent = this.f20095g;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (component != null) {
            sb2.append(" class=");
            sb2.append(component.getClassName());
        } else {
            Intent intent2 = this.f20095g;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb2.append(" action=");
                sb2.append(action);
            }
        }
        return sb2.toString();
    }
}
