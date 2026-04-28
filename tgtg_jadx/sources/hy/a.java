package hy;

import android.media.MediaDrm;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Lambda implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException {
        MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
        byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
        propertyByteArray.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            mediaDrm.release();
        } else {
            mediaDrm.release();
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        messageDigest.update(propertyByteArray);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return y.G(bArrDigest, "", b.f22558a, 30);
    }
}
