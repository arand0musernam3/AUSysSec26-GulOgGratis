package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import ra.a;
import ra.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2719a = -1;
        byte[] bArr = null;
        iconCompat.f2721c = null;
        iconCompat.f2722d = null;
        iconCompat.f2723e = 0;
        iconCompat.f2724f = 0;
        iconCompat.f2725g = null;
        iconCompat.f2726h = IconCompat.f2718k;
        iconCompat.f2727i = null;
        iconCompat.f2719a = aVar.f(-1, 1);
        byte[] bArr2 = iconCompat.f2721c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f37821e;
            int i11 = parcel.readInt();
            if (i11 >= 0) {
                bArr = new byte[i11];
                parcel.readByteArray(bArr);
            }
        } else {
            bArr = bArr2;
        }
        iconCompat.f2721c = bArr;
        iconCompat.f2722d = aVar.g(iconCompat.f2722d, 3);
        iconCompat.f2723e = aVar.f(iconCompat.f2723e, 4);
        iconCompat.f2724f = aVar.f(iconCompat.f2724f, 5);
        iconCompat.f2725g = (ColorStateList) aVar.g(iconCompat.f2725g, 6);
        String string = iconCompat.f2727i;
        if (aVar.e(7)) {
            string = ((b) aVar).f37821e.readString();
        }
        iconCompat.f2727i = string;
        String string2 = iconCompat.f2728j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f37821e.readString();
        }
        iconCompat.f2728j = string2;
        iconCompat.f2726h = PorterDuff.Mode.valueOf(iconCompat.f2727i);
        switch (iconCompat.f2719a) {
            case -1:
                Parcelable parcelable = iconCompat.f2722d;
                if (parcelable != null) {
                    iconCompat.f2720b = parcelable;
                    return iconCompat;
                }
                i4.a.f("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f2722d;
                if (parcelable2 != null) {
                    iconCompat.f2720b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f2721c;
                iconCompat.f2720b = bArr3;
                iconCompat.f2719a = 3;
                iconCompat.f2723e = 0;
                iconCompat.f2724f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f2721c, Charset.forName("UTF-16"));
                iconCompat.f2720b = str;
                if (iconCompat.f2719a == 2 && iconCompat.f2728j == null) {
                    iconCompat.f2728j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f2720b = iconCompat.f2721c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f2727i = iconCompat.f2726h.name();
        switch (iconCompat.f2719a) {
            case -1:
                iconCompat.f2722d = (Parcelable) iconCompat.f2720b;
                break;
            case 1:
            case 5:
                iconCompat.f2722d = (Parcelable) iconCompat.f2720b;
                break;
            case 2:
                iconCompat.f2721c = ((String) iconCompat.f2720b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2721c = (byte[]) iconCompat.f2720b;
                break;
            case 4:
            case 6:
                iconCompat.f2721c = iconCompat.f2720b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i11 = iconCompat.f2719a;
        if (-1 != i11) {
            aVar.j(i11, 1);
        }
        byte[] bArr = iconCompat.f2721c;
        if (bArr != null) {
            aVar.i(2);
            Parcel parcel = ((b) aVar).f37821e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2722d;
        if (parcelable != null) {
            aVar.i(3);
            ((b) aVar).f37821e.writeParcelable(parcelable, 0);
        }
        int i12 = iconCompat.f2723e;
        if (i12 != 0) {
            aVar.j(i12, 4);
        }
        int i13 = iconCompat.f2724f;
        if (i13 != 0) {
            aVar.j(i13, 5);
        }
        ColorStateList colorStateList = iconCompat.f2725g;
        if (colorStateList != null) {
            aVar.i(6);
            ((b) aVar).f37821e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f2727i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f37821e.writeString(str);
        }
        String str2 = iconCompat.f2728j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f37821e.writeString(str2);
        }
    }
}
