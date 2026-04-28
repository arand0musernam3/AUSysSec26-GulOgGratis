package ay;

import android.util.Base64;
import androidx.activity.p;
import ax.a0;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final PublicKey a(String str) throws InvalidKeySpecException {
        byte[] bArrDecode = Base64.decode(y.n(y.n(y.n(str, "\n", "", false), "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), 0);
        bArrDecode.getClass();
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        publicKeyGeneratePublic.getClass();
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String b(String str) {
        str.getClass();
        URL url = new URL("https", "www." + a0.f4866s, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a0.c().execute(new p(url, objectRef, str, reentrantLock, conditionNewCondition, 1));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) objectRef.element;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final boolean c(PublicKey publicKey, String str, String str2) {
        publicKey.getClass();
        str2.getClass();
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            signature.update(bytes);
            byte[] bArrDecode = Base64.decode(str2, 8);
            bArrDecode.getClass();
            return signature.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
