package atd.ar;

import android.content.Context;
import com.adyen.threeds2.Warning;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH$J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0004\u001a\u00020\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/security/SecurityCheck;", "", "<init>", "()V", "warning", "Lcom/adyen/threeds2/Warning;", "getWarning", "()Lcom/adyen/threeds2/Warning;", "shouldWarn", "", "context", "Landroid/content/Context;", "generateWarning", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AuthenticationRequestParameters {
    private static int AuthenticationRequestParameters = 1;
    private static int getSDKAppID;

    @NotNull
    public abstract Warning AuthenticationRequestParameters();

    public abstract boolean AuthenticationRequestParameters(@NotNull Context context);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r4 = atd.ar.AuthenticationRequestParameters.getSDKAppID + 11;
        atd.ar.AuthenticationRequestParameters.AuthenticationRequestParameters = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (AuthenticationRequestParameters(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (AuthenticationRequestParameters(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r4 = AuthenticationRequestParameters();
        r0 = atd.ar.AuthenticationRequestParameters.getSDKAppID;
        r1 = r0 & 7;
        atd.ar.AuthenticationRequestParameters.AuthenticationRequestParameters = (((r0 | 7) & (~r1)) + (r1 << 1)) % 128;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.Warning getSDKTransactionID(@org.jetbrains.annotations.NotNull android.content.Context r4) {
        /*
            r3 = this;
            int r0 = atd.ar.AuthenticationRequestParameters.getSDKAppID
            r1 = r0 | 33
            int r1 = r1 << 1
            r0 = r0 ^ 33
            int r1 = r1 - r0
            int r0 = r1 % 128
            atd.ar.AuthenticationRequestParameters.AuthenticationRequestParameters = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L1f
            r4.getClass()
            boolean r4 = r3.AuthenticationRequestParameters(r4)
            r0 = 38
            int r0 = r0 / 0
            if (r4 == 0) goto L3c
            goto L28
        L1f:
            r4.getClass()
            boolean r4 = r3.AuthenticationRequestParameters(r4)
            if (r4 == 0) goto L3c
        L28:
            com.adyen.threeds2.Warning r4 = r3.AuthenticationRequestParameters()
            int r0 = atd.ar.AuthenticationRequestParameters.getSDKAppID
            r1 = r0 & 7
            int r2 = ~r1
            r0 = r0 | 7
            r0 = r0 & r2
            int r1 = r1 << 1
            int r0 = r0 + r1
            int r0 = r0 % 128
            atd.ar.AuthenticationRequestParameters.AuthenticationRequestParameters = r0
            return r4
        L3c:
            int r4 = atd.ar.AuthenticationRequestParameters.getSDKAppID
            int r4 = r4 + 11
            int r0 = r4 % 128
            atd.ar.AuthenticationRequestParameters.AuthenticationRequestParameters = r0
            int r4 = r4 % 2
            r0 = 0
            if (r4 == 0) goto L4a
            return r0
        L4a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ar.AuthenticationRequestParameters.getSDKTransactionID(android.content.Context):com.adyen.threeds2.Warning");
    }
}
