package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ra.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        ra.c cVarH = remoteActionCompat.f2567a;
        boolean z11 = true;
        if (aVar.e(1)) {
            cVarH = aVar.h();
        }
        remoteActionCompat.f2567a = (IconCompat) cVarH;
        CharSequence charSequence = remoteActionCompat.f2568b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ra.b) aVar).f37821e);
        }
        remoteActionCompat.f2568b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2569c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ra.b) aVar).f37821e);
        }
        remoteActionCompat.f2569c = charSequence2;
        remoteActionCompat.f2570d = (PendingIntent) aVar.g(remoteActionCompat.f2570d, 4);
        boolean z12 = remoteActionCompat.f2571e;
        if (aVar.e(5)) {
            z12 = ((ra.b) aVar).f37821e.readInt() != 0;
        }
        remoteActionCompat.f2571e = z12;
        boolean z13 = remoteActionCompat.f2572f;
        if (!aVar.e(6)) {
            z11 = z13;
        } else if (((ra.b) aVar).f37821e.readInt() == 0) {
            z11 = false;
        }
        remoteActionCompat.f2572f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ra.a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f2567a;
        aVar.i(1);
        aVar.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2568b;
        aVar.i(2);
        Parcel parcel = ((ra.b) aVar).f37821e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2569c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f2570d;
        aVar.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z11 = remoteActionCompat.f2571e;
        aVar.i(5);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = remoteActionCompat.f2572f;
        aVar.i(6);
        parcel.writeInt(z12 ? 1 : 0);
    }
}
