package androidx.core.app;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f2711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f2712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2716f;

    public static y0 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(InAppMessageBase.ICON);
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatA = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z11 = bundle.getBoolean("isBot");
        boolean z12 = bundle.getBoolean("isImportant");
        y0 y0Var = new y0();
        y0Var.f2711a = charSequence;
        y0Var.f2712b = iconCompatA;
        y0Var.f2713c = string;
        y0Var.f2714d = string2;
        y0Var.f2715e = z11;
        y0Var.f2716f = z12;
        return y0Var;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f2711a);
        IconCompat iconCompat = this.f2712b;
        if (iconCompat != null) {
            iconCompat.getClass();
            bundle = new Bundle();
            switch (iconCompat.f2719a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f2720b);
                    break;
                case 0:
                default:
                    i4.a.f("Invalid icon");
                    return null;
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f2720b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f2720b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f2720b);
                    break;
            }
            bundle.putInt("type", iconCompat.f2719a);
            bundle.putInt("int1", iconCompat.f2723e);
            bundle.putInt("int2", iconCompat.f2724f);
            bundle.putString("string1", iconCompat.f2728j);
            ColorStateList colorStateList = iconCompat.f2725g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f2726h;
            if (mode != IconCompat.f2718k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle(InAppMessageBase.ICON, bundle);
        bundle2.putString("uri", this.f2713c);
        bundle2.putString("key", this.f2714d);
        bundle2.putBoolean("isBot", this.f2715e);
        bundle2.putBoolean("isImportant", this.f2716f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        String str = this.f2714d;
        String str2 = y0Var.f2714d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.f2711a), Objects.toString(y0Var.f2711a)) && Objects.equals(this.f2713c, y0Var.f2713c) && Boolean.valueOf(this.f2715e).equals(Boolean.valueOf(y0Var.f2715e)) && Boolean.valueOf(this.f2716f).equals(Boolean.valueOf(y0Var.f2716f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f2714d;
        return str != null ? str.hashCode() : Objects.hash(this.f2711a, this.f2713c, Boolean.valueOf(this.f2715e), Boolean.valueOf(this.f2716f));
    }
}
