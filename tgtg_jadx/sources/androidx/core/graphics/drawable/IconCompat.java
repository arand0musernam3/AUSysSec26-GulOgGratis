package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import ba0.g;
import i4.a;
import j4.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2718k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f2721c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f2722d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2723e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2724f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f2725g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2726h = f2718k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2727i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2728j;

    public IconCompat(int i11) {
        this.f2719a = i11;
    }

    public static IconCompat a(Bundle bundle) {
        int i11 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i11);
        iconCompat.f2723e = bundle.getInt("int1");
        iconCompat.f2724f = bundle.getInt("int2");
        iconCompat.f2728j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f2725g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f2726h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i11) {
            case -1:
            case 1:
            case 5:
                iconCompat.f2720b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i11);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f2720b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f2720b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat b(Icon icon) {
        icon.getClass();
        int iY = g.y(icon);
        if (iY == 2) {
            return d(null, g.u(icon), g.t(icon));
        }
        if (iY == 4) {
            Uri uriZ = g.z(icon);
            uriZ.getClass();
            String string = uriZ.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f2720b = string;
            return iconCompat;
        }
        if (iY != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f2720b = icon;
            return iconCompat2;
        }
        Uri uriZ2 = g.z(icon);
        uriZ2.getClass();
        String string2 = uriZ2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f2720b = string2;
        return iconCompat3;
    }

    public static IconCompat c(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2720b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Resources resources, String str, int i11) {
        str.getClass();
        if (i11 == 0) {
            a.f("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2723e = i11;
        if (resources != null) {
            try {
                iconCompat.f2720b = resources.getResourceName(i11);
            } catch (Resources.NotFoundException unused) {
                a.f("Icon resource cannot be found");
                return null;
            }
        } else {
            iconCompat.f2720b = str;
        }
        iconCompat.f2728j = str;
        return iconCompat;
    }

    public final int e() {
        int i11 = this.f2719a;
        if (i11 == -1) {
            return g.t(this.f2720b);
        }
        if (i11 == 2) {
            return this.f2723e;
        }
        d.e(this, "called getResId() on ");
        return 0;
    }

    public final String f() {
        int i11 = this.f2719a;
        if (i11 == -1) {
            return g.u(this.f2720b);
        }
        if (i11 == 2) {
            String str = this.f2728j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2720b).split(":", -1)[0] : this.f2728j;
        }
        d.e(this, "called getResPackage() on ");
        return null;
    }

    public final Uri g() {
        int i11 = this.f2719a;
        if (i11 == -1) {
            return g.z(this.f2720b);
        }
        if (i11 == 4 || i11 == 6) {
            return Uri.parse((String) this.f2720b);
        }
        d.e(this, "called getUri() on ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Icon h(android.content.Context r5) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.h(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f2719a == -1) {
            return String.valueOf(this.f2720b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f2719a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f2719a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f2720b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f2720b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f2728j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f2723e);
                if (this.f2724f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f2724f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f2720b);
                break;
        }
        if (this.f2725g != null) {
            sb2.append(" tint=");
            sb2.append(this.f2725g);
        }
        if (this.f2726h != f2718k) {
            sb2.append(" mode=");
            sb2.append(this.f2726h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
