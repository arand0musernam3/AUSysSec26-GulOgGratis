package pz;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends a30.d implements IInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f35671h;

    public j(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 6);
        i0.b(bArr.length == 25);
        this.f35671h = Arrays.hashCode(bArr);
    }

    public static byte[] W(String str) {
        try {
            return str.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e5) {
            i4.a.d(e5);
            return null;
        }
    }

    @Override // a30.d
    public final boolean P(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 == 1) {
            yz.a aVarV = V();
            parcel2.writeNoException();
            j00.h.b(parcel2, aVarV);
            return true;
        }
        if (i11 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f35671h);
        return true;
    }

    public abstract byte[] U();

    public final yz.a V() {
        return new yz.b(U());
    }

    public final boolean equals(Object obj) {
        yz.a aVarV;
        if (obj instanceof j) {
            try {
                j jVar = (j) obj;
                if (jVar.f35671h == this.f35671h && (aVarV = jVar.V()) != null) {
                    return Arrays.equals(U(), (byte[]) yz.b.V(aVarV));
                }
            } catch (RemoteException e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35671h;
    }
}
